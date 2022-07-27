import React from "react";
import axios from 'axios';
import {useState ,useEffect} from "react";
import ReactDOM from "react-dom";
import AddLeaveReason from './AddLeaveReason';
import Modal from 'react-modal';

const customStyles = {
		  content: {
		    top: '50%',
		    left: '50%',
		    right: 'auto',
		    bottom: 'auto',
		    marginRight: '-50%',
		    width:'70%',
		   
		    transform: 'translate(-50%, -50%)',
		  },
		};

const ViewLeaveReason = () => {
	
	let subtitle;
const [modalIsOpen, setIsOpen] = React.useState(false);
const [leaveReason , setLeaveReason]= useState([]);
const [leaveobj , setLeaveobj]= useState({});
const[status,setStatus]=useState(true);
const[leaveReasonCode, setLeaveReasonCode]=useState("");
const[leaveReasonDescription, setLeaveReasonDescription]=useState("");
const [leaveReasonId, setLeaveReasonId]=useState("");

function openModal(id) {
	 const newItem=leaveReason.find((leave)=>{
		   return leave.leaveReasonId==id})
	 setLeaveobj(newItem);	
	 setLeaveReasonId(newItem.leaveReasonId);
	 setIsOpen(true);
	 console.log(leaveReasonId);
  }

  function afterOpenModal() {
    // references are now sync'd and can be accessed.
    subtitle.style.color = '#f00';
  }

  function closeModal() {
    setIsOpen(false);
  }


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
	const updateData=()=>{
		axios({
			method:'post',
			url:'http://localhost:8080/api/jsonws/leave.leavereason/update-leave-reason/leave-reason-id/'+leaveReasonId+'/leave-reason-code/'+leaveReasonCode+'/leave-reason-description/'+leaveReasonDescription+'/?p_auth='+Liferay.authToken
		})
		.then((res)=>{
			console.log(res.data);
			
		})
		.catch((error)=>{
			console.log(error);
			
		})}
	const submitForm=(e)=>{
		//e.preventDefault();
		
		updateData();
		
	}



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
				    <button type="button" onClick={()=>{openModal(leave.leaveReasonId)}} className="btn btn-primary" >Edit</button></td>
				  </tr>
				)	
		     })
		}
		</tbody>
		</table></span>:<AddLeaveReason/>}
	      <Modal
	        isOpen={modalIsOpen}
	        onAfterOpen={afterOpenModal}
	        onRequestClose={closeModal}
	        style={customStyles}
	        contentLabel="Example Modal">
	        <h2 ref={(_subtitle) => (subtitle = _subtitle)}>Update Leave Reason</h2>
	        <form onSubmit={submitForm} >   
	      <input type="hidden" className="form-control" defaultValue={leaveobj.leaveReasonId} /><br></br>
	        	<input type="text" className="form-control"  onChange={(e)=>{setLeaveReasonCode(e.target.value)}} defaultValue={leaveobj.leaveReasonCode} /> <br></br>
	        	<input type="text" className="form-control" onChange={(e)=>{setLeaveReasonDescription(e.target.value)}} defaultValue={leaveobj.leaveReasonDescription} /><br></br>  
	          
	        	<div>
	            <button type="submit"  value="Submit" className= "btn btn-primary">Submit</button>
	          </div>
	          <button className= "btn btn-info" onClick={closeModal}>close</button>    
	        </form>		
	      </Modal>
	     
        </div>	
);

}    	
export default ViewLeaveReason; 