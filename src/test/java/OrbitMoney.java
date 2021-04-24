import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OrbitMoney
{
    static WebDriver driver;
    static By FirstName = By.xpath("//input[@id='fullNameSrEmail']");
    static By LastName = By.xpath("//input[@placeholder='Last Name']");
    static By Email = By.xpath("//input[@id='signupSrEmail']");
    static By PhoneNum = By.xpath("//input[@id='phonenubmer']");
    static By CountryDropdown = By.xpath("//div[@class='form-control form-control-lg css-q4f9d9-container']//div[contains(@class,'css-1hwfws3')]");
    static By Password = By.xpath("//input[@id='signupSrPassword']");
    static By ConfirmPassword = By.xpath("//input[@id='signupSrConfirmPassword']");
    static By IAcceptCheckBox = By.xpath("//input[@name='termsCheckbox']");
    static By CreateAccount = By.xpath("//button[normalize-space()='Create an account']");
    static By getTextSignIn = By.xpath("//h1[contains(text(),'Sign in')]");

    @BeforeTest
    public static void init()
    {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.silentOutput", "true");
        driver = new ChromeDriver();
    }
    @BeforeMethod
    public static void setUpTest()
    {
        driver.get("https://www.orbitmoney.com/signup");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public static void user1SignUp() throws InterruptedException
    {

        driver.findElement(FirstName).sendKeys("abc1");
        driver.findElement(LastName).sendKeys("bcd1");
        driver.findElement(Email).sendKeys("arshad.talha18@gmail.com");
        driver.findElement(PhoneNum).sendKeys("1233211234");

        WebElement DropDownCountry = driver.findElement(CountryDropdown);
        //Action class to interact with the dropdown that is not accessible through inspect
        Actions action1 = new Actions(driver);
        action1.click(DropDownCountry).sendKeys(Keys.ENTER).build().perform();

        driver.findElement(Password).sendKeys("Orb!t321");
        driver.findElement(ConfirmPassword).sendKeys("Orb!t321");
        WebElement check = driver.findElement(IAcceptCheckBox);
        Actions action2 = new Actions(driver);
        action2.click(check).build().perform();
        driver.findElement(CreateAccount).click();

        String text = driver.findElement(getTextSignIn).getText();

        //Verifying that the next screen after Sign UP is the Sign IN one.
        Assert.assertEquals(text, "Sign in");
    }

    @Test
    public static void user2SignUp() throws InterruptedException
    {
        driver.findElement(FirstName).sendKeys("abc1");
        driver.findElement(LastName).sendKeys("bcd1");
        driver.findElement(Email).sendKeys("user2@gmail.com");
        driver.findElement(PhoneNum).sendKeys("1233211234");

        WebElement DropDownCountry = driver.findElement(CountryDropdown);
        //Action class to interact with the dropdown that is not accessible through inspect
        Actions action1 = new Actions(driver);
        action1.click(DropDownCountry).sendKeys(Keys.ENTER).build().perform();

        driver.findElement(Password).sendKeys("Orb!t321");
        driver.findElement(ConfirmPassword).sendKeys("Orb!t321");
        Thread.sleep(2000);
        WebElement check = driver.findElement(IAcceptCheckBox);
        Actions action2 = new Actions(driver);
        action2.click(check).build().perform();
        driver.findElement(CreateAccount).click();

        String text = driver.findElement(getTextSignIn).getText();

        //Verifying that the next screen after Sign UP is the Sign IN one.
        Assert.assertEquals(text, "Sign in");
    }

    @Test
    public void user3SignUp() throws InterruptedException
    {
        driver.findElement(FirstName).sendKeys("abc1");
        driver.findElement(LastName).sendKeys("bcd1");
        driver.findElement(Email).sendKeys("user3@gmail.com");
        driver.findElement(PhoneNum).sendKeys("1233211234");

        WebElement DropDownCountry = driver.findElement(CountryDropdown);
        //Action class to interact with the dropdown that is not accessible through inspect
        Actions action1 = new Actions(driver);
        action1.click(DropDownCountry).sendKeys(Keys.ENTER).build().perform();

        driver.findElement(Password).sendKeys("Orb!t321");
        driver.findElement(ConfirmPassword).sendKeys("Orb!t321");
        Thread.sleep(2000);
        WebElement check = driver.findElement(IAcceptCheckBox);
        Actions action2 = new Actions(driver);
        action2.click(check).build().perform();
        driver.findElement(CreateAccount).click();

        String text = driver.findElement(getTextSignIn).getText();

        //Verifying that the next screen after Sign UP is the Sign IN one.
        Assert.assertEquals(text, "Sign in");
    }

    @Test
    public void user4SignUp() throws InterruptedException
    {
        driver.findElement(FirstName).sendKeys("abc1");
        driver.findElement(LastName).sendKeys("bcd1");
        driver.findElement(Email).sendKeys("user4@gmail.com");
        driver.findElement(PhoneNum).sendKeys("1233211234");

        WebElement DropDownCountry = driver.findElement(CountryDropdown);
        //Action class to interact with the dropdown that is not accessible through inspect
        Actions action1 = new Actions(driver);
        action1.click(DropDownCountry).sendKeys(Keys.ENTER).build().perform();

        driver.findElement(Password).sendKeys("Orb!t321");
        driver.findElement(ConfirmPassword).sendKeys("Orb!t321");
        Thread.sleep(2000);
        WebElement check = driver.findElement(IAcceptCheckBox);
        Actions action2 = new Actions(driver);
        action2.click(check).build().perform();
        driver.findElement(CreateAccount).click();

        String text = driver.findElement(getTextSignIn).getText();

        //Verifying that the next screen after Sign UP is the Sign IN one.
        Assert.assertEquals(text, "Sign in");
    }

    @Test
    public void user5SignUp() throws InterruptedException
    {
        driver.findElement(FirstName).sendKeys("abc1");
        driver.findElement(LastName).sendKeys("bcd1");
        driver.findElement(Email).sendKeys("user5@gmail.com");
        driver.findElement(PhoneNum).sendKeys("1233211234");

        WebElement DropDownCountry = driver.findElement(CountryDropdown);
        //Action class to interact with the dropdown that is not accessible through inspect
        Actions action1 = new Actions(driver);
        action1.click(DropDownCountry).sendKeys(Keys.ENTER).build().perform();

        driver.findElement(Password).sendKeys("Orb!t321");
        driver.findElement(ConfirmPassword).sendKeys("Orb!t321");
        Thread.sleep(2000);
        WebElement check = driver.findElement(IAcceptCheckBox);
        Actions action2 = new Actions(driver);
        action2.click(check).build().perform();
        driver.findElement(CreateAccount).click();

        String text = driver.findElement(getTextSignIn).getText();

        //Verifying that the next screen after Sign UP is the Sign IN one.
        Assert.assertEquals(text, "Sign in");
    }

    @Test
    public void user6SignUp() throws InterruptedException
    {
        driver.findElement(FirstName).sendKeys("abc1");
        driver.findElement(LastName).sendKeys("bcd1");
        driver.findElement(Email).sendKeys("user6@gmail.com");
        driver.findElement(PhoneNum).sendKeys("1233211234");

        WebElement DropDownCountry = driver.findElement(CountryDropdown);
        //Action class to interact with the dropdown that is not accessible through inspect
        Actions action1 = new Actions(driver);
        action1.click(DropDownCountry).sendKeys(Keys.ENTER).build().perform();

        driver.findElement(Password).sendKeys("Orb!t321");
        driver.findElement(ConfirmPassword).sendKeys("Orb!t321");
        Thread.sleep(2000);
        WebElement check = driver.findElement(IAcceptCheckBox);
        Actions action2 = new Actions(driver);
        action2.click(check).build().perform();
        driver.findElement(CreateAccount).click();

        String text = driver.findElement(getTextSignIn).getText();

        //Verifying that the next screen after Sign UP is the Sign IN one.
        Assert.assertEquals(text, "Sign in");
    }

    @Test
    public void user7SignUp() throws InterruptedException
    {
        driver.findElement(FirstName).sendKeys("abc1");
        driver.findElement(LastName).sendKeys("bcd1");
        driver.findElement(Email).sendKeys("user7@gmail.com");
        driver.findElement(PhoneNum).sendKeys("1233211234");

        WebElement DropDownCountry = driver.findElement(CountryDropdown);
        //Action class to interact with the dropdown that is not accessible through inspect
        Actions action1 = new Actions(driver);
        action1.click(DropDownCountry).sendKeys(Keys.ENTER).build().perform();

        driver.findElement(Password).sendKeys("Orb!t321");
        driver.findElement(ConfirmPassword).sendKeys("Orb!t321");
        Thread.sleep(2000);
        WebElement check = driver.findElement(IAcceptCheckBox);
        Actions action2 = new Actions(driver);
        action2.click(check).build().perform();
        driver.findElement(CreateAccount).click();

        String text = driver.findElement(getTextSignIn).getText();

        //Verifying that the next screen after Sign UP is the Sign IN one.
        Assert.assertEquals(text, "Sign in");
    }

    @Test
    public void user8SignUp() throws InterruptedException
    {
        driver.findElement(FirstName).sendKeys("abc1");
        driver.findElement(LastName).sendKeys("bcd1");
        driver.findElement(Email).sendKeys("user8@gmail.com");
        driver.findElement(PhoneNum).sendKeys("1233211234");

        WebElement DropDownCountry = driver.findElement(CountryDropdown);
        //Action class to interact with the dropdown that is not accessible through inspect
        Actions action1 = new Actions(driver);
        action1.click(DropDownCountry).sendKeys(Keys.ENTER).build().perform();

        driver.findElement(Password).sendKeys("Orb!t321");
        driver.findElement(ConfirmPassword).sendKeys("Orb!t321");
        Thread.sleep(2000);
        WebElement check = driver.findElement(IAcceptCheckBox);
        Actions action2 = new Actions(driver);
        action2.click(check).build().perform();
        driver.findElement(CreateAccount).click();

        String text = driver.findElement(getTextSignIn).getText();

        //Verifying that the next screen after Sign UP is the Sign IN one.
        Assert.assertEquals(text, "Sign in");
    }

    @Test
    public void user9SignUp() throws InterruptedException
    {
        driver.findElement(FirstName).sendKeys("abc1");
        driver.findElement(LastName).sendKeys("bcd1");
        driver.findElement(Email).sendKeys("user9@gmail.com");
        driver.findElement(PhoneNum).sendKeys("1233211234");

        WebElement DropDownCountry = driver.findElement(CountryDropdown);
        //Action class to interact with the dropdown that is not accessible through inspect
        Actions action1 = new Actions(driver);
        action1.click(DropDownCountry).sendKeys(Keys.ENTER).build().perform();

        driver.findElement(Password).sendKeys("Orb!t321");
        driver.findElement(ConfirmPassword).sendKeys("Orb!t321");
        Thread.sleep(2000);
        WebElement check = driver.findElement(IAcceptCheckBox);
        Actions action2 = new Actions(driver);
        action2.click(check).build().perform();
        driver.findElement(CreateAccount).click();

        String text = driver.findElement(getTextSignIn).getText();

        //Verifying that the next screen after Sign UP is the Sign IN one.
        Assert.assertEquals(text, "Sign in");
    }

    @Test
    public void user10SignUp() throws InterruptedException
    {
        driver.findElement(FirstName).sendKeys("abc1");
        driver.findElement(LastName).sendKeys("bcd1");
        driver.findElement(Email).sendKeys("user10@gmail.com");
        driver.findElement(PhoneNum).sendKeys("1233211234");

        WebElement DropDownCountry = driver.findElement(CountryDropdown);
        //Action class to interact with the dropdown that is not accessible through inspect
        Actions action1 = new Actions(driver);
        action1.click(DropDownCountry).sendKeys(Keys.ENTER).build().perform();

        driver.findElement(Password).sendKeys("Orb!t321");
        driver.findElement(ConfirmPassword).sendKeys("Orb!t321");
        Thread.sleep(2000);
        WebElement check = driver.findElement(IAcceptCheckBox);
        Actions action2 = new Actions(driver);
        action2.click(check).build().perform();
        driver.findElement(CreateAccount).click();

        String text = driver.findElement(getTextSignIn).getText();

        //Verifying that the next screen after Sign UP is the Sign IN one.
        Assert.assertEquals(text, "Sign in");
    }
}
