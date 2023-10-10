import { useContext } from "react";
import { useNavigate } from "react-router-dom"
import MonContext from "../context/MonContext";
import PersonInfos from "../components/PersonInfos";
// import FormInfos from "../components/FormInfos"

function Contacts()  {

    const navigate = useNavigate();

    const addButton = () => {
        console.log("clique");
        navigate("/contacts/ajouter")
    }

    const {person}=useContext(MonContext)
    console.log(person.id);
    return(
        <>
<div>
<h1>Contact List</h1>
<button onClick={addButton}>Ajouter Contact</button>
</div>
<hr />

    {person.length === 0 ? <div><p>La liste de contacts est vide</p></div> :
    person.map(p => 
        <PersonInfos key={p.id} personId={p.id}/>
        )}
    
        </>
    )
}

export default Contacts