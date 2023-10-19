import { useDispatch, useSelector } from "react-redux";
import { setAuthMode, signInAction, signUpAction } from "./authSlice";
import { useRef } from "react";

const SignForm = () => {
    const authMode = useSelector(state => state.auth.authMode)
    const dispatch = useDispatch()

    const emailRef = useRef()
    const passwordRef = useRef()

    const submitFormHandler = async (event) => {
        event.preventDefault()

        const email = emailRef.current.value
        const password = passwordRef.current.value

        const credentials = {
            email,
            password,
            returnSecureToken: true
        }

      if(authMode === "Se connecter"){
        dispatch(signInAction(credentials))
      }
      if(authMode === "S'inscrire"){
        dispatch(signUpAction(credentials))
      }
      
    }

    return ( 
        <>
            <h3>{authMode}</h3>
            <hr />
            <form onSubmit={submitFormHandler}>
                <div>
                    <label htmlFor="email">Email: </label>
                    <input type="email" id="email"  ref={emailRef}/>
                </div>
                <div>
                    <label htmlFor="password">Password: </label>
                    <input type="password" id="password" ref={passwordRef} />
                </div>
                <button>{authMode}</button>
            </form>
            <button 
                onClick={() => dispatch(setAuthMode(authMode === "Se connecter" ? "S'inscrire" : "Se connecter"))}>
                    {authMode === "Se connecter" ? "S'inscrire" : "Se connecter"}
            </button>
        </>
     );
}
 
export default SignForm;