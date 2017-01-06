# 部署配置

1. webapp/META-INF/context.xml 中配置系统数据库信息
2. resources/gsltax/gsltaxContext.xml 中配置itims接口地址
3. resources/gsltax/machineRoomDefinition/machineroom.xml 中配置机房几口地址
4. 如果tomcat/lib中不存在mysql驱动还需要加入mysql驱动包


----
###其它配置说明

- gsltax/jobs :配置相关任务执行
- gsltax/itims ：ITIMS相关配置xml
- gsltax/machineRoomDefinition : 机房设备详细定义xml
