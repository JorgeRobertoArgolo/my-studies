const students = ['Jorge', "Mary", 'Robert']

//students[3] = 'Luiza'

//Insertion in the end -> remove is pop
students.push('Luiza')

//Insertion in the begin -> remove is shift
students.unshift('Lucia')

delete students[0]

console.log(students.length)
console.log(students)


console.log(typeof students)

console.log(students instanceof Array)