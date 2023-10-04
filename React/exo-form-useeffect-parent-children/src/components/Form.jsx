import { useState } from "react"
import classes from './MyForm.module.css'

const Form = (props) => {
    /* eslint-disable react/prop-types */
    const { formInformations } = props

    const [firstName, setFirstName] = useState("")
    const [lastName, setLastName] = useState("")
    const [bornDate, setBornDate] = useState("")

    const submitHandler = (event) => {
        event.preventDefault()
        formInformations({
            firstName,
            lastName,
            bornDate
        },
            setFirstName(""),
            setLastName(""),
            setBornDate("")
        )
    }
    return (
        <form className={classes.form} action="#" onSubmit={submitHandler} >
            <div className={classes.firstNameInput}>
                <label htmlFor="nom">Nom</label>
                <input type="text" value={lastName} onInput={(e) => setLastName(e.target.value)} required />
            </div>
            <div>
                <label htmlFor="prenom" >Prenom</label>
                <input type="text" value={firstName} onInput={(e) => setFirstName(e.target.value)} required />
            </div>
            <div>
                <label htmlFor="birthdate" >Date de naissance</label>
                <input type="date" value={bornDate} onInput={(e) => setBornDate(e.target.value)} required />
            </div>
            <div>
                <button>Submit</button>
            </div>
        </form >
    )
}

export default Form