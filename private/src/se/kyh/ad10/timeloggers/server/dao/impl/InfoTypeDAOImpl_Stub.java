// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

package se.kyh.ad10.timeloggers.server.dao.impl;

public final class InfoTypeDAOImpl_Stub
    extends java.rmi.server.RemoteStub
    implements se.kyh.ad10.timeloggers.server.dao.intf.InfoTypeDAO, java.rmi.Remote
{
    private static final long serialVersionUID = 2;
    
    private static java.lang.reflect.Method $method_deleteInfoType_0;
    private static java.lang.reflect.Method $method_getInfoTypeName_1;
    private static java.lang.reflect.Method $method_saveInfoType_2;
    
    static {
	try {
	    $method_deleteInfoType_0 = se.kyh.ad10.timeloggers.server.dao.intf.InfoTypeDAO.class.getMethod("deleteInfoType", new java.lang.Class[] {int.class});
	    $method_getInfoTypeName_1 = se.kyh.ad10.timeloggers.server.dao.intf.InfoTypeDAO.class.getMethod("getInfoTypeName", new java.lang.Class[] {int.class});
	    $method_saveInfoType_2 = se.kyh.ad10.timeloggers.server.dao.intf.InfoTypeDAO.class.getMethod("saveInfoType", new java.lang.Class[] {se.kyh.ad10.timeloggers.server.entities.InfoType.class});
	} catch (java.lang.NoSuchMethodException e) {
	    throw new java.lang.NoSuchMethodError(
		"stub class initialization failed");
	}
    }
    
    // constructors
    public InfoTypeDAOImpl_Stub(java.rmi.server.RemoteRef ref) {
	super(ref);
    }
    
    // methods from remote interfaces
    
    // implementation of deleteInfoType(int)
    public boolean deleteInfoType(int $param_int_1)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_deleteInfoType_0, new java.lang.Object[] {new java.lang.Integer($param_int_1)}, -8024830041081554517L);
	    return ((java.lang.Boolean) $result).booleanValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of getInfoTypeName(int)
    public java.lang.String getInfoTypeName(int $param_int_1)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_getInfoTypeName_1, new java.lang.Object[] {new java.lang.Integer($param_int_1)}, 4299361065962206811L);
	    return ((java.lang.String) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of saveInfoType(InfoType)
    public boolean saveInfoType(se.kyh.ad10.timeloggers.server.entities.InfoType $param_InfoType_1)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_saveInfoType_2, new java.lang.Object[] {$param_InfoType_1}, 4790994538129868400L);
	    return ((java.lang.Boolean) $result).booleanValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
}
