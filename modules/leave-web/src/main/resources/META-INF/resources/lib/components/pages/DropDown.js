import React from "react";
import axios from 'axios';
import { useState, useEffect } from "react";
import ReactDOM from "react-dom";



const DropDown = () => {
	
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

	 
	return (
			
			<div>
			 <label>LeaveType:</label>
	            <select class="form-select form-control">
	            <option selected>Open  select menu</option>
			{leaveType.map((leave, index) => {
				return (

						<option>{leave.leaveName}</option>				
			)})
			}
			</select>
			<button type="button" class="btn btn-danger"  >Delete</button>

			
			</div>
	);
}
export default DropDown	