package MavenPriject.MavenJava;

import org.testng.annotations.Test;

public class AppiumTest {
	@Test
	public void FbLogin() {
		System.out.println("Facbok login successfully");
		System.out.println("Facbok login successfully1");
		System.out.println("Facbok login successfully2");
		System.out.println("Facbok login successfully3");
	}
	
	@Test(groups={"smoke"})
	public void FbLogout() {
		System.out.println("facbook Logout succesfully ");
	}
		public void FbSignin() {
		System.out.println("facbook Signin succesfully ");
	}

}
