import { Link } from "react-router-dom";
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap-icons/font/bootstrap-icons.min.css';

function Navbar() {
    return (
        <>
            <nav classNameName="navbar navbar-expand-lg bg-secondary">
                <div className="container-fluid row">
                    <div className="col-6 me-auto">
                        <Link to={"/"}> Mon Site E-commerce</Link>
                    </div>
                    <div className="col-6">
                        <Link to={"/Signform"}> Sign Out</Link>                    
                    </div>
                </div>
            </nav>
        </>
    )
}
export default Navbar;