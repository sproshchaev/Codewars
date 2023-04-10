function find(object, path) {
  let result = "";
  let pathArray = path.split(".");
  let currObj = object;
  pathArray.forEach((element, index) => {
      if ((element != "toString") && (currObj[pathArray[index]] != undefined)) {
        currObj = currObj[pathArray[index]];
        result = currObj; 
       } else {
        result = undefined;
       }
  });
  return result;
}

console.log(find({ user: { name: { first: 'John', last: 'Snow' }} }, "user.name.first")); // 'John' 
console.log(find({ people: ['John', 'Dave', 'Lisa'] }, "people.1")); // 'Dave'
console.log(find({ user: { name: 'Dan' } }, "user.wallet.money")); // undefined 
console.log(find({ user: { name: 'Dan' } }, "user2")); // undefined 
console.log(find({ user: { addresses: [[Object], [Object]], name: { first: 'John', last: 'Snow'}}}, "user.name.first.toString"));  // undefined
