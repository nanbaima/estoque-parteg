package estoque;

public interface IAdapterSupplier {

	boolean startRegister();
	
	boolean startUpdate();
	
	boolean startDelete();
	
	boolean submitRegisterAndUpdate(Supplier supplier);
	
	boolean submitDelete(boolean delete);
	
}
