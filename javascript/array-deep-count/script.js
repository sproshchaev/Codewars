// в отладке 
function deepCount(a) {
  let result = 0;
  let bottom = false;
  for (let i = 0; i < a.length; i++) {
    
    result++;
  }
  console.log(result);
  return result;
}

function countThisLevel(a) {
}


deepCount([]);
deepCount([1, 2, 3]);
deepCount(["x", "y", ["z"]]);
deepCount([1, 2, [3, 4, [5]]]);
deepCount([[[[[[[[[]]]]]]]]]);