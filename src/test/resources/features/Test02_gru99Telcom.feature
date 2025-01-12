Feature: gru99 Add Customer

  Scenario: gru99 Add Costomer

    Given kullanici "guru99Url" adresine gider
    Then kullanici sayfanin basliginin Telecom icerdigini test eder
    Then clinician Add Customer linkine tiklar
    Then kullanici acilan sayfadaki formu doldurur ve submit tusuna basar
    Then kaydin basarili oldugunu dogrular
    Then kullanici customer id numarasini yazdirir
    And sayfayi kapatir
