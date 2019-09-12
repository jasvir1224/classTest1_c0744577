import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Jasvir Kaur
	//C0744577
public class BlazeDemoTest {
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/Users/jasvirkaur/Desktop/chromedriver");
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://blazedemo.com" );

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(5000);
	//	driver.close();
		}

	@Test
	public void testCase1() {
		List<WebElement> departureCitites = driver.findElements(By.name("select#value"));
		System.out.println("Number of cities: " + departureCitites.size());
		for (int i = 0; i < departureCitites.size(); i++) {
		WebElement cities = departureCitites.get(i);
		String actualcities = cities.getText(); 
		assertEquals(7, actualcities);

		}
		
	}

}
