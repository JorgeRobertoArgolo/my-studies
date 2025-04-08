//First method
let varA = 'A'; // B
let varB = 'B'; // C
let varC = 'C'; // A

let aux = varA;
varA = varB;
varB = varC;
varC = aux;

console.log(varA, varB, varC);

//Second method
varA = 'A'; // B
varB = 'B'; // C
varC = 'C'; // A

[varA, varB, varC] = [varB, varC, varA]

console.log(varA, varB, varC);