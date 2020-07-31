package MavenPriject.MavenJava;

import org.testng.annotations.Test;

public class ApiTest {
	@Test
	public void LinkdinLogin() {
		System.out.println("Link den Login successfully");
	}
@Test(groups={"smoke"})
public void LinkedinLogout() {
	System.out.println("Linkden Log out successfully");
}
}
