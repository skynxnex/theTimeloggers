// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

package se.kyh.ad10.timeloggers.server.dao.impl;

public final class ProjectDAOImpl_Stub
    extends java.rmi.server.RemoteStub
    implements se.kyh.ad10.timeloggers.server.dao.intf.ProjectDAO, java.rmi.Remote
{
    private static final long serialVersionUID = 2;
    
    private static java.lang.reflect.Method $method_getAllProjectsForCustomer_0;
    private static java.lang.reflect.Method $method_getProject_1;
    private static java.lang.reflect.Method $method_saveProject_2;
    private static java.lang.reflect.Method $method_saveProjectActivityStatus_3;
    
    static {
	try {
	    $method_getAllProjectsForCustomer_0 = se.kyh.ad10.timeloggers.server.dao.intf.ProjectDAO.class.getMethod("getAllProjectsForCustomer", new java.lang.Class[] {int.class, int.class});
	    $method_getProject_1 = se.kyh.ad10.timeloggers.server.dao.intf.ProjectDAO.class.getMethod("getProject", new java.lang.Class[] {int.class});
	    $method_saveProject_2 = se.kyh.ad10.timeloggers.server.dao.intf.ProjectDAO.class.getMethod("saveProject", new java.lang.Class[] {java.lang.String.class, int.class, int.class, int.class});
	    $method_saveProjectActivityStatus_3 = se.kyh.ad10.timeloggers.server.dao.intf.ProjectDAO.class.getMethod("saveProjectActivityStatus", new java.lang.Class[] {int.class});
	} catch (java.lang.NoSuchMethodException e) {
	    throw new java.lang.NoSuchMethodError(
		"stub class initialization failed");
	}
    }
    
    // constructors
    public ProjectDAOImpl_Stub(java.rmi.server.RemoteRef ref) {
	super(ref);
    }
    
    // methods from remote interfaces
    
    // implementation of getAllProjectsForCustomer(int, int)
    public java.util.List getAllProjectsForCustomer(int $param_int_1, int $param_int_2)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_getAllProjectsForCustomer_0, new java.lang.Object[] {new java.lang.Integer($param_int_1), new java.lang.Integer($param_int_2)}, -4474599710659699101L);
	    return ((java.util.List) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of getProject(int)
    public se.kyh.ad10.timeloggers.server.entities.Project getProject(int $param_int_1)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_getProject_1, new java.lang.Object[] {new java.lang.Integer($param_int_1)}, -6223751657227894135L);
	    return ((se.kyh.ad10.timeloggers.server.entities.Project) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of saveProject(String, int, int, int)
    public boolean saveProject(java.lang.String $param_String_1, int $param_int_2, int $param_int_3, int $param_int_4)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_saveProject_2, new java.lang.Object[] {$param_String_1, new java.lang.Integer($param_int_2), new java.lang.Integer($param_int_3), new java.lang.Integer($param_int_4)}, 4928711067988687849L);
	    return ((java.lang.Boolean) $result).booleanValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of saveProjectActivityStatus(int)
    public boolean saveProjectActivityStatus(int $param_int_1)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_saveProjectActivityStatus_3, new java.lang.Object[] {new java.lang.Integer($param_int_1)}, 7615677357507954763L);
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
