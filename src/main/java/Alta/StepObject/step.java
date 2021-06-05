package Alta.StepObject;

import Alta.PageObject.Altapage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.$;

public class step extends Altapage {
    @Step("Click Login/Register button")
    public step goToRegisterPage() {
        goToregistration.waitUntil(Condition.visible, 1500).click();
        return this;
    }

    @Step("Check the first registry input visibility")
    public step emptyinput() {
        checkinput.shouldBe(Condition.visible);
        return this;
    }

    @Step("Check the second registry input visibility")
    public step emptyinput2() {
        checkinput2.shouldBe(Condition.visible);
        return this;
    }

    @Step("Click Registration button")
    public step goRegister() {
        goToregister.click();
        return this;
    }


    @Step("Check title of registration visibility")
    public step goTitle() {
        title.shouldBe(Condition.visible);
        return this;
    }

    @Step("Check account type visibility")
    public step account() {
        accounttype.shouldBe(Condition.visible);
        return this;
    }

    @Step("Click to account type")
    public step Selectradio() {
        rediobtelement.click();
        return this;

    }

    @Step("Enter the password")
    public step Pass(String passwords) {
        passwordInput.setValue(passwords);
        return this;
    }

    @Step("Repeat the password")
    public step Pass2(String passwords) {
        passwordInput2.setValue(passwords);
        return this;
    }

    @Step("Username is")
    public step Firstname(String first_name) {
        firstNameinput.setValue(first_name);
        return this;
    }

    @Step("The surname is")
    public step Lastname(String last_name) {
        lastNameInput.setValue(last_name);
        return this;
    }


    @Step("Log in email is - {email}")
    public step Email(String email) {
        emailinput.setValue(email);
        return this;
    }

    public step Scroll(boolean top) {
        one.scrollIntoView(top).waitUntil(Condition.visible, 2000);
        return this;
    }

    @Step("Click registration button")
    public step RegBtn() {
        registerBtn.waitUntil(Condition.visible, 2000).click();
        return this;
    }


    @Step("Click the first page")
    public step Page1() {
        gofirstPage.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Click the menu")
    public step Menu() {
        mainmenu.waitUntil(Condition.visible, 1500).click();
        return this;
    }


    @Step("Click the tablets")
    public step Tablet() {
        tablets.click();
        return this;
    }


    @Step("Check filter enabled")
    public step Filter() {
        filterbtn.shouldBe(Condition.enabled);
        return this;
    }

    @Step("Click filter")
    public step flick() {
        filterbtn.waitUntil(Condition.visible, 1500).click();
        return this;
    }


    @Step("Click bestSellers")
    public step bestSellers() {
        bestsellers.waitUntil(Condition.visible, 1500).click();
        return this;
    }


    @Step("Check visibility Click ")
    public step Main() {
        Btnone.waitUntil(Condition.visible, 1500).click();
        return this;
    }

    @Step("Click the first page button")
    public step Btn() {
        btn.waitUntil(Condition.visible, 1500).click();
        return this;
    }

    @Step("Click the second page button")
    public step SEcond() {
        bnt_2.waitUntil(Condition.visible, 1500).click();
        return this;
    }

    @Step("Click the third page button")
    public step next() {
        btn_3.waitUntil(Condition.visible, 1500).click();
        return this;
    }

    @Step("Click the product")
    public step Tab() {
        model.waitUntil(Condition.visible, 1500).click();
        return this;
    }


    @Step("Click the cart")
    public step cart() {
        button_cart.waitUntil(Condition.visible, 1500).click();
        return this;
    }


    @Step("Check product sum visibility")
    public step sum() {
        total.shouldBe(Condition.visible);
        return this;
    }

    @Step("Click shopping cart")
    public step in_cart() {
        shopping_cart.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Click button of increase")
    public step increase() {
        incr.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Click to recount")
    public step calculate() {
        re_calc.waitUntil(Condition.visible, 1500).click();
        return this;
    }

    public step scroll(boolean top) {
        incr.scrollIntoView(top).waitUntil(Condition.visible, 1500);
        return this;
    }


    @Step("Click order")
    public step Order() {
        order.click();
        return this;
    }

    @Step("Account type")
    public step type(String some_radio) {
        account.selectRadio(some_radio);
        return this;
    }

    @Step("User number is - {some_number}")
    public step Phone(String some_number) {
        user_phone.setValue(some_number);
        return this;
    }

    @Step("User personal number is - {personal_number}")
    public step Number(String personal_number) {
        p_numb.setValue(personal_number);
        return this;
    }

    @Step("City is - {some_city}")
    public step CiTy(String some_city) {
        city.setValue(some_city);
        return this;
    }

    @Step("address is - {some_address}")
    public step address(String some_address) {
        addres.setValue(some_address);
        return this;
    }

    @Step("Scroll")
    public step scrol(boolean top) {
        container.scrollIntoView(top);
        return this;
    }

    @Step("payment is - {some_payment}")
    public step pay(String some_payment) {
        payment.selectRadio(some_payment);
        return this;
    }

    @Step("mark and accept terms of service")
    public step terms(String some_payment) {
        payment.selectRadio(some_payment);
        return this;
    }

    @Step("Click warranty terms")
    public step Warranty(String some_x) {
        warranty.selectRadio(some_x);
        return this;
    }

    @Step("Click order")
    public step order() {
        selectOrder.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Click cart")
    public step CART() {
        Main_Cart.waitUntil(Condition.visible, 2000).click();
        return this;
    }

    @Step("Delete order")
    public step Delete() {
        $(".owl-item").hover();
        delete.waitUntil(Condition.visible, 2000).click();
        return this;
    }
}
