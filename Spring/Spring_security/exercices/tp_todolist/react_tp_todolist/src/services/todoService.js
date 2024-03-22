import api from './api';
import { authHeader } from '../helpers/auth-header';

const getAllTodos = () => {
  return api.get('/todos', { headers: authHeader() });
};


const createTodo = (todo) => {
  return api.post('/todos/admin/post', todo, { headers: authHeader() });
};


const deleteTodo = (todoId) => {
  return api.delete(`/todos/${todoId}`, { headers: authHeader() });
};

const updateTodo = (todoData) => {
  console.log(todoData)
  return api.put('/todos', todoData, { headers: authHeader() });
};


export const todoService = {getAllTodos,createTodo,deleteTodo,updateTodo };
