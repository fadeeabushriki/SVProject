
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Start {
	
	ChromeDriver driver;
	
	String Question = new String();


	
	@BeforeTest
	public void main() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://shemsvcollege.github.io/Trivia/");	
		Thread.sleep(5000);
		

	}
	@Test (priority=0)
	public void CheckiSiteOpened ()  {
		

		if(driver.getPageSource().contains("Start"))
		{

			System.out.println("The site is loading fine!");

		}
		else
			System.out.println("The site does not work!");
		
	
	}
	
	@Test (priority=1)
	public void Startbuton ()  {
	
		driver.findElement(By.id("startB")).click();
	}
	@Test (priority=2)
	public void typequsetion1() {

			Scanner input = new Scanner(System.in);
			System.out.println("Please first question :");
			Question = input.nextLine(); 
			WebElement q1 = driver.findElement(By.name("question"));	
			q1.sendKeys(Question);
	}
	@Test (priority=3)
	public void nextbtn() {
		
		driver.findElement(By.id("nextquest")).click();
		
	}

	@Test (priority=4)
	public void typeanswer () {

		Scanner input = new Scanner(System.in);
		
		String answerQ;

		for( int i=0; i<4; i++)
		{
			if(i == 0)
			{
				System.out.println("Please Enter the answer ");
				answerQ = input.nextLine(); 
				WebElement answer1 = driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[1]/div[2]/input"));
				answer1.sendKeys(answerQ);
			}
			else if(i == 1)
			{
				System.out.println("Please Enter the answer ");
				answerQ = input.nextLine(); 
				WebElement answer1 = driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[2]/div[2]/input"));
				answer1.sendKeys(answerQ);
			}
			else if(i == 2)
			{
				System.out.println("Please Enter the answer ");
				answerQ = input.nextLine(); 
				WebElement answer1 = driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[3]/div[2]/input"));
				answer1.sendKeys(answerQ);
			}
			else
			{
				System.out.println("Please Enter the answer ");
				answerQ = input.nextLine(); 
				WebElement answer1 = driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[4]/div[2]/input"));
				answer1.sendKeys(answerQ);
			}
			
		}

	}
	@Test (priority=5)
	public void selectanswer()
	{
		driver.findElement(By.cssSelector("#answers > div:nth-child(3) > div.col-sm-1 > input[type=radio]")).click();
		
	}
	@Test (priority=6)
public void nextbtn11 () {
		
		driver.findElement(By.id("nextquest")).click();
		
	}
	
	@Test (priority=7)
	public void typequsetion2() {

			Scanner input = new Scanner(System.in);
			System.out.println("Please secound question :");
			Question = input.nextLine(); 
			WebElement q1 = driver.findElement(By.name("question"));	
			q1.sendKeys(Question);
	}
	@Test (priority=8)
	public void nextbtn2() {
		
		driver.findElement(By.id("nextquest")).click();
		
	}

	@Test (priority=9)
	public void typeanswer2 () {

		Scanner input = new Scanner(System.in);
		
		String answerQ;

		for( int i=0; i<4; i++)
		{
			if(i == 0)
			{
				System.out.println("Please Enter the answer ");
				answerQ = input.nextLine(); 
				WebElement answer1 = driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[1]/div[2]/input"));
				answer1.sendKeys(answerQ);
			}
			else if(i == 1)
			{
				System.out.println("Please Enter the answer ");
				answerQ = input.nextLine(); 
				WebElement answer1 = driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[2]/div[2]/input"));
				answer1.sendKeys(answerQ);
			}
			else if(i == 2)
			{
				System.out.println("Please Enter the answer ");
				answerQ = input.nextLine(); 
				WebElement answer1 = driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[3]/div[2]/input"));
				answer1.sendKeys(answerQ);
			}
			else
			{
				System.out.println("Please Enter the answer ");
				answerQ = input.nextLine(); 
				WebElement answer1 = driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[4]/div[2]/input"));
				answer1.sendKeys(answerQ);
			}
			
		}

	}
	@Test (priority=10)
	public void selectanswer2()
	{
		driver.findElement(By.cssSelector("#answers > div:nth-child(5) > div.col-sm-1 > input[type=radio]")).click();
		
	}
	@Test (priority=11)
