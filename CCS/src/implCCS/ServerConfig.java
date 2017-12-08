package implCCS;

import modelCCS.Config;
import modelCCS.ProvidedPort;
import modelCCS.RequestedPort;

public class ServerConfig extends Config {
	public ServerConfig() {
		this.addPort(new ProvidedPort(7));
		this.addPort(new ProvidedPort(8));
		this.addPort(new ProvidedPort(9));
		this.addPort(new RequestedPort(10));
		
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
		
		ConnectionToDB gamma = new ConnectionToDB();
		this.addConnector(gamma);

		this.addAttachment(connectionManager, alpha);
		this.addAttachment(securityManager, alpha);

		this.addAttachment(securityManager, beta);
		this.addAttachment(db, beta);

		this.addAttachment(connectionManager, gamma);
		this.addAttachment(db, gamma);		
	}
}
