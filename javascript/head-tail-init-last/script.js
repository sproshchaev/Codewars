function head(array) {
  let result = array[0];
  console.log(result);
  return result;
}

function tail(array) {
  let result = [];
  for (let i = 1; i < array.length; i++) {
    result[i - 1] = array[i];
  }
  console.log(result);
  return result;
}

function init(array) {
  let result = [];
  for (let i = 0; i < array.length - 1; i++) {
    result[i] = array[i];
  }
  console.log(result);
  return result;
}

function last(array) {
  let result = array[array.length - 1];
  console.log(result);
  return result;
}

head([5, 1]);
tail([1, 2]);
init([1, 5, 7, 9]);
last([7, 2]);