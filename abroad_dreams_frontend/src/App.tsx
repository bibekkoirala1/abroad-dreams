
import {createBrowserRouter, RouterProvider} from "react-router-dom";

import Home from "./pages/Home.tsx";
import './App.css'

function App() {


  return (
    <>
        <RouterProvider router={createBrowserRouter([
            {path:"/",element:<Home />}
        ])} />

    </>
  )
}

export default App
