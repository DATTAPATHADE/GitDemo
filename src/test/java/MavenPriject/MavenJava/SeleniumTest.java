package MavenPriject.MavenJava;

import org.testng.annotations.Test;

public class SeleniumTest {
	@Test
	public void JiratLogin() {
		System.out.println("Jira Login successfully");
		
	}
@Test(groups={"smoke"})
public void JiraLogout() {
System.out.println("JIra Logout Successfully");
	
}
}
