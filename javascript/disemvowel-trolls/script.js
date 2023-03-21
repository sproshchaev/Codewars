function disemvowel(str) {
  let result = '';
  let vowels = 'AEIOUY';
  for (let i = 0; i < str.length; i++) {
    if ((vowels.indexOf(str[i].toUpperCase()) == -1 ) || (str[i].toUpperCase() == 'Y') ) {
      result += str[i];
    }
  }
  console.log(result);
  return result;
}

disemvowel('This website is for losers LOL!');