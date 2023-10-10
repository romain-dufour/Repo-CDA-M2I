import { useContext, useRef } from "react"
import Task from "../models/task"
import { MonContext } from "../context/MonContext"

const Formulaire = () => {
    const context = useContext(MonContext)
    const {setTasks} = context

    const taskNameInputRef = useRef()
    const taskDeadLineInputRef = useRef()

    const submitHandler =(event)=>{
        event.preventDefault()
        console.log("form")
        const name = taskNameInputRef.current.value
        const deadline = taskDeadLineInputRef.current.value

        const newTask = new Task (name,deadline)

        setTasks((prevTasks) =>[...prevTasks, newTask])

        taskNameInputRef.current.value = ""
        taskDeadLineInputRef.current.value=""

    }

    return (

        <form onSubmit={submitHandler}>
            <div>
                <label htmlFor="taskname" >Taskname :</label>
                <input type="text" ref={taskNameInputRef} required />
            </div>
            <div>
                <label htmlFor="deadline">Deadline :</label>
                <input type="Date" ref={taskDeadLineInputRef} required />
            </div>
            <div>
                <button>Add task</button>
            </div>

        </form>
    )
}

export default Formulaire