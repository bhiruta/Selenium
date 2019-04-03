package Selenium;


import java.util.concurrent.TimeUnit;
public class ChromeDriver {
    private static Object charSequence;

    public static void main(String[] args) {
        System.setProperty ("webdriver.chrome.driver", "src/BrowserDrivers/chromedriver_win32");
        ChromeDriver driver=new ChromeDriver ();
        
        new ChromeDriver ().chromeDriver("//input.id('FirstName')").wait(|: 30, TimeUnit.SECONDS);

        // asking driver to get the url
        driver.manage("https://demo.nopcommerce.com/");
        //register for a new user
        //input.xpath("//a[@class='ico-register']")).click();
        
        driver.findElements (//input.id('FirstName')").sendkeys( ...charSequence:"Raj");
        
        driver.findElements (//input.id('LastName')").sendkeys( ...charSequence:"Patel");

        driver.findElements (//input.id('Email")).sendkeys( ...charSequence"rajpatel@gmail.com");
        driver.findElements (//input.id("password")).sendkeys( ...charsequence"raj123");
        driver.findElements (// input.id("confirmpassword")).sendkeys(...charsequence"raj123");
        driver.findElements (// input.id("register-button")).click();
        
        
        
        
        


    



    }

    private void findElements(String s) {
    }

    private void manage(String s) {
    }

    private void get() {
    }

    private Object chromeDriver(String s) {
    }


}


}

    private void get(String s) {
    }

    private Object seleniumtest1(String s) {
    }