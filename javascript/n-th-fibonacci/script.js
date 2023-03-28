function nthFibo(n) {
  let currNumber = 1;
  if ((n == 1) || (n == 2)) {
    n == 1 ? currNumber = 0 : currNumber = 1; 
  } else {
    let count = 3;
    let firstNumber = 0;
    let secondNumber = 1;
    while (count < n) {
      firstNumber = secondNumber;
      secondNumber = currNumber;
      currNumber = firstNumber + secondNumber;
      count++;
    }
  }
  console.log(currNumber);
  return currNumber;
}

nthFibo(1);
nthFibo(2);
nthFibo(3);
nthFibo(4);
nthFibo(5);
nthFibo(6);
nthFibo(7);
nthFibo(8);
