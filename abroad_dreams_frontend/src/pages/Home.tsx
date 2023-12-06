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
                <div className="course-finder">

                    <div className="search-container">
                        <input type="search" alt="course-search" placeholder="Search Available Courses" />

                        <select name="duration" id="duration">
                            <option value="">Select Duration</option>
                            <option value="short">1-2 Years</option>
                            <option value="medium">3 Years</option>
                            <option value="long">4 Years</option>
                        </select>

                        <select name="country" id="country">
                            <option value="">Select Country</option>
                            <option value="usa">United States</option>
                            <option value="uk">United Kingdom</option>
                            <option value="india">India</option>
                        </select>

                        <select name="subject" id="subject">
                            <option value="">Select Subject</option>
                            <option value="math">Mathematics</option>
                            <option value="science">Science</option>
                            <option value="history">History</option>
                        </select>

                        <button type="submit" className="btn-search" name="search">Search</button>
                    </div>
                </div>

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