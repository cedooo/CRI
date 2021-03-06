package cn.com.dhcc.rp.st.RK_ICorbaRDS;


/**
* RK_ICorbaRDS/DataPublisherPOA.java .
* 锟斤拷 IDL-to-Java 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷植锟斤拷锟斤拷锟芥本 "3.2" 锟斤拷锟?
* 锟斤拷锟斤拷 RK_ICorbaRDS.idl
* 2014锟斤拷3锟斤拷12锟斤拷 锟斤拷锟斤拷锟斤拷 锟斤拷锟斤拷09时21锟斤拷11锟斤拷 CST
*/

public abstract class DataPublisherPOA extends org.omg.PortableServer.Servant
 implements cn.com.dhcc.rp.st.RK_ICorbaRDS.DataPublisherOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("GetData", new java.lang.Integer (0));
    _methods.put ("SetData", new java.lang.Integer (1));
    _methods.put ("RegisterEventWatcher", new java.lang.Integer (2));
    _methods.put ("UnregisterEventWatcher", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {

  /*
  			strIDProp: IDh??? 1.2.Value
  			strValue: ??/??<
  		*/
       case 0:  // RK_ICorbaRDS/DataPublisher/GetData
       {
         String strIDProp = in.read_string ();
         org.omg.CORBA.StringHolder strValue = new org.omg.CORBA.StringHolder ();
         boolean $result = false;
         $result = this.GetData (strIDProp, strValue);
         out = $rh.createReply();
         out.write_boolean ($result);
         out.write_string (strValue.value);
         break;
       }

       case 1:  // RK_ICorbaRDS/DataPublisher/SetData
       {
         String strIDProp = in.read_string ();
         String strValue = in.read_string ();
         boolean $result = false;
         $result = this.SetData (strIDProp, strValue);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }


  /*
  			锟斤拷?锟斤拷 "?f??" ???p
  		*/
       case 2:  // RK_ICorbaRDS/DataPublisher/RegisterEventWatcher
       {
         cn.com.dhcc.rp.st.RK_ICorbaRDS.EventWatcher eventWatcher = cn.com.dhcc.rp.st.RK_ICorbaRDS.EventWatcherHelper.read (in);
         boolean $result = false;
         $result = this.RegisterEventWatcher (eventWatcher);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // RK_ICorbaRDS/DataPublisher/UnregisterEventWatcher
       {
         cn.com.dhcc.rp.st.RK_ICorbaRDS.EventWatcher eventWatcher = cn.com.dhcc.rp.st.RK_ICorbaRDS.EventWatcherHelper.read (in);
         boolean $result = false;
         $result = this.UnregisterEventWatcher (eventWatcher);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:RK_ICorbaRDS/DataPublisher:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public DataPublisher _this() 
  {
    return DataPublisherHelper.narrow(
    super._this_object());
  }

  public DataPublisher _this(org.omg.CORBA.ORB orb) 
  {
    return DataPublisherHelper.narrow(
    super._this_object(orb));
  }


} // class DataPublisherPOA
