package implCCS;

import modelCCS.Connector;
import modelCCS.RequestedRole;

public class ConnectionToDB extends Connector {
	public ConnectionToDB() {
		this.addRole(new RequestedRole(32));
		this.addRole(new RequestedRole(31));
	}
}