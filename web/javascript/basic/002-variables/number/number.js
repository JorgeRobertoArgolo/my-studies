let n1 = 1;
let n2 = 2.5;
let n3 = 10.654987923;
let n4 = 10;

console.log(n1.toString() + n2) //12.5

//n1 = n1.toString()

console.log(typeof n1)

//number of decimal cases
console.log(n3.toFixed(4))

console.log(Number.isInteger(n4))

let temp = n1 * 5;
console.log(Number.isNaN(temp))