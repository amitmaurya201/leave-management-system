import React from "react";

const Navbar = () => {
return (
<div>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
<div class="container-fluid">
  <a class="navbar-brand" href="/web/guest/leave-app/-/leaveapplication_INSTANCE_1BuZmwhraoDu/homes"><b>Leave Management System</b></a>

  <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
     <a class="nav-link " href="/web/guest/leave-app/-/leaveapplication_INSTANCE_1BuZmwhraoDu/view-employee"><b>Employee</b></a>
      <a class="nav-link" href="/web/guest/leave-app/-/leaveapplication_INSTANCE_1BuZmwhraoDu/view-leave-type"><b>Leave Type</b></a>
      <a class="nav-link" href="/web/guest/leave-app/-/leaveapplication_INSTANCE_1BuZmwhraoDu/view-reason"><b> Leave Reason</b></a>
      <a class="nav-link" href="/web/guest/leave-app/-/leaveapplication_INSTANCE_1BuZmwhraoDu/schedule-Leave"><b>Schedule Leave</b></a>
      <a class="nav-link" href="/web/guest/leave-app/-/leaveapplication_INSTANCE_1BuZmwhraoDu/dropdown"><b>Leave Summary</b></a>
    </div>    
  </div>
</div>
</nav>

</div>


);


};
export default Navbar; 