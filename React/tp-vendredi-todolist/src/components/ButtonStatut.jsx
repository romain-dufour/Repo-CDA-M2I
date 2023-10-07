import { useContext } from "react"
import { MonContext } from "../context/MonContext"


const ButtonStatut = (props) => {
    const [context] = useContext(MonContext)
    const taskId = props
    const foundTask = context.task.find(t =>t.id === taskId) 

const changeStatut = ()=>{

    console.log(foundTask);
    // if (butonn.onclick == true){
    //     changeStatut.textcontent = "Fini"
    // } else{
    //     changeStatut.textcontent = "En cours"
    // } 
}

    return (
        <button onClick={changeStatut}>tache</button>
    )
}

export default ButtonStatut