import { useContext } from "react"
import { MonContext } from "../context/MonContext"


const FormulaireChien = () => {

    const [name, setName] = useContext(MonContext)
    const [race, setRace] = useContext(MonContext)
    const [date, setDate] = useContext(MonContext)
    const [photo, setPhoto] = useContext(MonContext)

    const addCard = () => {

    }
    return (
        <>
            <div className="col-12  ">
                <img className="rounded-circle" src="https://picsum.photos/id/237/200/300" />
            </div>
            <div className="col-6 text-center  ">
                <label className="mx-4" htmlFor="nom">Nom</label>
                <input type="text" value={name} onInput={(e) => setName(e.target.value)} />
            </div>
            <div className="col-6 text-center  ">
                <label className="mx-4" htmlFor="race">Race</label>
                <input type="text" value={race} onInput={(e) => setRace(e.target.value)} />
            </div >
            <div className="col-6 text-center ">
                <label className="mx-4" htmlFor="DateDeNaissance">Date de naissance</label>
                <input type="text" value={date} onInput={(e) => setDate(e.target.value)} required />
            </div>
            <div className="col-6 text-center ">
                <label className="mx-4" htmlFor="image">Lien vers la photo</label>
                <input type="text" value={photo} onInput={(e) => setPhoto(e.target.value)} required />
            </div>

            <div>
                <button className="btn btn-dark" onClick={addCard()}>Ajouter</button>
            </div>

        </>

    )
}

export default FormulaireChien