CREATE TABLE base (
    id                   varchar(50),
    name                 varchar(50),
    description          text,
    firstName            varchar(50),
    lastName             varchar(50),
    objectTypeId         text,
    customerId           text,
    parentId             text,
     CONSTRAINT base_role_pk PRIMARY KEY ( id )
);

