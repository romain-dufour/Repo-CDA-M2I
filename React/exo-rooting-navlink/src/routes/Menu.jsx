import { NavLink, Outlet } from "react-router-dom"

function Menu() {

    const
        handleNavLinkClasses= ({ isActive, isPending } ) => {
                return isPending ? "pending-class" : isActive ? "active-class" : ""}

                return (
                    <div>
                        <header className="row">
                            <h1 className=" text-danger">eWebsite</h1>
                            <div className="">
                            <NavLink to="/" className={handleNavLinkClasses}>Home</NavLink>
                            </div>
                            <div>
                            <NavLink to="/MyProjects" className="nav-link">My Projects</NavLink>
                            </div>
                            <div>
                            <NavLink to="/About" className={handleNavLinkClasses}>About</NavLink>
                            </div>
                            <div>
                            <NavLink to="/Contact" className={handleNavLinkClasses}>Contact Me</NavLink>

                            </div>
                        </header>
                        <Outlet />
                    </div>
                )
            }

    export default Menu