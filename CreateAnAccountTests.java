package tests;

import org.junit.Test;

import pages.CreateAnAccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

public class CreateAnAccountTests extends BaseTest{
    public HomePage homePage;
    public LoginPage loginPage;
    public CreateAnAccountPage createAnAccountPage;
    public MyAccountPage myAccountPage;


    String ime = "Petar";
    String prezime = "Petrovic";
    String emailadresa = "masa@cose.rs";
    //Promeniti emailadresu pre svakog testa
    String sifra = "code11";
    String vaseIme = "Petar";
    String vasePrezime = "Petrovic";
    String nazivFirme = "Academy";
    String adresa = "beogradska";
    String adresaLinijaDva = "br:10";
    String grad = "Beograd";
    String postanskiBroj = "11000";
    String dodatneInformacije = "Nacionalnost Srbin.";
    String brojTelefona = "0111234567";
    String brojMobilnogTelefona = "0612345678";
    String nadimak = "Peca";
    String expectedText = "MY ACCOUNT";


    @Test
    public void verifySuccesfulRegister(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        homePage.basePage();
        homePage.verifySignInButton();
        loginPage.verifyCreateAnAccountPage(emailadresa);
        createAnAccountPage.verifyGender();
        createAnAccountPage.verifyFirsName(ime);
        createAnAccountPage.verifyLastName(prezime);
        createAnAccountPage.verifyEmail(emailadresa);
        createAnAccountPage.verifyPassword(sifra);
        createAnAccountPage.verifyBirthDay();
        createAnAccountPage.verifyNewsletter();
        createAnAccountPage.verifySpecialOffer();
        createAnAccountPage.verifyYourFirstName(vaseIme);
        createAnAccountPage.verifyYourLastName(vasePrezime);
        createAnAccountPage.verifyCompanyName(nazivFirme);
        createAnAccountPage.verifyAddress(adresa);
        createAnAccountPage.verifyAddressLineTwo(adresaLinijaDva);
        createAnAccountPage.verifyCity(grad);
        createAnAccountPage.verifyState();
        createAnAccountPage.verifyPostalCode(postanskiBroj);
        createAnAccountPage.verifyCountry();
        createAnAccountPage.verifyAdditionalInformation(dodatneInformacije);
        createAnAccountPage.verifyHomePhone(brojTelefona);
        createAnAccountPage.verifyMobilePhone(brojMobilnogTelefona);
        createAnAccountPage.verifyAlias(nadimak);
        createAnAccountPage.verifyRegisterButton();
        myAccountPage.verifySuccesfulLogin(expectedText);

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

    }
    
}
