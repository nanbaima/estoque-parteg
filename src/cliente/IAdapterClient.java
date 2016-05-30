package cliente;

public interface IAdapterClient {

	boolean startRegister();
	
	boolean startUpdate();
	
	boolean startDelete();
	
	boolean submitRegisterAndUpdate(Client client);
	
	boolean submitDelete(boolean delete);
	
}
