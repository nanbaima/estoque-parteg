package estoque;

import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;

public class SupplierContext extends java.lang.Object implements java.lang.Cloneable {

	public SupplierState state;
	public Supplier supplier;
	private IAdapterSupplier adapter;

	public SupplierContext() {
		super();
		this.state = SupplierState.idle;
		this.supplier = new Supplier();
	}

	public SupplierContext clone() {
		try {
			return (SupplierContext)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void handleEvent(Object... objects) {

		if (objects.length <= 0) {
			return;
		}
		
		Supplier tests = generateEntity();

		String eventName = (String) objects[0];

		switch (state) {

		case idle:
			if (eventName.compareTo("startRegisterEv") == 0) {
				boolean success = adapter.startRegister();
				if(success) {
					state = SupplierState.registered;
				}
			}

			if (eventName.compareTo("startUpdateEv") == 0) {
				boolean success = adapter.startUpdate();
				if(success) {
					state = SupplierState.updating;
				}
			}

			if (eventName.compareTo("startDeleteEv") == 0) {
				boolean success = adapter.startDelete();
				if(success) {
					state = SupplierState.deleting;
				}
			}

			break;

		case registering:

			if (eventName.compareTo("submitEv") == 0) {
				Supplier objParam = (Supplier) objects[1];
				boolean valid = objParam.getValid();

				/*Gera objeto válido*/
				Supplier supplier = generateEntity();

				/*Se teste de objeto inválido*/
				if(!valid) {
					//campo nome é obrigatório, atribuindo vazio dará erro no registro, objetivo do teste inválido
					supplier.setNome("");
				} 

				boolean success = adapter.submitRegisterAndUpdate(supplier);

				if(success){
					state = SupplierState.registered;
				} else {
					state = SupplierState.notRegistered;
				}
			}

			break;

		case updating:

			if (eventName.compareTo("submitEv") == 0) {
				Supplier objParam = (Supplier) objects[1];
				boolean valid = objParam.getValid();

				/*Gera objeto válido*/
				Supplier supplier = generateEntity();

				/*Se teste de objeto inválido*/
				if(!valid) {
					//campo nome é obrigatório, atribuindo vazio dará erro no registro, objetivo do teste inválido
					supplier.setNome("");
				} 

				boolean success = adapter.submitRegisterAndUpdate(supplier);

				if(success){
					state = SupplierState.updated;
				} else {
					state = SupplierState.notUpdated;
				}
			}

			break;

		case deleting:
			
			if (eventName.compareTo("submitEv") == 0) {
				Supplier objParam = (Supplier) objects[1];
				boolean valid = objParam.getValid();
				
				boolean success = adapter.submitDelete(valid);
				
				if(success){
					state = SupplierState.deleted;
				} else {
					state = SupplierState.notDeleted;
				}
				
			}

			break;

		default:
			break;
		}

	}

	private Supplier generateEntity() {
		EnhancedRandom enhancedRandom = EnhancedRandomBuilder.aNewEnhancedRandomBuilder().build();
		Supplier supplier = enhancedRandom.nextObject(Supplier.class);
		return supplier;

	}


}
