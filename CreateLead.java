package pages;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods {


	public CreateLead enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthik");
		return this;
	}

	public CreateLead enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("C");
		return this;
	}

	public CreateLead enterCompanyName() {

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		return this;
		
	}	
	
	public ViewLead clickCreateLeadButton() {
		
		driver.findElement(By.name("submitButton")).click();
		
		return new ViewLead();
		
		
	}



}
