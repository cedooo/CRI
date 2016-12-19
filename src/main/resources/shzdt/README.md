# 部署配置

1. webapp/META-INF/context.xml 中配置系统数据库信息
2. resources/shzdt/shzdtContext.xml 中配置itims接口地址
3. resources/shzdt/machineRoomDefinition/machineroom.xml 中配置机房几口地址
4. 如果tomcat/lib中不存在mysql驱动还需要加入mysql驱动包


----
###其它配置说明

- shzdt/jobs :配置相关任务执行
- shzdt/itims ：ITIMS相关配置xml
- shzdt/machineRoomDefinition : 机房设备详细定义xml
