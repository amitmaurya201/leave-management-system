import React from "react";
import axios from 'axios';
import { useState, useEffect } from "react";
import ReactDOM from "react-dom";





const LeaveApplication = () => {


	
	const [leaveType, setLeaveType] = useState([]);
	const getLeaveTypeList = () => {
		axios({
			method: 'get',
			url: 'http://localhost:8080/api/jsonws/leave.leavetype/get-leave-type-list/?p_auth=' + Liferay.authToken
		})
			.then((result) => {
				console.log(result.data);
			
				setLeaveType(result.data);
			})
			.catch((error) => {
				console.log(error);
			})
	};
	useEffect(() => {

		getLeaveTypeList();
	}, []);


	const [leaveReason , setLeaveReason]= useState([]);


	useEffect(() => {
	    const fetchData =  () => {
	  axios({
		        method: 'get',
		        url: 'http://localhost:8080/api/jsonws/leave.leavereason/get-leave-reason-list/?p_auth='+Liferay.authToken
		  })
		  .then((result)=> {
			  console.log(result.data);
			  setLeaveReason(result.data);
		  })
		  .catch((error)=> {
			  console.log(error);
		  })};
		  fetchData();
		 
	   },[]);
	
	const [selects,setSelects] = useState();
	
	
	return (
<div className="container">
<div className="py-4">
<h1>Leave Application</h1><br></br>
<form>
<label for="exampleInputEmail1"><b>Leave Type</b></label><br></br>

<select class="form-select form-control" value={selects} onChange={e=>setSelects(e.target.value)} > 
  <option selected>Select</option>
  {leaveType.map((leave, index) => {
		return (

				<option value={leave.count}>{leave.leaveName}</option>				
	)})
	}
  
</select>
<br></br>
  <div class="form-group">
    <label for="exampleInputEmail1"><b>Available Leaves</b></label>
    <input type="text" class="form-control" id="exampleInputEmail1"  placeholder={selects} readOnly/>
  </div><br></br>
  <div class="form-group">
    <label for="exampleInputPassword1"><b>Availed Leaves</b></label>
    <input type="text" class="form-control" id="exampleInputPassword1" placeholder="0" readOnly/>
  </div><br></br>
  <label for="exampleInputPassword1"><b>Start Date</b></label>
  <input type="date" class="form-control" id="exampleInputPassword1" />
  <br></br>
  <label for="exampleInputPassword1"><b>End Date</b></label>
  <input type="date" class="form-control" id="exampleInputPassword1" />
  <br></br>
  <div class="form-check form-check-inline">
  <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="option1"/>
  <label class="form-check-label" for="inlineCheckbox1">Start In Half Day</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="option2"/>
  <label class="form-check-label" for="inlineCheckbox2">End In Half Day</label>
</div><br></br>
<br></br>
<label for="exampleInputPassword1"><b>Actual Joining Date</b></label>
  <input type="date" class="form-control" id="exampleInputPassword1" />
  <br></br>
  <label for="exampleInputEmail1"><b>Join In Half Day</b></label><br></br>

<select class="form-select form-control" aria-label="Default select example">
  <option selected>Select</option>
  <option value="1">Half Day</option>
  <option value="2">Full Day</option>
  
</select>
<br></br>
<div class="form-group">
    <label for="exampleInputEmail1"><b>Remark</b></label>
    <input type="text" class="form-control" id="exampleInputEmail1"  placeholder=" "/>
  </div><br></br>
  <label for="exampleInputEmail1"><b>Leave Reason</b></label><br></br>

<select class="form-select form-control" aria-label="Default select example">
  <option selected>Select</option>
  {leaveReason.map((leave, index) => {
		return (

				<option>{leave.leaveReasonDescription}</option>				
	)})
	}
  
</select>
<br></br>
<div class="mb-3">
  <label for="formFile" class="form-label"><b>Attach Document</b></label>
  <input class="form-control" type="file" id="formFile"/>
</div><br></br>
<label for="exampleInputEmail1"><b>Reporting Manager</b></label><br></br>

<select class="form-select form-control" aria-label="Default select example">
  <option selected>Select</option>
  <option value="1">Amit Sir</option>
  <option value="2">Deepanshu Sir</option>
 <option value="2">Divya Ma'am</option>
</select>
<br></br>
<br></br>
  <button type="submit" class="btn btn-primary">Submit Leave</button>
</form>
</div>
</div>
);
};
export default LeaveApplication; 