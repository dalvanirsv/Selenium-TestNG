package br.com.saraiva.book.addtocart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
            WebDriver navegador = new ChromeDriver();
                navegador.get("https://www.saraiva.com.br/");
    }

    @AfterMethod ()
        public void tearDown(){
            driver.quit();

    }
    
}
