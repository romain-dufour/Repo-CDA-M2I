import { useContext } from "react"
import { MonContext } from "../context/MonContext"


const ButtonStatut = (props) => {
    const { tasks, setTasks } = useContext(MonContext)
    const taskId = props.taskId
    // const foundTask = context.task.find(t =>t.id === taskId) 

    const changeStatut = () => {

        const updatedTasks = tasks.map((task) => {
            if (task.id === taskId) {
                return { ...task, status: task.status === "En cours" ? "Fini" : "En cours" }

            }
            return task
        })
        // if (button.onclick == true) {
        //     changeStatut.textcontent = "Fini"
        // } else {
        //     changeStatut.textcontent = "En cours"
        // }
    }

    setTasks(updatedTasks);

    return (
        <button onClick={changeStatut}>
            {tasks.find((task) => task.id === taskId)?.status === "Fini" ? "En cours" : "Fini"}
        </button>)
}

export default ButtonStatut