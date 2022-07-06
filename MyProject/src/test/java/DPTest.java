



	   import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.testng.annotations.DataProvider;

		public class DPTest {
		  @Test(dataProvider = "logindata")
		  public void loginTest(String uname, String pass, String errmsg) {

				
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				driver.get("file:///D:/New%20folder/javabykiran-Selenium-Softwares%20(2)/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
				driver.findElement(By.id("email")).sendKeys(uname);
				driver.findElement(By.xpath("password")).sendKeys(pass);
				driver.findElement(By.xpath("//button")).click();
		  
		  
		 }

		  @DataProvider
		  public Object[][] logindata() {
		    return new Object[][] {
		      new Object[] {"","", "error" },
		      new Object[] {"mangesh","query","please enter" },
		      new Object[] {"kiran@gmail.com","123456",""},
		    };
		  }
		

	}


