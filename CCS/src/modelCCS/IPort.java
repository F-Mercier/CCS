package modelCCS;

public interface IPort {
	Boolean isTaken();
	void taken();
	void free();
	int getId();
}
