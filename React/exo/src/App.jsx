import logo from './logo.svg';
import './App.css';
import Alert from './components/Alert';

function App() {
  return (
    <>
      <Alert message="what the fuck ?!" /> <br />

      <div className="App">
        <Alert/> <br />
        <Alert/> <br />


      </div>
    </>

  );
}

export default App;
