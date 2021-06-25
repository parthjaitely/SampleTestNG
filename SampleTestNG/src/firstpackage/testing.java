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
		    @Test
		    public void imagess() throws InterruptedException {
		        ChromeDriver driver =new ChromeDriver();
		        driver.get("http://book.theautomatedtester.co.uk/");
		        java.util.List<WebElement> listImages = driver.findElements(By.tagName("img"));
		        //creating the list for getting the number of elements
		        int figures = 0; //variable to count the images
		        for (WebElement image : listImages) { //loop
		            if ( image.isDisplayed()) { //condition for images
		                figures++;    //increment
		            }
		        }
		        System.out.println("No. of total displayed images: " + figures);
		        driver.close();
		    }
		    @Test
		    //this test is same as above just a tag is changed i.e. for buttons
		    public void buttons() throws InterruptedException {
		        ChromeDriver driver =new ChromeDriver();
		        driver.get("http://book.theautomatedtester.co.uk/");
		        java.util.List<WebElement> listButtons = driver.findElements(By.tagName("button"));

		        int counts = 0;
		        for (WebElement button : listButtons) {
		            if(button.getText().equals("buttonName")) {
		                counts++;
		            }
		        }
		        System.out.println("No. of total displyed buttons: " + counts);
		        driver.close();
		    }
}
