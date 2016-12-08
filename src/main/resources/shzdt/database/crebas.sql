/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2016/12/8 21:02:21                           */
/*==============================================================*/


drop table if exists shzdt_equip_mosn_map;

drop table if exists shzdt_equipment_attr_conf;

drop table if exists shzdt_humiture;

drop table if exists shzdt_leak_water;

drop table if exists shzdt_parameter_value;

drop table if exists shzdt_ups;

drop table if exists shzdt_ups_state;

/*==============================================================*/
/* Table: shzdt_equip_mosn_map                                  */
/*==============================================================*/
create table shzdt_equip_mosn_map
(
   ID                   int not null auto_increment,
   equipCode            varchar(16),
   mosn                 int(11),
   machineRoomCode      char(16),
   primary key (ID)
);

/*==============================================================*/
/* Table: shzdt_equipment_attr_conf                             */
/*==============================================================*/
create table shzdt_equipment_attr_conf
(
   id                   int not null auto_increment,
   mosn                 int(11),
   fCollectTime         char(19),
   fPartID              varchar(21),
   parameterCode        varchar(16),
   parameterName        varchar(64),
   unit                 varchar(64),
   alarmTop             varchar(64),
   alarmBottom          varchar(64),
   alertTop             varchar(64),
   alertBottom          varchar(64),
   dmsn                 int(3),
   objChgStat           varchar(11),
   primary key (id)
);

/*==============================================================*/
/* Table: shzdt_humiture                                        */
/*==============================================================*/
create table shzdt_humiture
(
   id                   int not null auto_increment,
   mosn                 int(11),
   fCollectTime         char(19),
   fPartID              varchar(21),
   temp                 varchar(32),
   humi                 varchar(32),
   dmsn                 int(3),
   objChgStat           varchar(11),
   fAggregateCnt        int,
   primary key (id)
);

/*==============================================================*/
/* Table: shzdt_leak_water                                      */
/*==============================================================*/
create table shzdt_leak_water
(
   id                   int not null auto_increment,
   mosn                 int(11),
   fCollectTime         char(19),
   fPartID              varchar(21),
   state                varchar(16),
   positionR            varchar(16),
   checkR               varchar(16),
   checkI               varchar(16),
   redGreenR            varchar(16),
   yellowBlueR          varchar(16),
   mainAlarm            varchar(16),
   leakAlarm            varchar(16),
   lineCut              varchar(16),
   EEPROM               varchar(16),
   leakPosition         varchar(16),
   dmsn                 int(3),
   objChgStat           varchar(11),
   fAggregateCnt        int,
   primary key (id)
);

/*==============================================================*/
/* Table: shzdt_parameter_value                                 */
/*==============================================================*/
create table shzdt_parameter_value
(
   machineID            varchar(16) not null,
   paid                 varchar(16) not null,
   pastate              varchar(16),
   pavalue              varchar(32),
   padate               char(32),
   doCollectTime        char(32),
   primary key (machineID, paid)
);

/*==============================================================*/
/* Table: shzdt_ups                                             */
/*==============================================================*/
create table shzdt_ups
(
   id                   int not null auto_increment,
   mosn                 int(11),
   fCollectTime         char(19),
   fPartID              varchar(21),
   dmsn                 int(3),
   objChgStat           varchar(11),
   fAggregateCnt        int,
   leftBattery          varchar(16),
   leftTime             varchar(16),
   batteryI             varchar(16),
   outOverload          varchar(16),
   innerTemp            varchar(16),
   batteryV             varchar(16),
   powerRate            varchar(16),
   viewRate             varchar(16),
   inputI               varchar(16),
   inputHz              varchar(16),
   inputFactor          varchar(16),
   voltage              varchar(16),
   inputAI              varchar(16),
   inputAV              varchar(16),
   inputABV             varchar(16),
   inputBI              varchar(16),
   inputBV              varchar(16),
   inputBCV             varchar(16),
   inputCI              varchar(16),
   inputCV              varchar(16),
   inputCAV             varchar(16),
   bypathAI             varchar(16),
   bypathAV             varchar(16),
   bypathABV            varchar(16),
   bypathBI             varchar(16),
   bypathBV             varchar(16),
   bypathBCV            varchar(16),
   bypathCI             varchar(16),
   bypathCV             varchar(16),
   bypathCAV            varchar(16),
   bypathRate           varchar(16),
   outputAI             varchar(16),
   outputAOverload      varchar(16),
   outputAV             varchar(16),
   outputABV            varchar(16),
   outputBI             varchar(16),
   outputBOverload      varchar(16),
   outputBV             varchar(16),
   outputBCV            varchar(16),
   outputCI             varchar(16),
   outputCOverload      varchar(16),
   outputCV             varchar(16),
   outputCAV            varchar(16),
   primary key (id)
);

/*==============================================================*/
/* Table: shzdt_ups_state                                       */
/*==============================================================*/
create table shzdt_ups_state
(
   id                   int not null auto_increment,
   mosn                 int(11),
   objChgStat           varchar(11),
   fAggregateCnt        int,
   fCollectTime         char(19),
   fPartID              varchar(21),
   inState              int(1),
   batteryLevelState    int(1),
   chargState           int(1),
   outChargeState       int(1),
   outputState          int(1),
   hardwareError        int(1),
   battleNeedChange     int(1),
   overload             int(1),
   shudownNow           int(1),
   compatibility        int(1),
   parameterError       int(1),
   shutdownEmergency    int(1),
   fan                  int(1),
   tempTooHigh          int(1),
   primary key (id)
);

