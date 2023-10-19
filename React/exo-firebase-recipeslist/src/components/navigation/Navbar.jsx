import { Link } from "react-router-dom";


function Navbar() {
    return (
        <>
            <nav className="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
                <div className="container-fluid row">
                    <span className="navbar-brand"></span>
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