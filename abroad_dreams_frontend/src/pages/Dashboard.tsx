// Importing the CSS file
import "../css/Dashboard.css";

// Dashboard component
function Dashboard() {
  

return(

  <div className="header">

    <div className="left-section">
      <img className="dream-logo" src="src\assets\logo\ad-square-logo.svg"/>
      <div className="dashboard-button-container">
        <button className="dashboard-button" >Users</button>
        <button className="dashboard-button" >Institutions</button>
        <button className="dashboard-button" >Courses</button>
        <button className="dashboard-button" >Teachers</button>
        <button className="dashboard-button" >Classrooms</button>
        <button className="dashboard-button" >Payments</button>
      </div>
      <img className="ham-logo" src="src/assets/home-slideshow/Hamburger_icon.png" alt="" />
    </div>
      <div className="left-container">
        
      </div>

      {/* Middle Section */}
      <div className="middle-section">
        <input className="search-bar-section" placeholder="College Search" type="text" />
        <ul>
          <li>My Colleges</li>
          <li>Common App</li>
          <li>Financial Aids</li>
        </ul>
      </div>

      {/* Right Section */}
      <div className="right-section">
        <img className="notification-logo" src="src/assets/home-slideshow/notification-icon.png" alt="Notification Logo" />
        <img className="profile-image" src="src/assets/home-slideshow/profile.jpg" alt="Profile Image" />
        <div className="admin-info">
          <h3>Karan Bohara</h3>
        </div>
      </div>
  
    </div>
  )
}

export default Dashboard;
