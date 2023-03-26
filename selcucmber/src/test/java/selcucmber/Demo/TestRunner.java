package selcucmber.Demo;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/test/resources/Feature_lab/login.feature",
		glue = "selcucmber.Demo",
		plugin = {"html:target/rep.html", "json:target/jrep.json", "junit:target/xrep.xml"} 
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
