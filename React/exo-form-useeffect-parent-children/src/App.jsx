import { useState } from 'react'
import Form from './components/form'
import Table from './components/Table'
import classes from './components/MyForm.module.css'


function App() {

  const [maState,setMaState] = useState("")
const [user,setUser] = useState([])

const formInformations = ({firstName, lastName, bornDate})=>{
setMaState("")
console.log(firstName);
console.log(lastName)
console.log(bornDate)
setUser ( (prevState) =>[...prevState,{firstName, lastName, bornDate} ] )

}

return (
    <div className={classes.app}>
    <Form formInformations={formInformations} maState={maState}/>
    <hr />
      <Table user={user}/>
    </div>
  )
}

export default App
