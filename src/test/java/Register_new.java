import Alta.StepObject.step;
import Alta.Utils.Chromerunner;
import Alta.Utils.Retry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selectors.*;

import java.net.Authenticator;
//import com.sun.net.httpserver.Authenticator,

import static Alta.DataObject.AltaData.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

@Listeners(Alta.Utils.TestLister.class)
public class Register_new extends Chromerunner {

    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login / Registration detailed test description")
    public void fillregister() {
        SoftAssert soft = new SoftAssert();
        step register = new step();
        register

                .goToRegisterPage()
                .emptyinput()
                .emptyinput2()
                .goRegister();
        soft.assertEquals("ახალი ანგარიშის რეგისტრაცია", $("h1").getText());
        register.goTitle()
                .account()
                .Selectradio()
                .Email(fillemail)
                .Pass(password)
                .Pass2(password)
                .Firstname(firstName)
                .Lastname(lastName)
                .RegBtn();
        soft.assertAll();

    }
}
