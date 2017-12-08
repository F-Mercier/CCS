package modelCCS;

public class PairBinding<L,R> {
	private IPort l;
	private IPort r;
	public PairBinding(IPort l, IPort r) {
		this.l = l;
		this.r = r;
	}
	public IPort getL() {
		return l;
	}
	public IPort getR() { 
		return r; 
	}
	public void setL(IPort l) { 
		this.l = l; 
	}
	public void setR(IPort r) {
		this.r = r;
	}
}