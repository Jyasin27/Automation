package unittests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ExampleTest {

//    @Test
//    public void firstTest()
//    {
//        System.out.println("Hiii there!");
//
//
//        try
//        {
//            //Assertions.assertEquals(1,8); - these are exceptions
//            String[] array = new String[]{"Hello"};
//            var t = array [1]; //second item
//
//        }
//        catch (Exception ex)
//        {
//            System.out.println(ex.getMessage());
//        }
//    }

    @Test
    public void firstSelenium()
    {
        WebDriverManager.chromedriver().setup();
        var driver = new ChromeDriver(); //opens a webdriver
        //automation vs Test - to validate
       // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(90));  -Don't need but helps to load page quicker
        driver.navigate().to("https://www.way2automation.com/angularjs-protractor/banking/#/login");
    }


}
