package com.Ecommerce.InstaSnap.ProductTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyKidsProduct {
	
	
	@Test(priority = 1)
	public void createProduct() 
	{
		
		Reporter.log("Kids Product Created",true);
	}
	
	@Test(priority =2,invocationCount = 2,dependsOnMethods = "createProduct",enabled = false)
	public void updateProduct()
	{
		
		Reporter.log("Kids Products Updated",true);
	}

}
