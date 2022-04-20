package SVTest;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Main {
	
//	static WebDriver driver;
	
	ChromeDriver driver;
	
	String [] Question = new String [16];
	
	
	@BeforeTest
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shemsvcollege.github.io/Trivia/");	
		Thread.sleep(10000);

	}
	@Test (priority=1)
	public void Startbuton () {
		System.out.println("1111");
		String type = ('"' + "startB" +'"');
		
		Clickbtn type1 = new Clickbtn (type);
	//	WebElement clickstart = driver.findElement(By.id("startB"));
	//	clickstart.click();
	}
	
	@Test (priority=2)
	public void typeQuestion () {
		try {

			Question[16]= "?";

			Scanner input = new Scanner(System.in);
			System.out.println("Please Enter worker name");

			for(int i=0;i<Question.length-1;i++)
				Question[i] = input.next();
			WebElement q1 = driver.findElement(By.name("question"));
			
		//	String str[] = {"What is your name"};
			
			q1.sendKeys(Question);


		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	

}