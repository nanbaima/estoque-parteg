package estoque;

public enum SupplierState {

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
