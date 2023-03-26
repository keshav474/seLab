package selcucmber.Demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;		
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;		
	

public class StepDefLogin2 {				

    WebDriver driver;			
    		
    @Given("^Open the Firefox and launch the application$")					
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
//       System.setProperty("webdriver.gecko.driver", "E://Selenium//Selenium_Jars//geckodriver.exe");					
       driver= new EdgeDriver();					
       driver.manage().window().maximize();			
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");					
    }		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

       driver.findElement(By.name("username")).sendKeys("admin");							
       driver.findElement(By.name("password")).sendKeys("admin123");							
    }		

    @Then("^Login the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {		
    	driver.findElement(By.name("password")).sendKeys(Keys.ENTER);					
    }		
}