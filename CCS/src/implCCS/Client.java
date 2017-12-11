package implCCS;

import modelCCS.Component;
import modelCCS.ProvidedPort;

public class Client extends Component {
	public Client() {
		this.addPort(new ProvidedPort(101));
		this.addPort(new ProvidedPort(9));
	}
	public Message sendMessage(Message msg) {
		return this.getPort(msg.getPort()).passMessage(msg);
	}
}
