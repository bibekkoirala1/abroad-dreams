import { useState } from "react";
import "../css/Home.css";

function Home(){
    const [showPassword, setShowPassword] = useState(false);

    const togglePasswordVisibility = () => {
        setShowPassword((prevShowPassword) => !prevShowPassword);
    };

    return (
        <div>
            <div className="header">
                <div className="logo">
                    <img src="src/assets/logo/ad-square-logo.svg"/>
                </div>

                <div className="links">
                    <a href="#">Home</a>
                    <a href="#">Services</a>
                    <a href="#">Who We Are</a>
                    <a href="#">Contact Us</a>
                </div>

                <div className="login-register">

                    <input type="email" alt="Email" placeholder="Enter Email" />
                    <input
                        type={showPassword ? "text" : "password"}
                        alt="Password"
                        placeholder="Enter Password"
                    />
                    <input
                        type="checkbox"
                        id="showPasswordCheckbox"
                        checked={showPassword}
                        onChange={togglePasswordVisibility}
                    />
                    <label className="showPasswordCheckbox">Show Password</label>
                        <button type="submit" className="btn-login" name="Login">Login</button>
                        <button type="submit" className="btn-register" name="Register">Register</button>
                </div>

            </div>

            <div className="main-body">
            <div className="slider-frame">
            <div className="slide-images">
                    <div className="img-container">
                        <img src="src/assets/home-slideshow/slideshow-1.jpg"/>
                    </div>
                    <div className="img-container">
                    <img src="src/assets/home-slideshow/slideshow-2.jpg"/>
                    </div>
                    <div className="img-container">
                    <img src="src/assets/home-slideshow/slideshow-3.jpg"/>
                    </div>
            </div>
        </div>
            </div>



            <div className="footer">
                <p>&copy; 2023 Abroad Dreams. All rights reserved.</p>
            </div>




        </div>


    )
}

export default Home;