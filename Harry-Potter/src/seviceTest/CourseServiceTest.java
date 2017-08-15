package seviceTest;

import org.junit.Assert;
import org.junit.Test;

import entities.*;

	public class CourseServiceTest {
		
		@Test
		public void ConstructorTest() {
			Course flying = new Course("flying");
			
			String actual = flying.getName();
			String expected = "flying";
			Assert.assertEquals(expected, actual);			
		}		
}
