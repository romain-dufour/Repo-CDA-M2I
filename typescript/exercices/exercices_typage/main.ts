 //1
let userName: string = "romain"

//2
let userAge: number = 34 

//3
let isLogin: boolean = false 

//4
let userNames: string[] = []
userNames.push(userName)
console.log(userNames);

//5
let person: object = {
    firstName : "Dupont",
    age : 20,
    isLoggedIn : true

} 
// console.log(person.age); // non ce n'est pas possible d'afficher l'age

//6
let person1: {
    firstName : string,
    age: number,
    isLoggedIn: boolean
} = {
    firstName : "Dupont",
    age : 20,
    isLoggedIn : true
}
console.log(person1.age);

//7
let person2 = {
    firstName : "Dupont",
    age : 20,
    isLoggedIn : true
}
console.log(person2.age);

//8
let infos: [string, number]
infos = ["Dupont", 20]

console.log(infos[1]);