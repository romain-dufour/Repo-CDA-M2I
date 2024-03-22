import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Header from './shared/Header';
import PrivateRoute from './components/PrivateRoute';
import Login from './components/Login';
import Register from './components/Register';
import FormCreateTodo from './components/FormCreateTodo';
import ListTodos from './components/ListTodos';

import './App.css';

function App() {
  return (
    <Router>
      <Header />
      <Routes>
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} />
        <Route path="/" element={<Login />} />

         <Route path="/todos" element={
          <ListTodos />
          // <PrivateRoute>
            // {<ListTodos /> }
          // </PrivateRoute>
        } />

        <Route path="/create-todo" element={
          <FormCreateTodo />
          // <PrivateRoute>
          //   {<FormCreateTodo /> }
          // </PrivateRoute>
        } />
      </Routes>
    </Router>
  );
}

export default App;
