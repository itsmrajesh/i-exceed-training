var name = 'Rajesh';

let lastName = 'M';

console.log(name, lastName);

let a = 20;
var b = 30;
a = ' hey dude'
console.log(5 + 5 + a);

let person = { // person object in the form of key value pair
    fName: "Rajesh",
    age: 21
};
console.log("Name " + person.fName + " Age : " + person.age);

// accessing using bracket notation

person['fName']='M Rajesh'


console.log("Name " + person.fName + " Age : " + person.age);

console.log("Name : "+person['fName']);  // accessing using bracket notation
