import useState from 'react';
import useEffect  from 'react';
// import MySound from "../assets/sounds/cigale.mp3"

const Timer = () => {
    const [nomMinuteur, setNomMinuteur] = useState('Mon Minuteur');
    const [duree, setDuree] = useState(60); // Temps en secondes
    const [tempsRestant, setTempsRestant] = useState(duree);
    const [enCours, setEnCours] = useState(false);



   useEffect(() => {
let interval;
    if (enCours && tempsRestant > 0) {
      interval = setInterval(() => {
        setTempsRestant(tempsRestant - 1);
      }, 1000);
    }

    return () => {
      clearInterval(interval);
    };
  }, [enCours, tempsRestant]);

  const demarrerMinuteur = () => {
    setEnCours(true);
  };

  const arreterMinuteur = () => {
    setEnCours(false);
  };

  const reinitialiserMinuteur = () => {
    setEnCours(false);
    setTempsRestant(duree);
  };

  // const playMySound = () => {
  //   const newSound = new Audio(MySound)
  //   newSound.play()
  // }

  return (
    <div>
      <h1>{nomMinuteur}</h1>
      <p>Temps restant : {tempsRestant} secondes</p>
      <input
        type="text"
        placeholder="Nom du minuteur"
        value={nomMinuteur}
        onChange={(e) => setNomMinuteur(e.target.value)}
      />
      <input
        type="number"
        placeholder="Durée en secondes"
        value={duree}
        onChange={(e) => setDuree(parseInt(e.target.value))}
      />
      <button onClick={demarrerMinuteur}>Play</button>
      <button onClick={arreterMinuteur}>Pause</button>
      <button onClick={reinitialiserMinuteur}>Réinitialiser</button>
    </div>
  );
}

export default Timer;