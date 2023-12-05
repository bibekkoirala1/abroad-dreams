
import {createBrowserRouter, RouterProvider} from "react-router-dom";
import Dashboard from "./pages/Dashboard.tsx";

import Home from "./pages/Home.tsx";

import './App.css'

function App() {


  return (
    <>
        <RouterProvider router={createBrowserRouter([
            {path:"/",element:<Home />},
            {path:"/dashboard" , element:<Dashboard />}
            
        ])} />

    </>
  )
}

export default App
