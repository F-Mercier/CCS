package implCCS;

import modelCCS.Component;
import modelCCS.ProvidedPort;

public class Server extends Component {
	public Server() {
		this.addPort(new ProvidedPort(102));
		this.addPort(new ProvidedPort(99));
		
		ServerConfig serverConfig = new ServerConfig();
		this.setConfigComponent(serverConfig);
		serverConfig.addBinding(this);
	}
}
