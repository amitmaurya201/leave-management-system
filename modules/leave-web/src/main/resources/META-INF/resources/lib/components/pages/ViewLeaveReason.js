import React from "react";
import axios from 'axios';
import {useState ,useEffect} from "react";
import ReactDOM from "react-dom";
import AddLeaveReason from './AddLeaveReason';

const ViewLeaveReason = () => {

const [leaveReason , setLeaveReason]= useState([]);
const[status,setStatus]=useState(true);

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

 function handleRemove(id)
 {
	console.log(id)
;
  
    fetch(`http://localhost:8080/api/jsonws/leave.leavereason/delete-leave-reason/leave-reason-id/${id}/?p_auth=`+Liferay.authToken,{
    	method:'DELETE'
    }).then((result)=>{
    	result.json().then((resp)=>{
    		console.warn(resp)
    	})
    		
    })  
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
				    <td><button type="button" class="btn btn-danger" onClick={()=>{handleRemove(leave.leaveReasonId)}} >Delete</button>
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