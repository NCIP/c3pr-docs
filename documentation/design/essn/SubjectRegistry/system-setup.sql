--System Level Registry Statuses
insert into REGISTRY_STATUSES (id, version, code, description) values(-1000, 1, 'Pre-Enrolled', 'Pre-Enrolled');
insert into REGISTRY_STATUSES (id, version, code, description) values(-1001, 1, 'Enrolled', 'Enrolled');
insert into REGISTRY_STATUSES (id, version, code, description) values(-1002, 1, 'Screen Failed', 'Screen Failed');
insert into REGISTRY_STATUSES (id, version, code, description) values(-1003, 1, 'Accrued', 'Accrued');
insert into REGISTRY_STATUSES (id, version, code, description) values(-1004, 1, 'Active Intervention', 'Active Intervention');
insert into REGISTRY_STATUSES (id, version, code, description) values(-1005, 1, 'Long-Term Followup', 'Long-Term Followup');
insert into REGISTRY_STATUSES (id, version, code, description) values(-1006, 1, 'Observation', 'Observation');
insert into REGISTRY_STATUSES (id, version, code, description) values(-1007, 1, 'Withdrawn', 'Withdrawn');
insert into REGISTRY_STATUSES (id, version, code, description) values(-1008, 1, 'Declined Consent', 'Declined Consent');
insert into REGISTRY_STATUSES (id, version, code, description) values(-1009, 1, 'Completed', 'Completed');

--Screen Failure Reasons
insert into reasons(id, version, code, description, dtype, registry_st_id, primary_indicator) values(-1000, 0, 'FAILED_INCLUSION', 'FAILED INCLUSION', 'REGISTRY_STATUS', -1002, true);
insert into reasons(id, version, code, description, dtype, registry_st_id, primary_indicator) values(-1001, 0, 'FAILED_EXCLUSION', 'FAILED EXCLUSION', 'REGISTRY_STATUS', -1002, true);

--Withdrawn Reasons
insert into reasons(id, version, code, description, dtype, registry_st_id, primary_indicator) values(-1002, 0, 'UNWILLING', 'UNWILLING', 'REGISTRY_STATUS', -1007,true);