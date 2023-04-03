function sortByBit(arr) {
  let strArr = [];
  let countBit = 0;
  arr.forEach((element, i) => {
    countBit = 0;
    let divisible = element;
    while (divisible / 2 > 1) {
      if (divisible % 2 != 0) {
        countBit++;
      }
      divisible = Math.trunc(divisible / 2);
    }
    if (divisible / 2 > 0) {
      countBit++;
    }
    strArr[i] = countBit + "-" + element;
  });
  strArr = strArr.sort((inA, inB) => {
    let a = Number(inA.substring(0, inA.indexOf("-")));
    let b = Number(inB.substring(0, inB.indexOf("-")));
    if (a < b) {
      return -1;
    }
    if (a > b) {
      return 1;
    }
    if (a == b) {
      a = Number(inA.substring(inA.indexOf("-") + 1));
      b = Number(inB.substring(inB.indexOf("-") + 1));
      if (a < b) {
        return -1;
      }
      if (a > b) {
        return 1;
      }
      return 0;
    }
  });
  strArr.forEach((element, i) => {
    arr[i] = Number(element.substring(element.indexOf("-") + 1));
  });
  console.log(arr);
  return arr;
}

sortByBit([7, 6, 15, 8]); // [8, 6, 7, 15] 
sortByBit([3, 8, 3, 6, 5, 7, 9, 1]); // [1, 8, 3, 3, 5, 6, 9, 7]
sortByBit([9, 4, 5, 3, 5, 7, 2, 56, 8, 2, 6, 8, 0]); // [0, 2, 2, 4, 8, 8, 3, 5, 5, 6, 9, 7, 56]
