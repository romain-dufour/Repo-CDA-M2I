import { useContext } from "react"
import  MonContext  from "../context/MonContext"


const PersonInfos = (props) => {

     const { personId } = props
    const person = useContext(MonContext).person.find(p => p.id === personId)


    return (

        <div>
            Prénom : {person.prenom} {person.nom}
            <hr />
            <ul>
                <li>email : {person.email}</li>
                <li>Telephone : {person.telephone}</li>
            </ul>
        </div>

    )
}

export default PersonInfos