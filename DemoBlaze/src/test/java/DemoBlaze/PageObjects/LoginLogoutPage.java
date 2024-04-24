package DemoBlaze.PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginLogoutPage {

	WebDriver ldriver;
	
	public LoginLogoutPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}	
	
	@FindBy(id="login2")
	public WebElement lnkLogin;
	
	@FindBy(id="logInModalLabel")
	public WebElement modalLogin;
	
	@FindBy(id="logout2")
	public WebElement lnkLogout;
	
	public void loginLink() {
		lnkLogin.click();
	}
	
	public void loginUsername(String uname) {
        WebElement inputUser=modalLogin.findElement(By.xpath("//input[@id='loginusername']"));
        inputUser.sendKeys(uname);
	}
	
	public void loginPassword(String pwd) {
        WebElement inputPwd=modalLogin.findElement(By.xpath("//input[@id='loginpassword']"));
        inputPwd.sendKeys(pwd);
	}
	
	public void loginbtn() {
		modalLogin.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	}
	
	public void logoutbtn() {
		lnkLogout.click();
	}
	
}
