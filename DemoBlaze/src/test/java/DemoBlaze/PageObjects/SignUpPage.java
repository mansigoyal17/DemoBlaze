package DemoBlaze.PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {

	WebDriver ldriver;
	
	public SignUpPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}	
 
	
	@FindBy(id="signin2")
	WebElement lnkSignUp;
	
	@FindBy(id="signInModalLabel")
	WebElement modalElement;
	
	
	public void signUpbtn() {
		lnkSignUp.click();
	}
	
	public void setUsername(String uname) {
        WebElement inputUser=modalElement.findElement(By.xpath("//input[@id='sign-username']"));
        inputUser.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
        WebElement inputPwd=modalElement.findElement(By.xpath("//input[@id='sign-password']"));
        inputPwd.sendKeys(pwd);
	}
	
	public void submit() {
        modalElement.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();
	}
	
	public void close() {
        modalElement.findElement(By.xpath("//div[@id='signInModal']//button[@type='button'][normalize-space()='Close']")).click();
	}
	
	
	
}
