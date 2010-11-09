--Create Study
insert into studies(id, version, phase_code, type, dtype, status, retired_indicator) values (-1001, 0, 'Phase III Trial', 'Primary Treatment', 'Local', 'PENDING', 'false');
--Add Study Version
insert into study_versions(id, version, version_date, study_id, amendment_type, name, original_indicator, short_title_text, long_title_text, description_text, retired_indicator) values
(-1001, 0, current_date, -1001, 'IMMEDIATE_AFTER_GRACE_PERIOD', 'Original version', true, 'test_services2', 'test_services_long_title2', 'test_services_description2', 'false');

--Add Coordinating Center
insert into study_organizations(id, version, study_id, hcs_id, type, retired_indicator) values(-1002, 0, -1001, 16522, 'SCC', 'false');
--Add Coordinating Center Identifier
insert into identifiers(id, version, dtype, type, stu_id, hcs_id, value, primary_indicator, retired_indicator) 
values(-1001, 0, 'OAI', 'COORDINATING_CENTER_IDENTIFIER', -1001, 16522, 'test_service2', true, 'false');

--Add Study Site
insert into study_organizations(id, version, study_id, hcs_id, type, retired_indicator) values(-1003, 0, -1001, 16522, 'SST', 'false');
--Add Study Site Version
insert into study_site_versions(id, version, stu_version_id, sto_id, start_date, retired_indicator) values(-1001, 0, -1001, -1003, current_date, 'false');

--Add 1st consent
insert into consents(id, version, name, version_id, stu_version_id, mandatory_indicator, consenting_methods, retired_indicator) 
values(-1002, 0, 'General1', '1.0', -1001, true, 'WRITTEN : VERBAL', 'false');
--Add consent questions
insert into consent_questions(id, version, text, code, con_id, retired_indicator) values(-1004, 0, 'question1', 'q1', -1002, 'false');
insert into consent_questions(id, version, text, code, con_id, retired_indicator) values(-1005, 0, 'question2', 'q2', -1002, 'false');

--Add 2nd consent
insert into consents(id, version, name, stu_version_id, mandatory_indicator, consenting_methods, retired_indicator) 
values(-1003, 0, 'General2', -1001, true, 'WRITTEN : VERBAL', 'false');
--Add consent questions
insert into consent_questions(id, version, text, code, con_id, retired_indicator) values(-1006, 0, 'question1', 'q1', -1003, 'false');
insert into consent_questions(id, version, text, code, con_id, retired_indicator) values(-1007, 0, 'question2', 'q2', -1003, 'false');

--Add study level permissible registry statuses
insert into permissible_reg_stats(id, version, registry_st_id, study_id, retired_indicator) values(-1010, 0, -1000, -1001, 'false');
insert into permissible_reg_stats(id, version, registry_st_id, study_id, retired_indicator) values(-1011, 0, -1001, -1001, 'false');
insert into permissible_reg_stats(id, version, registry_st_id, study_id, retired_indicator) values(-1012, 0, -1002, -1001, 'false');
--Add study level screen failed secondary reasons
insert into reasons(id, version, code, description, dtype, parent_id, per_reg_st_id, retired_indicator, primary_indicator) 
values(-1008, 0, 'Lab_Out_Of_Range1', 'Lab Out Of Range1', 'REGISTRY_STATUS', -1000, -1012, 'false', false);
insert into reasons(id, version, code, description, dtype, parent_id, per_reg_st_id, retired_indicator, primary_indicator) 
values(-1009, 0, 'Lab_Out_Of_Range2', 'Lab Out Of Range2', 'REGISTRY_STATUS', -1001, -1012, 'false', false);
insert into permissible_reg_stats(id, version, registry_st_id, study_id, retired_indicator) values(-1013, 0, -1003, -1001, 'false');
insert into permissible_reg_stats(id, version, registry_st_id, study_id, retired_indicator) values(-1014, 0, -1004, -1001, 'false');
insert into permissible_reg_stats(id, version, registry_st_id, study_id, retired_indicator) values(-1015, 0, -1005, -1001, 'false');
insert into permissible_reg_stats(id, version, registry_st_id, study_id, retired_indicator) values(-1016, 0, -1006, -1001, 'false');
insert into permissible_reg_stats(id, version, registry_st_id, study_id, retired_indicator) values(-1017, 0, -1007, -1001, 'false');
--Add study level withdrawn secondary reasons
insert into reasons(id, version, code, description, dtype, parent_id, per_reg_st_id, retired_indicator, primary_indicator) 
values(-1010, 0, 'Distance', 'Distance', 'REGISTRY_STATUS', -1002, -1017, 'false', false);
insert into reasons(id, version, code, description, dtype, parent_id, per_reg_st_id, retired_indicator, primary_indicator) 
values(-1011, 0, 'Schedule', 'Schedule', 'REGISTRY_STATUS', -1002, -1017, 'false', false);
insert into permissible_reg_stats(id, version, registry_st_id, study_id, retired_indicator) values(-1018, 0, -1008, -1001, 'false');
insert into permissible_reg_stats(id, version, registry_st_id, study_id, retired_indicator) values(-1019, 0, -1009, -1001, 'false');