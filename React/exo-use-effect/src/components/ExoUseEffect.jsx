import { useEffect, useState } from "react"


const ExoUseEffect = (props) => {

    const [nbrA, setNbrA] = useState(0)
    const [nbrB, setNbrB] = useState(0)
    const [multiply, setMultiply] = useState(0)
    const [isResultEgal, setisResultEgal] = useState(false)
    const [result, setResult] = useState("")

    const mysteryValue = props.mysteryValue

    const nbrAInputValue = (e) => {
        setNbrA(e.target.value)
    }

    const nbrBInputValue = (e) => {
        setNbrB(e.target.value)
    }
   
    // const isItFalse = (a,b,c) =>{
    //     let result =""
    //     if(a*b!==c){
    //         result =`${a} x ${b} est différent de ${c}`  
    //     }
    //     else {
    //         result =`Bravo ! ${a} x ${b} = ${c} `
    //     }
    //     return (result)
    // }
    
    useEffect(() => {
        setMultiply(nbrA *nbrB)
        setisResultEgal(multiply === mysteryValue)
        let result =`${nbrA} x ${nbrB} est différent de ${mysteryValue}`
        if (multiply===mysteryValue){
            result =`Bravo ! ${nbrA} x ${nbrB} = ${mysteryValue} `
        } 

    }, [nbrA, nbrB,mysteryValue]
    )

    return (
        <>
            <input type="text" value={nbrA} onInput={nbrAInputValue} />
            <input type="text" value={nbrB} onInput={nbrBInputValue} />
            <input type="text" value={multiply} />
            <p>{result}</p>
            <p>{isResultEgal ? `Bravo ! ${nbrA} x ${nbrB} = ${multiply} ` : `${nbrA} x ${nbrB} est différent de ${mysteryValue}` }</p>
        </>
    )
}


export default ExoUseEffect