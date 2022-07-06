

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage<driver> {
		@FindBy(id="email")
		WebElement username;
		
		@FindBy(id="password")
		WebElement password;
		
		@FindBy(xpath="//button")
		WebElement loginbtn;
		
		public Loginpage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		}
		public void loginToApplication(String uname,String pass) {
			username.sendKeys(uname);
			password.sendKeys(pass);
			loginbtn.click();
		
			
		}

	}


