import classes from './MyForm.module.css'


const Table = (props) => {
    /* eslint-disable react/prop-types */
    const { user } = props


    return (
        <table className={classes.table}>
            <thead>
                <tr>
                    <th>nom</th>
                    <th>prenom</th>
                    <th>Date de naissance</th>
                </tr>
            </thead>
            <tbody>
            {user.map((person, index) => (
                    <tr key={index}>
                        <td>{person.lastName}</td>
                        <td>{person.firstName}</td>
                        <td>{person.bornDate}</td>
                    </tr>
                ))}
            </tbody>
        </table >
    )
}

export default Table