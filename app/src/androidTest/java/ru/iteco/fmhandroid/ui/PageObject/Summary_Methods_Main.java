package ru.iteco.fmhandroid.ui.PageObject;

public class Summary_Methods_Main {

    // сводный метод проверки видимости всех иконок на экране Main
    public void checkAllIconsVisibilityOnMainPage() {
        new Utils_Helper().timerWaitingAsyncOperation3000();
        new CheckUtils_Main().checkIconMenu_Visibility();             // иконка MENU
        new CheckUtils_Main().checkIconTradeMark_Visibility();        // иконка ВХОСПИСЕ
        new CheckUtils_Main().checkIconButterFly_Visibility();        // иконка Бабочка
        new CheckUtils_Main().checkIconNews_Visibility();
        new CheckUtils_Main().checkIconAllNews_Visibility();
        new CheckUtils_Main().checkIconClaims_Visibility();
        new CheckUtils_Main().checkIconAllClaims_Visibility();
        new CheckUtils_Main().checkIconLogOut_Visibility();
    }

}
