package pages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificMethods;

public class MyLeadPage extends ProjectSpecificMethods{
	
	public CreateLead clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
		
		return new CreateLead();
	}
	
	
 	

}
