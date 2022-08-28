package pages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificMethods;


public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage typeUserName() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		return this;
	}
	
	public LoginPage typePassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	     return this;
	}
	
	public HomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
		
	}
	
	

}
