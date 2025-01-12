package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AutomationExerciseStepDefinitions {

    AutomationExercisePage automationExercisePage=new AutomationExercisePage();

    @Given("Kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String autoexerUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(autoexerUrl));

    }


    @Then("Anasayafaya ulastigini dogrular")
    public void anasayafaya_ulastigini_dogrular() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://www.automationexercise.com/";
        assertTrue(expectedUrl.equals(actualUrl));

    }
    @Then("{string} sayfasina gider")
    public void sayfasina_gider(String product) {
        automationExercisePage.product.click();


    }
    @Then("Tum urunlerin goruntulendigini dogrular")
    public void tum_urunlerin_goruntulendigini_dogrular() {
        assertTrue(automationExercisePage.allProducts.isDisplayed());

    }
    @Then("Arama kismina {string} yazip search butonuna tiklar")
    public void arama_kismina_yazip_search_butonuna_tiklar(String arananUrun) {
        automationExercisePage.searchBox.sendKeys(arananUrun);
        automationExercisePage.searchButton.click();

    }
    @Then("Urun ayrintisini goruntuler")
    public void urun_ayrintisini_goruntuler() {
        automationExercisePage.viewProduct.click();


    }
    @Then("Urun adini dogrular")
    public void urun_adini_dogrular() {
        String expectedProductName="Premium Polo T-Shirts";
        String actualProductName=automationExercisePage.productName.getText();
        assertEquals(expectedProductName,actualProductName);

    }
}