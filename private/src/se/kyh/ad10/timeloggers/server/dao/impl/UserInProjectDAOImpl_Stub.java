// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

package se.kyh.ad10.timeloggers.server.dao.impl;

public final class UserInProjectDAOImpl_Stub
    extends java.rmi.server.RemoteStub
    implements se.kyh.ad10.timeloggers.server.dao.intf.UserInProjectDAO, java.rmi.Remote
{
    private static final long serialVersionUID = 2;
    
    private static java.lang.reflect.Method $method_addUserToProject_0;
    private static java.lang.reflect.Method $method_removeUserFromProject_1;
    
    static {
	try {
	    $method_addUserToProject_0 = se.kyh.ad10.timeloggers.server.dao.intf.UserInProjectDAO.class.getMethod("addUserToProject", new java.lang.Class[] {int.class, int.class, int.class});
	    $method_removeUserFromProject_1 = se.kyh.ad10.timeloggers.server.dao.intf.UserInProjectDAO.class.getMethod("removeUserFromProject", new java.lang.Class[] {int.class});
	} catch (java.lang.NoSuchMethodException e) {
	    throw new java.lang.NoSuchMethodError(
		"stub class initialization failed");
	}
    }
    
    // constructors
    public UserInProjectDAOImpl_Stub(java.rmi.server.RemoteRef ref) {
	super(ref);
    }
    
    // methods from remote interfaces
    
    // implementation of addUserToProject(int, int, int)
    public boolean addUserToProject(int $param_int_1, int $param_int_2, int $param_int_3)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_addUserToProject_0, new java.lang.Object[] {new java.lang.Integer($param_int_1), new java.lang.Integer($param_int_2), new java.lang.Integer($param_int_3)}, 8609561429550712365L);
	    return ((java.lang.Boolean) $result).booleanValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of removeUserFromProject(int)
    public boolean removeUserFromProject(int $param_int_1)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_removeUserFromProject_1, new java.lang.Object[] {new java.lang.Integer($param_int_1)}, -7651660616020040649L);
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
