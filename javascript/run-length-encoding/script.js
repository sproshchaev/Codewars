var runLengthEncoding = function(str){
  let result = [];
  
  return result;
}

runLengthEncoding(""); // []
runLengthEncoding("abc"); // [[1,'a'],[1,'b'],[1,'c']]
runLengthEncoding("WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW"); // [[12,'W'],[1,'B'],[12,'W'],[3,'B'],[24,'W'],[1,'B'],[14,'W']]
