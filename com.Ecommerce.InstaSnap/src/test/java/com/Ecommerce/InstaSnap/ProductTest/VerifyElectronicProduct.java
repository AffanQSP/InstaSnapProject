package com.Ecommerce.InstaSnap.ProductTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyElectronicProduct 
{
  
	@Test(priority = 1)
	public void createProduct() 
	{
		
		Reporter.log("Electronics Product Created",true);
	}
	
	@Test(priority =2,invocationCount = 2,dependsOnMethods = "createProduct",enabled = false)
	public void updateProduct()
	{
		
		Reporter.log("Electronics Products Updated",true);
	}
}
