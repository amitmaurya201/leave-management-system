
import React from "react";
import ViewEmployee from "./components/pages/ViewEmployee";
import Navbar from "./components/layout/Navbar";
import Home from "./components/Home";
import LeaveApplication from "./components/leave/LeaveApplication";
import ViewLeaveReason from "./components/pages/ViewLeaveReason";
import ViewLeaveType from "./components/pages/ViewLeaveType";
import ScheduleLeave from "./components/leave/ScheduleLeave";
import {BrowserRouter as Router,Routes,Route} from "react-router-dom";

function App() {
	
	/*const p_id = getP_id();*/
  return (
   <Router>
  <div className="App">	
  <Navbar/>
  <Routes>

    <Route exact path="/web/guest/leave-app/-/leaveapplication_INSTANCE_51UKnpHVuQDw/homes" element={<Home />}></Route>
    <Route exact path="/web/guest/leave-app/-/leaveapplication_INSTANCE_51UKnpHVuQDw/view-employee" element={<ViewEmployee />}></Route>
    <Route exact path="/web/guest/leave-app/-/leaveapplication_INSTANCE_51UKnpHVuQDw/leave-application" element={<LeaveApplication />}></Route>
    <Route exact path="/web/guest/leave-app/-/leaveapplication_INSTANCE_51UKnpHVuQDw/view-reason" element={<ViewLeaveReason />}></Route>
    <Route exact path="/web/guest/leave-app/-/leaveapplication_INSTANCE_51UKnpHVuQDw/view-leave-type" element={<ViewLeaveType />}></Route>
    <Route exact path="/web/guest/leave-app/-/leaveapplication_INSTANCE_51UKnpHVuQDw/schedule-Leave" element={<ScheduleLeave />}></Route>
   
    </Routes>
  </div>
  </Router>
  );
}

export default App;