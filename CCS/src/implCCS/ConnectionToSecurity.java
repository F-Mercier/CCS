package implCCS;

import modelCCS.Connector;
import modelCCS.RequestedRole;

public class ConnectionToSecurity extends Connector {
	public ConnectionToSecurity() {
		this.addRole(new RequestedRole(12));
		this.addRole(new RequestedRole(11));
	}
}
