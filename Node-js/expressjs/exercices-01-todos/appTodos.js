import express from 'express'
// import { Todo } from './classe/Todo';

const appTodos = express();
const todoList = [{
    titre: "tache 1", contenu: "test", statut: "en cours"
},
{
    titre: "tache 2", contenu: "test", statut: "en cours"
},
{
    titre: "tache 3", contenu: "test", statut: "en cours"
},
]
appTodos.use(express.json())

const port = 3030

// action qui sera déclenché lors de la connection sur '/' et affichera la liste des totos 
appTodos.get("/", (req, res) => {
    res.send("bienvenu sur ma todoliste")
})

//endpoint pour ajouter une todo
appTodos.post("/todos", (req, res) => {
    res.send(req.body)
})


//endpoint pour modifier une toto
appTodos.patch("/todos/:todoId", (req, res) => {
    res.send(req.body)
    res.send({todoId:req.body.todoId,statut:"terminé"})
})


//endpoint pour récupérer la liste des todos
appTodos.get("/todos", (req, res) => {
    res.json(todoList)
})

// un Endpoint pour récupérer une todo
appTodos.get("/todos:todoId", (req, res) => {
    res.json(todoList)
})

// un EndPoint pour supprimer une todo
appTodos.delete("/todos:todoId", (req, res) => {
    res.json()
})

// un Endpoint pour rechercher des todos par leur titre


// un Endpoint pour modifier le statut d'une todo






appTodos.listen(port, () => {
    console.log(`http://127.0.0.1:${port}/todos`);
})
