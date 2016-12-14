## 如果存在icloud数据库， 则应该在icloud的tcmo表进行插入，注意fMOType和catalog.xml中数据对应， 不和其它行冲突


# fMOType 的值 和 catalog.xml中 devType对应
 insert into tcmotype(fMOType,fAlias,fCategory,fInstance) values(70,'IDC365-CMS机房',20,0); 
 insert into tcmotype(fMOType,fAlias,fCategory,fInstance,fDispOrder) values(70201,'UPS-IDC365',20,0,1); 
 insert into tcmotype(fMOType,fAlias,fCategory,fInstance,fDispOrder) values(70701,'温湿度-IDC365',20,0,1); 
 insert into tcmotype(fMOType,fAlias,fCategory,fInstance,fDispOrder) values(708002,'漏水控制器-IDC365',20,0,1); 
 