// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

package se.kyh.ad10.timeloggers.server.dao.impl;

public final class CustomerInfoDAOImpl_Stub
    extends java.rmi.server.RemoteStub
    implements se.kyh.ad10.timeloggers.server.dao.intf.CustomerInfoDAO, java.rmi.Remote
{
    private static final long serialVersionUID = 2;
    
    private static java.lang.reflect.Method $method_deleteCustomerInfo_0;
    private static java.lang.reflect.Method $method_listCustomerInfoByCustomer_1;
    private static java.lang.reflect.Method $method_saveCustomerInfo_2;
    
    static {
	try {
	    $method_deleteCustomerInfo_0 = se.kyh.ad10.timeloggers.server.dao.intf.CustomerInfoDAO.class.getMethod("deleteCustomerInfo", new java.lang.Class[] {int.class});
	    $method_listCustomerInfoByCustomer_1 = se.kyh.ad10.timeloggers.server.dao.intf.CustomerInfoDAO.class.getMethod("listCustomerInfoByCustomer", new java.lang.Class[] {int.class});
	    $method_saveCustomerInfo_2 = se.kyh.ad10.timeloggers.server.dao.intf.CustomerInfoDAO.class.getMethod("saveCustomerInfo", new java.lang.Class[] {se.kyh.ad10.timeloggers.server.entities.CustomerInfo.class});
	} catch (java.lang.NoSuchMethodException e) {
	    throw new java.lang.NoSuchMethodError(
		"stub class initialization failed");
	}
    }
    
    // constructors
    public CustomerInfoDAOImpl_Stub(java.rmi.server.RemoteRef ref) {
	super(ref);
    }
    
    // methods from remote interfaces
    
    // implementation of deleteCustomerInfo(int)
    public boolean deleteCustomerInfo(int $param_int_1)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_deleteCustomerInfo_0, new java.lang.Object[] {new java.lang.Integer($param_int_1)}, 1093939280923569795L);
	    return ((java.lang.Boolean) $result).booleanValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of listCustomerInfoByCustomer(int)
    public java.util.List listCustomerInfoByCustomer(int $param_int_1)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_listCustomerInfoByCustomer_1, new java.lang.Object[] {new java.lang.Integer($param_int_1)}, 6663477450288890374L);
	    return ((java.util.List) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of saveCustomerInfo(CustomerInfo)
    public boolean saveCustomerInfo(se.kyh.ad10.timeloggers.server.entities.CustomerInfo $param_CustomerInfo_1)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_saveCustomerInfo_2, new java.lang.Object[] {$param_CustomerInfo_1}, -7463845429112990572L);
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
