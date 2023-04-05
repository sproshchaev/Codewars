const calculate = (...args) => { 
  let result = 0;
  args.forEach(element => result += element);
  return (...args) => {
    args.forEach(element => result += element);
    return result;
  } };

console.log(calculate(1, 1)(2)); // should return 4
console.log(calculate(1)(1)); // should return 2
console.log(calculate(1, 1)(1)); // should return 3
console.log(calculate(1, 1)(1, -1)); // should return 2
console.log(calculate(2, 4)(3, 7, 1)); // should return 17
