package implCCS;

import modelCCS.Connector;
import modelCCS.ProvidedRole;

public class ConnectionToSecurity extends Connector {
	public ConnectionToSecurity() {
		this.addRole(new ProvidedRole(3));
		this.addRole(new ProvidedRole(4));
	}
}
