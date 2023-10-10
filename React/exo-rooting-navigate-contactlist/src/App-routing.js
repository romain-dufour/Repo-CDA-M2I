import { createBrowserRouter } from "react-router-dom";
import Home from "./routes/Home";
import ErrorPage from "./routes/ErrorPage";
import FormInfos from "../src/components/FormInfos";
import Contacts from "./routes/Contacts";
import Menu from "./routes/Menu";


const router = createBrowserRouter([
    {
        path: "/",
        element: <Menu />,
        errorElement: <ErrorPage />,
        children : [
        {
            path: "/",
            element: <Home />,
        },
        {
            path: "/contacts",
            element: <Contacts/>,
        }    ,{
            path: "/contacts/ajouter",
            element: <FormInfos />,
        }

    ]
    
    }

])

export default router