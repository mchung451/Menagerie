//
//package main;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//class Selenium {
//
//    public static void main (String[] args) throws InterruptedException{
//
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\micha\\Desktop\\new chromedriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http:localhost:8080/");
//        driver.manage().window().maximize();
//        System.out.println("The test has launched!");
//
//        driver.findElement(By.linkText("Welcome to the zoo!")).click();
//        if (driver.getCurrentUrl().equals("http:localhost:8080/WelcomeMessage")){
//            System.out.println("Welcome Message Link Passed!");
//        }
//        else{
//            System.out.println("Welcome Message Link Failed...");
//        }
//
//        driver.navigate().back();
//
//        driver.findElement(By.xpath("//button[contains(text(), 'Search Dogs')]")).click();
//        if (driver.getCurrentUrl().equals("http://localhost:8080/Kennel?")){
//            System.out.println("Search dogs works");
//        }
//        else{
//            System.out.println("Search dogs does not work");
//        }
//
//        driver.navigate().back();
//
//        driver.findElement(By.xpath("//button[contains(text(), 'Search Bat')]")).click();
//        if (driver.getCurrentUrl().equals("http://localhost:8080/Roost?")){
//            System.out.println("Search bats works");
//        }
//        else {
//            System.out.println("Search bats doesn't work");
//        }
//
//        driver.quit();
//
//    }
//}
//
