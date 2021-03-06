package estoque;

import org.junit.*;
import static org.junit.Assert.*;

// JUnit 4.3
public class TestCasesSupplier{
	
	public static junit.framework.Test suite(){
		return new junit.framework.JUnit4TestAdapter(TestCasesSupplier.class);
	}
	
	@Test
	public void test1()
	{
		SupplierContext oTestObject = new SupplierContext();
		Boolean validParam3 = false;
		assertEquals(true, (oTestObject.state == SupplierState.idle));
		oTestObject.handleEvent("startRegisterEv");
		assertEquals(true, (oTestObject.state == SupplierState.registering));
		oTestObject.handleEvent("submitEv", validParam3);
		assertEquals(true, (oTestObject.state == SupplierState.notRegistered));
		oTestObject.handleEvent("clear");
		assertEquals(true, (oTestObject.state == SupplierState.idle));
		
	}
	
	@Test
	public void test2()
	{
		SupplierContext oTestObject = new SupplierContext();
		Boolean validParam3 = true;
		Boolean validParam11 = false;
		assertEquals(true, (oTestObject.state == SupplierState.idle));
		oTestObject.handleEvent("startRegisterEv");
		assertEquals(true, (oTestObject.state == SupplierState.registering));
		oTestObject.handleEvent("submitEv", validParam3);
		assertEquals(true, (oTestObject.state == SupplierState.registered));
		oTestObject.handleEvent("back2idle");
		assertEquals(true, (oTestObject.state == SupplierState.idle));
		assertEquals(true, (oTestObject.qtddRegistro.intValue() >= 1));
		oTestObject.handleEvent("startUpdateEv");
		assertEquals(true, (oTestObject.state == SupplierState.updating));
		oTestObject.handleEvent("submitEv", validParam11);
		assertEquals(true, (oTestObject.state == SupplierState.notUpdated));
		oTestObject.handleEvent("clear");
		assertEquals(true, (oTestObject.state == SupplierState.idle));
		
	}
	
	@Test
	public void test3()
	{
		SupplierContext oTestObject = new SupplierContext();
		Boolean validParam3 = true;
		Boolean validParam10 = true;
		assertEquals(true, (oTestObject.state == SupplierState.idle));
		oTestObject.handleEvent("startRegisterEv");
		assertEquals(true, (oTestObject.state == SupplierState.registering));
		oTestObject.handleEvent("submitEv", validParam3);
		assertEquals(true, (oTestObject.state == SupplierState.registered));
		oTestObject.handleEvent("back2idle");
		assertEquals(true, (oTestObject.state == SupplierState.idle));
		assertEquals(true, (oTestObject.qtddRegistro.intValue() >= 1));
		oTestObject.handleEvent("startDeleteEv");
		assertEquals(true, (oTestObject.state == SupplierState.deleting));
		oTestObject.handleEvent("submitEv", validParam10);
		assertEquals(true, (oTestObject.state == SupplierState.deleted));
		oTestObject.handleEvent("back2idle");
		assertEquals(true, (oTestObject.state == SupplierState.idle));
		
	}
	
	@Test
	public void test4()
	{
		SupplierContext oTestObject = new SupplierContext();
		Boolean validParam3 = true;
		Boolean validParam11 = true;
		assertEquals(true, (oTestObject.state == SupplierState.idle));
		oTestObject.handleEvent("startRegisterEv");
		assertEquals(true, (oTestObject.state == SupplierState.registering));
		oTestObject.handleEvent("submitEv", validParam3);
		assertEquals(true, (oTestObject.state == SupplierState.registered));
		oTestObject.handleEvent("back2idle");
		assertEquals(true, (oTestObject.state == SupplierState.idle));
		assertEquals(true, (oTestObject.qtddRegistro.intValue() >= 1));
		oTestObject.handleEvent("startUpdateEv");
		assertEquals(true, (oTestObject.state == SupplierState.updating));
		oTestObject.handleEvent("submitEv", validParam11);
		assertEquals(true, (oTestObject.state == SupplierState.updated));
		oTestObject.handleEvent("back2idle");
		assertEquals(true, (oTestObject.state == SupplierState.idle));
		
	}
	
	@Test
	public void test5()
	{
		SupplierContext oTestObject = new SupplierContext();
		Boolean validParam3 = true;
		Boolean validParam10 = false;
		assertEquals(true, (oTestObject.state == SupplierState.idle));
		oTestObject.handleEvent("startRegisterEv");
		assertEquals(true, (oTestObject.state == SupplierState.registering));
		oTestObject.handleEvent("submitEv", validParam3);
		assertEquals(true, (oTestObject.state == SupplierState.registered));
		oTestObject.handleEvent("back2idle");
		assertEquals(true, (oTestObject.state == SupplierState.idle));
		assertEquals(true, (oTestObject.qtddRegistro.intValue() >= 1));
		oTestObject.handleEvent("startDeleteEv");
		assertEquals(true, (oTestObject.state == SupplierState.deleting));
		oTestObject.handleEvent("submitEv", validParam10);
		assertEquals(true, (oTestObject.state == SupplierState.notDeleted));
		oTestObject.handleEvent("back2idle");
		assertEquals(true, (oTestObject.state == SupplierState.idle));
		
	}
	
}