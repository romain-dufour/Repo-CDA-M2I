import { useRef } from "react"
import classes from './Style.module.css'


const Useeffect = (props) => {
    const loginFormFirstName = useRef()
    const loginFormLastName = useRef()
    const loginFormPassWord = useRef()

    const { clg } = props
    // const clg = () => {
    //     console.log(loginFormFirstName.current.value);
    //     console.log(loginFormLastName.current.value);
    //     console.log(loginFormPassWord.current.value);
    // }
    const contenant = (event) => {
        event.preventDefault()
        clg({
            firstname: loginFormFirstName.current.value,
            lastname: loginFormLastName.current.value,
            password: loginFormPassWord.current.value
        }
        )
    }

    return (
        <form className={classes.form}>
            <label className={classes.label} htmlFor="firstName">firsname</label>
            <input className={classes.input} type="text" ref={loginFormFirstName} />
            <label className={classes.label} htmlFor="lastName">lastname</label>
            <input className={classes.input} type="text" ref={loginFormLastName} />
            <label className={classes.label} htmlFor="password">password</label>
            <input className={classes.input} type="password" ref={loginFormPassWord} />
            <button className={classes.bouton} onClick={contenant}>Submit clg</button>

        </form>
    )
}

export default Useeffect