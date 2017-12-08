package modelCCS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Connector implements ElemArchi {
	private List<IRole> interfaceConnector = new ArrayList<IRole>();
	private Config configConnector = null;
	public Connector() {
		System.out.println(this.toString() + " created");
	}
	public List<IRole> getInterfaceConnector() {
		return interfaceConnector;
	}
	public void addRole(IRole role) {
		this.interfaceConnector.add(role);
	}
	public IRole getRole(int index) {
		return interfaceConnector.get(index);
	}
	public Config getConfigConnector() {
		return configConnector;
	}
	public void setConfigConnector(Config configConnector) {
		this.configConnector = configConnector;
		System.out.println(configConnector.toString() + " added to " + this.toString());
	}
	public List<IRole> findFreeRoles() {
		List<IRole> result = new ArrayList<IRole>();
		
		for (IRole candidate : this.getInterfaceConnector()) {
			if (!candidate.isTaken()) {
				result.add(candidate);
			}
		}
		
		return result;
	}
	public Map<IRole, ILink> findUsedRoles() {
		Map<IRole, ILink> result = new HashMap<IRole, ILink>();
		
		for (IRole candidate : this.getInterfaceConnector()) {
			if (candidate.isTaken()) {
				result.put(candidate, candidate.getLink());
			}
		}
		
		return result;
	}
	public IRole provideRole() {
		IRole result = null;
				
		for (IRole candidate : this.getInterfaceConnector()) {
			if (!candidate.isTaken()) result = candidate;
		}

		result.taken();
		return result;
	}
	public void checkState() {
		System.out.println("=========\nCONNECTOR\n" + this.toString());
		System.out.println("*****\nROLES\n" + this.getInterfaceConnector());
		System.out.println("**********\nFREE ROLES\n" + this.findFreeRoles());
		System.out.println("**********\nUSED ROLES\n" + this.findUsedRoles());
		System.out.println("******\nCONFIG\n" + this.getConfigConnector() + "\n******");
		if (this.getConfigConnector() != null) {
			this.getConfigConnector().checkState();
		}
	}
}
