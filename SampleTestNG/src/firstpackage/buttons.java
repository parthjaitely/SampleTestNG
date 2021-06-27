package firstpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class buttons {
	   @BeforeClass
	    void setUpClass() {
	        System.setProperty("webdriver.chrome.driver", "C://Users//sharm//OneDrive//Desktop//chromedriver.exe");
	        // beforeclass action to link the driver
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
