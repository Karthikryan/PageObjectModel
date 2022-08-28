package pages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificMethods;


public class HomePage extends ProjectSpecificMethods {
	public MyHome clickCrmSfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHome();
		

	}
}