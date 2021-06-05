package Alta.StepObject;

import Alta.PageObject.Altapage_Second;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class step_two extends Altapage_Second {
    @Step("Click the second page")
    public step_two Second() {
        goToSecondPage.click();
        return this;
    }

    @Step("Click the menu")
    public step_two List() {
        gotoList.click();
        return this;
    }

    @Step("Check product brand is enable")
    public step_two Some() {
        chose.waitUntil(Condition.enabled, 2000);
        return this;
    }

    @Step("Select brand and check visibility")
    public step_two brand(String some_brand) {
        Brand.selectRadio(some_brand).waitUntil(Condition.visible, 2000);
        return this;
    }


    @Step("Select filter product")
    public step_two filter(String some_radio) {
        product.selectRadio(some_radio);
        return this;
    }


    @Step("Click sort list")
    public step_two Sort() {
        fields.waitUntil(Condition.visible, 4000).click();
        return this;
    }


    @Step("Sort alphabetically: A to Z.")
    public step_two Sorting() {
        sort.waitUntil(Condition.visible, 2000).click();
        return this;
    }


    @Step("Click product")
    public step_two Smart() {
        smartWatches.shouldBe(Condition.enabled).click();
        return this;
    }

    @Step("Click pricer")
    public step_two Pricer() {
        Price.shouldBe(Condition.enabled).click();
        return this;
    }

    @Step("brand is enable")
    public step_two BRand() {
        samsung.shouldBe(Condition.enabled);
        return this;
    }


    @Step("Check product brand visibility and select")
    public step_two Samsung(String some_Brand) {
        get_brand.selectRadio(some_Brand).waitUntil(Condition.visible, 1500);
        return this;
    }


    @Step("Click type of product")
    public step_two TyPe() {
        chose_type.waitUntil(Condition.visible, 1500).click();
        return this;
    }


    @Step("Select product")
    public step_two Name(String some_product) {
        product_name.selectRadio(some_product);
        return this;

    }

    @Step("Click size of product")
    public step_two Size() {
        screen.click();
        return this;
    }


    @Step("Select screen size of product")
    public step_two screen(String some_size) {
        size.selectRadio(some_size).waitUntil(Condition.visible, 1000);
        return this;
    }


    @Step("Click product resistant")
    public step_two resistant() {
        water.waitUntil(Condition.visible, 3000).click();
        return this;
    }

    @Step("Check visibility and Select yes")
    public step_two get(String some_condition) {
        get_resistant.selectRadio(some_condition).waitUntil(Condition.visible, 1000);
        return this;

    }

    @Step("Click model")
    public step_two Galaxy() {
        galaxy.waitUntil(Condition.visible, 1000).click();
        return this;
    }

    @Step("Click the compare ")
    public step_two compare() {
        btn_compare.waitUntil(Condition.visible, 1000).click();
        return this;
    }

    @Step("Click second product")
    public step_two secondw() {
        get_second.waitUntil(Condition.visible, 1000).click();
        return this;
    }

    @Step("Click the compare cart ")
    public step_two compare_cart() {
        scale.waitUntil(Condition.visible, 1000).click();
        return this;
    }

    @Step("Click the compare button")
    public step_two compare_List() {
        primare_compare.waitUntil(Condition.visible, 1000).click();
        return this;
    }

    @Step("Click remove")
    public step_two remove() {
        remove_btn.waitUntil(Condition.visible, 1000).click();
        return this;
    }

}
