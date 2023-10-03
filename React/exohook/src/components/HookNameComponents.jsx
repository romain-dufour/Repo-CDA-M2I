import { useState } from "react";

const FirstNameHookComponent = (props) => {

    const [valueFirstnameInput, setFirstname] = useState("")
    const [valueLastnameInput, setLastname] = useState("")

    const changeValueFirstname = (event) => {
        setFirstname(event.target.value)
    }

    const changeValueLastname = (event) => {
        setLastname(event.target.value) 
       }
       
    const getFullname =() =>{
        const first = valueFirstnameInput.charAt(0).toUpperCase() + valueFirstnameInput.slice(1)
        const last = valueLastnameInput.toUpperCase()

        return first + " " + last
    }
    return (
        <>
            <p>Veuillez rentrer votre prénom</p>
            <input type="text" placeholder="Firstname" onInput={changeValueFirstname} />
            <p>Veuillez rentrer votre nom</p>
            <input type="text" placeholder="nom" onInput={changeValueLastname} />

            <p>Bonjour <b>{getFullname()} </b>, bienvenue sur l'application</p>
        </>
    )
}

export default FirstNameHookComponent;