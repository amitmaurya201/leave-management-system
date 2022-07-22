create index IX_2160E2C9 on Leave_Employee (employeeName[$COLUMN_LENGTH:75$]);
create index IX_F7D6A0B0 on Leave_Employee (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_2EEF9332 on Leave_Employee (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_5B4F64D on Leave_LeaveApplication (status[$COLUMN_LENGTH:75$]);
create index IX_63C649B on Leave_LeaveApplication (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_A13B55DD on Leave_LeaveApplication (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_598AEA6E on Leave_LeaveReason (leaveReasonDescription[$COLUMN_LENGTH:75$]);
create index IX_240A7ACD on Leave_LeaveReason (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_CF9D508F on Leave_LeaveReason (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E9184D63 on Leave_LeaveType (leaveName[$COLUMN_LENGTH:75$]);
create index IX_401FA883 on Leave_LeaveType (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_9B6E73C5 on Leave_LeaveType (uuid_[$COLUMN_LENGTH:75$], groupId);