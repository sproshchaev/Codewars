function recycle(array) {
  let result = [[], [], [], []];
  let paperIndex = 0;
  let glassIndex = 0; 
  let organicIndex = 0;
  let plasticIndex = 0;
  array.forEach((element, index) => {
    if (element.material == "paper" || element.secondMaterial == "paper") {
      result[0][paperIndex++] = element.type; 
    }
    if (element.material == "glass" || element.secondMaterial == "glass") {
      result[1][glassIndex++] = element.type;
    }
    if (element.material == "organic" || element.secondMaterial == "organic") {
      result[2][organicIndex++] = element.type;
    }
    if (element.material == "plastic" || element.secondMaterial == "plastic") {
      result[3][plasticIndex++] = element.type;
    }
  });
  console.log(result);
  return result;
}

recycle([
  {type: 'rotten apples', material: 'organic'},
  {type: 'out of date yogurt', material: 'organic', secondMaterial: 'plastic'},
  {type: 'wine bottle', material: 'glass', secondMaterial: 'paper'},
  {type: 'amazon box', material: 'paper'},
  {type: 'beer bottle', material: 'glass', secondMaterial: 'paper'}
]);
