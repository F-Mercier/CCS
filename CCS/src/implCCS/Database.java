package implCCS;

import java.util.HashMap;
import java.util.Map;

import modelCCS.Component;
import modelCCS.ProvidedPort;

public class Database extends Component {
	private Map<Integer, String> name = new HashMap<Integer, String>();
	private Map<Integer, Integer> power = new HashMap<Integer, Integer>();
	private Map<Integer, String> password = new HashMap<Integer, String>();
	public Database() {
		this.addPort(new ProvidedPort(3));
		this.addPort(new ProvidedPort(5));
		this.addPort(new ProvidedPort(7));
	}
	public String getName(int id) {
		return this.name.get(id);
	}
	public void setName(int id, String name) {
		this.name.put(id, name);
	}
	public int getPower(int id) {
		return this.power.get(id);
	}
	public void setPower(int id, int power) {
		this.power.put(id, power);
	}
	public void setPassword(int id, String password) {
		this.password.put(id, password);
	}
	public boolean passwordSet(int id) {
		return !(this.password.get(id).isEmpty());
	}
}
