import { NavLink, Outlet } from "react-router-dom"


function Menu() {


    return (


        <div>
            <header>
                <h1>eWebsite</h1>
                <div>
                    <NavLink to="/" >Home</NavLink>
                </div>
                <div>
                    <NavLink to="/contacts">Contacts</NavLink>

                </div>
            </header>
            <Outlet />
        </div>
    )
}

export default Menu