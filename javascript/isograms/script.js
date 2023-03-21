function isIsogram(str){
  let result = true;
  let charAlreadyThere = '';   
  for (let i = 0; i < str.length; i++) {
    if ((charAlreadyThere.indexOf(str[i].toUpperCase()) == -1) || (str[i] == '')) {
      charAlreadyThere += str[i].toUpperCase();
    } else {
      result = false;
      break;
    }
  }
  console.log(result);
  return result;
}

isIsogram('Dermatoglyphics');
isIsogram('moose');
isIsogram('moOse');
isIsogram('aba');
isIsogram('');
