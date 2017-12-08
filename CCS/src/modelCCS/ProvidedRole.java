package modelCCS;

public class ProvidedRole implements IRole {
	public int id;
	public Boolean taken;
	public ProvidedRole(int id) {
		this.id = id;
		this.taken = false;
	}
	@Override
	public Boolean isTaken() {
		return taken;
	}
	@Override
	public void taken() {
		this.taken = true;
	}
	@Override
	public void free() {
		this.taken = false;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
