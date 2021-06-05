package Alta.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Altapage_Second {
    protected SelenideElement
            goToSecondPage = $(".ty-menu__item-link", 2),
            gotoList = $(".ty-text-links__a", 0),
            chose = $("#sw_content_27_329"),
            Brand = $("#elm_checkbox_27_329_1082"),
            product = $(byName("product_filters[285]")),
            fields = $("#sw_elm_sort_fields"),
            sort = $(byText("ანბანის მიხედვით: A-დან Z-მდე")),
            smartWatches = $(".ty-text-links__a", 1),
            Price = $("#sw_content_27_17"),
            samsung = $("#sw_content_27_329"),
            get_brand = $("#elm_checkbox_27_329_20293"),
            chose_type = $("#sw_content_27_333"),
            product_name = $(byName("product_filters[333]")),
            screen = $("#sw_content_27_166"),
            size = $(byName("product_filters[166]")),
            water = $("#sw_content_27_254"),
            get_resistant = $(byName("product_filters[254]")),
            galaxy = $(".ty-pict", 0),
            btn_compare = $(".ty-add-to-compare"),
            get_second = $("#det_img_34352"),
            scale = $(".cm-ajax", 1),
            primare_compare = $(".primary-compare"),
            remove_btn = $(".ty-remove__txt");


}
