import { useState } from "react"
import Formulaire from "./components/Formulaire"
import { MonContext } from "./context/MonContext"
import TasksDisplay from "./components/TasksDisplay"

function App() {
const [tasks, setTasks] = useState([])

const deleteTaskHandler =(task) => {
  setTasks(prevTasks => prevTasks.filter(t => t.id !== task.id))
}

  return (
    <MonContext.Provider value={{tasks, setTasks}}>
      <Formulaire />
      {tasks.map(task=> <TasksDisplay  key={task.id} id={task.id} onDeleteTask = {deleteTaskHandler} />
    )}

    </MonContext.Provider>
  )
}

export default App
