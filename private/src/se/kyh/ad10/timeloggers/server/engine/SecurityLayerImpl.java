package se.kyh.ad10.timeloggers.server.engine;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import se.kyh.ad10.timeloggersPublic.server.PublicInterface;
import se.kyh.ad10.timeloggersPublic.server.SecurityLayer;


public class SecurityLayerImpl extends UnicastRemoteObject implements SecurityLayer {

	private static final long serialVersionUID = 2336179925218126332L;
	public static Map<UUID, PublicInterface> map;

	protected SecurityLayerImpl() throws RemoteException {
		super();
	
		map = Collections.synchronizedMap(new HashMap<UUID, PublicInterface>());
		// TODO Auto-generated constructor stub
	}


	@Override
	public PublicInterface getPublicInterface(UUID sessionID) {
		return map.get(sessionID);
	}

	@Override
	public UUID createSession() throws RemoteException {
		UUID sessionId = UUID.randomUUID();
		PublicInterfaceImpl pii = new PublicInterfaceImpl();
		map.put(sessionId, pii);
		return sessionId;
	}
}
