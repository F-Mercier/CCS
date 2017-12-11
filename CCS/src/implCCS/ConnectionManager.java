package implCCS;

import modelCCS.Component;
import modelCCS.ProvidedPort;

public class ConnectionManager extends Component {
	public ConnectionManager() {
		this.addPort(new ProvidedPort(31));
		this.addPort(new ProvidedPort(11));
		this.addPort(new ProvidedPort(999));
	}
}
