// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

package se.kyh.ad10.timeloggers.server.dao.impl;

public final class ProjectDAOImpl_Stub
    extends java.rmi.server.RemoteStub
    implements se.kyh.ad10.timeloggers.server.dao.intf.ProjectDAO, java.rmi.Remote
{
    private static final long serialVersionUID = 2;
    
    private static java.lang.reflect.Method $method_getAllProjects_0;
    private static java.lang.reflect.Method $method_getAllProjectsForCustomer_1;
    private static java.lang.reflect.Method $method_getProject_2;
    private static java.lang.reflect.Method $method_saveProject_3;
    private static java.lang.reflect.Method $method_saveProjectActivityStatus_4;
    
    static {
	try {
	    $method_getAllProjects_0 = se.kyh.ad10.timeloggers.server.dao.intf.ProjectDAO.class.getMethod("getAllProjects", new java.lang.Class[] {});
	    $method_getAllProjectsForCustomer_1 = se.kyh.ad10.timeloggers.server.dao.intf.ProjectDAO.class.getMethod("getAllProjectsForCustomer", new java.lang.Class[] {int.class, int.class});
	    $method_getProject_2 = se.kyh.ad10.timeloggers.server.dao.intf.ProjectDAO.class.getMethod("getProject", new java.lang.Class[] {int.class});
	    $method_saveProject_3 = se.kyh.ad10.timeloggers.server.dao.intf.ProjectDAO.class.getMethod("saveProject", new java.lang.Class[] {se.kyh.ad10.timeloggers.server.entities.Project.class});
	    $method_saveProjectActivityStatus_4 = se.kyh.ad10.timeloggers.server.dao.intf.ProjectDAO.class.getMethod("saveProjectActivityStatus", new java.lang.Class[] {int.class});
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
    
    // implementation of getAllProjects()
    public java.util.List getAllProjects()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_getAllProjects_0, null, 1411262223693112010L);
	    return ((java.util.List) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of getAllProjectsForCustomer(int, int)
    public java.util.List getAllProjectsForCustomer(int $param_int_1, int $param_int_2)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_getAllProjectsForCustomer_1, new java.lang.Object[] {new java.lang.Integer($param_int_1), new java.lang.Integer($param_int_2)}, -4474599710659699101L);
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
	    Object $result = ref.invoke(this, $method_getProject_2, new java.lang.Object[] {new java.lang.Integer($param_int_1)}, -6223751657227894135L);
	    return ((se.kyh.ad10.timeloggers.server.entities.Project) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of saveProject(Project)
    public boolean saveProject(se.kyh.ad10.timeloggers.server.entities.Project $param_Project_1)
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_saveProject_3, new java.lang.Object[] {$param_Project_1}, 480939045980368239L);
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
	    Object $result = ref.invoke(this, $method_saveProjectActivityStatus_4, new java.lang.Object[] {new java.lang.Integer($param_int_1)}, 7615677357507954763L);
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
