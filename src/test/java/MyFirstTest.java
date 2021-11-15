import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;

public class MyFirstTest {
	private List<String> names;
//	@Test
//	public void testHelloWorld(){
//		System.out.println("Hello World");
//	}
	@Test
	public void testIfCompanyNameIsEquals(){
		String expected = "Codeup";
		String actual = "CodeUp";
//		assertEquals(expected, actual);
		assertNotEquals(expected, actual);
	}
//	@Test
//	public void testIfChangeIsCorrect() {
//		Double price = 10.0;
//		Double discount = 4.5;
//
//		assertEquals(5.5, price - discount, 0);
//		assertEquals(5.1, price - discount, 0.5);
//		assertNotEquals(4.9, price - discount, 0.5);
//	}
//	@Test
//	public void testIfObjectsAreDifferent() {
//		Object dog = new Object();
//		Object sheep = new Object();
//		Object clonedSheep = sheep;
//
//		assertNotSame(sheep, dog);
//		assertSame(sheep, clonedSheep);
//	}
	@Test
	public void testIfArrayEquals() {
		int[] numbers = {1, 2, 3};
		int[] otherNumbers = new int[3];
		otherNumbers[0] = 1;
		otherNumbers[1] = 2;
		otherNumbers[2] = 3;

		assertArrayEquals(numbers, otherNumbers);
	}
	@Test
	public void testIfGreaterOrLesserThanWorks() {
		String language = "PHP";
		assertTrue(language.contains("H"));
		assertFalse(language.contains("J"));

	}
	@Test
	public void testIfInstanceIsNull() {
		Object phone = new Object();
		Object laptop = null;
		assertNull(null);
		assertNull(laptop);
		assertNotNull(phone);
	}
	@Before
	public void setUp(){
		this.names = new ArrayList<>();
		this.names.add("Fer");
	}
	@Test
	public void testIfNamesIsInitialized(){
		assertNotNull(names);
	}
	@Test
	public void testIfANameCanBeAdded(){
		assertEquals(1, this.names.size());
		this.names.add("Zach");
		assertEquals(2, this.names.size());
		assertSame("fer", this.names.get(0));
		assertSame("Zach", this.names.get(1));
	}
}
//every test is a public void