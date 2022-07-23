
import React from "react";
import ViewEmployee from "./components/ViewEmployee";
import Navbar from "./components/Navbar";
import Home from "./components/Home";
import LeaveApplication from "./components/LeaveApplication";
import ViewReasonForm from "./components/ViewReasonForm";
import ViewLeaveForm from "./components/ViewLeaveForm";
import ScheduleLeave from "./components/ScheduleLeave";


import {BrowserRouter as Router,Routes,Route} from "react-router-dom";

function App() {
	
	/*const p_id = getP_id();*/
  return (
   <Router>
  <div className="App">	
  <Navbar/>
  

  <Routes>

    <Route exact path="/web/guest/leave-management/-/leaveapplication_INSTANCE_HoUXgLr2V2n0/homes" element={<Home />}></Route>
    <Route exact path="/web/guest/leave-management/-/leaveapplication_INSTANCE_HoUXgLr2V2n0/view-employee" element={<ViewEmployee />}></Route>
    <Route exact path="/web/guest/leave-management/-/leaveapplication_INSTANCE_HoUXgLr2V2n0/leave-application" element={<LeaveApplication />}></Route>
    <Route exact path="/web/guest/leave-management/-/leaveapplication_INSTANCE_HoUXgLr2V2n0/view-reason" element={<ViewReasonForm />}></Route>
    <Route exact path="/web/guest/leave-management/-/leaveapplication_INSTANCE_HoUXgLr2V2n0/view-leave-type" element={<ViewLeaveForm />}></Route>
    <Route exact path="/web/guest/leave-management/-/leaveapplication_INSTANCE_HoUXgLr2V2n0/schedule-Leave" element={<ScheduleLeave />}></Route>

     
    </Routes>
  
  </div>
  </Router>
  );
}

export default App;