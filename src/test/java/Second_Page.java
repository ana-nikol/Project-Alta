import Alta.StepObject.step_two;
import Alta.Utils.Chromerunner;
import Alta.Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Alta.DataObject.AtaData_Second.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

@Listeners(Alta.Utils.TestLister.class)
public class Second_Page extends Chromerunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Comparison of two product test description")
    public void Smartwatches() {
        SoftAssert soft = new SoftAssert();
        step_two smart = new step_two();
        smart
                .Second()
                .Smart()
                .Pricer()
                .BRand()
                .Samsung(brand)
                .TyPe()
                .Name(watches)
                .resistant()
                .get(resistant)
                .Galaxy()
                .compare()
                .Second()
                .Smart()
                .Pricer()
                .BRand()
                .Samsung(brand)
                .TyPe()
                .Name(watches);
        soft.assertEquals("Water Resistant", $("#sw_content_27_254").getText());
        smart.resistant()
                .get(resistant)
                .secondw()
                .compare()
                .compare_cart()
                .compare_List();
        soft.assertAll();

    }


    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("Sort detail test description")
    public void Phone() {
        SoftAssert soft = new SoftAssert();
        step_two Mobile = new step_two();
        Mobile
                .Second()
                .List()
                .Some()
                .brand(radio)
                .Sort();
        soft.assertEquals("პოპულარობით", $("#sw_elm_sort_fields").getText());
        Mobile.Sorting()
                .Sort();
        soft.assertAll();

    }

}
