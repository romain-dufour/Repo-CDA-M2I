import { NavLink , Outlet} from "react-router-dom"

function Menu()  {
    return(
        <div>
        <header>
        <h1>eWebsite</h1>
                <NavLink to="/">Home</NavLink>
                <NavLink to="/MyProjects">My Projects</NavLink>
                <NavLink to="/About">About</NavLink>
                <NavLink to="/Contact">Contact Me</NavLink>
        </header>
        <Outlet/>
        </div>
    )}

    export default Menu