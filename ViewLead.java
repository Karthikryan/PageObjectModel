package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import baseClass.ProjectSpecificMethods;

public class ViewLead extends ProjectSpecificMethods{
	
		public ViewLead verifyFirstName() {
		
	String actName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	Assert.assertEquals(actName, "Karthik");
		return this;
				
	}

}
