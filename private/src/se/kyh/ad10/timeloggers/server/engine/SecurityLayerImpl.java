package se.kyh.ad10.timeloggers.server.engine;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.UUID;

import se.kyh.ad10.timeloggersPublic.server.SecurityLayer;


public class SecurityLayerImpl extends UnicastRemoteObject implements SecurityLayer {

		/**
	 * 
	 */
	private static final long serialVersionUID = 2336179925218126332L;

		protected SecurityLayerImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

		
	int session = 12345;

	@Override
	public int getSession() {
		// TODO Auto-generated method stub
		return session;
	}

	@Override
	public UUID createSession() {
		// TODO Auto-generated method stub
		return null;
	}
}