public void nextbtn22 () {
		
		driver.findElement(By.id("nextquest")).click();
		
	}
	

	@Test (priority=12)
	public void typequsetion3() {

			Scanner input = new Scanner(System.in);
			System.out.println("Please therd question :");
			Question = input.nextLine(); 
			WebElement q1 = driver.findElement(By.name("question"));	
			q1.sendKeys(Question);
	}
	@Test (priority=13)
	public void nextbtn3() {
		
		driver.findElement(By.id("nextquest")).click();
		
	}

	@Test (priority=14)
	public void typeanswer3 () {

		Scanner input = new Scanner(System.in);
		
		String answerQ;

		for( int i=0; i<4; i++)
		{
			if(i == 0)
			{
				System.out.println("Please Enter the answer ");
				answerQ = input.nextLine(); 
				WebElement answer1 = driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[1]/div[2]/input"));
				answer1.sendKeys(answerQ);
			}
			else if(i == 1)
			{
				System.out.println("Please Enter the answer ");
				answerQ = input.nextLine(); 
				WebElement answer1 = driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[2]/div[2]/input"));
				answer1.sendKeys(answerQ);
			}
			else if(i == 2)
			{
				System.out.println("Please Enter the answer ");
				answerQ = input.nextLine(); 
				WebElement answer1 = driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[3]/div[2]/input"));
				answer1.sendKeys(answerQ);
			}
			else
			{
				System.out.println("Please Enter the answer ");
				answerQ = input.nextLine(); 
				WebElement answer1 = driver.findElement(By.xpath("/html/body/div/section[1]/main/div/form/div/div/div[4]/div[2]/input"));
				answer1.sendKeys(answerQ);
			}

		}

	}
	@Test (priority=15)
	public void selectanswer3()
	{
		driver.findElement(By.cssSelector("#answers > div:nth-child(2) > div.col-sm-1 > input[type=radio]")).click();
		

	}
	@Test (priority=16)
	public void nextbtn33 () {

		driver.findElement(By.id("nextquest")).click();

	}
	
	@Test (priority=17)
	public void checkfinishedbuildtest() {

		if(driver.getPageSource().contains("finished"))
		{

			System.out.println("You finished to build the test!");

		}
		else
			System.out.println("You not finished to build the test!!!");
		
		

	}
	
	
	@Test (priority=18)
	public void Startplay () {

		driver.findElement(By.cssSelector("#secondepage > center > button:nth-child(2)")).click();

	}
	
	@Test (priority=19)
	public void wronganswer() throws InterruptedException {
		
		Thread.sleep(5000);
		
	
	
		

		for ( int i=0 ; i<3 ; i++)
		{

			if(driver.findElement(By.id("0")).isDisplayed() == true)
			{
				driver.findElement(By.xpath("//*[@id=\"0\"]/input[4]")).click();
				driver.findElement(By.id("btnnext")).click();
				
				
			}
			else if(driver.findElement(By.id("1")).isDisplayed() == true)
			{
				driver.findElement(By.xpath("//*[@id=\"1\"]/input[4]")).click();
				driver.findElement(By.id("btnnext")).click();

				
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[4]")).click();
				driver.findElement(By.id("btnnext")).click();

				
						
			}
			
			
		}

	}
	
	@Test (priority=20)
	public void Statuswronganswer  () throws InterruptedException  {
		
		Thread.sleep(2000);
		
		if(driver.findElement(By.id("mark")).isDisplayed() == true)
		{
			
			System.out.println("TryAgain!");
			
		}
		
	
	}
	
	@Test (priority=21)
	public void correctanswer  () throws InterruptedException  {
		
		Thread.sleep(5000);
	
		
		driver.findElement(By.xpath("//*[@id=\"markpage\"]/center/button[1]")).click();
		
		for ( int i=0 ; i<3 ; i++)
		{

			
			
			if(driver.findElement(By.id("0")).isDisplayed() == true)
			{
				driver.findElement(By.xpath("//*[@id=\"0\"]/input[2]")).click();  //#2
				driver.findElement(By.id("btnnext")).click();
				
			}
			else if(driver.findElement(By.id("1")).isDisplayed() == true)
			{
				driver.findElement(By.xpath("//*[@id=\"1\"]/input[4]")).click();   //#4
				driver.findElement(By.id("btnnext")).click();
				
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"2\"]/input[1]")).click();   //#1
				driver.findElement(By.id("btnnext")).click();
				
			}
			
			
		}

	}
	@Test (priority=22)
	public void Statuscorrectanswer () throws InterruptedException  {
		
		Thread.sleep(2000);
		
		if(driver.findElement(By.id("mark")).isDisplayed() == true)
		{
			
			System.out.println("Congratulation!");
			
		}
		
	
	}
	
	@Test (priority=23)
	public void OpenFacebookk () throws InterruptedException  {
		
		String windowHandle = driver.getWindowHandle();
		
		Thread.sleep(2000);
		
		WebElement link = driver.findElement(By.id("fackBook2"));
		Actions newTab = new Actions(driver); 
		newTab.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
		
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));	

		if(driver.getPageSource().contains("FaceBook"))
		{

			System.out.println("The Facebook site has been opened!");

		}
		else
			System.out.println("The Facebook site does not opened, and there is an issue!!!");
		
		
		Thread.sleep(3000);
		
		driver.close();
		driver.switchTo().window(windowHandle);
	
	}
	
	@AfterTest  
	public void Closewindow  ()
	{
		
		driver.findElement(By.xpath("//*[@id=\"markpage\"]/center/button[2]")).click();
		System.out.println("The End!!");
		driver.close();
		
	}
	
	
	


}
