
Feature: US1003 Kullanici parametre olarak yazdigi kelimeyi aratir
  @paralel1 @smoke
  Scenario: TC07 kullanici istedigi kelimeyi aratabilmeli

    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna "backpack" yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And 5 saniye bekler
    And sayfayi kapatır


      # cucumber'da feature'a yazilan sayilar parametre olarak algilanir