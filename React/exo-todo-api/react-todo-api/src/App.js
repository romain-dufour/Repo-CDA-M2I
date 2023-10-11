import { useState } from 'react';
import './App.css';
import TodoForm from './components/TodoForm';
import {TodoContext} from "./context/TodoContext"


function App() {
  const [todos,setTodos] = useState([])

  return (
    <TodoContext.Provider value={{todos, setTodos}}>
    <TodoForm />
  </TodoContext.Provider>
  );
}

export default App;
