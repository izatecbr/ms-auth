CREATE TABLE public.tab_profile (
	id serial NOT NULL,
	alias varchar(50) NULL,
	label varchar(50) NULL,
	description varchar(100) NULL,
	CONSTRAINT tab_profile_pkey PRIMARY KEY (id)
);

INSERT INTO public.tab_profile (alias, description, "label") VALUES('MNG', 'Manager', 'Manager');
INSERT INTO public.tab_profile (alias, description, "label") VALUES('OPE', 'Operator', 'Operator');

--tab_role para detalhar as permissoes?

CREATE TABLE public.tab_profile_role (
	id serial not null,
	role varchar(16) NOT NULL,
	profile int NOT NULL,
	CONSTRAINT tab_access_role_pkey PRIMARY KEY (id)
);
INSERT INTO public.tab_profile_role (profile, role) VALUES(1,'CTM_MENU');
INSERT INTO public.tab_profile_role (profile, role) VALUES(1,'CTM_FULL');
INSERT INTO public.tab_profile_role (profile, role) VALUES(1,'PDC_MENU');
INSERT INTO public.tab_profile_role (profile, role) VALUES(1,'PDC_FULL');
INSERT INTO public.tab_profile_role (profile, role) VALUES(2,'CTM_MENU');
INSERT INTO public.tab_profile_role (profile, role) VALUES(2,'CTM_SELECT');
INSERT INTO public.tab_profile_role (profile, role) VALUES(2,'CTM_PRINT');
INSERT INTO public.tab_profile_role (profile, role) VALUES(2,'PDC_INSERT');
INSERT INTO public.tab_profile_role (profile, role) VALUES(2,'PDC_UPDATE');

CREATE TABLE public.tab_user (
	login varchar(10) NOT NULL,
	password varchar(50) NULL,
	profile varchar(5) NULL,
	CONSTRAINT tab_user_pkey PRIMARY KEY (login)
);

INSERT INTO public.tab_user (login, password, profile) VALUES('mng','123',1);
INSERT INTO public.tab_user (login, password, profile) VALUES('ope','456',2);

CREATE TABLE public.tab_menu (
	id serial not null,
	label varchar(16) NOT NULL,
	level varchar(16) NOT NULL,
	role varchar(16) NULL,
	parent int NULL,
	CONSTRAINT tab_access_menu PRIMARY KEY (id)
);

