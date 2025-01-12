package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.Gru99Page;
import utilities.ConfigReader;
import utilities.Driver;

public class gru99StepDefinitions {

    Gru99Page gru99Page=new Gru99Page();
    Faker faker=new Faker();


    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String gru99Url) {
        Driver.getDriver().get(ConfigReader.getProperty(gru99Url));

    }
    @Then("kullanici sayfanin basliginin Telecom icerdigini test eder")
    public void kullanici_sayfanin_basliginin_telecom_icerdigini_test_eder() {
        String actualTitle=Driver.driver.getTitle();
        Assertions.assertTrue(actualTitle.contains("Telecom"));
    }
    @Then("kullanici Add Customer linkine tiklar")
    public void kullanici_add_customer_linkine_tiklar() {
        gru99Page.addCustomer.click();
        Driver.getDriver().switchTo().frame((gru99Page.iframe));
        gru99Page.closeAdv.click();
        Driver.getDriver().switchTo().defaultContent();



    }
    @Then("kullanici acilan sayfadaki formu doldurur ve submit tusuna basar")
    public void kullanici_acilan_sayfadaki_formu_doldurur_ve_submit_tusuna_basar() throws InterruptedException {
        gru99Page.done.click();
        gru99Page.firstname.sendKeys(faker.name().firstName());
        gru99Page.lastname.sendKeys(faker.name().lastName()+ Keys.TAB);
        gru99Page.email.sendKeys(faker.internet().emailAddress()+Keys.TAB);
        gru99Page.address.sendKeys(faker.address().city());
        gru99Page.phone.sendKeys("987456321");
        gru99Page.submitButton.click();
        Thread.sleep(3000);


    }
    @Then("kaydin basarili oldugunu dogrular")
    public void kaydin_basarili_oldugunu_dogrular() {
        String actuelVerify=gru99Page.details.getText();
        String expectedString="Access Details";
        Assertions.assertTrue(actuelVerify.contains(expectedString));
    }
    @Then("kullanici customer id numarasini yazdirir")
    public void kullanici_customer_id_numarasini_yazdirir() {
        System.out.println("\nCustomer ID:"+gru99Page.customerId.getText());


    }
}