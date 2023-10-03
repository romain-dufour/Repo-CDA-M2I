import { useState } from "react"



const Compteur = (props) => {

    const [number, setNumber] = useState(0)

    const incrementation = () => {
        setNumber(number + 1)
    }

    const decrementation = () => {
        setNumber(number - 1)
    }

    const affichageFizzBuzz = (i) => {
        let affichage
        if (( i % 3 == 0) && (i % 5 == 0) && (i !== 0)) {
            affichage = "FizzBuzz";
        } else if (i % 3 == 0 && (i !== 0)) {
            affichage = "Fizz";
        } else if (i % 5 == 0 && (i !== 0)) {
            affichage = "Buzz";
        } else {
            affichage = i;
        }

        return affichage
    }

    return (
        <>
            <button type="button" disabled={number >= props.max}  onClick={incrementation}>+</button>
            <div>{affichageFizzBuzz(number)}</div>
            <button type="button" disabled={number <= 0} onClick={decrementation}>-</button>
        </>
    )

}

export default Compteur