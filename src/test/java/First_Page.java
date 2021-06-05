import Alta.StepObject.step;
import Alta.Utils.Chromerunner;
import Alta.Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Alta.DataObject.AltaData.*;
import static Alta.DataObject.AltaData.x;
import static com.codeborne.selenide.Selenide.$;


@Listeners(Alta.Utils.TestLister.class)
public class First_Page extends Chromerunner {

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("Scroll and go to the pages test description")
    public void filter() {
        SoftAssert soft = new SoftAssert();
        step somefilter = new step();
        somefilter
                .Page1()
                .Menu();
        soft.assertEquals("ტაბლეტები და აქსესუარები", $("h1").getText());
        somefilter.Tablet()
                .Filter()
                .flick()
                .bestSellers()
                .Main()
                .Scroll(false)
                .Btn()
                .Scroll(false)
                .SEcond()
                .Scroll(false)
                .next()
                .Scroll(false);
        soft.assertAll();
    }


    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The whole process of purchasing the product test description")
    public void BuyTheTablet() {
        SoftAssert soft = new SoftAssert();
        step product = new step();
        product
                .Page1()
                .Menu();
        soft.assertEquals("ტაბლეტები და აქსესუარები", $("h1").getText());
        product.Tablet()
                .Tab()
                .cart()
                .sum()
                .in_cart()
                .increase()
                .calculate()
                .scroll(false)
                .Order()
                .type(Radio)
                .Email(fillemail)
                .Pass(password)
                .Pass2(password)
                .Firstname(firstName)
                .Lastname(lastName)
                .Phone(phoneNumber)
                .Number(pers_number)
                .CiTy(city)
                .address(adress)
                .scrol(true)
                .pay(paymethod)
                .Warranty(x)
                .order()
                .CART();
              //  .Delete(); gogoebo es xan mushaobs xan ara da mainc iyos yoveli shemtxvevistvis :D <3
        soft.assertAll();

    }
}
