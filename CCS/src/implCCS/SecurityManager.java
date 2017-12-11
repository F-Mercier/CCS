package implCCS;

import modelCCS.Component;
import modelCCS.ProvidedPort;

public class SecurityManager extends Component {
	public SecurityManager() {
		this.addPort(new ProvidedPort(21));
		this.addPort(new ProvidedPort(12));
	}
}
