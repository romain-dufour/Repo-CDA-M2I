// import dringSound from './assets/sounds/cigales.mp3'


function TimerForm(props) {

    const nbrTimer = props

    


    return (
        <div>
            <table>
                <tr>
                    <td>
                        <div>
                            <label htmlFor="Nom">Nom</label>
                            <input type="text" />
                        </div>
                        <div>
                            <label htmlFor="Nom">Temps</label>
                            <input type="text" />
                        </div>
                        <button >Play</button>
                    </td>
                    <td>
                        <input type="time" />
                    </td>
                </tr>

            </table>


        </div>
    )
}

export default TimerForm