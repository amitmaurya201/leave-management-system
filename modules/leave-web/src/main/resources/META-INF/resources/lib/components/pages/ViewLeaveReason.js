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
function openModal(id) {
	 const newItem=leaveReason.find((leave)=>{
		   return leave.leaveReasonId==id})
	 setLeaveobj(newItem);	   
	 setIsOpen(true);
	 console.log(leaveobj.leaveReasonCode);
  }

  function afterOpenModal() {
    // references are now sync'd and can be accessed.
    subtitle.style.color = '#f00';
  }

  function closeModal() {
    setIsOpen(false);
  }


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
	console.log(id);
  
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
				    <td><button type="button" className="btn btn-danger" onClick={()=>{handleRemove(leave.leaveReasonId)}} >Delete</button>
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
	        contentLabel="Example Modal"
	      >
	        <h2 ref={(_subtitle) => (subtitle = _subtitle)}>Update Leave Reason</h2>
	        <form>   
	      
	        	<input type="text" className="form-control" value={leaveobj.leaveReasonCode} /> <br></br>
	        	<input type="text" className="form-control" value={leaveobj.leaveReasonDescription} /><br></br>  		 
	          <button className= "btn btn-primary">Submit</button>
	          <button className= "btn btn-info" onClick={closeModal}>close</button>
	      
	        </form>
		
	      </Modal>
	     
        </div>	
);

}      

	
	
export default ViewLeaveReason; 