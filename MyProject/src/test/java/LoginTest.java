import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
@Test
public void Test01() {
	

	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///D:/New%20folder/javabykiran-Selenium-Softwares%20(2)/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	
	Loginpage lp=new Loginpage(driver);
	lp.loginToApplication("kiran@gmail.com","123456");
	Assert.assertEquals(driver.getTitle(),"JavaKykiran| Dashboard");
	
	
				
				
				
			}

		

		
		
		
		
		

	
	
	
	
	
	
	
	
	

	


	
	
	

}


