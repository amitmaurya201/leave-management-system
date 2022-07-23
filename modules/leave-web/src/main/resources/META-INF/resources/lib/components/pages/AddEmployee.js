import axios from 'axios';
import {useState} from "react";
import React from "react";

function AddEmployee() { 
	let [employeecode, setEmployeeCode] = useState("");
	let [employeename, setEmployeeName] = useState("");
	let [employeedateofjoining, setEmployeeDateOfJoining] = useState("");
	
	 const add=()=>{
		  axios({
		        method: 'post',
		        url: 'http://localhost:8080/api/jsonws/leave.employee/add-employee-details/employee-code/'+employeecode+'/employee-name/'+employeename+'/date-of-joining/'+employeedateofjoining+'/?p_auth='+Liferay.authToken
		  
		  })
		    .then((result)=> {
		  console.log(result.data);
	  })
	  .catch((error)=> {
		  console.log(error);
	  })}
	 var submitform=()=>{
		     
		 if(employeecode!="" && employeename!="" && employeedateofjoining!="" && employeecode!=null && employeename!=null  && employeedateofjoining!=null){
		    add();}
		    }
		  
	  return (
	  <div className="container">
	  <div className="py-4">
	  <h1>Add Employee Form</h1> <br></br>
	  <form onSubmit={submitform}>
	  <div class="form-group">
	   <label for="exampleInputEmail1">Employee Code</label>
	  <input type="text" class="form-control" placeholder="Enter the Employee Code" name="employeecode" onChange={(e)=>{ setEmployeeCode(e.target.value)}} required/> <br/><br/>
	  </div>
	  <div class="form-group">
	    <label for="exampleInputPassword1">Employee Name</label>
      <input type="text" class="form-control" placeholder="Enter the Employee Name" name="employeename" onChange={(e)=>{ setEmployeeName(e.target.value)}} required/><br/><br/>
	  </div>
	  <div class="form-group">	
	  <label for="exampleInputPassword1">Date Of Joining</label>
      <input type="date" class="form-control" placeholder="Enter the Date Of Joining" name="employeedateofjoining" onChange={(e)=>{ setEmployeeDateOfJoining(e.target.value)}} required/><br/><br/>
	  </div>  
	  <button type="submit" class="btn btn-primary">Submit</button>
		  </form>
	  </div>	  
	  </div>
	  );
	}
export default AddEmployee;
	 
