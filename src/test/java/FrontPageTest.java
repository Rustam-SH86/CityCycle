
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class FrontPageTest extends AbstractPageTest {


    @Test @Epic("Epic1") @Feature("Кнопка Велосипеды-Городские")
    void chooseCycle() {
        driver.get("https://citycycle.ru/");
        FrontPage page = new FrontPage(driver);
        page.chooseCycle();
       // Assertions.assertTrue(driver.getTitle().equals("Городские велосипеды купить в интернет-магазине CityCycle.ru"));

    }

    @Test @Epic("Epic2") @Feature("Кнопка Аксесуары-Велокомпьютеры-Беспроводные компьютеры")
    void chooseAccessories() {
        driver.get("https://citycycle.ru/");
        FrontPage page = new FrontPage(driver);
        page.chooseAccessories();
       // Assertions.assertTrue(driver.getTitle().equals("Городские велосипеды купить в интернет-магазине CityCycle.ru"));

    }

    @Test @Epic("Epic3") @Feature("Кнопка Детали-Педали")
    void chooseRepairparts() {
        driver.get("https://citycycle.ru/");
        FrontPage page = new FrontPage(driver);
        page.chooseRepairparts();
        //Assertions.assertTrue(driver.getTitle().equals("Педали и шипы велосипедные"));

    }

    @Test @Epic("Epic4") @Feature("Кнопка Экипировка-термобелье")
    void chooseEquipment() {
        driver.get("https://citycycle.ru/");
        FrontPage page = new FrontPage(driver);
        page.chooseEquipment();
       // Assertions.assertTrue(driver.getTitle().equals("Термобелье"));
    }
    @Test @Epic("Epic5") @Feature("Кнопка Инструменты-Велонасосы")
    void chooseTools() {
        driver.get("https://citycycle.ru/");
        FrontPage page = new FrontPage(driver);
        page.chooseTools();
        //Assertions.assertTrue(driver.getTitle().equals("Велосипедные инструменты"));
    }
    @Test @Epic("Epic6") @Feature("Кнопка Питание-Уход за телом")
    void chooseNutrition() {
        driver.get("https://citycycle.ru/");
        FrontPage page = new FrontPage(driver);
        page.chooseNutrition();
       // Assertions.assertTrue(driver.getTitle().equals("Уход за телом"));
    }
    @Test @Epic("Epic7") @Feature("Кнопка Сертификаты")
    void chooseCertificates() {
        driver.get("https://citycycle.ru/");
        FrontPage page = new FrontPage(driver);
        page.chooseCertificates();
       // Assertions.assertTrue(driver.getTitle().equals("Сертификаты"));
    }
    @Test @Epic("Epic8") @Feature("Кнопка Бренды")
    void chooseBrend() {
        driver.get("https://citycycle.ru/");
        FrontPage page = new FrontPage(driver);
        page.chooseBrend();
      //  Assertions.assertTrue(driver.getTitle().equals("Купить Polar в интернет-магазине CityCycle.ru"));
    }
    @Test @Epic("Epic9") @Feature("Кнопка Скидки")
    void chooseDiscount() {
        driver.get("https://citycycle.ru/");
        FrontPage page = new FrontPage(driver);
        page.chooseDiscount();
       // Assertions.assertTrue(driver.getTitle().equals("Распродажа велосипедов, велоформы, велозапчастей и велоаксессуаров в интернет-магазине CityCycle.ru"));
    }








}
