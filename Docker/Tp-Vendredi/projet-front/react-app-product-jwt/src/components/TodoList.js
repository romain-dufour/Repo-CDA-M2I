import React, { useEffect, useState } from 'react';
import { todoService } from '../services/todoService';
import UpdateProductModal from './UpdateTodoModal';
import UpdateTodoModal from './UpdateTodoModal';


function TodoList() {
  const [todos, setTodos] = useState([]);
  const [error, setError] = useState('');

  useEffect(() => {
    todoService.getAllTodos()
      .then(response => {
        console.log(response)
        setTodos(response.data);
      })
      .catch(error => {
        setError('Erreur lors de la récupération des produits.');
      });
  }, []);

  const loadTodos = () => {
    todoService.getAllTodos()
      .then(response => {
        setTodos(response.data);
      })
      .catch(error => {
        setError('Erreur lors de la récupération des produits.');
      });
  };

  const [selectedTodo, setSelectedTodo] = useState(null);

  const updateTodo = (todoData) => {
    console.log("todo " + todoData.name)
    todoService.updateTodo(todoData)
      .then(() => {
        loadTodos();
        setSelectedTodo(null);
      })
      .catch(error => {
        setError('Erreur lors de la mise à jour de la todo.');
      });
  };


  const deleteTodo = (todoId) => {
    todoService.deleteTodo(todoId)
      .then(() => {
        loadTodos();
      })
      .catch(error => {
        setError('Erreur lors de la suppression de la todo.');
      });
  };


  return (
    <div className="container mt-5">
      <h2>Todo List</h2>
      {error && <div className="alert alert-danger" role="alert">
        {error}
      </div>}
      <table className="table">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">task</th>

          </tr>
        </thead>
        <tbody>
          {todos.map((todo, index) => (
            <tr key={todo.id}>
              <th scope="row">{index + 1}</th>
              <td>{todo.name}</td>
              <td>{todo.task}</td>
              <td>
                <button className="btn btn-danger mr-4" onClick={() => deleteTodo(todo.id)}>Supprimer</button>
                <button className='btn btn-warning' onClick={() => setSelectedTodo(todo)}>Update</button>
               
              </td>
            </tr>
          ))}
           {selectedTodo && (
                  <UpdateTodoModal
                    todo={selectedTodo}
                    onSave={updateTodo}
                    onCancel={() => setSelectedTodo(null)}
                  />
                )}
        </tbody>
      </table>

    </div>
  );
}

export default TodoList;
