import { useState } from "react";
import TimerForm from "./TimerForm";
import Timer from "./Timer";

function App() {
  const [timers, setTimers] = useState([]);

  const handleTimerCreate = (newTimer) => {
    if (timers.length < 5) {
      setTimers([...timers, newTimer]);
    }
  };

  return (
    <div className="App">
      <h1>Timer App</h1>
      <TimerForm onTimerCreate={handleTimerCreate} />
      <div className="timer-container">
        {timers.map((timer, index) => (
          <Timer
            key={index}
            name={timer.name}
            duration={parseInt(timer.duration)}
          />
        ))}
      </div>
    </div>
  );
}

export default App;
