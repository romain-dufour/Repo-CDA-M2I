import CardChien from './components/CardChien'
import FormulaireChien from './components/FormulaireChien'
import { MonContext } from './context/MonContext'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/js/bootstrap.min.js'
import 'bootstrap-icons/font/bootstrap-icons.min.css'
import { useState } from 'react'



function App() {
  const dogName = useState("")
  const dogRace = useState("")
  const dogDate = useState("")
  const dogPhoto = useState("")



  return (
    <MonContext.Provider value={(dogName,dogRace,dogDate,dogPhoto)}>
       <div className='row bg-secondary g-3 fw-bolder container '>
        <FormulaireChien />
      </div>
      <hr />
      <div>
        <CardChien />
      </div>
       </MonContext.Provider>
   
  )
}

export default App
