package implCCS;

import modelCCS.Component;
import modelCCS.Message;
import modelCCS.ProvidedPort;
import modelCCS.RequestedPort;

public class Client extends Component {
	public Client() {
		this.addPort(new ProvidedPort(1));
		this.addPort(new ProvidedPort(10));
		this.addPort(new RequestedPort(11));
		this.addPort(new RequestedPort(100));
	}
	public void sendMessage(Message msg) {
		this.getPort(msg.getPort()).passMessage(msg);
	}
}
