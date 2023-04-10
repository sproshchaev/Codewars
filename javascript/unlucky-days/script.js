function unluckyDays(year) {
  const FIRST_MONTH_JS = 0;
  const LAST_MONTH_JS = 11;
  let result = 0;
  let currDate = new Date(year, FIRST_MONTH_JS, 01);
  while (currDate <= new Date(year, LAST_MONTH_JS, 31)) {
    if ((currDate.getDay() == 5) && (currDate.getDate() == 13)) {
      result++;
    }
    currDate.setDate(currDate.getDate() + 1);
  }
  return result;
}

console.log(unluckyDays(2015)); // 3
console.log(unluckyDays(1986)); // 1
console.log(unluckyDays(2017)); // 2
