package implCCS;

import modelCCS.Component;
import modelCCS.ProvidedPort;
import modelCCS.RequestedPort;

public class Server extends Component {
	public Server() {
		this.addPort(new ProvidedPort(2000));
		this.addPort(new ProvidedPort(3000));
		this.addPort(new RequestedPort(4000));
		this.addPort(new RequestedPort(5000));
		ServerConfig serverConfig = new ServerConfig();
		this.setConfigComponent(serverConfig);
		serverConfig.addBinding(this);
	}
}
