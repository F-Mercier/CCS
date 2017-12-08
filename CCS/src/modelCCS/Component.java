package modelCCS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Component implements ElemArchi {
	private List<IPort> interfaceComponent = new ArrayList<IPort>();
	private Config configComponent = null;
	public Component() {
		System.out.println(this.toString() + " created");
	}
	public List<IPort> getInterfaceComponent() {
		return interfaceComponent;
	}
	public void addPort(IPort port) {
		this.interfaceComponent.add(port);
	}
	public IPort getPort(int index) {
		for (IPort candidate : this.getInterfaceComponent()) {
			if (candidate.getId() == index) return candidate;
		}
		return null;
	}
	public Config getConfigComponent() {
		return configComponent;
	}
	public void setConfigComponent(Config configComponent) {
		this.configComponent = configComponent;
		System.out.println(configComponent.toString() + " added to " + this.toString());
	}
	public List<IPort> findFreePorts() {
		List<IPort> result = new ArrayList<IPort>();
		
		for (IPort candidate : this.getInterfaceComponent()) {
			if (!candidate.isTaken()) {
				result.add(candidate);
			}
		}
		
		return result;
	}
	public Map<IPort, ILink> findUsedPorts() {
		Map<IPort, ILink> result = new HashMap<IPort, ILink>();
		
		for (IPort candidate : this.getInterfaceComponent()) {
			if (candidate.isTaken()) {
				result.put(candidate, candidate.getLink());
			}
		}
		
		return result;
	}
	public IPort providePort() {
		IPort result = null;
				
		for (IPort candidate : this.getInterfaceComponent()) {
			if (!candidate.isTaken()) result = candidate;
		}

		result.isTaken();
		return result;
	}
	public void checkState() {
		System.out.println("=========\nCOMPONENT\n" + this.toString());
		System.out.println("*****\nPORTS\n" + this.getInterfaceComponent());
		System.out.println("**********\nFREE PORTS\n" + this.findFreePorts());
		System.out.println("**********\nUSED PORTS\n" + this.findUsedPorts());
		System.out.println("******\nCONFIG\n" + this.getConfigComponent() + "\n******");
		if (this.getConfigComponent() != null) {
			this.getConfigComponent().checkState();
		}
	}
}
