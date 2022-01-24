import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class FrontPage extends AbstractPage {

    @FindBy(xpath = "(//ul//li//a[@title='Велосипеды'])[2]")
    WebElement cycles;
    @FindBy(xpath = "//ul//li[@data-relative-parent='120']")
    WebElement urban;

    @FindBy(xpath = "(//a[@title='Аксессуары'])[2]")
    WebElement accessories;
    @FindBy(xpath = "//ul//li//div[@data-relative-child='156']")
    WebElement bikecomputers;
    @FindBy (xpath = "//div//ul//li[@data-relative-parent='157']")
    WebElement wirelesscomputers;


    @FindBy(xpath = "(//a[@title='Детали'])[2]")
    WebElement repairparts;
    @FindBy(xpath = "//div[@data-relative-child='222']")
    WebElement pedals;

    @FindBy(xpath = "(//a[@title='Экипировка'])[2]")
    WebElement equipment;
    @FindBy(xpath = "//div[@data-relative-child='322']")
    WebElement thermalunderwear;

    @FindBy(xpath = "(//a[@title='Инструменты'])[2]")
    WebElement tools;
    @FindBy(xpath = "//div[@data-relative-child='331']")
    WebElement bicyclepump;

    @FindBy(xpath = "(//a[@title='Питание'])[2]")
    WebElement nutrition;
    @FindBy(xpath = "//div[@data-relative-child='375']")
    WebElement bodycare;

    @FindBy(xpath = "(//a[@title='Сертификаты'])[2]")
    WebElement certificates;
    @FindBy(xpath = "(//a[@title='Сертификат 3000 руб'])[1]")
    WebElement certif3000;
    @FindBy(xpath = "//div//button[@data-id='321434']")
    WebElement inbasket;

    @FindBy(xpath = "//a[@title='Бренды']")
    WebElement brend;
    @FindBy(xpath = "//a[@title='Polar']]")
    WebElement polar;

    @FindBy(xpath = "(//a[@title='Скидки'])[1]")
    WebElement discount;




    public FrontPage(WebDriver driver) {

        super(driver);
    }
    public void chooseCycle(){
        Actions action = new Actions(getDriver());
        action.moveToElement(cycles).pause(Duration.ofSeconds(3)).moveToElement(urban).click();


    }
    public void chooseAccessories() {
        Actions action = new Actions(getDriver());
        action.moveToElement(accessories).pause(Duration.ofSeconds(3)).moveToElement(bikecomputers).pause(Duration.ofSeconds(3)).click(wirelesscomputers);

    }
    public void chooseRepairparts() {
        Actions action = new Actions(getDriver());
        action.moveToElement(repairparts).pause(Duration.ofSeconds(3)).click(pedals);

    }
    public void chooseEquipment() {
        Actions action = new Actions(getDriver());
        action.moveToElement(equipment).pause(Duration.ofSeconds(3)).click(thermalunderwear);

    }
    public void chooseTools() {
        Actions action = new Actions(getDriver());
        action.moveToElement(tools).pause(Duration.ofSeconds(3)).click(bicyclepump);

    }
    public void chooseNutrition() {
        Actions action = new Actions(getDriver());
        action.moveToElement(nutrition).pause(Duration.ofSeconds(3)).click(bodycare);

    }
    public void chooseCertificates() {
        Actions action = new Actions(getDriver());
        action.click(certificates).click(certif3000).click(inbasket);




    }
    public void chooseBrend() {
        Actions action = new Actions(getDriver());
        action.moveToElement(brend).pause(Duration.ofSeconds(3)).click(polar);

    }

    public void chooseDiscount() {
        Actions action = new Actions(getDriver());
        action.click(discount);
    }






    }
