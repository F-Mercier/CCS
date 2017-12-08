package implCCS;

import modelCCS.Connector;
import modelCCS.ProvidedRole;

public class SecurityToDB extends Connector {
	public SecurityToDB() {
		this.addRole(new ProvidedRole(1));
		this.addRole(new ProvidedRole(2));
	}
}
