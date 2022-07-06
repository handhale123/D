import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
		@Test
		public void Test01(){
			System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("file:///D:/New%20folder/javabykiran-Selenium-Softwares%20(2)/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
			
		}
		

	}


