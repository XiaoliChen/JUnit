package MainPackage;
import junit.framework.Test;
import static org.junit.Assert.*;

public class MyJUnit extends MyClassTest{
	public void testSum(){
	MyClass MyClass= new MyClass();
	assertEquals(50, MyClass.AddTwoNumbers(30,20));
	
}
	public void testBoolean(){
		assertEquals(true, MyClass.ReturnTrue());
		
	}
	
}
