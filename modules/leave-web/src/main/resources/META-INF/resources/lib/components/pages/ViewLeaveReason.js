import React from "react";
import axios from 'axios';
import {useState ,useEffect} from "react";
import ReactDOM from "react-dom";
import AddLeaveReason from './AddLeaveReason';

const ViewLeaveReason = () => {

const [leaveReason , setLeaveReason]= useState([]);
const[status,setStatus]=useState(true);

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
	useEffect(() => {

		fetchData();

	 
   },[]);

 function deleteReason(id) {
	console.log(id);

	 let text1 = "Are you sure to delete ?";
     if(confirm(text1)==true){
	
    fetch(`http://localhost:8080/api/jsonws/leave.leavereason/delete-leave-reason/leave-reason-id/${id}/?p_auth=`+Liferay.authToken,{
    	method:'DELETE'
    }).then((result)=>{
    	result.json().then((resp)=>{
			console.warn(resp)
				  fetchData();
    	})
    		
    })  
  }
}
return (<div>
		
		{status?<span>
		<br></br>
<button type="button" onClick={()=>{setStatus(false)}} className="btn btn-primary">Add Reason</button>
<br></br>
<br></br>
<table className="table table-bordered">
<thead className="thead-dark">
  <tr>
    <th>S.NO</th>
    <th>Leave Reason Code</th>
    <th>Leave Reason Description</th> 
    <th>Action</th>
  </tr>
</thead>
<tbody>
		{
			leaveReason.map((leave,index)=>{
				return( 
				  <tr>
				    <td>{index+1}</td>
				    <td>{leave.leaveReasonCode}</td>
				    <td>{leave.leaveReasonDescription}</td>
				    <td><button type="button" class="btn btn-danger" onClick={()=>{deleteReason(leave.leaveReasonId)}} >Delete</button>
				    <br></br>
				    <br></br>
				    <button type="button" class="btn btn-primary">Edit</button></td>
				  </tr>
				)	
		     })
		}
		</tbody>
		</table></span>:<AddLeaveReason/>}
        </div>	
);
}
export default ViewLeaveReason;