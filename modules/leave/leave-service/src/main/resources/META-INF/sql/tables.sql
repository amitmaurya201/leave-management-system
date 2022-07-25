create table Leave_Employee (
	uuid_ VARCHAR(75) null,
	employeeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	employeeCode VARCHAR(75) null,
	employeeName VARCHAR(75) null,
	dateOfJoining VARCHAR(75) null
);

create table Leave_LeaveApplication (
	uuid_ VARCHAR(75) null,
	leaveApplicationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	leaveReasonId LONG,
	employeeId LONG,
	leaveTypeId LONG,
	startDate VARCHAR(75) null,
	endDate VARCHAR(75) null,
	startInHalfDay BOOLEAN,
	endInHalfDay BOOLEAN,
	actualJoiningDate VARCHAR(75) null,
	remark VARCHAR(75) null,
	documentId LONG,
	status VARCHAR(75) null,
	reportingManager VARCHAR(75) null,
	joinInHalfDay VARCHAR(75) null
);

create table Leave_LeaveReason (
	uuid_ VARCHAR(75) null,
	leaveReasonId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	leaveReasonCode VARCHAR(75) null,
	leaveReasonDescription VARCHAR(75) null
);

create table Leave_LeaveType (
	uuid_ VARCHAR(75) null,
	leaveTypeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	leaveCode VARCHAR(75) null,
	leaveName VARCHAR(75) null,
	count DOUBLE
);