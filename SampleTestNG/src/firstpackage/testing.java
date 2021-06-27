package firstpackage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	public class testing {
		    @BeforeClass
		    void setUpClass() {
		        System.setProperty("webdriver.chrome.driver", "C://Users//sharm//OneDrive//Desktop//chromedriver.exe");
		        // beforeclass action to link the driver
		    }
		    @Test
		    public void testlogo() throws Exception{
		        System.setProperty("webdriver.chrome.driver", "C://Users//sharm//OneDrive//Desktop//chromedriver.exe");
		        ChromeDriver driver = new ChromeDriver();
		        driver.get("http://book.theautomatedtester.co.uk/");
		        // for the site
		        String actualTitle = "Selenium: Beginners Guide";
		        //title on the site
		        Assert.assertEquals(driver.getTitle(), actualTitle);
		        WebElement logo = driver.findElement(By.className("mainheading")  );
		        Assert.assertEquals(true, logo.isDisplayed());
		        //checking if the logo is displayed or not
		        System.out.println("The test for the logo is passed");
		        //statement if it is correct
		    }
}
