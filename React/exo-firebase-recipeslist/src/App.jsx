import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap-icons/font/bootstrap-icons.min.css';
import Navbar from './components/navigation/Navbar';
import { Link } from 'react-router-dom';
import RecipesItem from './components/recipes/RecipesItem';
import { useSelector } from 'react-redux'
import RecipesForm from './components/recipes/RecipesForm';

function App() {
  const user = useSelector(state => state.auth.user)

  return (
    <>
    <div className='row'>

  
      <Navbar />
      <h3>Recipes List</h3>
      <div className='row'>
      <div className='col-6'>
      <RecipesForm ></RecipesForm>
      
      </div>
      
      <div className='col-6'>
      <RecipesItem user={user}/>
      </div>
      </div>
      </div>

      
    </>
  )
}

export default App
