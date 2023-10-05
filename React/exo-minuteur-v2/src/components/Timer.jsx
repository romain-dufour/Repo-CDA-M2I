import { useState} from "react";
import { useEffect} from "react";
import dringSound from "./assets/sounds/cigale.mp3"

const Timer=({ name, duration })=> {
  const [timeRemaining, setTimeRemaining] = useState(duration);
  const [isExpired, setIsExpired] = useState(false);

  const playMySound = () => {
    const newSound = new Audio(dringSound)

    newSound.play()
  }

  useEffect(() => {
    const interval = setInterval(() => {
      setTimeRemaining((prevTime) => {
        if (prevTime === 0) {
          setIsExpired(true);
          clearInterval(interval);
          return 0;
        }
        return prevTime - 1;
      });
    }, 1000);

    return () => {
      clearInterval(interval);
    };
  }, [duration]);

  useEffect(() => {
    if (isExpired) {
        playMySound()
      // Faire clignoter et jouer un son (vous pouvez utiliser des bibliothèques tierces pour cela).
    }
  }, [isExpired]);

  return (
    <div>
      <h2>{name}</h2>
      <p>Time Remaining: {timeRemaining} seconds</p>
      {/* Ajoutez ici la jauge qui se remplit au fur et à mesure */}
    </div>
  );
}

export default Timer;
