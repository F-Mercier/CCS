package implCCS;

import modelCCS.Connector;
import modelCCS.ProvidedRole;
import modelCCS.RequestedRole;

public class RPC extends Connector {
	public RPC() {
		this.addRole(new ProvidedRole(16));
		this.addRole(new ProvidedRole(32));
		this.addRole(new RequestedRole(15));
		this.addRole(new RequestedRole(30));
	}
}
