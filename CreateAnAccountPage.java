package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAnAccountPage extends BasePage{

    public CreateAnAccountPage(WebDriver driver){
        super(driver);
    }
    
    By genderMrButtonBy = By.id("id_gender1");
    By genderMrsButtonBy = By.id("id_gender2");
    By firstNameFieldBy = By.id("customer_firstname");
    By lastNameFieldBy = By.id("customer_lastname");
    By emailFieldBy = By.id("email");
    By passwordFieldBy = By.id("passwd");
    By dateDayValueBy = By.xpath("//*[@id='days']/option[23]");
    By dateMonthValueBy = By.xpath("//*[@id='months']/option[8]");
    By dateYearValueBy = By.xpath("//*[@id='years']/option[47]");
    By newsletterButtonBy = By.xpath("//*[@id='account-creation_form']/div[1]/div[7]/label");
    By specialOffersButtonBy = By.xpath("//*[@id='account-creation_form']/div[1]/div[8]/label");
    By yourFirstNameFieldBy = By.id("firstname");
    By yourLastNameFieldBy = By.id("lastname");
    By companyFieldBy = By.id("company");
    By addresOneFieldBy = By.id("address1");
    By addresTwoFieldBy = By.id("address2");
    By cityFieldBy = By.id("city");
    By stateValueBy = By.xpath("//*[@id='id_state']/option[2]");
    By postalCodeFieldBy = By.id("postcode");
    By countryValueBy = By.xpath("//*[@id='id_country']/option[2]");
    By additionalInformationFieldBy = By.id("other");
    By homePhoneFieldBy = By.id("phone");
    By mobilePhoneFieldBy = By.id("phone_mobile");
    By aliasFieldBy = By.id("alias");
    By registerButtonBy = By.xpath("//*[@id='submitAccount']/span");


    public CreateAnAccountPage verifyGender(){
        click(genderMrButtonBy);
        return this;
    }

    public CreateAnAccountPage verifyFirsName(String firstName){
        writeText(firstNameFieldBy, firstName);
        return this;
    }

    public CreateAnAccountPage verifyLastName(String LastName){
        writeText(lastNameFieldBy, LastName);
        return this;
    }

    public CreateAnAccountPage verifyEmail(String email){
        writeText(emailFieldBy, email);
        return this;
    }

    public CreateAnAccountPage verifyPassword(String password){
        writeText(passwordFieldBy, password);
        return this;
    }

    public CreateAnAccountPage verifyBirthDay(){
        click(dateDayValueBy);
        click(dateMonthValueBy);
        click(dateYearValueBy);
        return this;
    }

    public CreateAnAccountPage verifyNewsletter(){
        click(newsletterButtonBy);
        return this;
    }

    public CreateAnAccountPage verifySpecialOffer(){
        click(specialOffersButtonBy);
        return this;
    }

    public CreateAnAccountPage verifyYourFirstName(String yourFirstName){
        writeText(yourFirstNameFieldBy, yourFirstName);
        return this;
    }

    public CreateAnAccountPage verifyYourLastName(String yourLastName){
        writeText(yourLastNameFieldBy, yourLastName);
        return this;
    }

    public CreateAnAccountPage verifyCompanyName(String companyName){
        writeText(companyFieldBy, companyName);
        return this;
    }

    public CreateAnAccountPage verifyAddress(String address){
        writeText(addresOneFieldBy, address);
        return this;
    }

    public CreateAnAccountPage verifyAddressLineTwo(String addressLineTwo){
        writeText(addresTwoFieldBy, addressLineTwo);
        return this;
    }

    public CreateAnAccountPage verifyCity(String city){
        writeText(cityFieldBy, city);
        return this;
    }

    public CreateAnAccountPage verifyState(){
        click(stateValueBy);
        return this;
    }

    public CreateAnAccountPage verifyPostalCode(String postalCode){
        writeText(postalCodeFieldBy, postalCode);
        return this;
    }

    public CreateAnAccountPage verifyCountry(){
        click(countryValueBy);
        return this;
    }

    public CreateAnAccountPage verifyAdditionalInformation(String additionalInformation){
        writeText(additionalInformationFieldBy, additionalInformation);
        return this;
    }

    public CreateAnAccountPage verifyHomePhone(String homePhone){
        writeText(homePhoneFieldBy, homePhone);
        return this;
    }

    public CreateAnAccountPage verifyMobilePhone(String mobilePhone){
        writeText(mobilePhoneFieldBy, mobilePhone);
        return this;
    }

    public CreateAnAccountPage verifyAlias(String alias){
        writeText(aliasFieldBy, alias);
        return this;
    }

    public  CreateAnAccountPage verifyRegisterButton(){
        click(registerButtonBy);
        return this;
    }
}
