import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';

import Header from './shared/Header';
import CreateTodo from './components/CreateTodo';
import TodoList from './components/TodoList'

function App() {
  return (
    <Router>
      < Header/>
      <Routes>
        <Route path="/" element={
            <TodoList />
        } />

        <Route path="/create-todo" element={
            <CreateTodo />
        } />
      </Routes>
    </Router>
  );
}
export default App;

