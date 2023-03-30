function getLengthOfMissingArray(arrayOfArrays) {
  let result = 0;
  if (arrayOfArrays != null) {
    if (arrayOfArrays.length != 0) {
      let arrayOflength = [];
      let maxLength = 0;
      let minLength = Number.MAX_SAFE_INTEGER;
      let arrayIsNullOrEmpty = false;
      for (let i = 0; i < arrayOfArrays.length; i++) {
        if (arrayOfArrays[i] == null || arrayOfArrays[i].length == 0) {
          arrayIsNullOrEmpty = true;
          result = 0;
          break;
        }
        arrayOflength[i] = arrayOfArrays[i].length;
        if (arrayOfArrays[i].length > maxLength) {
          maxLength = arrayOfArrays[i].length;
        }
        if (arrayOfArrays[i].length < minLength) {
          minLength = arrayOfArrays[i].length;
        }
      }
      if (arrayIsNullOrEmpty == false) {
        if (minLength == Number.MAX_SAFE_INTEGER) {
          minLength = 0;
        }
        let foundLength;
        for (let i = minLength; i <= maxLength; i++) {
          foundLength = false;
          for (let j = 0; j < arrayOflength.length; j++) {
            if (arrayOflength[j] == i) {
              foundLength = true;
              break;
            }
          }
          if (!foundLength) {
            result = i;
            break;
          }
        }
      }
    }
  }
  console.log(result);
  return result;
}

getLengthOfMissingArray([
  [1],
  [4, 2, 4, 0, 0, 0, 2],
  [0, 2, 1],
  [4, 4, 3, 3],
  [1, 3, 1, 3, 4, 0, 2, 0, 4, 0],
  [0, 1, 1, 3, 0, 2, 0, 2],
  [1, 1, 4, 2, 1, 4, 4, 0, 0],
  [3, 1, 1, 1, 2],
  [1, 0, 3, 2, 4, 2],
  [3, 3, 4, 3, 1, 3, 0, 0, 2, 4, 1],
  [0, 2, 0, 0, 0, 2, 3, 2, 2, 1, 3, 3],
]);
getLengthOfMissingArray([
  [2, 4, 1],
  [3, 2, 3, 4, 0],
  [3, 3, 1, 3, 3, 0, 2, 1],
  [0, 2, 4, 2, 4, 4, 3, 0, 1, 1, 2, 0, 2, 1],
  [1, 4, 0, 4, 3, 2, 4, 2, 1, 0, 0],
  [2, 0, 4, 1, 2, 2, 2],
  [1, 0, 4, 4, 4, 3, 1, 0, 1],
  [1, 1, 4, 0, 1, 1, 4, 2, 2, 3, 0, 4],
  [3, 2, 1, 4, 4, 1, 1, 3, 2, 3],
  [2, 2, 4, 1, 1, 2],
  [3, 4, 4, 3, 1, 4, 2, 0, 0, 3, 4, 4, 0],
]);
getLengthOfMissingArray();
getLengthOfMissingArray([
  [],
  [4],
  [3, 3, 1],
  [4, 2, 0, 4],
  [2, 4, 0, 3, 0],
  [1, 4, 1, 4, 3, 3],
  [4, 1, 0, 3, 3, 0, 3],
]);
getLengthOfMissingArray([[], [1, 0], [4, 1, 1, 2, 4], [0, 3, 3], [3, 1, 2, 4]]);
getLengthOfMissingArray([
  [0, 0, 1],
  [3, 2, 0, 2],
  [0, 3, 0, 2, 3],
  [1, 4, 4, 3, 3, 1, 3],
]);
getLengthOfMissingArray(null);
getLengthOfMissingArray([[], [4], [3, 1, 2], [4, 0, 3, 1]]);
getLengthOfMissingArray([]);
getLengthOfMissingArray([[null], [null, null, null]]);
getLengthOfMissingArray([[1, 2], [4, 5, 1, 1], [1], [5, 6, 7, 8, 9]]);
getLengthOfMissingArray([
  ["a", "a", "a"],
  ["a", "a"],
  ["a", "a", "a", "a"],
  ["a"],
  ["a", "a", "a", "a", "a", "a"],
]);
