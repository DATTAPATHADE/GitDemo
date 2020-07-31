package MavenPriject.MavenJava;

import org.testng.annotations.Test;

public class ApiTest {
	@Test
	public void LinkdinLogin() {
		System.out.println("Link den Login successfully");
		System.out.println("Link den Login successfully1");
		System.out.println("Link den Login successfully2");
		System.out.println("Link den Login successfully3");
	}
@Test(groups={"smoke"})
public void LinkedinLogout() {
	System.out.println("Linkden Log out successfully");
}

public void LinkedinSignin() {
	System.out.println("Linkden Signin successfully");
}
}
