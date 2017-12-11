package implCCS;

import modelCCS.Config;
import modelCCS.ProvidedPort;

public class ServerConfig extends Config {
	public ServerConfig() {
		this.addPort(new ProvidedPort(9));
		this.addPort(new ProvidedPort(99));
		this.addPort(new ProvidedPort(999));
		
		ConnectionManager connectionManager = new ConnectionManager();
		this.addComponent(connectionManager);
		this.addBinding(connectionManager, 999, 999);
	
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

		this.addAttachment(connectionManager, 11, alpha, 11);
		this.addAttachment(securityManager, alpha);

		this.addAttachment(securityManager, beta);
		this.addAttachment(db, beta);

		this.addAttachment(connectionManager, gamma);
		this.addAttachment(db, gamma);		
	}
}
