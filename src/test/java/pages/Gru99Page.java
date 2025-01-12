package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Gru99Page {
    public Gru99Page(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "(//a[@href='addcustomer.php'])[1]")
    public WebElement addCustomer;

    @FindBy(xpath = "//*[@for='done']")
    public WebElement done;

    @FindBy (xpath = "//*[@id='fname']")
    public WebElement firstname;

    @FindBy (xpath = "//*[@id='lname']")
    public WebElement lastname;

    @FindBy (xpath = "//*[@id='email']")
    public WebElement email;

    @FindBy(xpath="//*[@name='addr']")
    public WebElement address;

    @FindBy (xpath = "//input[@id='telephoneno']")
    public WebElement phone;

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//h1")
    public WebElement details;

    @FindBy(xpath = "//h3")
    public WebElement customerId;

    @FindBy(xpath = "//div[@id='dismiss-button']")
    public WebElement closeAdv;

    @FindBy(xpath = "//iframe[@id='google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0']")
    public WebElement iframe;











}