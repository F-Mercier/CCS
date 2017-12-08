package modelCCS;

import java.util.ArrayList;
import java.util.List;

public abstract class Config implements ElemArchi {
	private List<IPort> interfaceConfig = new ArrayList<IPort>();
	private List<ILink> links = new ArrayList<ILink>();
	private List<Component> components = new ArrayList<Component>();
	private List<Connector> connectors = new ArrayList<Connector>();
	public Config() {
		System.out.println(this.toString() + " created");
	}
	public List<IPort> getInterfaceConfig() {
		return interfaceConfig;
	}
	public void addPort(IPort port) {
		this.interfaceConfig.add(port);
	}
	public IPort getPort(int index) {
		return interfaceConfig.get(index);
	}
	public List<ILink> getLinks() {
		return links;
	}
	public ILink getLink(int id) {
		return links.get(id);
	}
	public void addLink(ILink link) {
		this.links.add(link);
	}
	public List<Component> getComponents() {
		return components;
	}
	public void addComponent(Component component) {
		this.components.add(component);
		System.out.println(component.toString() + " added to " + this.toString());
	}
	public void addBinding(Component component) {
		int id = links.size();
		IPort c = this.providePort();
		Binding b = new Binding(id, component.providePort(), this.providePort());
		this.addLink(b);
		System.out.println(component.toString() + " (port " + b.getL().getId() + ") binded to " + this.toString() + " (port " + b.getR().getId() + ") with binding number " + id);
	}
	public void addAttachment(Component component, Connector connector) {
		int id = links.size();
		Attachment a = new Attachment(id, component.providePort(), connector.provideRole());
		this.addLink(a);
		System.out.println(component.toString() + " (port " + a.getL().getId() + ") attached to " + connector.toString() + "(port " + a.getR().getId() + ") with binding number " + id);
	}
	public List<Connector> getConnectors() {
		return connectors;
	}
	public void addConnector(Connector connector) {
		this.connectors.add(connector);
		System.out.println(connector.toString() + " added to " + this.toString());
	}
	public List<IPort> findFreePorts() {
		List<IPort> result = new ArrayList<IPort>();
		
		for (IPort candidate : this.getInterfaceConfig()) {
			if (!candidate.isTaken()) {
				result.add(candidate);
			}
		}
		
		return result;
	}
	public IPort providePort() {
		IPort result = null;
				
		for (IPort candidate : this.getInterfaceConfig()) {
			if (!candidate.isTaken()) result = candidate;
		}

		result.taken();
		return result;
	}
	public void checkState() {
		System.out.println("======\nCONFIG\n" + this.toString());
		System.out.println("*****\nPORTS\n" + this.getInterfaceConfig());
		System.out.println("**********\nFREE PORTS\n" + this.findFreePorts());
		System.out.println("**********\nCOMPONENTS\n" + this.getComponents());
		System.out.println("**********\nCONNECTORS\n" + this.getConnectors());
		System.out.println("*****\nLINKS\n" + this.getLinks() + "\n*****");
		for (Component comp : this.getComponents()) {
			comp.checkState();
		}
		for (Connector conn : this.getConnectors()) {
			conn.checkState();
		}
	}
}
