import { useState } from 'react'
import SignForm from './components/auth/SignForm'
import './App.css'
import TaskForm from './components/task/taskForm'
import { useSelector } from 'react-redux'

function App() {
  const user = useSelector( state => state.auth.user)

  return (
    <>
    {
      user ? 
        <TaskForm />
        :
        <SignForm />
      
    }
    </>

    
  )
}

export default App
