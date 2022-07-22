import React from "react";
import axios from 'axios';
import {useState ,useEffect} from "react";
import ReactDOM from "react-dom";
import AddEmployee from "./AddEmployee";

const ViewEmployee = () => {

const [employees , setEmployees]= useState([]);
const [status,setStatus]=useState(true);


useEffect(() => {
    const fetchData =  () => {
  axios({
	        method: 'get',
	        url: 'http://localhost:8080/api/jsonws/leave.employee/get-employees-list/?p_auth='+Liferay.authToken
	  })
	  .then((res)=> {
		  console.log(res.data);
		  setEmployees(res.data);
	  })
	  .catch((err)=> {
		  console.log(err);
	  })};
	  fetchData();
   },[]);


function handleRemove(id)
{
	console.log(id)
;

   fetch(`http://localhost:8080/api/jsonws/leave.employee/delete-employee-detail/employee-id/${id}/?p_auth=`+Liferay.authToken,{

   	method:'DELETE'
   }).then((result)=>{
   	result.json().then((resp)=>{
   		console.warn(resp)
   	})
   		
   })

   
 }






return (<div>
		
		{status?<span>

		<br></br><button type="button" onClick={()=>{setStatus(false)}} className="btn btn-info">Add Employee</button><br></br>

		<br></br><table className="table table-bordered">
<thead className="thead-dark">
  <tr>
    <th>S.NO</th>
    <th>Employee Code</th>
    <th>Employee Name</th> 
    <th>Date Of Joining</th>
    <th>Action</th>

    </tr>
</thead>
<tbody>
		{
			employees.map((employee,index)=>{
				return( 
				  <tr>
				    <td>{index+1}</td>
				    <td>{employee.employeeCode}</td>
				    <td>{employee.employeeName}</td>
				    <td>{employee.dateOfJoining}</td>
				    <td><button type="button" class="btn btn-danger" onClick={()=>{handleRemove(employee.employeeId)}} >Delete Employee	</button>
				   <br></br>
				   <br></br>
				    <button type="button" class="btn btn-info">Edit Employee</button></td>
				  </tr>
				)	
		     })
		}
		</tbody>
		</table></span>:<AddEmployee/>}
        </div>	
);

}
export default ViewEmployee; 