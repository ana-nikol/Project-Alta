package Alta.StepObject;

import Alta.PageObject.Altapage_Third;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;


public class step_three extends Altapage_Third {
    @Step("Click the third page")
    public step_three PageThree() {
        gothirdPage.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Click the menu")
    public step_three Menu() {
        goTomenu.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Click subcategories")
    public step_three list() {
        select.click();
        return this;
    }

    @Step("Click Price")
    public step_three Price() {
        select_step.click();
        return this;
    }

    @Step("Check brand of product is enabled")
    public step_three Brand() {
        get_brand.shouldBe(Condition.enabled);
        return this;
    }


    @Step("Model is - {some_model}")
    public step_three Model(String some_model) {
        model.selectRadio(some_model);
        return this;
    }

    @Step("Click Offer")
    public step_three Offer() {
        offer.waitUntil(Condition.visible, 2000).click();
        return this;
    }


    @Step("Click Discount")
    public step_three Sale(String some_product) {
        select_sale.selectRadio(some_product);
        return this;
    }

    @Step("Click wheel")
    public step_three Wheel() {
        diameter.waitUntil(Condition.visible, 2000).click();
        return this;
    }


    @Step("Select product size and check visibility")
    public step_three Size(String some_size) {
        size.selectRadio(some_size).waitUntil(Condition.visible, 2000);
        return this;
    }


    @Step("Click product")
    public step_three Scooter() {
        some_model.click();
        return this;
    }


    @Step("Check discount visibility")
    public step_three Discount() {
        discound.waitUntil(Condition.visible,4000);
        return this;
    }


    public step_three Scroll(boolean top) {
        container.scrollIntoView(top).waitUntil(Condition.visible, 3000);
        return this;
    }


    @Step("Check product warranty visibility")
    public step_three Warranty() {
        warranty.waitUntil(Condition.visible, 3000);
        return this;
    }


    @Step("Click menu")
    public step_three MENU() {
        menu.click();
        return this;
    }


    @Step("Click product")
    public step_three Drone() {
        drones.click();
        return this;
    }


    @Step("Check product price visibility")
    public step_three PRICE() {
        price.shouldBe(Condition.visible);
        return this;
    }


    @Step("Check product type visibility")
    public step_three TYPE() {
        drone_brand.shouldBe(Condition.visible);
        return this;
    }


    @Step("Click product type")
    public step_three PRO() {
        swellPro.waitUntil(Condition.visible, 2000).click();
        return this;
    }

    @Step("Click balance in the store")
    public step_three Show() {
        show_stock.click();
        return this;
    }

    @Step("Check product store visibility")
    public step_three Store() {
        store_name.shouldNotBe(Condition.disappear);
        return this;
    }

    @Step("Check product place visibility")
    public step_three Place() {
        store_center.shouldNotBe(Condition.disappear);
        return this;
    }

    @Step("Check working hours visibility")
    public step_three Hours() {
        hours.shouldNotBe(Condition.disappear);
        return this;
    }

    @Step("Check working days visibility")
    public step_three Days() {
        day.shouldNotBe(Condition.disappear);
        return this;
    }

    @Step("Click return back")
    public step_three Back() {
        back.waitUntil(Condition.visible, 2000).click();
        return this;
    }


    @Step("Click wishlist")
    public step_three Wish() {
        wish.waitUntil(Condition.visible, 2000).click();
        return this;
    }

    @Step("Click wishlist")
    public step_three List() {
        wish_list.waitUntil(Condition.visible, 2000).click();
        return this;
    }


    @Step("Click remove icon")
    public step_three Clear() {
        remove.waitUntil(Condition.visible, 2000).click();
        return this;
    }


    @Step("click the main page")
    public step_three back() {
        mainPage.click();
        return this;
    }
}
