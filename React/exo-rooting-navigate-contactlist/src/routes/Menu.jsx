import { NavLink, Outlet } from "react-router-dom"


function Menu() {


    return (




        <div>
            <header>
            <nav className="navbar navbar-expand-lg bg-body-dark">
  <div className="container-fluid">
    <a className="navbar-brand" href="#">eWebsite</a>
    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span className="navbar-toggler-icon"></span>
    </button>
    <div className="collapse navbar-collapse" id="navbarSupportedContent">
      <ul className="navbar-nav me-auto mb-2 mb-lg-0">
        <li className="nav-item">
          <NavLink to="/" className="nav-link active"  aria-current="page" href="#">Home</NavLink>
        </li>
      </ul>
    </div>
    <div className="collapse navbar-collapse" id="navbarSupportedContent">
      <ul className="navbar-nav me-auto mb-2 mb-lg-0">
        <li className="nav-item">
        <NavLink to="/contacts" className="nav-link active"  aria-current="page" href="#">Contacts</NavLink>
        </li>
      </ul>
    </div>
  </div>
</nav>
{/* 
                <h1>eWebsite</h1>
                <div>
                    <NavLink to="/" >Home</NavLink>
                </div>
                <div>
                    <NavLink to="/contacts">Contacts</NavLink>

                </div> */}
            </header>
            <Outlet />
        </div>
    )
}

export default Menu