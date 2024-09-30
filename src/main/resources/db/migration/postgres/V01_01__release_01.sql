CREATE TABLE public.tab_feature (
	id varchar(5) NOT NULL,
	"label" varchar(50) NULL,
	description varchar(100) NULL,
	CONSTRAINT tab_feature_pkey PRIMARY KEY (id)
);

INSERT INTO public.tab_feature (id, description, "label") VALUES('CTM', 'Customer Management', 'Customer');
INSERT INTO public.tab_feature (id, description, "label") VALUES('PDC', 'Product Management', 'Product');

CREATE TABLE public.tab_operation (
	id varchar(10) NOT NULL,
	"label" varchar(50) NULL,
	description varchar(100) NULL,
	CONSTRAINT tab_operation_pkey PRIMARY KEY (id)
);
INSERT INTO public.tab_operation (id, description, "label") VALUES('FULL', 'Full', 'Full');
INSERT INTO public.tab_operation (id, description, "label") VALUES('SAVE', 'Save', 'Save');
INSERT INTO public.tab_operation (id, description, "label") VALUES('UPDATE', 'Update', 'Update');
INSERT INTO public.tab_operation (id, description, "label") VALUES('DELETE', 'Delete', 'Delete');
INSERT INTO public.tab_operation (id, description, "label") VALUES('SELECT', 'Select', 'Select');
INSERT INTO public.tab_operation (id, description, "label") VALUES('PRINT', 'Print', 'Print');

CREATE TABLE public.tab_profile (
	id varchar(5) NOT NULL,
	"label" varchar(50) NULL,
	description varchar(100) NULL,
	CONSTRAINT tab_profile_pkey PRIMARY KEY (id)
);

INSERT INTO public.tab_profile (id, description, "label") VALUES('MNG', 'Manager', 'Manager');
INSERT INTO public.tab_profile (id, description, "label") VALUES('OPE', 'Operator', 'Operator');



CREATE TABLE public.tab_access_role (
	id serial not null,
	role varchar(16) NOT NULL,
	profile varchar(5) NULL,
	CONSTRAINT tab_access_role_pkey PRIMARY KEY (id)
);

INSERT INTO public.tab_access_role (profile, role) VALUES('MNG','CTM_FULL');
INSERT INTO public.tab_access_role (profile, role) VALUES('OPE','CTM_SELECT');
INSERT INTO public.tab_access_role (profile, role) VALUES('OPE','CTM_PRINT');

