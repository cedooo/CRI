package cn.com.dhcc.rp.st.RK_ICorbaRDS;


/**
* RK_ICorbaRDS/_DataPublisherStub.java .
* 锟斤拷 IDL-to-Java 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷植锟斤拷锟斤拷锟芥本 "3.2" 锟斤拷锟?
* 锟斤拷锟斤拷 RK_ICorbaRDS.idl
* 2014锟斤拷3锟斤拷12锟斤拷 锟斤拷锟斤拷锟斤拷 锟斤拷锟斤拷09时21锟斤拷11锟斤拷 CST
*/

public class _DataPublisherStub extends org.omg.CORBA.portable.ObjectImpl implements cn.com.dhcc.rp.st.RK_ICorbaRDS.DataPublisher
{


  /*
  			strIDProp: IDh??? 1.2.Value
  			strValue: ??/??<
  		*/
  public boolean GetData (String strIDProp, org.omg.CORBA.StringHolder strValue)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("GetData", true);
                $out.write_string (strIDProp);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                strValue.value = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return GetData (strIDProp, strValue        );
            } finally {
                _releaseReply ($in);
            }
  } // GetData

  public boolean SetData (String strIDProp, String strValue)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("SetData", true);
                $out.write_string (strIDProp);
                $out.write_string (strValue);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return SetData (strIDProp, strValue        );
            } finally {
                _releaseReply ($in);
            }
  } // SetData


  /*
  			锟斤拷?锟斤拷 "?f??" ???p
  		*/
  public boolean RegisterEventWatcher (cn.com.dhcc.rp.st.RK_ICorbaRDS.EventWatcher eventWatcher)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("RegisterEventWatcher", true);
                cn.com.dhcc.rp.st.RK_ICorbaRDS.EventWatcherHelper.write ($out, eventWatcher);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return RegisterEventWatcher (eventWatcher        );
            } finally {
                _releaseReply ($in);
            }
  } // RegisterEventWatcher

  public boolean UnregisterEventWatcher (cn.com.dhcc.rp.st.RK_ICorbaRDS.EventWatcher eventWatcher)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("UnregisterEventWatcher", true);
                cn.com.dhcc.rp.st.RK_ICorbaRDS.EventWatcherHelper.write ($out, eventWatcher);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return UnregisterEventWatcher (eventWatcher        );
            } finally {
                _releaseReply ($in);
            }
  } // UnregisterEventWatcher

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:RK_ICorbaRDS/DataPublisher:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init (args, props).string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     String str = org.omg.CORBA.ORB.init (args, props).object_to_string (this);
     s.writeUTF (str);
  }
} // class _DataPublisherStub
