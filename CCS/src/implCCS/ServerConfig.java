package implCCS;

import modelCCS.Config;
import modelCCS.ProvidedPort;
import modelCCS.RequestedPort;

public class ServerConfig extends Config {
	public ServerConfig() {
		this.addPort(new ProvidedPort(8));
		this.addPort(new RequestedPort(9));
		
		ConnectionManager connectionManager = new ConnectionManager();
		this.addComponent(connectionManager);
		this.addBinding(connectionManager);
	
		SecurityManager securityManager = new SecurityManager();
		this.addComponent(securityManager);
	
		Database db = new Database();
		this.addComponent(db);
		
		ConnectionToSecurity alpha = new ConnectionToSecurity();
		this.addConnector(alpha);
		
		SecurityToDB beta = new SecurityToDB();
		this.addConnector(beta);
		
		ConnectionToSecurity gamma = new ConnectionToSecurity();
		this.addConnector(gamma);
	}
}
