package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {

    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@href='/products']")
    public WebElement product;

    @FindBy (xpath = "//*[text()='All Products']")
    public WebElement allProducts;

    @FindBy (id = "search_product")
    public WebElement searchBox;

    @FindBy(css = ".fa.fa-search")
    public WebElement searchButton;

    @FindBy(css = ".fa.fa-plus-square")
    public WebElement viewProduct;

    @FindBy (xpath = "//h2[text()='Premium Polo T-Shirts']")
    public WebElement productName;



}