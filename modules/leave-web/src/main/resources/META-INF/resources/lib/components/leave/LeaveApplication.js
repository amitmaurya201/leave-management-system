/*import React from "react";
import axios from 'axios';
import { useState, useEffect } from "react";
import ReactDOM from "react-dom";


const LeaveApplication = () => {

	const [employeeId, setEmployeeId] = useState("");
    const [leaveReasonId, setLeaveReasonId] = useState("");
    const [leaveTypeId, setLeaveTypeId] = useState("");
    const [startDate, setStartDate] = useState("");
    const [endDate, setEndDate] = useState("");
    const [startInHalfDay, setStartInHalfDay] = useState(false);
    const [startInEndDay, setStartInEndDay] = useState(false);
    const [actualJoiningDate, setActualJoiningDate] = useState("");
    const [remark, setRemark] = useState("");
    const [reportingManager, setReportingManager] = useState("");
    const [documentId, setDocumentId] = useState("");
    const [joinInHalfDay, setJoinInHalfDay] = useState("");
    
    
    
    
    const startInHalfDayHandleChange = () => {
    	setStartInHalfDay(!startInHalfDay);
    };

    const startInEndDayHandleChange = () => {
    	setStartInEndDay(!startInEndDay);
    };
	
    const saveLeaveApplication = () => {
        alert(startDate + endDate + startInHalfDay + startInEndDay + remark + actualJoiningDate + status + reportingManager)
        axios.post(
            `http://localhost:8080/api/jsonws/leave.leaveapplication/add-leave-application-detail/leave-reason-id/${leaveReasonId}/employee-id/${employeeId}/leave-type-id/${leaveTypeId}/start-date/${startDate}/end-date/${endDate}/start-in-half-day/${startInHalfDay}/end-in-half-day/${startInEndDay}/actual-joining-date/${actualJoiningDate}/remark/${remark}/document-id/${documentId}/status/${status}/reporting-manager/${reportingManager}/join-in-half-day/${joinInHalfDay}
             /?p_auth=`+ Liferay.authToken
        )
            .then((res) => {
                console.log(res.data);
            })
    }

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
  <input type="date" class="form-control" name="startDate" onChange={e=>setStartDate(e.target.value)} />
  <br></br>
  <label for="exampleInputPassword1"><b>End Date</b></label>
  <input type="date" class="form-control" name="endDate" onChange={e=>setEndDate(e.target.value)} />
  <br></br>
  <div class="form-check form-check-inline">
  <input class="form-check-input" type="checkbox" name="startInHalfDay" value="option1" onChange={e=>setStartDate(e.target.value)}/>
  <label class="form-check-label" for="inlineCheckbox1">Start In Half Day</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="checkbox" name="startInEndDay" value="option2" onChange={e=>setStartInEndDay(e.target.value)}/>
  <label class="form-check-label" for="inlineCheckbox2">End In Half Day</label>
</div><br></br>
<br></br>
<label for="exampleInputPassword1"><b>Actual Joining Date</b></label>
  <input type="date" class="form-control" name"actualJoiningDate" />
  <br></br>
  <label for="exampleInputEmail1"><b>Join In Half Day</b></label><br></br>

<select class="form-select form-control" onChange={e=>setJoinInHalfDay(e.target.value)}>
  <option selected>Select</option>
  <option value="No">Half Day</option>
  <option value="Yes">Full Day</option>
  
</select>
<br></br>
<div class="form-group">
    <label for="exampleInputEmail1"><b>Remark</b></label>
    <input type="text" class="form-control" name="remark" placeholder=" " onChange={e=>setRemark(e.target.value)}/>
  </div><br></br>
  <label for="exampleInputEmail1"><b>Leave Reason</b></label><br></br>

<select class="form-select form-control" onChange={e=>setLeaveReasonId(e.target.value)}>
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
  <input class="form-control" type="file" id="formFile" />
</div><br></br>
<label for="exampleInputEmail1"><b>Reporting Manager</b></label><br></br>

<select class="form-select form-control" onChange={e=>setReportingManager(e.target.value)}>
  <option selected>Select</option>
  <option>Amit Sir</option>
  <option>Deepanshu Sir</option>
 <option>Divya Ma'am</option>
</select>
<br></br>
<br></br>
  <button type="submit" class="btn btn-primary">Submit Leave</button>
</form>
</div>
</div>
);
};
export default LeaveApplication; */