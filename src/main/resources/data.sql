INSERT INTO public.t_role (id,created_at,created_by,updated_at,updated_by,is_active,description,role_name,role_type) VALUES
     ('0afa0a7c-8381-14e5-8183-a143a40f000f','2022-10-04 04:31:48.239',NULL,'2022-10-25 10:42:18.175',NULL,true,'Admin','Admin','ADMIN'),
     ('0afa0a7c-83ef-1c33-8183-f00b15020017','2022-10-19 11:40:01.666',NULL,'2022-10-25 10:41:43.212',NULL,true,'Village Head','Village Head','VILLAGE HEAD'),
     ('0afa0a7c-8455-1e50-8184-564a2bea000a','2022-11-08 08:10:12.330',NULL,'2023-01-26 06:11:30.743',NULL,true,'Villager','Villager','VILLAGER');
     

INSERT INTO public.t_user (id,created_at,created_by,is_active,updated_at,updated_by,delete_allowed,email,mobile_number,"password",user_name) VALUES
	 ('7f000001-8303-12b2-8183-034914600000','2022-09-03 17:47:44.544',NULL,true,'2022-09-03 17:49:40.820',NULL,false,NULL,'7702985338','$2a$10$n3ZEz0XgHXNWWsznqUIWI.3QHALKjX60PiMhnMuOCO3EadXIYGJZC','Admin');

INSERT INTO public.t_users_roles (user_id,role_id) VALUES
	 ('7f000001-8303-12b2-8183-034914600000','0afa0a7c-8381-14e5-8183-a143a40f000f');