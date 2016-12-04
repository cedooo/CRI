/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2016/11/28 13:53:24                          */
/*==============================================================*/


drop table if exists shzdt_data;

/*==============================================================*/
/* Table: shzdt_data                                            */
/*==============================================================*/
create table shzdt_data
(
   id                   int not null,
   parameterCode        varchar(16),
   parameterName        varchar(64),
   value                varchar(64),
   unit                 varchar(64),
   state                varchar(64),
   alarmTop             varchar(64),
   alarmBottom          varchar(64),
   alertTop             varchar(64),
   alertBottom          varchar(64),
   collectTime          varchar(32),
   primary key (id)
);

CREATE  TABLE shzdt_parameter_value
(
id int not null,
paid varchar(24),
pastate int ,
pavalue DOUBLE ,
padate VARCHAR(64),
  PRIMARY  KEY (id)
);

