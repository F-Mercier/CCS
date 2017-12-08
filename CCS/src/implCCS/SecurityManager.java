package implCCS;

import modelCCS.Component;
import modelCCS.ProvidedPort;

public class SecurityManager extends Component {
	public SecurityManager() {
		this.addPort(new ProvidedPort(99));
		this.addPort(new ProvidedPort(98));
	}
}
