class Pile <T>{
  public elements : T[]
    constructor(){
        this.elements= []
}
empiler(element: T) :void{
    this.elements.push(element)
}
depiler():void {
    this.elements.pop();
}
}
export {Pile}