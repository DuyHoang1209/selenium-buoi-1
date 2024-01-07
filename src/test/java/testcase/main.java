package testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.jce.exception.ExtCertPathBuilderException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.Locale;

public class main {
    public WebDriver driver;
    java.lang.String userName;
    java.lang.String password;

    @Test
    public void main() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);


        driver.get("https://www.demo.guru99.com/");
        WebElement test = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input"));
        test.sendKeys("hoangpd1@smartosc.com");

        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();;
        Thread.sleep(3000);
        userName= driver.findElement(By.xpath("(//td[@class=\"accpage\"]//following-sibling::td)[1]")).getText();
        System.out.println("UssernameID:"+userName);

        password= driver.findElement(By.xpath("(//td[@class=\"accpage\"]//following-sibling::td)[2]")).getText();
        System.out.println("PasswordID:"+password);,

        Object ExtCertPathBuilderException;
        password=driver.getPageSource();
        String lowerCase = password.toLowerCase(Locale.ROOT);
        string

        @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
