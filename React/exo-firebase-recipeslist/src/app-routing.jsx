import { createBrowserRouter } from "react-router-dom";
import App from "./App";
import RecipesForm from "./components/recipes/RecipesForm";
import SignForm from "./components/auth/SignForm";
import ErrorPage from "./routes/ErrorPage";

const router = createBrowserRouter([
    {
        path : "/",
        element :<App />,
        errorElement:<ErrorPage/>
    },
    {
        path : "/Signform",
        element : <SignForm/>,
        errorElement : <ErrorPage />
    },
    {
        path : "/Recipesform",
        element : <RecipesForm/>,
        errorElement : <ErrorPage />
    },

])
export default router