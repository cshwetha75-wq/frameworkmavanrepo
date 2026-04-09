package pack;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createcontactTest() {
		
		String URl= System.getProperty("url");
		String BROWSER= System.getProperty("browser","chrome");
		String USERNAME= System.getProperty("username");
		String PASSWORD= System.getProperty("password");
		System.out.println(URl);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("execute createcontacttest");
		
	}
	
	@Test
	public void modifycontactTest() {
		
		System.out.println("execute modifycontacttest");
	}

	@Test
	public void deletecontactTest() {
		
		System.out.println("execute deletecontacttest");
	}

}
