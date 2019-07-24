package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pomimplementation {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver  driver=new ChromeDriver();
PageClass Pobject = new PageClass(driver);
driver.get("http://demowebshop.tricentis.com/");
driver.manage().window().maximize();
Pobject.clicklink();
String username="aravind.guggilla57@gmail.com";
Pobject.typename(username);
String password="aravind";
Pobject.typepassword(password);
Pobject.clickonlogin();
System.out.println("title of the page is "+driver.getTitle());




	}

}
