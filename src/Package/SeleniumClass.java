package Package;

import java.beans.Statement;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.sl.In;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SeleniumClass {
    
	public static void main(String[] args) throws InterruptedException, SQLException  {
    	
    	
    	String pathToDriver="C:\\Users\\Jibinsha\\eclipse-workspace\\Recruitment-Exercise\\Automation-Exercise\\chromedriver-win64\\chromedriver.exe";
    	System.setProperty("webdriver.chrome.driver", pathToDriver);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        
//        protocol  : jdbc
//        database type : mysql
//        host : localhost or IP address
//        
//        port number : 3306
//        name of the DB : testdb
        
        
        
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","username","password");
        java.sql.Statement statement = connection.createStatement();
        
        String query ="Selehghdschsrfct * from tablename";
        statement.execute(query);
        
        driver.quit();
        
    }
  
}
