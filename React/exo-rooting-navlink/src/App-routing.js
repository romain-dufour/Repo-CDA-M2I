import { createBrowserRouter } from "react-router-dom";
import Home from "./routes/Home";
import MyProject from "./routes/MyProjects";
import About from "./routes/About";
import Contact from "./routes/Contact";
import ErrorPage from "./routes/ErrorPage";
import Menu from "./routes/Menu";


const router = createBrowserRouter([
    {
        path:"/",
        element:<Menu/>,
        errorElement : <ErrorPage/>,
        children : [
            {
                path :"/",
                element : <Home/>
            },
            {
                path :"/MyProjects",
                element : <MyProject/>
            },
            {
                path: "/About",
                element : <About/>
            },
            {
                path: "/Contact",
                element : <Contact/>
            }
        ]
    }
])

export default router