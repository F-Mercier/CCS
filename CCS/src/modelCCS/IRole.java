package modelCCS;

public interface IRole {
	Boolean isTaken();
	void taken();
	void free();
	int getId();
}
