import Useeffect from './components/Useeffect'
import './App.css'
// import classes from './components/Style.css'


function App() {


  const clg = (element) => {
    console.log(element.firstname);
    console.log(element.lastname);
    console.log(element.password);
}

  return (
    <>
  <Useeffect clg={clg}/>
    </>
  )
}

export default App
