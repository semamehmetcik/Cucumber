
Feature: US1004 kullanici gecerli bilgilerle giris yapar

  @hook @paralel2 @smoke
  Scenario: TC08 kullanici gecerli bilgilerle giris yapabilmeli

    Given kullanici testotomasyonu anasayfaya gider
    Then account linkini tiklar
    When email olarak "toGecerliEmail" girer
    And password olarak "toGecerliPassword" girer
    And login butonuna basar
    Then basarili olarak giris yapilabildigini test eder
    And logout butonuna basar