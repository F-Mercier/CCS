package implCCS;

import modelCCS.Connector;
import modelCCS.RequestedRole;

public class RPC extends Connector {
	public RPC() {
		this.addRole(new RequestedRole(102));
		this.addRole(new RequestedRole(101));
	}
}
