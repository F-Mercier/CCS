package modelCCS;

public class Attachment implements ILink {
	private int id;
	Pair<IPort, IRole> pair = new Pair(null, null);
	public Attachment(int id) {
		this.id = id;
	}
	public Attachment(int id, IPort p, IRole r) {
		this.id = id;
		this.pair.setL(p);
		this.pair.setR(r);
	}
	public IPort getL() {
		return pair.getL();
	}
	public void setL(IPort port) {
		if ((this.getR() == null) || (!this.sameType(port, this.getR()))) pair.setL(port);
	}
	public IRole getR() {
		return pair.getR();
	}
	public void setR(IRole role) {
		if ((this.getL() == null) || (!this.sameType(this.getL(), role))) pair.setR(role);
	}
	public boolean sameType(IPort p, IRole r) {
		return p.getClass().getCanonicalName().equals(r.getClass().getCanonicalName());
	}
}
