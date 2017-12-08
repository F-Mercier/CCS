package modelCCS;

public class Binding implements ILink {
	private int id;
	Pair<IPort, IPort> pair = new Pair(null, null);
	public Binding(int id) {
		this.id = id;
	}
	public Binding(int id, IPort p1, IPort p2) {
		this.id = id;
		this.pair.setL(p1);
		this.pair.setR(p2);
	}
	public IPort getL() {
		return pair.getL();
	}
	public void setL(IPort port) {
		if ((this.getR() == null) || (this.sameType(this.getR(), port))) pair.setL(port);
	}
	public IPort getR() {
		return pair.getR();
	}
	public void setR(IPort port) {
		if ((this.getL() == null) || (this.sameType(this.getL(), port))) pair.setR(port);
	}
	public boolean sameType(IPort p1, IPort p2) {
		return p1.getClass().getCanonicalName().equals(p2.getClass().getCanonicalName());
	}
}
