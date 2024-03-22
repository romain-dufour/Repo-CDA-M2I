import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { todoService } from '../services/todoService';

const FormCreateTodo = () => {
    const [todo, setTodo] = useState({
        title: '',
        description: ''
    });
    const navigate = useNavigate();

    const handleChange = (e) => {
        const { title, description } = e.target;
        setTodo(prevState => ({
            ...prevState,
            [title]: description
        }));
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
            await todoService.createTodo(todo);
            console.log('Todo created successfully');
            setTodo({ title: '', description: '' });
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
                <label htmlFor="todoTitle" className="form-label">Titre</label>
                <input 
                    type="text" 
                    class="form-control" 
                    id="todoTitle" 
                    name="title" 
                    value={todo.title} 
                    onChange={handleChange} 
                />
            </div>
            <div class="mb-3">
                <label for="todoDescription">Description</label>
                <textarea class="form-control" 
                id="todoDescription" 
                placeholder="Description textarea" 
                name='description'
                value={todo.description}
                onChange={handleChange} 
                ></textarea>
                {/* <div class="invalid-feedback">
                Renseignez la description de la todo
                </div> */}
            </div>
            <button type="submit" className="btn btn-primary">Créer</button>
        </form>
    </div>
    );
};

export default FormCreateTodo;
