import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap-icons/font/bootstrap-icons.min.css';
import { Link } from 'react-router-dom';

function Menu() {
    // const setStorage = () => {
    //     const adminLogin = {
    //         identite: "a",
    //         mdp: "a",
    //     }

    //     localStorage.setItem("login", JSON.stringify(adminLogin))
    // }


//   const setStorage = () => {
//       console.log("j'appuie sur le bouton")
//       localStorage.setItem("role","Admin")
//   }
    const linkStyle = {
        color: 'white',  
        textDecoration: 'none', 
    };

    return (
        <>
            <nav className="navbar navbar-expand-lg bg-secondary">
                <div className="container-fluid">
                    <a className="navbar-brand" href="#"><Link to="/" style={linkStyle}>Mon Site E-commerce</Link></a>
                    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span>
                    </button>
                    <div className="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                            <li className="nav-item">
                            <a className="nav-link active" aria-current="page" href="#"><Link to="/panier" style={linkStyle}>Panier</Link></a>
                            </li>
                        </ul>
                        <ul className="navbar-nav">
                            <li className="nav-item">
                            <a className="nav-link active" aria-current="page" href="#" ><Link to="/FormIdentite" style={linkStyle}>Administration</Link></a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </>
    )
}

export default Menu;
