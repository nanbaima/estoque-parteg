package cliente;

public enum ClientState {
	idle,
	
	registering,
	registered,
	notRegistered,
	
	updating,
	updated,
	notUpdated,
	
	deleting,
	deleted,
	notDeleted,
	
	savingRegister,
	savingUpdate,
	doDelete;
}