package implCCS;

import modelCCS.Component;
import modelCCS.ProvidedPort;

public class ConnectionManager extends Component {
	public ConnectionManager() {
		this.addPort(new ProvidedPort(1111));
		this.addPort(new ProvidedPort(1112));
		this.addPort(new ProvidedPort(1113));
	}
}
