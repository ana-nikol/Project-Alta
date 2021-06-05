import Alta.StepObject.step_three;
import Alta.Utils.Chromerunner;
import Alta.Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Alta.DataObject.AltaData_Third.*;
import static com.codeborne.selenide.Selenide.$;

@Listeners(Alta.Utils.TestLister.class)
public class Third_Page extends Chromerunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description
    public void scooter() {
        SoftAssert soft = new SoftAssert();
        step_three toy = new step_three();
        toy
                .PageThree()
                .Menu()
                .list()
                .Price()
                .Brand()
                .Model(first)
                .Offer()
                .Sale(Second)
                .Wheel()
                .Scooter()
                .Discount()
                .Scroll(false);
        soft.assertEquals("Warranty", $(".ty-subheader", 5).getText());
        toy.Warranty()
                .Scroll(true);
        soft.assertAll();

    }

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Add and remove products from the wishlist test description")
    public void Drone() {
        SoftAssert soft = new SoftAssert();
        step_three drone = new step_three();
        drone
                .PageThree()
                .MENU()
                .Drone()
                .PRICE()
                .TYPE()
                .PRO()
                .Show()
                .Store();
        soft.assertEquals("ქავთარაძის მაღაზია", $(".nj_store_name").getText());
        drone.Place()
                .Hours();
        soft.assertEquals("ყოველდღე: 10:00 - 19:00", $(".nj_store_working_days").getText());
        drone.Days()
                .Back()
                .Wish()
                .List()
                .Clear()
                .back();
        soft.assertAll();
    }

}

