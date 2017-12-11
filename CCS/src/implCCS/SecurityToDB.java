package implCCS;

import modelCCS.Connector;
import modelCCS.RequestedRole;

public class SecurityToDB extends Connector {
	public SecurityToDB() {
		this.addRole(new RequestedRole(22));
		this.addRole(new RequestedRole(21));
	}
}
