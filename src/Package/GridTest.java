package Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class GridTest {
    public static void main(String[] args) throws MalformedURLException {
    	// Set up ChromeOptions for remote execution
        ChromeOptions options = new ChromeOptions();
        
        // Initialize RemoteWebDriver with the hub URL and ChromeOptions
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.4.22:4444/wd/hub"), options);


        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();
    }
}
