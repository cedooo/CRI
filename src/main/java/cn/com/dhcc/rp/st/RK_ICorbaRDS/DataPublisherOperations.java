package cn.com.dhcc.rp.st.RK_ICorbaRDS;


/**
* RK_ICorbaRDS/DataPublisherOperations.java .
* 锟斤拷 IDL-to-Java 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷植锟斤拷锟斤拷锟芥本 "3.2" 锟斤拷锟?
* 锟斤拷锟斤拷 RK_ICorbaRDS.idl
* 2014锟斤拷3锟斤拷12锟斤拷 锟斤拷锟斤拷锟斤拷 锟斤拷锟斤拷09时21锟斤拷11锟斤拷 CST
*/

public interface DataPublisherOperations 
{

  /*
  			strIDProp: IDh??? 1.2.Value
  			strValue: ??/??<
  		*/
  boolean GetData (String strIDProp, org.omg.CORBA.StringHolder strValue);
  boolean SetData (String strIDProp, String strValue);

  /*
  			锟斤拷?锟斤拷 "?f??" ???p
  		*/
  boolean RegisterEventWatcher (cn.com.dhcc.rp.st.RK_ICorbaRDS.EventWatcher eventWatcher);
  boolean UnregisterEventWatcher (cn.com.dhcc.rp.st.RK_ICorbaRDS.EventWatcher eventWatcher);
} // interface DataPublisherOperations
