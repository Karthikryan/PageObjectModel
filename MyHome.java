package pages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificMethods;

public class MyHome extends ProjectSpecificMethods{
	
	public MyLeadPage clickLeadsTab() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadPage();
		
	}
}
