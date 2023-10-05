// import dringSound from './assets/sounds/cigales.mp3'


function TimerForm(props) {

    const nbrTimer = props

    


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
    )
}

export default TimerForm