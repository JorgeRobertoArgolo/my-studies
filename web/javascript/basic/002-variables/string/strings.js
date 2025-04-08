//            01234567   
let string = "the text is to learling programming"

console.log(string[80]);
console.log(string[2]);

//return the caracter
console.log(string.charAt(3));

//concat
console.log(string.concat(" ", "strange"));

//return the first indice, when start
console.log(string.indexOf('text'));

//return the last indice, when start
console.log(string.lastIndexOf('t'));

//regex
console.log(string.match(/[a-z]/g));

//return the index
console.log(string.search('h'));

//replace
console.log(string.replace('the', 'test'));

//length
console.log(string.length);

//slice ->start 0
console.log(string.slice(4, 8));

//start in the final
console.log(string.slice(-4));

console.log(string.split(' '));
console.log(string.split(' ', 3));

console.log(string.toUpperCase());
console.log(string.toLowerCase());