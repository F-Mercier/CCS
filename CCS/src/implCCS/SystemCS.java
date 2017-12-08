package implCCS;

import modelCCS.Attachment;
import modelCCS.Config;
import modelCCS.IPort;
import modelCCS.Message;
import modelCCS.ProvidedPort;

public class SystemCS extends Config {
	public SystemCS() {
		this.addPort(new ProvidedPort(1337));
		this.addPort(new ProvidedPort(713705));
		Server server = new Server();
		this.addComponent(server);
	}
	public void detectMessage(IPort port, Message msg) {
		((Attachment) port.getLink()).getR().receiveMessage(msg);
	}
}
