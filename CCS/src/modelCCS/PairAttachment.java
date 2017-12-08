package modelCCS;

public class PairAttachment<L,R> {
	private IPort l;
	private IRole r;
	public PairAttachment(IPort l, IRole r) {
		this.l = l;
		this.r = r;
	}
	public IPort getL() {
		return l;
	}
	public IRole getR() { 
		return r; 
	}
	public void setL(IPort l) { 
		this.l = l; 
	}
	public void setR(IRole r) {
		this.r = r;
	}
}