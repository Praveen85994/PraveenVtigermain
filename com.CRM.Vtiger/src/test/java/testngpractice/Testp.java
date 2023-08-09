package testngpractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testp {
	@Test(priority=1)
	
	public void createuser() {
		System.out.println("usercreated");
		Assert.fail();
	}

	@Test(priority=1,dependsOnMethods="createuser")
	public void updateuser() {
		System.out.println("userupdated");
	
	}
	@Test(priority=2,enabled=false)
	public void deleteuser() {
		System.out.println("userdeleted");
	}
}
