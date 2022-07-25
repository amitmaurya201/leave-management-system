import React from 'react';
import ReactDOM from 'react-dom';
import {useState} from 'react';
import axios from "axios";

function AddLeaveType(){
	let [leaveCode, setLeaveCode] = useState("");
	let [leaveName, setLeaveName] = useState("");
	let [count,setCount]= useState("");
	
	 const add=()=>{
	     axios({
	        method: 'post',
	        url: 'http://localhost:8080/api/jsonws/leave.leavetype/create-leave-type/leave-code/'+leaveCode+'/leave-name/'+leaveName+'/count/'+count+'/?p_auth='+Liferay.authToken           
	  
	  })
	  .then((result)=> {
		  console.log(result.data);
	  })
	  .catch((error)=> {
		  console.log(error);
	  })}
	 var submitform=(e)=>{
		   //e.preventDefault(); 
		 if(leaveCode!="" && leaveName!="" && count!="" && leaveCode!=null && leaveName!=null && count!=null){
		    add();}
	 }
	return(
			<div>
			<h1>Add Leave Type Form</h1>
   <form onSubmit={submitform}>		
	 <label>LeaveCode</label><br></br>
	<input  type="text"  className='form-control' placeholder="Enter LeaveCode" name="leaveCode" onChange={(e)=>{setLeaveCode(e.target.value)}} required></input>
	  <br></br>
	 <label>LeaveName</label>
	<input type="text" className='form-control'  placeholder="Enter LeaveName" name="leaveName" onChange={(e)=>{setLeaveName(e.target.value)}} required></input>
	<br></br>
	 <label>Count (Monthly)</label>
	<input  className='form-control' type="text"  placeholder="Enter count" name="count" onChange={(e)=>{setCount(e.target.value)}}></input>	
	<br></br>
	<input type="submit" className= "btn btn-primary" value="Submit"></input>
	</form>
	</div>
	);
}
export default AddLeaveType;