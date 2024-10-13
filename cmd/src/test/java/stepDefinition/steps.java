package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class steps {

	WebDriver driver;
	@Given("the user is on the opencart login")
	public void the_user_is_on_the_opencart_login() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/en-gb?route=account/login");
		driver.manage().window().maximize();

	}

	@When("the user enter the login credentials \\(username:{string},password={string})")
	public void the_user_enter_the_login_credentials_username_password(String user, String pwd) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='input-email']")).clear();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(user);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='input-password']")).clear();
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		
		

	}

	@When("the user clicks on the button")
	public void the_user_clicks_on_the_button() {
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.quit();
	}
	







}
