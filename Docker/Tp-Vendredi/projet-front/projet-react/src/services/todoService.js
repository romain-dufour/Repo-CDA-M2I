import api from './api';

const getAllTodos = () => {
  return api.get('/todos');
};


const createTodo = (todo) => {
  return api.post('/add', todo);
};


const deleteTodo = (todoId) => {
  return api.delete(`/todo/${todoId}`);
};

const updateTodo = (todoData) => {
  console.log(todoData)
  return api.put('/todo/update', todoData, {
  'Content-Type': 'application/json'
    }
  );
};

export const todoService = { getAllTodos, createTodo, deleteTodo, updateTodo };
