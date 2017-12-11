package modelCCS;

import implCCS.Message;

public class ProvidedPort implements IPort {
	public int id;
	public Boolean taken;
	public ILink link;
	public ProvidedPort(int id) {
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
	@Override
	public Message passMessage(Message msg) {
		System.out.println(this.getId() + " : " + msg.getMsg());
		return ((Attachment) this.getLink()).getR().receiveMessage(msg);
	}
	@Override
	public Message receiveMessage(Message msg) {
		System.out.println(this.getId() + " : " + msg.getMsg());
		return msg;
	}
	public ILink getLink() {
		return link;
	}
	public void setLink(ILink link) {
		this.link = link;
		this.taken();
	}
}
