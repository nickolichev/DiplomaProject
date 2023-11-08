package ru.iteco.fmhandroid.ui.PageObject;

import io.qameta.allure.kotlin.junit4.DisplayName;

public class Summary_Methods_Main {

    @DisplayName("Сводный метод проверки отображения всех элементов на экране Main")
    public void checkAllIconsVisibilityOnMainPage() {
        new CheckUtils_Main().checkIconMenu_Visibility();
        new CheckUtils_Main().checkIconTradeMark_Visibility();
        new CheckUtils_Main().checkIconButterFly_Visibility();
        new CheckUtils_Main().checkIconNews_Visibility();
        new CheckUtils_Main().checkIconAllNews_Visibility();
        new CheckUtils_Main().checkButtonExpendNews_Visibility();
        new CheckUtils_Main().checkIconClaims_Visibility();
        new CheckUtils_Main().checkIconAllClaims_Visibility();
        new CheckUtils_Main().checkButtonAddNewClaim_Visibility();
        new CheckUtils_Main().checkButtonExpendClaim_Visibility();
        new CheckUtils_Main().checkIconLogOut_Visibility();
    }
}
