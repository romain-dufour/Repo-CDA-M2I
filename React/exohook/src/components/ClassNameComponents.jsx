import { Component, PureComponent } from "react";

class FirstNameFullComponent extends PureComponent {
    constructor (props) {
        super(props) 
        this.state ={
            firstname:"",
            lastname:""
        }
    }
}

firsnameInputHandler(){

}
lastnameInputHandler(){
    
}

const getFullname =() =>{
    const first = valueFirstnameInput.charAt(0).toUpperCase() + valueFirstnameInput.slice(1)
    const last = valueLastnameInput.toUpperCase()

    return first + " " + last
}
render () {
    return(
        <>
            <p>Veuillez rentrer votre prénom</p>
            <input type="text" placeholder="Firstname" value={this.state.firstname} onInput={this.firsnameInputHandler.bind(this)} />
            <p>Veuillez rentrer votre nom</p>
            <input type="text" placeholder="nom" value={this.state.lastname} onInput={this.lastnameInputHandler.bind(this)}/>

            <p>Bonjour <b>{getFullname()} </b>, bienvenue sur l'application</p>
        </>
    )
}
