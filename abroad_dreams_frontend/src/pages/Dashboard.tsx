import "../css/Dashboard.css";


function Dashboard() {
  

return(

  <div className="header">

    <div className="left-section">
    <img className="dream-logo" src="src/assets/logo/ad-square-logo.svg"/>
      <img className="ham-logo" src="src/assets/home-slideshow/Hamburger_icon.png" alt="" />
      <div className="left-container">
      </div>
    </div>
    <div className="middle-section">
      <input className="search-bar-section" placeholder="Search  for" type="text" /></div>
    <div className="right-section">

    <img className="notification-logo" src="src/assets/home-slideshow/notification-icon.png" alt="no img" />

    <img className="profile-image" src="src/assets/home-slideshow/profile.jpg" alt="no img" />

    <div className="admin-info">
      <h3>Karan Bohara</h3>
    </div>


    
    </div>
  </div>



)
};



export default Dashboard;
