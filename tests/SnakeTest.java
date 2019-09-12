import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SnakeTest {
	// Jasvir Kaur
	//C0744577
	Snake  snake;
	

	@Before
	public void setUp() throws Exception {
		
		
	//Creating the snakes	
		snake = new Snake("first" , 15, "grass");
		snake = new Snake("second", 20, "vegetables");
		}
@Test
	public void isHealthy() {
	String food = "vegetable";
	
	boolean snakeFood = snake.isHealthy();
	
         assertEquals("food", snake.isHealthy());
	
	
		}
	
	@Test
	public void fitsInCage() {
		
	boolean	snakelength = snake.fitsInCage(20);
	
	}

}
