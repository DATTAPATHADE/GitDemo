package MavenPriject.MavenJava;

import org.testng.annotations.Test;

public class SeleniumTest {
	@Test
	public void JiratLogin() {
		System.out.println("Jira Login successfully");
		System.out.println("Jira Login successfully1");
		System.out.println("Jira Login successfully2");
		System.out.println("Jira Login successfully3");
		
	}
@Test(groups={"smoke"})
public void JiraLogout() {
System.out.println("JIra Logout Successfully");
	
}
public void JiraSignin() {
System.out.println("JIra Signin Successfully");
	
}
}
