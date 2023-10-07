import { useState } from "react"
import Formulaire from "./components/Formulaire"
import { MonContext } from "./context/MonContext"
// import TasksDisplay from "./components/TasksDisplay"

function App() {
const [tasks, setTasks] = useState([])


  return (
    <MonContext.Provider value={{tasks, setTasks}}>
      <Formulaire />
      {tasks.map(task=>(
        <TasksDisplay  key={task.id} id={task.id} />
    ))}

    </MonContext.Provider>
  )
}

export default App
