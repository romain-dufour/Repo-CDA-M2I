import { useNavigate } from "react-router-dom"


function ProtectedRoute (props) {
    const navigate = useNavigate()

if(true){
    return(
        // <>{props.children}</>
        navigate("/ajout-produit")
    )
}

}
export default ProtectedRoute