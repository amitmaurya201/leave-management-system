import React from 'react';
import {useState} from 'react';
import axios from 'axios';
function AddLeaveReason() {
	
	let[leaveReasonCode, setLeaveResonCode]=useState("");
	let[leaveReasonDescription,setLeaveReasonDescription]=useState("");	
	
	const leavefunction=()=>{
		axios({
			method:'post',
			url:'http://localhost:8080/api/jsonws/leave.leavereason/add-leave-reason-details/reason-code/'+leaveReasonCode+'/reason-des/'+leaveReasonDescription+'/?p_auth='+Liferay.authToken
			
		})
		.then((result)=>	{
			console.log(result.data);
			
		})
		.catch((err)=>{
			console.log(result.data);
		})}
	
	const submitForm=(e)=>{
		//e.preventDefault();
		if(leaveReasonCode!="" && leaveReasonDescription!="" && leaveReasonCode!=null && leaveReasonDescription!=null){
			leavefunction();
		}
	}
		
  return (<div>
    <div className='App'>
		  <h1>Add Leave Reason Form</h1><br></br>
    <form onSubmit={submitForm}>
      <div >
        <label>Leave Reason Code</label><br></br>
        <input className="form-control" type='text' placeholder="Enter Leave Reason Code" 
        	onChange={(e)=>{setLeaveResonCode(e.target.value)}} required/>
      </div><br></br>
        <div>
        <label>Leave Reason</label><br></br>
        <input className="form-control" type='text' placeholder="Enter Leave Reason Description"
        	onChange={(e)=>{setLeaveReasonDescription(e.target.value)}}required/>
      </div><br></br>
      <div>
        <button type="submit"  value="Submit" onClick= {()=>{setStatus(false)}} className= "btn btn-primary">Submit</button>
      </div>
      </form>
    </div></div>
  );
}
export default AddLeaveReason;
   