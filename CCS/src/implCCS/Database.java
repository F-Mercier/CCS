package implCCS;

import modelCCS.Component;
import modelCCS.ProvidedPort;

public class Database extends Component {
	public Database() {
		this.addPort(new ProvidedPort(3));
		this.addPort(new ProvidedPort(5));
	}
}
