package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class test {
    public WebDriver driver;
    String userName;
    String password;

    @Test
    public void google() throws InterruptedException {
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
        System.out.println("PasswordID:"+password);


    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
