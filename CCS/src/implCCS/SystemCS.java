package implCCS;

import modelCCS.Config;
import modelCCS.ProvidedPort;
import modelCCS.RequestedPort;

public class SystemCS extends Config {
	public SystemCS() {
		this.addPort(new ProvidedPort(1337));
		this.addPort(new RequestedPort(713705));
		Server server = new Server();
		this.addComponent(server);
	}
}
