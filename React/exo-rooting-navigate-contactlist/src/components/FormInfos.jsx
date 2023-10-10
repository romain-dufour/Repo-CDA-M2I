import { useNavigate } from "react-router-dom"
import { useRef, useContext } from "react"
import Person from "../model/Person"
import MonContext from "../context/MonContext"

const FormInfos = () => {
    const { setPerson } = useContext(MonContext)

    const prenomInputRef = useRef()
    const nomInputRef = useRef()
    const emailInputRef = useRef()
    const telephoneInputRef = useRef()

    const navigate = useNavigate();

    const submitHandler = (event) => {
        event.preventDefault()

        setPerson((prev => [...prev, new Person(
            nomInputRef.current.value, prenomInputRef.current.value, emailInputRef.current.value, telephoneInputRef.current.value
        )]))

        console.log(prenomInputRef.current.value);
        navigate("/contacts/")

    }

    return (

        <form onSubmit={submitHandler}>
            <div>
                <label htmlFor="prenom" >Prénom</label>
                <input type="text" id="prenom" ref={prenomInputRef}  />
            </div>
            <div>
                <label htmlFor="nom" >Nom</label>
                <input type="text" id="nom" ref={nomInputRef}/>
            </div>
            <div>
                <label htmlFor="email" >Email</label>
                <input type="text" id="email" ref={emailInputRef}/>
            </div>
            <div>
                <label htmlFor="telephone" >Numéro de téléphone</label>
                <input type="text" id="telephone" ref={telephoneInputRef}/>
            </div>
            <div>
                <button >Ajouter</button>
            </div>


        </form >

    )
}

export default FormInfos