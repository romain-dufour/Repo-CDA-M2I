import { Pile } from "./class/pile.js";

const hangarNumber = new Pile<number>()

hangarNumber.empiler(45)
console.table(hangarNumber.elements);
