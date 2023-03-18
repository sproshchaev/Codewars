function brightest(colors) {
  let result = "";
  let indexMaxBrightest = -1;
  let maxBrightest = -1;
  let currBrightest = -1;
  for (let i = 0; i < colors.length; i++) {
    currBrightest = getMaxFromColor(colors[i]);
    if (currBrightest > maxBrightest) {
      maxBrightest = currBrightest;
      indexMaxBrightest = i;
    }
  }
  result = colors[indexMaxBrightest];
  console.log(result);
  return result;
}

const convertDigitHexToDecimal = (inHex) => {
  switch (inHex) {
    case "0", "1", "2", "3", "4", "5", "6", "7", "8", "9":
      return Number(inHex);
    case "A":
      return 10;
    case "B":
      return 11;
    case "C":
      return 12;
    case "D":
      return 13;
    case "E":
      return 14;
    case "F":
      return 15;
    default:
  }
};

const convertTwoDigitHexToDecimal = (inHex) => {
  return (convertDigitHexToDecimal(inHex[0]) * 16 + convertDigitHexToDecimal(inHex[1]) * 1);
};

const getMaxFromColor = (inRrGgBb) => {
  let posInRrGgBb = 1;
  let val = 0;
  let maxVal = 0;
  while (posInRrGgBb < inRrGgBb.length) {
    val = convertTwoDigitHexToDecimal(inRrGgBb.substring(posInRrGgBb, posInRrGgBb + 2));
    if (val > maxVal) {
      maxVal = val;
    }
    posInRrGgBb = posInRrGgBb + 2;
  }
  return maxVal;
};

brightest(["#001000", "#000000", "#ABCDEF", "#123456"]);