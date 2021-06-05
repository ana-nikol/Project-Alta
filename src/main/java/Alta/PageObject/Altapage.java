package Alta.PageObject;

import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Altapage<pageone> {
    public SelenideElement

            goToregistration = $(".ty-account-info__title-txt"),
            checkinput = $(byName("hint_user_login")),
            checkinput2 = $(byName("hint_password")),
            goToregister = $(".ty-login-reglink__a"),
            title = $(byText("ახალი ანგარიშის რეგისტრაცია")),
            accounttype = $(byText("ანგარიშის ტიპი:")),
            rediobtelement = $(byName("user_data[user_type]"), 0),
            emailinput = $(byName("user_data[email]")),
            firstNameinput = $(byName("user_data[firstname]")),
            lastNameInput = $(byName("user_data[lastname]")),
            passwordInput = $(byName("user_data[password1]")),
            passwordInput2 = $(byName("user_data[password2]")),
            registerBtn = $(byName("dispatch[profiles.update]")),
            gofirstPage = $("#gm_id_335", 0),
            mainmenu = $(".ty-text-links__a", 1),
            tablets = $(".ty-text-links__a", 0),
            filterbtn = $("#sw_elm_sort_fields"),
            bestsellers = $(byText("ბესტსელერებით")),
            one = $(".ty-mainbox-container"),
            Btnone = $(".cm-history", 0),
            btn = $(".cm-history", 1),
            bnt_2 = $(".cm-history", 2),
            btn_3 = $(".cm-history", 3),
            model = $("#det_img_31044"),
            button_cart = $("#button_cart_31044"),
            ADD = $(".text-atc"),
            total = $(".ty-total-popup"),
            shopping_cart = $(".ty-btn", 5),
            incr = $(".cm-increase"),
            re_calc = $(by("data-ca-external-click-id", "button_cart")),
            order = $(".ty-btn__primary", 1),
            account = $(".radio "),
            emaillinput = $(byName("user_data[email]")),
            user_phone = $(byName("user_data[phone]")),
            p_numb = $(byName("user_data[fields][36]")),
            city = $(byName("user_data[s_city]")),
            addres = $(byName("user_data[s_address]")),
            container = $(".ty-step__title-txt", 2),
            payment = $("#payment_18"),
            warranty = $("#id_accept_terms"),
            selectOrder = $("#place_order_"),
            Main_Cart = $(".ty-dropdown-box__title"),
            delete = $(".cm-cart-item-delete");


}
