import { useContext, useRef, useEffect } from "react"
import { TodoContext } from "../context/TodoContext"
import axios from 'axios';


const TodoForm = () => {
    const { todos, setTodos } = useContext(TodoContext)
    const titreInputRef = useRef()

    useEffect(() => {
        axios.get("http://localhost:3001/todolist")
            .then(response => {
                setTodos(() => [ ...response.data])
                console.log(response.data)
            })
            .catch(error => {
                console.error("Erreur : ", error)
            })
    },[])



    const addPerson = () => {
        axios.post("http://localhost:3001/todolist", { titre: titreInputRef.current.value })
            .then(response => {
                setTodos((prev) => [...prev, response.data])

            })
            .catch(error => {
                console.error("Erreur : ", error)
            })
    }


    // const todoValues = titre


    const submitHandler = (event) => {
        event.preventDefault()
        console.log(todos);
        addPerson()
        console.log(todos);

    }

    return (
        <>
            <form action="#" onSubmit={submitHandler}>
                <label htmlFor="Titre">Titre</label>
                <input type="text" id="titre" ref={titreInputRef} />
                <br />
                <button >Ajouter</button>
            </form>
            <hr />
            <div>
                {/* afficher les taches ici */}
                {todos.map(todo => (
                    <>
                        <h2>{todo.titre}</h2>
                        <button>Modifier</button>
                        <button>Supprimer</button>
                        <hr />
                    </>

                ))}
            </div>
        </>

    )
}

export default TodoForm