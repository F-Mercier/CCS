package implCCS;

import modelCCS.Config;
import modelCCS.ProvidedPort;

public class SystemCS extends Config {
	public SystemCS() {
		this.addPort(new ProvidedPort(9));
		
		Server server = new Server();
		this.addComponent(server);
	}
}
