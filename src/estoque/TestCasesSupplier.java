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
		Supplier supVal3 = new Supplier();
		supVal3.valid = true;
		assertEquals(true, (oTestObject.state == SupplierState.idle));
		oTestObject.handleEvent("startRegisterEv");
		assertEquals(true, (oTestObject.state == SupplierState.registering));
		oTestObject.handleEvent("submitEv", supVal3);
		assertEquals(true, (oTestObject.state == SupplierState.registered));
		
	}
	
	@Test
	public void test2()
	{
		SupplierContext oTestObject = new SupplierContext();
		Supplier supVal3 = new Supplier();
		supVal3.valid = false;
		assertEquals(true, (oTestObject.state == SupplierState.idle));
		oTestObject.handleEvent("startRegisterEv");
		assertEquals(true, (oTestObject.state == SupplierState.registering));
		oTestObject.handleEvent("submitEv", supVal3);
		assertEquals(true, (oTestObject.state == SupplierState.notRegistered));
		
	}
	
	@Test
	public void test3()
	{
		SupplierContext oTestObject = new SupplierContext();
		Supplier supVal2 = new Supplier();
		supVal2.valid = true;
		assertEquals(true, (oTestObject.state == SupplierState.idle));
		oTestObject.handleEvent("startDeleteEv");
		assertEquals(true, (oTestObject.state == SupplierState.deleting));
		oTestObject.handleEvent("submitEv", supVal2);
		assertEquals(true, (oTestObject.state == SupplierState.deleted));
		
	}
	
	@Test
	public void test4()
	{
		SupplierContext oTestObject = new SupplierContext();
		Supplier supVal2 = new Supplier();
		supVal2.valid = false;
		assertEquals(true, (oTestObject.state == SupplierState.idle));
		oTestObject.handleEvent("startDeleteEv");
		assertEquals(true, (oTestObject.state == SupplierState.deleting));
		oTestObject.handleEvent("submitEv", supVal2);
		assertEquals(true, (oTestObject.state == SupplierState.notDeleted));
		
	}
	
	@Test
	public void test5()
	{
		SupplierContext oTestObject = new SupplierContext();
		Supplier supVal2 = new Supplier();
		supVal2.valid = true;
		assertEquals(true, (oTestObject.state == SupplierState.idle));
		oTestObject.handleEvent("startUpdateEv");
		assertEquals(true, (oTestObject.state == SupplierState.updating));
		oTestObject.handleEvent("submitEv", supVal2);
		assertEquals(true, (oTestObject.state == SupplierState.updated));
		
	}
	
	@Test
	public void test6()
	{
		SupplierContext oTestObject = new SupplierContext();
		Supplier supVal2 = new Supplier();
		supVal2.valid = false;
		assertEquals(true, (oTestObject.state == SupplierState.idle));
		oTestObject.handleEvent("startUpdateEv");
		assertEquals(true, (oTestObject.state == SupplierState.updating));
		oTestObject.handleEvent("submitEv", supVal2);
		assertEquals(true, (oTestObject.state == SupplierState.notUpdated));
		
	}
	
}