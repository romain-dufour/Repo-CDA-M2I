import { useContext } from "react"
import {MonContext} from "../context/MonContext"
import ButtonStatut from './ButtonStatut'



const TasksDisplay = (props)=>{
const context = useContext(MonContext)
    /* eslint-disable react/prop-types */

const taskId = props.id;
// const delete = props.onDeleteTask
const foundTask = context.tasks.find((t) => t.id === taskId)

return (
    <div>
        <div>{foundTask.name}</div>
        <div>{foundTask.deadline}</div>
        <div>
            <ButtonStatut taskId={taskId} />
            
        </div>

    </div>
)

}

export default TasksDisplay