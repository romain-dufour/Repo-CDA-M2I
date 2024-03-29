import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { todoService } from '../services/todoService';

const CreateTodo = () => {
    const [todo, setTodo] = useState({
        name: '',
        task: ''
    });
    const navigate = useNavigate();

    const handleChange = (e) => {
        const { name, task } = e.target;
        setTodo(prevState => ({
            ...prevState,
            [name]: e.value
        }));
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
            await todoService.createTodo(todo);
            console.log('Todo created successfully');
            setTodo({ name: '', task: '' });
            navigate('/todos'); 
        } catch (error) {
            console.error('Error creating todo:', error);
            
        }
    };

    return (
        <div className="container mt-5">
        <h2>Créer une nouvelle todo</h2>
        <form onSubmit={handleSubmit}>
            <div className="mb-3">
                <label htmlFor="todoName" className="form-label">Nom</label>
                <input 
                    type="text" 
                    className="form-control" 
                    id="todoName" 
                    name="name" 
                    value={todo.name} 
                    onChange={handleChange} 
                />
            </div>
            <div className="mb-3">
                <label htmlFor="todoTask" className="form-label">Tache</label>
                <input 
                    type="text" 
                    className="form-control" 
                    id="todoTask" 
                    name="task" 
                    value={todo.task} 
                    onChange={handleChange} 
                />
            </div>
            <button type="submit" className="btn btn-primary">Créer</button>
        </form>
    </div>
    );
};

export default CreateTodo;
