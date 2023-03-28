function formatDuration(seconds) {
  const SECONDS_PER_YEAR = 31536000;
  const SECONDS_PER_DAY = 86400;
  const SECONDS_PER_HOUR = 3600;
  const SECONDS_PER_MINUTE = 60;
  let result = "";
  let remains = 0;
  let years = Math.trunc(seconds / SECONDS_PER_YEAR);
  remains = seconds % SECONDS_PER_YEAR;
  if (years >= 1) {
    result = (years == 1) ? years + " year " : years + " years ";
  }
  let days = Math.trunc(remains / SECONDS_PER_DAY);
  remains = remains % SECONDS_PER_DAY;
  if (days >= 1) {
    result += (days == 1) ? days + " day " : days + " days ";
  }
  let hours = Math.trunc(remains / SECONDS_PER_HOUR);
  remains = remains % SECONDS_PER_HOUR;
  if (hours >= 1) {
    result += (hours == 1) ? hours + " hour " : hours + " hours ";
  }
  let minutes = Math.trunc(remains / SECONDS_PER_MINUTE);
  remains = remains % SECONDS_PER_MINUTE;
  if (minutes >= 1) {
    result += (minutes == 1) ? minutes + " minute " : minutes + " minutes ";
  }
  if (remains >= 1) {
    result += (remains == 1) ? remains + " second " : remains + " seconds ";
  }
  result = result.trim();
  if (seconds == 0) {
    result = "now";
  }
  let resultStringArray = result.split(" ");
  result = "";
  for (let i = 0; i < resultStringArray.length; i++) {
    result += resultStringArray[i] + " ";
    if (i % 2 != 0 && i < resultStringArray.length - 3) {
      result = result.trim() + ", ";
    }
    if (i == resultStringArray.length - 3) {
      result = result.trim() + " and ";
    }
  }
  console.log(result.trim());
  return result.trim();
}

formatDuration(0);
formatDuration(1);
formatDuration(12);
formatDuration(60);
formatDuration(62);
formatDuration(65);
formatDuration(120);
formatDuration(3600);
formatDuration(3605);
formatDuration(3662);
formatDuration(86400);
formatDuration(86401);
formatDuration(31536000);
formatDuration(2 * 31536000 + 86400);
formatDuration(2 * 31536000 + 2 * 86400);
formatDuration(2 * 31536000 + 2 * 86400 + 3600);
formatDuration(2 * 31536000 + 2 * 86400 + 2 * 3600);
formatDuration(2 * 31536000 + 2 * 86400 + 2 * 3600 + 60);
formatDuration(2 * 31536000 + 2 * 86400 + 2 * 3600 + 2 * 60);
formatDuration(2 * 31536000 + 2 * 86400 + 2 * 3600 + 2 * 60 + 1);
formatDuration(2 * 31536000 + 2 * 86400 + 2 * 3600 + 2 * 60 + 2);
