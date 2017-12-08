package implCCS;

import modelCCS.Connector;
import modelCCS.ProvidedRole;

public class ConnectionToDB extends Connector {
	public ConnectionToDB() {
		this.addRole(new ProvidedRole(1));
		this.addRole(new ProvidedRole(2));
	}
}