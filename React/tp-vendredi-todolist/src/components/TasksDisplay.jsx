import { useContext } from "react"
import {MonContext} from "../context/MonContext"
import ButtonStatut from './ButtonStatut'



const TasksDisplay = (props)=>{
const context = useContext(MonContext)

const taskId = props.id
const foundTask = context.task.find(t => t.id === taskId)

return (
    <div>
        <div>{foundTask.name}</div>
        <div>{foundTask.deadline}</div>
        <div>
            <button>coucou</button>
            <ButtonStatut taskId={props.id} />
            
        </div>

    </div>
)

}

export default TasksDisplay