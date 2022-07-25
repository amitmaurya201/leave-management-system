import React from "react";
import axios from 'axios';
import { useState, useEffect } from "react";
import ReactDOM from "react-dom";
import AddLeaveType from './AddLeaveType';

const ViewLeaveForm = () => {
	let [status, setStatus] = useState(true);
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
	function deleteLeave(id)
 {
		console.log(id)
;
		fetch(`http://localhost:8080/api/jsonws/leave.leavetype/delete-leave-type/leave-type-id/${id}/?p_auth=` + Liferay.authToken, {
			method: 'DELETE'
		}).then((result) => {
			result.json().then((resp) => {
				console.warn(resp)
				getLeaveTypeList();
			})
		})
	}
	return (<div>
		{status ? <span>
		<br></br>
		<br></br>
			<button type="button" onClick={() => { setStatus(false) }} className='btn btn-primary'>Add Leave Type</button>
			<br></br>
			<br></br>
			<table className="table table-striped ">
				<thead className="thead-dark">
					<tr>
						<th>S.No</th>
						<th>LeaveCode</th>
						<th>LeaveName</th>
						<th>Leaves Allowed (Monthly)</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					{leaveType.map((leave, index) => {
						return (

							<tr>
								<td>{index + 1}</td>
								<td>{leave.leaveCode}</td>
								<td>{leave.leaveName}</td>
								<td>{leave.count}</td>
								<td><button type="button" className="btn btn-primary">Update</button>
								<br></br>
								<br></br>
									<button onClick={() => { deleteLeave(leave.leaveTypeId) }} className="btn btn-danger">Delete</button> </td>
							</tr>)
					})
					}
				</tbody>
			</table></span> : <AddLeaveType />}
	</div>
	);
}
export default ViewLeaveForm;