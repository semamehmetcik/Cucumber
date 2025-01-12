
Feature: AE Product Verify

  Scenario:US001 AE Product Verify

    Given Kullanici "autoexerUrl" adresine gider
    Then  Anasayafaya ulastigini dogrular
    Then  "Product" sayfasina gider
    Then  Tum urunlerin goruntulendigini dogrular
    Then  Arama kismina "Premium Polo T-Shirt" yazip search butonuna tiklar
    Then  Urun ayrintisini goruntuler
    Then  Urun adini dogrular
    Then  sayfayi kapatir
