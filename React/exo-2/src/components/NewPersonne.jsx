const NewPerson = (props) => {

    const { persons } = props
  


    if (persons) {
        return (
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Firstname</th>
                        <th scope="col">Lastname</th>
                    </tr>
                </thead>
                <tbody>
                {persons.map((person,i) =>
                    <tr> key={i}
                        <th scope="row">{i}</th>
                        <td>{person.firstname}</td>
                        <td>{person.lastname}</td>
                    </tr>
    )}

                </tbody>
            </table>)
    }
    else {
        return (
            <div>Il n'y a personne dans la base de données</div>
        )
    }

}

export default NewPerson