import './App.css';
import { useState } from "react";
import MonContext from './context/MonContext';
import { RouterProvider } from 'react-router-dom';
import router from './App-routing';
import 'bootstrap/dist/css/bootstrap.min.css'

function App() {
  // const [person, setPerson] = useState([{prenom : "marc"},{prenom : "toto"}])
  const [person, setPerson] = useState([])

  return (
    <MonContext.Provider value={{ person, setPerson }}>
         <RouterProvider router={router} />

    </MonContext.Provider>
  );
}

export default App;
