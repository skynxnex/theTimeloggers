package se.kyh.ad10.timeloggers.server.engine;
import java.rmi.RemoteException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import se.kyh.ad10.timeloggersPublic.server.PublicInterface;
import se.kyh.ad10.timeloggersPublic.server.SecurityLayer;


public class SecurityLayerImpl implements SecurityLayer {

	private static final long serialVersionUID = 2336179925218126332L;
	private static Map<UUID, PublicInterface> map;

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
		PublicInterfaceImpl pii = new PublicInterfaceImpl(sessionId);
		map.put(sessionId, pii);
		System.out.println(sessionId);
		System.out.println(map);
		return sessionId;
	}
	
	public static PublicInterfaceImpl getPublicInterfaceImpl(UUID sessionID) {
		System.out.println(map);
		System.out.println(sessionID);
		return (PublicInterfaceImpl) map.get(sessionID);
	}
}
