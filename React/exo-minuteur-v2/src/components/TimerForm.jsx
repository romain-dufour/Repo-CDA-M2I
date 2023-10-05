import { useState } from "react";

const TimerForm=({onTimerCreate})=>{

  const [timerName, setTimerName] = useState("");
  const [timerDuration, setTimerDuration] = useState("");

  const handleCreateTimer = () => {
    if (timerName && timerDuration) {
      onTimerCreate({ name: timerName, duration: timerDuration });
      setTimerName("");
      setTimerDuration("");
    }
  };


  return (
    <div>
      <h2>Create Timer</h2>
      <input
        type="text"
        placeholder="Timer Name"
        value={timerName}
        onChange={(e) => setTimerName(e.target.value)}
      />
      <input
        type="number"
        placeholder="Duration (in seconds)"
        value={timerDuration}
        onChange={(e) => setTimerDuration(e.target.value)}
      />
      <button onClick={handleCreateTimer}>Create</button>
    </div>
  );
}

export default TimerForm;
