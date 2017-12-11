package modelCCS;

public class Attachment implements ILink {
	private int id;
	PairAttachment<IPort, IRole> pair = new PairAttachment(null, null);
	public Attachment(int id) {
		this.id = id;
	}
	public Attachment(int id, IPort p, IRole r) {
		this.id = id;
		this.setL(p);
		this.setR(r);
	}
	public IPort getL() {
		return pair.getL();
	}
	public void setL(IPort port) {
		if ((this.getR() == null) || (!this.sameType(port, this.getR()))) {
			pair.setL(port);
			port.setLink(this);
		}
	}
	public IRole getR() {
		return pair.getR();
	}
	public void setR(IRole role) {
		if ((this.getL() == null) || (!this.sameType(this.getL(), role))) {
			pair.setR(role);
			role.setLink(this);
		}
	}
	public boolean sameType(IPort p, IRole r) {
		return p.getClass().getCanonicalName().substring(9, 16).equals(r.getClass().getCanonicalName().substring(9, 16));
	}
}
