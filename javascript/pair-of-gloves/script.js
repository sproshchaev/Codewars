function numberOfPairs(gloves) {
  let result = 0;
  let alreadyProc = [];
  gloves.forEach((color) => {
    if (!alreadyProc.includes(color)) {
      alreadyProc.push(color);
      result += Math.trunc(gloves.filter((e) => e == color).length / 2);
    }
  });
  console.log(result);
  return result;
}

numberOfPairs(["red", "green", "red", "blue", "blue"]);
numberOfPairs(["red", "red", "red", "red", "red", "red"]);
numberOfPairs(["Aqua", "White", "Black", "Lime", "Olive", "Lime", "Blue", "Red", 
"Gray", "Gray", "Lime", "Gray", "Red", "Red", "Gray", "White", "Green", "Fuchsia",
"Green", "Green", "White", "Maroon", "Aqua", "Navy", "Purple", "Purple", "Black",
"Olive", "Blue", "Black", "White", "Fuchsia", "Aqua", "Purple", "Green", "Navy",
"Green", "Green", "Yellow", "Green", "White", "Lime", "Lime", "White", "Yellow",
"Yellow", "Olive", "Aqua",]);
