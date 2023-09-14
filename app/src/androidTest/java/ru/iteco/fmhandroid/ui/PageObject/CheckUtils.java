package ru.iteco.fmhandroid.ui.PageObject;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.hasDescendant;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static ru.iteco.fmhandroid.ui.PageObject.UtilsHelper.childAtPosition;
import static ru.iteco.fmhandroid.ui.testData.ClaimData.COMMENT_CONTENT_CARD_3;

import android.view.View;

import androidx.test.espresso.NoMatchingViewException;
import androidx.test.espresso.ViewInteraction;

import org.hamcrest.core.IsInstanceOf;

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.ui.resourceIDData.AboutElements;
import ru.iteco.fmhandroid.ui.resourceIDData.AuthorizationElements;
import ru.iteco.fmhandroid.ui.resourceIDData.ClaimElements;
import ru.iteco.fmhandroid.ui.resourceIDData.MainElements;
import ru.iteco.fmhandroid.ui.resourceIDData.MenuElelements;
import ru.iteco.fmhandroid.ui.resourceIDData.NewsElements;
import ru.iteco.fmhandroid.ui.testData.AboutData;
import ru.iteco.fmhandroid.ui.testData.ClaimData;
import ru.iteco.fmhandroid.ui.testData.MainData;
import ru.iteco.fmhandroid.ui.testData.MenuData;
import ru.iteco.fmhandroid.ui.testData.NewsData;

public class CheckUtils {
//    @Rule
//    public ActivityTestRule<AppActivity> mActivityRule = new ActivityTestRule<>(AppActivity.class);
//    public ActivityTestRule<AppActivity> mActivityScenarioRule =
//            new ActivityTestRule<>(AppActivity.class);
//    CardIdlingResource cardIdlingResource = new CardIdlingResource();

//    @Before
//    public void registerIdlingResources() {
//        cardIdlingResource = new CardIdlingResource();
//        IdlingRegistry.getInstance().register(ProjectIdlingResources.idlingResource);
//
//        try {
//            new AuthUtils().titleCheck();
//        } catch (NoMatchingViewException e) {
//            new AuthUtils().logOut();
//        }
//    }
//
//    @After
//    public void unregisterIdlingResources() {
//        IdlingRegistry.getInstance().unregister(ProjectIdlingResources.idlingResource);
//    }

    // экран MAIN PAGE
    // проверки всех иконок
    public void checkAllIconsVisibilityOnMainPage() {
        new CheckUtils().checkIconVisibilityMenu();             // иконка MENU
        new CheckUtils().checkIconVisibilityTradeMark();        // иконка ВХОСПИСЕ
        new CheckUtils().checkIconVisibilityButterFly();        // иконка Бабочка
        new CheckUtils().checkIconVisibilityNews();
        new CheckUtils().checkIconVisibilityAllNews();
        new CheckUtils().checkIconVisibilityClaims();
        new CheckUtils().checkIconVisibilityAllClaims();
        new CheckUtils().checkIconVisibilityLogOut();
    }

    public void checkIconVisibilityMenu() {
        ViewInteraction iconMenu = onView(withId(MainElements.ID_MAIN_MENU));
        iconMenu.check(matches(isDisplayed()));
        ViewInteraction descriptionMenu = onView(allOf(
                withId(MainElements.ID_MAIN_MENU),
                withContentDescription(MainData.DESCRIPTION_MENU)
        ));
        descriptionMenu.check(matches(isDisplayed()));
    }

    public void checkIconVisibilityTradeMark() {
        ViewInteraction iconTradMark = onView(withId(MainElements.ID_TRADE_MARK));
        iconTradMark.check(matches(isDisplayed()));
    }

    public void checkIconVisibilityButterFly() {
        ViewInteraction iconButterFly = onView(withId(MainElements.ID_BUTTERFLY));
        iconButterFly.check(matches(isDisplayed()));
        ViewInteraction descriptionMission = onView(allOf(
                withId(MainElements.ID_BUTTERFLY),
                withContentDescription(MainData.DESCRIPTION_MISSION)
        ));
        descriptionMission.check(matches(isDisplayed()));
    }

    public void checkIconVisibilityNews() {
        ViewInteraction iconNews = onView(withId(MainElements.ID_NEWS));
        iconNews.check(matches(isDisplayed()));

        ViewInteraction textNews = onView(allOf(
                withId(MainElements.ID_NEWS),
                hasDescendant(withText(MainData.TEXT_NEWS))
        ));
        textNews.check(matches(isDisplayed()));
    }

    // иконка на Main
    public void checkIconVisibilityAllNews() {
        ViewInteraction iconNews = onView(withId(MainElements.ID_ALL_NEWS));
        iconNews.check(matches(isDisplayed()));

        ViewInteraction textAllNews = onView(allOf(
                withId(MainElements.ID_ALL_NEWS),
                withParent(allOf(
                        withId(MainElements.ID_NEWS),
                        withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout.class))
                )),
                withText(MainData.TEXT_ALL_NEWS)
        ));
        textAllNews.check(matches(isDisplayed()));
    }

    // иконка на Main
    public void checkIconVisibilityClaims() {
        ViewInteraction iconNews = onView(withId(MainElements.ID_CLAIMS));
        iconNews.check(matches(isDisplayed()));

        ViewInteraction textClaims = onView(allOf(
                withId(MainElements.ID_CLAIMS),
                hasDescendant(withText(MainData.TEXT_CLAIMS))
        ));
        textClaims.check(matches(isDisplayed()));
    }

    public void checkIconVisibilityAllClaims() {
        ViewInteraction iconNews = onView(withId(MainElements.ID_ALL_CLAIMS));
        iconNews.check(matches(isDisplayed()));

        ViewInteraction textAllClaims = onView(allOf(
                withId(MainElements.ID_ALL_CLAIMS),
                withParent(allOf(
                        withId(MainElements.ID_CLAIMS),
                        withParent(IsInstanceOf.instanceOf(android.widget.LinearLayout.class))
                )),
                withText(MainData.TEXT_ALL_CLAIMS)
        ));
        textAllClaims.check(matches(isDisplayed()));
    }

    // экран CLAIMS
    // проверка Title
    public void checkTitleVisibilityClaims() {
        ViewInteraction title = onView(allOf(withText(ClaimData.TITLE_CLAIMS_TEXT),
                withParent(withParent(withId(ClaimElements.ID_TITLE_CLAIMS))),
                isDisplayed()));
        title.check(matches(withText(ClaimData.TITLE_CLAIMS_TEXT)));
    }

    public void checkIconVisibilityLogOut() {
        ViewInteraction iconLogOut = onView(withId(AuthorizationElements.ID_IMAGE_LOG_OUT));
        iconLogOut.check(matches(isDisplayed()));
        ViewInteraction descriptionMission = onView(allOf(
                withId(AuthorizationElements.ID_IMAGE_LOG_OUT),
                withContentDescription(MainData.DESCRIPTION_LOG_OUT)
        ));
        descriptionMission.check(matches(isDisplayed()));
    }

    // MENU LIST
    // Утилиты проверок, что в списке есть все строки меню
    public void checkLineVisibilityNews() {
        ViewInteraction news = onView(
                allOf(withId(MenuElelements.ID_TITLE_MENU), withText(MenuData.NEWS_TEXT),
                        withParent(withParent(withId(MenuElelements.ID_PARENT_TITLE))),
                        isDisplayed()));
        news.check(matches(withText(MenuData.NEWS_TEXT)));
    }

    public void checkLineVisibilityClaims() {
        ViewInteraction claims = onView(
                allOf(withId(MenuElelements.ID_TITLE_MENU), withText(MenuData.CLAIMS_TEXT),
                        withParent(withParent(withId(MenuElelements.ID_PARENT_TITLE))),
                        isDisplayed()));
        claims.check(matches(withText(MenuData.CLAIMS_TEXT)));
    }

    public void checkLineVisibilityAbout() {
        ViewInteraction about = onView(
                allOf(withId(MenuElelements.ID_TITLE_MENU), withText(MenuData.ABOUT_TEXT),
                        withParent(withParent(withId(MenuElelements.ID_PARENT_TITLE))),
                        isDisplayed()));
        about.check(matches(withText(MenuData.ABOUT_TEXT)));
    }

    // экран NEWS
    // проверка Title
    public void checkTitleVisibilityNews() {
        ViewInteraction title = onView(allOf(withText(NewsData.TITLE_NEWS_TEXT),
                withParent(withParent(withId(NewsElements.ID_TITLE_NEWS))),
                isDisplayed()));
        title.check(matches(withText(NewsData.TITLE_NEWS_TEXT)));
    }

    // проверка видимости кнопки сортировки
    public void checkButtonSortVisibilityNews() {
        ViewInteraction sort = onView(
                allOf(withId(NewsElements.ID_BUTTON_SORT_NEWS), withContentDescription(NewsData.BUTTON_SORT_NEWS),
                        withParent(withParent(withId(R.id.container_list_news_include))),
                        isDisplayed()));
        sort.check(matches(isDisplayed()));

    }

    // проверка видимости кнопки фильтра
    public void checkButtonFilterVisibilityNews() {
        ViewInteraction filter = onView(
                allOf(withId(NewsElements.ID_BUTTON_FILTER_NEWS),
                        withParent(withParent(withId(R.id.container_list_news_include))),
                        isDisplayed()));
        filter.check(matches(isDisplayed()));

    }

    // проверка видимости кнопки редактирования
    public void checkButtonEditVisibilityNews() {
        ViewInteraction edit = onView(
                allOf(withId(NewsElements.ID_BUTTON_EDIT_NEWS),
                        withParent(withParent(withId(R.id.container_list_news_include))),
                        isDisplayed()));
        edit.check(matches(isDisplayed()));

    }

    public void checkIconCategoryVisibilityNews() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_ICON_CATEGORY_NEWS), withText(NewsData.ICON_CATEGORY_NEWS),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        title.check(matches(isDisplayed()));
    }

    // проверки Title во всех категориях
    // использовать также на экране EDITING NEWS
    public void checkTitleCustomVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_CARD_NEWS), withText(NewsData.TITLE_CARD_CUSTOM),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        title.check(matches(isDisplayed()));
    }

    public void checkTitleAdvertisementVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_CARD_NEWS), withText(NewsData.TITLE_CARD_ADVERTISEMENT),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        title.check(matches(isDisplayed()));
    }

    public void checkTitleBirthdayVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_CARD_NEWS), withText(NewsData.TITLE_CARD_BIRTHDAY),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        title.check(matches(isDisplayed()));
    }

    public void checkTitleSalaryVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_CARD_NEWS), withText(NewsData.TITLE_CARD_SALARY),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        title.check(matches(isDisplayed()));
    }

    public void checkTitleTradeUnionVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_CARD_NEWS), withText(NewsData.TITLE_CARD_TRADE_UNION),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        title.check(matches(isDisplayed()));
    }

    public void checkTitleHolidayVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_CARD_NEWS), withText(NewsData.TITLE_CARD_HOLIDAY),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        title.check(matches(isDisplayed()));
    }

    public void checkTitleMassageVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_CARD_NEWS), withText(NewsData.TITLE_CARD_MASSAGE),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        title.check(matches(isDisplayed()));
    }

    public void checkTitleGratitudeVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_CARD_NEWS), withText(NewsData.TITLE_CARD_GRATITUDE),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        title.check(matches(isDisplayed()));
    }

    public void checkTitleHelpVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_CARD_NEWS), withText(NewsData.TITLE_CARD_HELP),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        title.check(matches(isDisplayed()));
    }

    // проверка даты в нераскрытой карточке
    public void checkDateVisibility() {
        ViewInteraction date = onView(
                allOf(withId(NewsElements.ID_DATE_CARD_NEWS), withText(NewsData.DATE_CREATED),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        date.check(matches(withText(NewsData.DATE_CREATED)));
    }

    // проверка кнопки Expend в нераскрытой карточке
    public void checkExpendVisibility() {
        ViewInteraction expend = onView(
                allOf(withId(NewsElements.ID_EXPEND_CARD_NEWS), withContentDescription(NewsData.EXPEND_CARD_NEWS),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        expend.check(matches(withText(NewsData.EXPEND_CARD_NEWS)));
    }

    // экран FILTER NEWS
    // title экрана FILTER NEWS
    public void checkTitleFilterNewsVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_FILTER_NEWS), withText(NewsData.TITLE_FILTER_NEWS),
                        withParent(withParent(withId(R.id.nav_host_fragment))),
                        isDisplayed()));
        title.check(matches(withText(NewsData.TITLE_FILTER_NEWS)));
    }

    // использовать также на экране EDITING NEWS
    public void checkCategoryFilterVisibility() {
        ViewInteraction filter = onView(
                allOf(withId(NewsElements.ID_CATEGORY_FOR_ALL), withText(NewsData.CATEGORY_FOR_ALL),
                        withParent(withParent(withId(R.id.news_item_category_text_input_layout))),
                        isDisplayed()));
        filter.check(matches(withText(NewsData.CATEGORY_FOR_ALL)));
    }

    public void checkDropdownCategoryVisibility() {
        ViewInteraction button = onView(
                allOf(withId(NewsElements.ID_DROPDOWN_CATEGORY), withContentDescription(NewsData.DROPDOWN_CATEGORY),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        button.check(matches(isDisplayed()));
    }

    public void checkDateStartVisibility() {
        ViewInteraction date = onView(
                allOf(withId(NewsElements.ID_DATE_START), withText(NewsData.DATE_START),
                        withParent(withParent(withId(R.id.news_item_publish_date_start_text_input_layout))),
                        isDisplayed()));
        date.check(matches(withText(NewsData.DATE_START)));
    }

    public void checkDateEndVisibility() {
        ViewInteraction date = onView(
                allOf(withId(NewsElements.ID_DATE_END), withText(NewsData.DATE_END),
                        withParent(withParent(withId(R.id.news_item_publish_date_end_text_input_layout))),
                        isDisplayed()));
        date.check(matches(withText(NewsData.DATE_END)));
    }

    public void checkButtonFilterVisibility_Filter() {
        ViewInteraction button = onView(
                allOf(withId(NewsElements.ID_BUTTON_FILTER), withText(NewsData.BUTTON_FILTER),
                        withParent(withParent(withId(R.id.nav_host_fragment))),
                        isDisplayed()));
        button.check(matches(isDisplayed()));
    }

    public void checkButtonCancelVisibility_Filter() {
        ViewInteraction button = onView(
                allOf(withId(NewsElements.ID_BUTTON_CANCEL), withText(NewsData.BUTTON_CANCEL),
                        withParent(withParent(withId(R.id.nav_host_fragment))),
                        isDisplayed()));
        button.check(matches(isDisplayed()));
    }


    // экран Control panel
    public void checkTitleControlPanelVisibility() {
        ViewInteraction text = onView(
                allOf(withText(NewsData.CONTROL_PANEL),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        text.check(matches(withText(NewsData.CONTROL_PANEL)));
    }

    public void checkSortControlPanelVisibility() {
        ViewInteraction sort = onView(allOf(withId(NewsElements.ID_BUTTON_SORT),
                withContentDescription(NewsData.BUTTON_SORT),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.container_list_news_include),
                                        0),
                                1),
                        isDisplayed()));
        sort.check(matches(withText(NewsData.BUTTON_SORT)));
    }

    public void checkButtonAddControlPanelVisibility() {
        ViewInteraction add = onView(
                allOf(withId(NewsElements.ID_BUTTON_ADD_NEWS), withContentDescription(NewsData.BUTTON_ADD_NEWS),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class))),
                        isDisplayed()));
        add.check(matches(isDisplayed()));
    }

    // проверяем текст "Publication date"
    public void checkPublicationControlPanelVisibility() {
        ViewInteraction date = onView(
                allOf(withId(NewsElements.ID_PUBLICATION_DATE), withText(NewsData.PUBLICATION_DATE),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        date.check(matches(withText(NewsData.PUBLICATION_DATE)));
    }

    // проверяем значение Publication date
    public void checkPublicationValueControlPanelVisibility() {
        ViewInteraction date = onView(
                allOf(withId(NewsElements.ID_PUBLICATION_DATE_VALUE), withText(NewsData.PUBLICATION_DATE_VALUE),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        date.check(matches(withText(NewsData.PUBLICATION_DATE_VALUE)));
    }

    // проверяем текст "Creation date"
    public void checkCreationControlPanelVisibility() {
        ViewInteraction date = onView(
                allOf(withId(NewsElements.ID_CREATION_DATE), withText(NewsData.CREATION_DATE),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        date.check(matches(withText(NewsData.CREATION_DATE)));
    }

    // проверяем значение Creation date
    // заменить на текущую дату Попробовать написать метод установки текущей даты
    public void checkCreationValueControlPanelVisibility() {
        ViewInteraction date = onView(
                allOf(withId(NewsElements.ID_CREATION_DATE_VALUE), withText(NewsData.CREATION_DATE_VALUE),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        date.check(matches(withText(NewsData.CREATION_DATE_VALUE)));
    }

    public void checkAuthorControlPanelVisibility() {

        ViewInteraction author = onView(
                allOf(withId(NewsElements.ID_AUTHOR), withText(NewsData.AUTHOR),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        author.check(matches(withText(NewsData.AUTHOR)));
    }

    public void checkAuthorValueControlPanelVisibility() {
        ViewInteraction author = onView(
                allOf(withId(NewsElements.ID_AUTHOR_VALUE), withText(NewsData.AUTHOR_VALUE),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        author.check(matches(withText(NewsData.AUTHOR_VALUE)));
    }

    public void checkCheckMarkControlPanelVisibility() {
        ViewInteraction check = onView(
                allOf(withId(NewsElements.ID_CHECK_MARK), withContentDescription(NewsData.CHECK_MARK),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        check.check(matches(isDisplayed()));
    }

    public void checkActiveControlPanelVisibility() {
        ViewInteraction active = onView(
                allOf(withId(NewsElements.ID_STATUS_ACTIVE), withText(NewsData.STATUS_ACTIVE),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        active.check(matches(withText(NewsData.STATUS_ACTIVE)));
    }

    public void checkDeleteControlPanelVisibility() {
        ViewInteraction delete = onView(
                allOf(withId(NewsElements.ID_BUTTON_DELETE), withContentDescription(NewsData.BUTTON_DELETE),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        delete.check(matches(isDisplayed()));
    }

    public void checkEditControlPanelVisibility() {
        ViewInteraction edit = onView(
                allOf(withId(NewsElements.ID_BUTTON_EDIT), withContentDescription(NewsData.BUTTON_EDIT),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        edit.check(matches(isDisplayed()));
    }

    public void checkExpendControlPanelVisibility() {
        ViewInteraction expend = onView(
                allOf(withId(NewsElements.ID_BUTTON_EXPEND), withContentDescription(NewsData.BUTTON_EXPEND),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        expend.check(matches(isDisplayed()));
    }


    // набор методов проверки DESCRIPTION по всем категориям
    // на экране Control panel после expend
    public void checkDescriptionCustomVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION), withText(NewsData.DESCRIPTION_CUSTOM),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_CUSTOM)));
    }

    public void checkDescriptionAdvertisementVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION), withText(NewsData.DESCRIPTION_ADVERTISEMENT),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_ADVERTISEMENT)));
    }

    public void checkDescriptionBirthdayVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION), withText(NewsData.DESCRIPTION_BIRTHDAY),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_BIRTHDAY)));
    }

    public void checkDescriptionSalaryVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION), withText(NewsData.DESCRIPTION_SALARY),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_SALARY)));
    }

    public void checkDescriptionTradeUnionVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION), withText(NewsData.DESCRIPTION_TRADE_UNION),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_TRADE_UNION)));
    }

    public void checkDescriptionHolidayVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION), withText(NewsData.DESCRIPTION_HOLIDAY),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_HOLIDAY)));
    }

    public void checkDescriptionMassageVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION), withText(NewsData.DESCRIPTION_MASSAGE),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_MASSAGE)));
    }

    public void checkDescriptionGratitudeVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION), withText(NewsData.DESCRIPTION_GRATITUDE),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_GRATITUDE)));
    }

    public void checkDescriptionHelpVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION), withText(NewsData.DESCRIPTION_HELP),
                        withParent(withParent(withId(R.id.news_item_material_card_view))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_HELP)));
    }



    // экран EDITING NEWS
    // проверка title EDITING
    public void checkTitleEditingVisibility(){
            ViewInteraction title = onView(
                    allOf(withId(NewsElements.ID_TITLE_EDITING), withText(NewsData.TITLE_EDITING),
                            withParent(allOf(withId(R.id.container_custom_app_bar_include_on_fragment_create_edit_news),
                                    withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class)))),
                            isDisplayed()));
            title.check(matches(withText(NewsData.TITLE_EDITING)));
        }

    // проверка sub title NEWS
    public void checkSubTitleNewsVisibility() {
        ViewInteraction sub = onView(
                allOf(withId(NewsElements.ID_SUB_TITLE_NEWS), withText(NewsData.SUB_TITLE_NEWS),
                        withParent(allOf(withId(R.id.container_custom_app_bar_include_on_fragment_create_edit_news),
                                withParent(IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class)))),
                        isDisplayed()));
        sub.check(matches(withText(NewsData.SUB_TITLE_NEWS)));
    }


    // набор методов проверки CATEGORY на экране EDITING NEWS
    // проверку выполнить перед редактированием каждого NEWS
    public void checkCategoryAdvertisementVisibility() {
        ViewInteraction category = onView(
                allOf(withId(NewsElements.ID_CATEGORY_FOR_ALL), withText(NewsData.CATEGORY_ADVERTISEMENT),
                        withParent(withParent(withId(R.id.news_item_category_text_input_layout))),
                        isDisplayed()));
        category.check(matches(withText(NewsData.CATEGORY_ADVERTISEMENT)));
    }

    public void checkCategoryBirthdayVisibility() {
        ViewInteraction category = onView(
                allOf(withId(NewsElements.ID_CATEGORY_FOR_ALL), withText(NewsData.CATEGORY_BIRTHDAY),
                        withParent(withParent(withId(R.id.news_item_category_text_input_layout))),
                        isDisplayed()));
        category.check(matches(withText(NewsData.CATEGORY_BIRTHDAY)));
    }

    public void checkCategorySalaryVisibility() {
        ViewInteraction category = onView(
                allOf(withId(NewsElements.ID_CATEGORY_FOR_ALL), withText(NewsData.CATEGORY_SALARY),
                        withParent(withParent(withId(R.id.news_item_category_text_input_layout))),
                        isDisplayed()));
        category.check(matches(withText(NewsData.CATEGORY_SALARY)));
    }

    public void checkCategoryTradeUnionVisibility() {
        ViewInteraction category = onView(
                allOf(withId(NewsElements.ID_CATEGORY_FOR_ALL), withText(NewsData.CATEGORY_TRADE_UNION),
                        withParent(withParent(withId(R.id.news_item_category_text_input_layout))),
                        isDisplayed()));
        category.check(matches(withText(NewsData.CATEGORY_TRADE_UNION)));
    }

    public void checkCategoryHolidayVisibility() {
        ViewInteraction category = onView(
                allOf(withId(NewsElements.ID_CATEGORY_FOR_ALL), withText(NewsData.CATEGORY_HOLIDAY),
                        withParent(withParent(withId(R.id.news_item_category_text_input_layout))),
                        isDisplayed()));
        category.check(matches(withText(NewsData.CATEGORY_HOLIDAY)));
    }

    public void checkCategoryMassageVisibility() {
        ViewInteraction category = onView(
                allOf(withId(NewsElements.ID_CATEGORY_FOR_ALL), withText(NewsData.CATEGORY_MASSAGE),
                        withParent(withParent(withId(R.id.news_item_category_text_input_layout))),
                        isDisplayed()));
        category.check(matches(withText(NewsData.CATEGORY_MASSAGE)));
    }

    public void checkCategoryGratitudeVisibility() {
        ViewInteraction category = onView(
                allOf(withId(NewsElements.ID_CATEGORY_FOR_ALL), withText(NewsData.CATEGORY_GRATITUDE),
                        withParent(withParent(withId(R.id.news_item_category_text_input_layout))),
                        isDisplayed()));
        category.check(matches(withText(NewsData.CATEGORY_GRATITUDE)));
    }

    public void checkCategoryHelpVisibility() {
        ViewInteraction category = onView(
                allOf(withId(NewsElements.ID_CATEGORY_FOR_ALL), withText(NewsData.CATEGORY_HELP),
                        withParent(withParent(withId(R.id.news_item_category_text_input_layout))),
                        isDisplayed()));
        category.check(matches(withText(NewsData.CATEGORY_HELP)));
    }


    // проверки всех ИСХОДНЫХ (при создании) Title в раскрытой карточке на экране EDITING NEWS
    // выполнить проверку каждого Title перед редактированием
    public void checkCreatedTitleAdvertisementVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_INPUT), withText(NewsData.TITLE_CARD_ADVERTISEMENT),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
        title.check(matches(withText(NewsData.TITLE_CARD_ADVERTISEMENT)));
    }

    public void checkCreatedTitleBirthdayVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_INPUT), withText(NewsData.TITLE_CARD_BIRTHDAY),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
        title.check(matches(withText(NewsData.TITLE_CARD_BIRTHDAY)));
    }

    public void checkCreatedTitleSalaryVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_INPUT), withText(NewsData.TITLE_CARD_SALARY),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
        title.check(matches(withText(NewsData.TITLE_CARD_SALARY)));
    }

    public void checkCreatedTitleTradeUnionVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_INPUT), withText(NewsData.TITLE_CARD_TRADE_UNION),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
        title.check(matches(withText(NewsData.TITLE_CARD_TRADE_UNION)));
    }

    public void checkCreatedTitleHolidayVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_INPUT), withText(NewsData.TITLE_CARD_HOLIDAY),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
        title.check(matches(withText(NewsData.TITLE_CARD_HOLIDAY)));
    }

    public void checkCreatedTitleMassageVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_INPUT), withText(NewsData.TITLE_CARD_MASSAGE),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
        title.check(matches(withText(NewsData.TITLE_CARD_MASSAGE)));
    }

    public void checkCreatedTitleGratitudeVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_INPUT), withText(NewsData.TITLE_CARD_GRATITUDE),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
        title.check(matches(withText(NewsData.TITLE_CARD_GRATITUDE)));
    }

    public void checkCreatedTitleHelpVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_INPUT), withText(NewsData.TITLE_CARD_HELP),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
        title.check(matches(withText(NewsData.TITLE_CARD_HELP)));
    }


    // проверки всех РЕДАКТИРОВАННЫХ Title в раскрытой карточке на экране EDITING NEWS
    // выполнить проверку каждого Title ПОСЛЕ редактирования
    public void checkEditedTitleAdvertisementVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_INPUT), withText(NewsData.TITLE_EDIT_ADVERTISEMENT),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
        title.check(matches(withText(NewsData.TITLE_EDIT_ADVERTISEMENT)));
    }

    public void checkEditedTitleBirthdayVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_INPUT), withText(NewsData.TITLE_EDIT_BIRTHDAY),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
        title.check(matches(withText(NewsData.TITLE_EDIT_BIRTHDAY)));
    }

    public void checkEditedTitleSalaryVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_INPUT), withText(NewsData.TITLE_EDIT_SALARY),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
        title.check(matches(withText(NewsData.TITLE_EDIT_SALARY)));
    }

    public void checkEditedTitleTradeUnionVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_INPUT), withText(NewsData.TITLE_EDIT_TRADE_UNION),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
        title.check(matches(withText(NewsData.TITLE_EDIT_TRADE_UNION)));
    }

    public void checkEditedTitleHolidayVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_INPUT), withText(NewsData.TITLE_EDIT_HOLIDAY),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
        title.check(matches(withText(NewsData.TITLE_EDIT_HOLIDAY)));
    }

    public void checkEditedTitleMassageVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_INPUT), withText(NewsData.TITLE_EDIT_MASSAGE),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
        title.check(matches(withText(NewsData.TITLE_EDIT_MASSAGE)));
    }

    public void checkEditedTitleGratitudeVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_INPUT), withText(NewsData.TITLE_EDIT_GRATITUDE),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
        title.check(matches(withText(NewsData.TITLE_EDIT_GRATITUDE)));
    }

    public void checkEditedTitleHelpVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_INPUT), withText(NewsData.TITLE_EDIT_HELP),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
        title.check(matches(withText(NewsData.TITLE_EDIT_HELP)));
    }




    // проверка ИСХОДНЫХ (при создании) DESCRIPTION

    public void checkCreatedDescriptionAdvertisementVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION_INPUT), withText(NewsData.DESCRIPTION_ADVERTISEMENT),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_ADVERTISEMENT)));
    }

    public void checkCreatedDescriptionBirthdayVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION_INPUT), withText(NewsData.DESCRIPTION_BIRTHDAY),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_BIRTHDAY)));
    }

    public void checkCreatedDescriptionSalaryVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION_INPUT), withText(NewsData.DESCRIPTION_SALARY),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_SALARY)));
    }

    public void checkCreatedDescriptionTradeUnionVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION_INPUT), withText(NewsData.DESCRIPTION_TRADE_UNION),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_TRADE_UNION)));
    }

    public void checkCreatedDescriptionHolidayVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION_INPUT), withText(NewsData.DESCRIPTION_HOLIDAY),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_HOLIDAY)));
    }

    public void checkCreatedDescriptionMassageVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION_INPUT), withText(NewsData.DESCRIPTION_MASSAGE),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_MASSAGE)));
    }

    public void checkCreatedDescriptionGratitudeVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION_INPUT), withText(NewsData.DESCRIPTION_GRATITUDE),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_GRATITUDE)));
    }

    public void checkCreatedDescriptionHelpVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION_INPUT), withText(NewsData.DESCRIPTION_HELP),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_HELP)));
    }

    // проверка ОТРЕДАКТИРОВАННЫХ  DESCRIPTION

    public void checkEditedDescriptionAdvertisementVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION_INPUT), withText(NewsData.DESCRIPTION_EDIT_ADVERTISEMENT),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_EDIT_ADVERTISEMENT)));
    }

    public void checkEditedDescriptionBirthdayVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION_INPUT), withText(NewsData.DESCRIPTION_EDIT_BIRTHDAY),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_EDIT_BIRTHDAY)));
    }

    public void checkEditedDescriptionSalaryVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION_INPUT), withText(NewsData.DESCRIPTION_EDIT_SALARY),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_EDIT_SALARY)));
    }

    public void checkEditedDescriptionTradeUnionVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION_INPUT), withText(NewsData.DESCRIPTION_EDIT_TRADE_UNION),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_EDIT_TRADE_UNION)));
    }

    public void checkEditedDescriptionHolidayVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION_INPUT), withText(NewsData.DESCRIPTION_EDIT_HOLIDAY),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_EDIT_HOLIDAY)));
    }

    public void checkEditedDescriptionMassageVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION_INPUT), withText(NewsData.DESCRIPTION_EDIT_MASSAGE),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_EDIT_MASSAGE)));
    }

    public void checkEditedDescriptionGratitudeVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION_INPUT), withText(NewsData.DESCRIPTION_EDIT_GRATITUDE),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_EDIT_GRATITUDE)));
    }

    public void checkEditedDescriptionHelpVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION_INPUT), withText(NewsData.DESCRIPTION_EDIT_HELP),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_EDIT_HELP)));
    }


    // ПЕРЕД редактированием проверяем дату создания
    public void checkDateCreatedVisibility() {
        ViewInteraction date = onView(
                allOf(withId(NewsElements.ID_DATE_INPUT), withText(NewsData.DATE_CREATED),
                        withParent(withParent(withId(R.id.news_item_create_date_text_input_layout))),
                        isDisplayed()));
        date.check(matches(withText(NewsData.DATE_CREATED)));
    }

    // ПЕРЕД редактированием проверяем время создания
    public void checkTimeCreatedVisibility() {
        ViewInteraction time = onView(
                allOf(withId(NewsElements.ID_TIME_INPUT), withText(NewsData.TIME_CREATED),
                        withParent(withParent(withId(R.id.news_item_publish_time_text_input_layout))),
                        isDisplayed()));
        time.check(matches(withText(NewsData.TIME_CREATED)));
    }

    // проверка ОТРЕДАКТИРОВАННОЙ даты в раскрытой карточке
    // предварительно найти и открыть
    public void checkDateEditedVisibility() {
        ViewInteraction date = onView(
                allOf(withId(NewsElements.ID_DATE_INPUT), withText(NewsData.DATE_EDITED),
                        withParent(withParent(withId(R.id.news_item_create_date_text_input_layout))),
                        isDisplayed()));
        date.check(matches(withText(NewsData.DATE_EDITED)));
    }

    // проверка ОТРЕДАКТИРОВАННОГО времени в раскрытой карточке
    // предварительно найти и открыть
    public void checkTimeEditedVisibility() {
        ViewInteraction time = onView(
                allOf(withId(NewsElements.ID_TIME_INPUT), withText(NewsData.TIME_EDITED),
                        withParent(withParent(withId(R.id.news_item_publish_time_text_input_layout))),
                        isDisplayed()));
        time.check(matches(withText(NewsData.TIME_EDITED)));
    }




    // набор методов для проверки НЕВАЛИДНЫХ Title, Description, Date, Time
    public void checkInvalidTitleVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_INPUT), withText(NewsData.TITLE_CARD_INVALID),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
        title.check(matches(withText(NewsData.TITLE_CARD_INVALID)));
    }

    public void checkEmptyTitleVisibility() {
        ViewInteraction title = onView(
                allOf(withId(NewsElements.ID_TITLE_INPUT), withText(NewsData.TITLE_CARD_EMPTY),
                        withParent(withParent(withId(R.id.news_item_title_text_input_layout))),
                        isDisplayed()));
        title.check(matches(withText(NewsData.TITLE_CARD_EMPTY)));
    }

    public void checkInvalidDescriptionVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION_INPUT), withText(NewsData.DESCRIPTION_INVALID),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_INVALID)));
    }

    public void checkEmptyDescriptionVisibility() {
        ViewInteraction description = onView(
                allOf(withId(NewsElements.ID_DESCRIPTION_INPUT), withText(NewsData.DESCRIPTION_EMPTY),
                        withParent(withParent(withId(R.id.news_item_description_text_input_layout))),
                        isDisplayed()));
        description.check(matches(withText(NewsData.DESCRIPTION_EMPTY)));
    }

    public void checkInvalidDateVisibility() {
        ViewInteraction date = onView(
                allOf(withId(NewsElements.ID_DATE_INPUT), withText(NewsData.DATE_INVALID),
                        withParent(withParent(withId(R.id.news_item_create_date_text_input_layout))),
                        isDisplayed()));
        date.check(matches(withText(NewsData.DATE_INVALID)));
    }

    public void checkEmptyDateVisibility() {
        ViewInteraction date = onView(
                allOf(withId(NewsElements.ID_DATE_INPUT), withText(NewsData.DATE_EMPTY),
                        withParent(withParent(withId(R.id.news_item_create_date_text_input_layout))),
                        isDisplayed()));
        date.check(matches(withText(NewsData.DATE_EMPTY)));
    }

    public void checkInvalidTimeVisibility() {
        ViewInteraction time = onView(
                allOf(withId(NewsElements.ID_TIME_INPUT), withText(NewsData.TIME_INVALID),
                        withParent(withParent(withId(R.id.news_item_publish_time_text_input_layout))),
                        isDisplayed()));
        time.check(matches(withText(NewsData.TIME_INVALID)));
    }

    public void checkEmptyTimeVisibility() {
        ViewInteraction time = onView(
                allOf(withId(NewsElements.ID_TIME_INPUT), withText(NewsData.TIME_EMPTY),
                        withParent(withParent(withId(R.id.news_item_publish_time_text_input_layout))),
                        isDisplayed()));
        time.check(matches(withText(NewsData.TIME_EMPTY)));
    }

    public void checkSwitchActiveOnVisibility() {
        ViewInteraction switch_ = onView(
                allOf(withId(NewsElements.ID_SWITCH), withText(NewsData.SWITCH_ON),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                        isDisplayed()));
        switch_.check(matches(isDisplayed()));
    }

    public void checkSwitchActiveOffVisibility() {
        ViewInteraction switch_ = onView(
                allOf(withId(NewsElements.ID_SWITCH), withText(NewsData.SWITCH_OFF),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                        isDisplayed()));
        switch_.check(matches(isDisplayed()));
    }

    public void checkSaveButtonVisibility() {
        ViewInteraction button = onView(
                allOf(withId(NewsElements.ID_SAVE_EDITING), withText(NewsData.SAVE_EDITING), withContentDescription(NewsData.SAVE_BUTTON),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                        isDisplayed()));
        button.check(matches(isDisplayed()));
    }

    public void checkCancelButtonVisibility() {
        ViewInteraction button = onView(
                allOf(withId(NewsElements.ID_CANCEL_EDITING), withText(NewsData.CANCEL_EDITING), withContentDescription(NewsData.SAVE_BUTTON),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                        isDisplayed()));
        button.check(matches(isDisplayed()));
    }


    // модальное окно предупреждение
    public void checkMessageVisibility() {
        ViewInteraction textView20 = onView(
                allOf(withId(NewsElements.ID_MODAL_MESSAGE), withText(NewsData.MESSAGE_EDIT),
                        withParent(withParent(withId(com.google.android.material.R.id.scrollView))),
                        isDisplayed()));
        textView20.check(matches(withText(NewsData.MESSAGE_EDIT)));
    }

    public void checkCancelModalVisibility() {
        ViewInteraction cancel = onView(
                allOf(withId(NewsElements.ID_MODAL_CANCEL), withText(NewsData.CANCEL_MODAL),
                        withParent(withParent(withId(com.google.android.material.R.id.buttonPanel))),
                        isDisplayed()));
        cancel.check(matches(isDisplayed()));
    }

    public void checkOkModalVisibility() {
        ViewInteraction ok = onView(
                allOf(withId(NewsElements.ID_MODAL_OK), withText(NewsData.OK_MODAL),
                        withParent(withParent(withId(com.google.android.material.R.id.buttonPanel))),
                        isDisplayed()));
        ok.check(matches(isDisplayed()));
    }

    // модальное окно DELETE
    public void checkMessageDeleteModalVisibility() {
        ViewInteraction textView21 = onView(
                allOf(withId(NewsElements.ID_MODAL_MESSAGE), withText(NewsData.MESSAGE_DELETE),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                        isDisplayed()));
        textView21.check(matches(withText(NewsData.MESSAGE_DELETE)));
    }

    public void checkCancelDeleteModalVisibility() {
        ViewInteraction button11 = onView(
                allOf(withId(NewsElements.ID_MODAL_CANCEL), withText(NewsData.CANCEL_MODAL),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                        isDisplayed()));
        button11.check(matches(isDisplayed()));
    }

    public void checkOkDeleteModalVisibility() {
        ViewInteraction button12 = onView(
                allOf(withId(NewsElements.ID_MODAL_OK), withText(NewsData.OK_MODAL),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class))),
                        isDisplayed()));
        button12.check(matches(isDisplayed()));
    }



    // экран ABOUT
    // набор всех проверок
    public void checkTitleVisibilityAbout() {
        onView(allOf(withText(AboutData.TITLE_VERSION_TEXT),
                withParent(withParent(withId(AboutElements.ID_TITLE_VERSION))),
                isDisplayed()));
    }

    public void checkVersionValueVisibility() {
        onView(allOf(withText(AboutData.VERSION_VALUE_TEXT),
                withParent(withParent(withId(AboutElements.ID_VERSION_VALUE))),
                isDisplayed()));
    }

    public void checkPrivacyPolicyVisibility() {
        onView(allOf(withText(AboutData.PRIVACY_POLICY_TEXT),
                withParent(withParent(withId(AboutElements.ID_PRIVACY_POLICY))),
                isDisplayed()));
    }

    public void checkTermsOfUseVisibility() {
        onView(allOf(withText(AboutData.TERMS_OF_USE_TEXT),
                withParent(withParent(withId(AboutElements.ID_TERMS_OF_USE))),
                isDisplayed()));
    }

    // Проверки статуса в открытой краточке CLAIM
    public void checkOpenStatusInCard() {
//        new UtilsHelper().timerWaitingAsynchOperation1000();
        onView(allOf(withId(ClaimElements.ID_LIST_CARD), withText(ClaimData.OPEN_STATUS_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()));
    }
    public void checkInProgressStatusInCard() {
//        new UtilsHelper().timerWaitingAsynchOperation1000();
//            ViewInteraction textView3 =
//                    onView(
//                    allOf(withId(R.id.status_label_text_view), withText("In progress"),
//                            withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
//                            isDisplayed()));
        onView(allOf(withId(ClaimElements.ID_LIST_CARD), withText(ClaimData.IN_PROGRESS_STATUS_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()));

    }
    public void checkExecutedStatus() {
//        new UtilsHelper().timerWaitingAsynchOperation1000();
        onView(allOf(withId(ClaimElements.ID_STATUS_CARD), withText(ClaimData.EXECUTED_STATUS_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()));
    }
    public void checkCanceledStatus() {
//        new UtilsHelper().timerWaitingAsynchOperation1000();
        onView(allOf(withId(ClaimElements.ID_STATUS_CARD), withText(ClaimData.CANCELED_STATUS_TEXT),
                withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                isDisplayed()));
    }

    // проверка кнопки Close в ооткрытой карточке Claim
    public void checkButtonCloseVisibility() {
        onView(allOf(withId(ClaimElements.ID_BUTTON_CLOSE), withContentDescription(ClaimData.BUTTON_CLOSE),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("com.google.android.material.card.MaterialCardView")),
                                        0),
                                23),
                        isDisplayed()));
//        appCompatImageButton3.perform(click());
    }

    // Проверки полей на странице Creating Claims
    public void checkAllFieldsAndButtonsVisibility() {
        new CheckUtils().checkTitleAppBar();
        new CheckUtils().checkFieldTitleVisibility();
        new CheckUtils().checkFieldExecutorVisibility();
        new CheckUtils().checkFieldDateVisibility();
        new CheckUtils().checkFieldTimeVisibility();
        new CheckUtils().checkFieldDiscriptionVisibility();
        new CheckUtils().checkButtonSaveVisibility();
        new CheckUtils().checkButtonCancelVisibility();
//        new UtilsHelper().timerWaitingAsynchOperation1000();
    }
    // проверка заголовка на странице Creatin Claim
    public void checkTitleAppBar() {
//        new DataHelper().waitAsynchOperation1000();
        onView(allOf(withId(ClaimElements.ID_TITLE_APP_BAR), withText(ClaimData.APP_BAR_CREATING_TEXT),
                isDisplayed()));
        onView(allOf(withId(ClaimElements.ID_TITLE_APP_BAR), withText(ClaimData.APP_BAR_CLAIMS_TEXT),
                isDisplayed()));
    }
    public void checkFieldTitleVisibility() {
//        new DataHelper().waitAsynchOperation1000();
        onView(allOf(withId(ClaimElements.ID_FIELD_TITLE),
                isDisplayed()));
    }

    public void checkFieldExecutorVisibility() {
//        new DataHelper().waitAsynchOperation1000();
        onView(allOf(withId(ClaimElements.ID_FIELD_EXECUTOR),
                isDisplayed()));
    }

    public void checkFieldDateVisibility() {
//        new DataHelper().waitAsynchOperation1000();
        onView(allOf(withId(ClaimElements.ID_FIELD_DATE),
                isDisplayed()));
    }

    public void checkFieldTimeVisibility() {
//        new DataHelper().waitAsynchOperation1000();
        onView(allOf(withId(ClaimElements.ID_FIELD_TIME),
                isDisplayed()));
    }

    public void checkFieldDiscriptionVisibility() {
//        new DataHelper().waitAsynchOperation1000();
        onView(allOf(withId(ClaimElements.ID_FIELD_DESCRIPTION),
                isDisplayed()));
    }

    public void checkButtonSaveVisibility() {
//        new DataHelper().waitAsynchOperation1000();
        onView(allOf(withId(ClaimElements.ID_SAVE_CREATING_Claims),
                isDisplayed()));
    }

    public void checkButtonCancelVisibility() {
//        new DataHelper().waitAsynchOperation1000();
        onView(allOf(withId(ClaimElements.ID_CANCEL_CREATING_Claims),
                isDisplayed()));
    }

    // набор проверок для проверки Title во всех test-case
    // в раскрытой карточке Claim  проверяем что Title видим и что видимо его содержание

    // test-case #7
    // заменить FAKE_TITLE на валидную
    public void checkTitle_1_Visibility() {
        onView(allOf(withId(ClaimElements.ID_TITLE_CARD), withText(ClaimData.TITLE_TEXT),
                isDisplayed()));
        onView(allOf(withId(ClaimElements.ID_TITLE_VALUE_CARD), withText(ClaimData.FAKE_TITLE),
                isDisplayed()));
    }

    // test-case #8
    public void checkTitle_2_Visibility() {
        onView(allOf(withId(ClaimElements.ID_TITLE_CARD), withText(ClaimData.TITLE_TEXT),
                isDisplayed()));
        onView(allOf(withId(ClaimElements.ID_TITLE_VALUE_CARD), withText(ClaimData.INPUT_TITLE_2),
                isDisplayed()));
    }

    // test-case #9
    public void checkTitle_3_Visibility() {
        onView(allOf(withId(ClaimElements.ID_TITLE_CARD), withText(ClaimData.TITLE_TEXT),
                isDisplayed()));
        onView(allOf(withId(ClaimElements.ID_TITLE_VALUE_CARD), withText(ClaimData.INPUT_TITLE_3),
                isDisplayed()));
    }

    // test-case #10
    public void checkTitle_4_Visibility() {
        onView(allOf(withId(ClaimElements.ID_TITLE_CARD), withText(ClaimData.TITLE_TEXT),
                isDisplayed()));
        onView(allOf(withId(ClaimElements.ID_TITLE_VALUE_CARD), withText(ClaimData.INPUT_TITLE_4),
                isDisplayed()));
    }

    // test-case #11
    public void checkTitle_5_Visibility() {
        onView(allOf(withId(ClaimElements.ID_TITLE_CARD), withText(ClaimData.TITLE_TEXT),
                isDisplayed()));
        onView(allOf(withId(ClaimElements.ID_TITLE_VALUE_CARD), withText(ClaimData.INPUT_TITLE_5),
                isDisplayed()));
    }

    // test-case #12
    public void checkTitle_6_Visibility() {
        onView(allOf(withId(ClaimElements.ID_TITLE_CARD), withText(ClaimData.TITLE_TEXT),
                isDisplayed()));
        onView(allOf(withId(ClaimElements.ID_TITLE_VALUE_CARD), withText(ClaimData.INPUT_TITLE_6),
                isDisplayed()));
    }

    // test-case #13
    public void checkTitle_7_Visibility() {
        onView(allOf(withId(ClaimElements.ID_TITLE_CARD), withText(ClaimData.TITLE_TEXT),
                isDisplayed()));
        onView(allOf(withId(ClaimElements.ID_TITLE_VALUE_CARD), withText(ClaimData.INPUT_TITLE_7),
                isDisplayed()));
    }

    // в раскрытой карточке проверяем что Executor видим и что видимо его содержание
    public void checkExecutorVisibility() {
        onView(allOf(withId(ClaimElements.ID_EXECUTOR_CARD), withText(ClaimData.EXECUTOR_TEXT),
                isDisplayed()));
        onView(allOf(withId(ClaimElements.ID_EXECUTOR_VALUE_CARD), withText(ClaimData.EXECUTOR_VALUE_OPEN_STATUS),
                isDisplayed()));
    }

    // в раскрытой карточке проверяем что Plan Date видим и что видимо его содержание
    // заменить FAKE_DATE на valid DATE
    public void checkValidPlanDateVisibility() {
        onView(allOf(withId(ClaimElements.ID_PLAN_DATE_CARD), withText(ClaimData.PLAN_DATE_TEXT),
                isDisplayed()));
        onView(allOf(withId(ClaimElements.ID_PLAN_DATE_VALUE_DATE_CARD), withText(ClaimData.FAKE_DATE),
                isDisplayed()));
        onView(allOf(withId(ClaimElements.ID_PLAN_DATE_VALUE_TIME_CARD), withText(ClaimData.INPUT_TIME),
                isDisplayed()));
    }

    public void checkInvalidPlanDateVisibility() {
        onView(allOf(withId(ClaimElements.ID_PLAN_DATE_CARD), withText(ClaimData.PLAN_DATE_TEXT),
                isDisplayed()));
        onView(allOf(withId(ClaimElements.ID_PLAN_DATE_VALUE_DATE_CARD), withText(ClaimData.INV_PLAN_DATE_DATE),
                isDisplayed()));
        onView(allOf(withId(ClaimElements.ID_PLAN_DATE_VALUE_TIME_CARD), withText(ClaimData.PLAN_DATE_VALUE_TIME),
                isDisplayed()));
    }

    // в раскрытой карточке проверяем что содержание Discription  отображается
    // test-case #7
    public void checkDiscription_1_Visibility() {
        onView(allOf(withId(ClaimElements.ID_DESCRIPTION_VALUE_CARD), withText(ClaimData.INPUT_DESCRIPTION_1),
                isDisplayed()));
    }
    // test-case #8
    public void checkDiscription_2_Visibility() {
        // test-case #8
        onView(allOf(withId(ClaimElements.ID_DESCRIPTION_VALUE_CARD), withText(ClaimData.INPUT_DESCRIPTION_2),
                isDisplayed()));
    }

    // test-case #10
    public void checkDiscription_4_Visibility() {
        // test-case #10
        onView(allOf(withId(ClaimElements.ID_DESCRIPTION_VALUE_CARD), withText(ClaimData.INPUT_DESCRIPTION_4),
                isDisplayed()));
    }

    // test-case #11
    public void checkDiscription_5_Visibility() {
        // test-case #11
        onView(allOf(withId(ClaimElements.ID_DESCRIPTION_VALUE_CARD), withText(ClaimData.INPUT_DESCRIPTION_5),
                isDisplayed()));
    }

    // test-case #12
    public void checkDiscription_6_Visibility() {
        // test-case #12
        onView(allOf(withId(ClaimElements.ID_DESCRIPTION_VALUE_CARD), withText(ClaimData.INPUT_DESCRIPTION_6),
                isDisplayed()));
    }

    // test-case #13
    public void checkDiscription_7_Visibility() {
        // test-case #13
        onView(allOf(withId(ClaimElements.ID_DESCRIPTION_VALUE_CARD), withText(ClaimData.INPUT_DESCRIPTION_7),
                isDisplayed()));
    }


    // проверка строки Created (для Discription)
    public void checkCreatedDiscriptionVisibility() {
        onView(allOf(withId(ClaimElements.ID_CREATED_DESCRIPTION_CARD), withText(ClaimData.INPUT_DESCRIPTION_7),
                isDisplayed()));
    }


    // методы проверок содержания созданных / редактированных полей comment
    // в раскрытой карточке проверяем что содержание Comment  отображается

    public void checkButtonSaveComment() {
        ViewInteraction save = onView(
                allOf(withId(ClaimElements.ID_SAVE_COMMENT), withText(ClaimData.BUTTON_SAVE_COMMENT),
                        withContentDescription(ClaimData.BUTTON_SAVE_COMMENT_DISCRIPTION),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                        isDisplayed()));
        save.check(matches(isDisplayed()));
    }

    public void checkButtonCancelComment() {
        ViewInteraction cancel = onView(
                allOf(withId(ClaimElements.ID_CANCEL_COMMENT), withText(ClaimData.BUTTON_CANCEL_COMMENT),
                        withContentDescription(ClaimData.BUTTON_CANCEL_COMMENT_DESCRIPTION),
                        withParent(withParent(IsInstanceOf.<View>instanceOf(androidx.cardview.widget.CardView.class))),
                        isDisplayed()));
        cancel.check(matches(isDisplayed()));
    }


    // test-case #9
    // метод для идентификации нужного comment внутри Claim
    public void checkCommentContentVisibility_9() {
        // test-case #9
        onView(allOf(withId(ClaimElements.ID_CONTENT_COMMENT), withText(ClaimData.COMMENT_CONTENT_CARD_3),
                isDisplayed()));
    }

    // родительский метод, который используем для дальнейших проверок и кликов внутри комментария
    //
    public  ViewInteraction checkInsideCommentContentVisibility(String commentContent) {
        // test-case #9
//        String commentContent = ClaimData.COMMENT_CONTENT_CARD_3;
        return onView(allOf(
                withId(ClaimElements.ID_CONTENT_COMMENT),
                withText(commentContent),
                isDisplayed()));
    }

    // набор методов проверки видимости и содержания Comment в раскрытой Claim
    public void checkEditComment_3_ContentVisibility() {
        // test-case #9
        onView(allOf(withId(ClaimElements.ID_CONTENT_COMMENT), withText(ClaimData.COMMENT_CONTENT_EDIT_CARD_3),
                isDisplayed()));
    }

    public void checkComment_4_ContentVisibility() {
        // test-case #9
        onView(allOf(withId(ClaimElements.ID_CONTENT_COMMENT), withText(ClaimData.COMMENT_CONTENT_CARD_4),
                isDisplayed()));
    }

    public void checkComment_5_ContentVisibility() {
        // test-case #11
        onView(allOf(withId(ClaimElements.ID_CONTENT_COMMENT), withText(ClaimData.COMMENT_CONTENT_CARD_5),
                isDisplayed()));
    }

    public void checkComment_6_ContentVisibility_12() {
        // test-case #12
        onView(allOf(withId(ClaimElements.ID_CONTENT_COMMENT), withText(ClaimData.COMMENT_CONTENT_CARD_6),
                isDisplayed()));
    }

    public void checkComment_7_ContentVisibility() {
        // test-case #13
        onView(allOf(withId(ClaimElements.ID_CONTENT_COMMENT), withText(ClaimData.COMMENT_CONTENT_CARD_7),
                isDisplayed()));
    }

    public void checkComment_3_NotVisibility() {
        onView(allOf(withId(ClaimElements.ID_CONTENT_COMMENT), withText(COMMENT_CONTENT_CARD_3)))
                .check(matches(not(isDisplayed())));
    }

    // в раскрытой карточке проверяем что содержание Author  отображается
    public void checkAuthorVisibility() {
        onView(allOf(withId(ClaimElements.ID_AUTHOR_CARD), withText(ClaimData.AUTHOR_TEXT_CARD),
                isDisplayed()));
        onView(allOf(withId(ClaimElements.ID_AUTHOR_VALUE_CARD), withText(ClaimData.AUTHOR_VALUE_CARD),
                isDisplayed()));
    }

    // в раскрытой карточке проверяем что строка AddComment  отображается и кнопка AddComment отображается
    public void checkAddCommentVisibility() {
        onView(allOf(withText(ClaimData.ADD_COMMENT_TEXT_CARD),
                withParent(withParent(withId(ClaimElements.ID_ADD_COMMENT_CARD))),
                isDisplayed()));
        onView(allOf(withId(ClaimElements.ID_ADD_COMMENT_BUTTON_CARD), withContentDescription(ClaimData.ADD_COMMENT_BUTTON_TEXT_CARD),
                withParent(withParent(withId(ClaimElements.ID_ADD_COMMENT_CARD))),
                isDisplayed()));
    }

  // на всякий случай конструкция провекрки содержания comment
//    // test-case #9
//    public void checkContentCommentVisibility_3() {
//        ViewInteraction edit = onView(
//                allOf(withId(ClaimElements.ID_CONTENT_COMMENT), withContentDescription(ClaimData.COMMENT_CONTENT_CARD_3),
//                        withParent(withParent(withId(ClaimElements.ID_LIST_COMMENT_CARD))),
//                        isDisplayed()));
//        edit.check(matches(isDisplayed()));
//    }


    //проверка видимости кнопки Edit comment
    public void checkButtonEditCommentVisibility() {
        ViewInteraction edit = onView(
                allOf(withId(ClaimElements.ID_COMMENT_BUTTON_EDIT), withContentDescription(ClaimData.EDIT_COMMENT_BUTTON_TEXT_CARD),
                        withParent(withParent(withId(ClaimElements.ID_LIST_COMMENT_CARD))),
                        isDisplayed()));
        edit.check(matches(isDisplayed()));
    }
    public void checkIconEditCardVisibility() {
        onView(allOf(withId(ClaimElements.ID_EDIT_CARD_BUTTON_CARD), withContentDescription(ClaimData.EDIT_CARD_BUTTON_TEXT_CARD),
                isDisplayed()));
    }

    public void checkButtonChangeStatusVisibility() {
        onView(allOf(withId(ClaimElements.ID_CHANGE_STATUS_ICON_CARD), withContentDescription(ClaimData.CHANGE_STATUS_TEXT_CARD),
                childAtPosition(
                        childAtPosition(
                                withClassName(is("com.google.android.material.card.MaterialCardView")),
                                0),
                        24),
                isDisplayed()));
    }

    // в модальном окне change в карточке Open
    public void checkButtonTakeToWorkStatusVisibility() {
        onView(allOf(withId(ClaimElements.ID_CHANGE_TAKE_TO_WORK_CARD), withText(ClaimData.CHANGE_TAKE_TO_WORK_TEXT_CARD),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()));
    }

    // в модальном окне change в карточке Open
    public void checkButtonCancelStatusVisibility() {
        onView(allOf(withId(ClaimElements.ID_CHANGE_CANCEL_CARD), withText(ClaimData.CHANGE_CANCEL_TEXT_CARD),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()));
    }


    // в модальном окне change в карточке In Progress
    public void checkButtonThrowOffStatusVisibility() {
        onView(allOf(withId(ClaimElements.ID_CHANGE_THROW_OFF_CARD), withText(ClaimData.CHANGE_THROW_OFF_TEXT_CARD),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()));
    }

    // в модальном окне change в карточке In Progress
    public void checkButtonToExecuteStatusVisibility() {
        onView(allOf(withId(ClaimElements.ID_CHANGE_TO_EXECUTE_CARD), withText(ClaimData.CHANGE_TO_EXECUTE_TEXT_CARD),
                withParent(withParent(withId(android.R.id.content))),
                isDisplayed()));
    }

    // набор проверок для теста creatingNewClaimInOpenStatusTest() в развернутой карточке претензии
    // test-case #7
    public void checkVisibilityInNewClaimWithOpenStatus() {
        new CheckUtils().checkTitle_1_Visibility();
        new CheckUtils().checkExecutorVisibility();
        new CheckUtils().checkValidPlanDateVisibility();         // заменить INPUT_FAKE_DATE
        new CheckUtils().checkOpenStatusInCard();
        new CheckUtils().checkDiscription_1_Visibility();
        new CheckUtils().checkAuthorVisibility();
        new CheckUtils().checkCreatedDiscriptionVisibility();     // видимость Created Discription (значение Date и Time не проверяем)
        new CheckUtils().checkAddCommentVisibility();
        new CheckUtils().checkButtonChangeStatusVisibility();      // видимость кнопки смены статуса
        new CheckUtils().checkEnableStateButtonChangeStatus();     // состояние Enable кнопки смены статуса
        new UtilsHelper().backSystemButton();                      // вспомогательный клик для снятия блока модального окна
        new ClaimUtils().clickChangeStatusClaimWithOpenStatus();   // открываем модальное окно
        new CheckUtils().checkButtonTakeToWorkStatusVisibility();  // видимость в модальном окне кнопки смены статуса
        new CheckUtils().checkButtonCancelStatusVisibility();      // видимость в модальном окне кнопки смены статуса
        new UtilsHelper().backSystemButton();                      // вспомогательный клик для снятия блока модального окна
        new CheckUtils().checkIconEditCardVisibility();            // видимость иконки Редактировать карточку
        new CheckUtils().checkButtonCloseVisibility();             // видимость иконки Закрыть карточку
    }

    // набор проверок для теста creatingNewClaimInProgressStatusTest() в развернутой карточке претензии
    // test-case #8 Проверка #1
    public void checkVisibilityInNewClaimWithInProgressStatus() {
        new CheckUtils().checkTitle_2_Visibility();
        new CheckUtils().checkExecutorVisibility();
        new CheckUtils().checkInvalidPlanDateVisibility();
        new CheckUtils().checkInProgressStatusInCard();
        new CheckUtils().checkDiscription_2_Visibility();
        new CheckUtils().checkAuthorVisibility();
        new CheckUtils().checkCreatedDiscriptionVisibility();      // видимость Created Discription (значение Date и Time не проверяем)

//        new CheckUtils().checkAddCommentVisibility();            // в test-case #8 нет Comment
        new CheckUtils().checkButtonChangeStatusVisibility();      // видимость кнопки смены статуса
        new CheckUtils().checkEnableStateButtonChangeStatus();     // состояние Enable кнопки смены статуса
        new UtilsHelper().backSystemButton();                      // вспомогательный клик для снятия блока модального окна
        new ClaimUtils().clickChangeStatusClaimWithOpenStatus();   // открываем модальное окно
        new CheckUtils().checkButtonTakeToWorkStatusVisibility();  // видимость в модальном окне кнопки смены статуса
        new CheckUtils().checkButtonCancelStatusVisibility();      // видимость в модальном окне кнопки смены статуса
        new UtilsHelper().backSystemButton();                      // вспомогательный клик для снятия блока модального окна
        new CheckUtils().checkIconEditCardVisibility();            // видимость иконки Редактировать карточку
        new CheckUtils().checkButtonCloseVisibility();             // видимость иконки Закрыть карточку
        // актуальные DATA на 02.09.23
    }

    // набор проверок для теста editingClaimFromOpenToInProgress_9() в развернутой карточке претензии
    // test-case #9
    public void checkVisibilityInEditedClaimWithInProgressStatus() {
        new CheckUtils().checkTitle_3_Visibility();
        new CheckUtils().checkExecutorVisibility();
        new CheckUtils().checkInvalidPlanDateVisibility();
        new CheckUtils().checkInProgressStatusInCard();            // проверям что Claim перешла в статус In Progress
        new CheckUtils().checkAuthorVisibility();
        new CheckUtils().checkCreatedDiscriptionVisibility();      // видимость Created Discription (значение Date и Time не проверяем)
        new CheckUtils().checkEditComment_3_ContentVisibility();   // проверяем отредактированный Comment

//        new CheckUtils().checkAddCommentVisibility();            // в test-case #8 нет Comment
//        new CheckUtils().checkButtonChangeStatusVisibility();      // видимость кнопки смены статуса
//        new CheckUtils().checkEnableStateButtonChangeStatus();     // состояние Enable кнопки смены статуса
//        new UtilsHelper().backSystemButton();                      // вспомогательный клик для снятия блока модального окна
//        new ClaimUtils().clickChangeStatusClaimWithOpenStatus();   // открываем модальное окно
//        new CheckUtils().checkButtonTakeToWorkStatusVisibility();  // видимость в модальном окне кнопки смены статуса
//        new CheckUtils().checkButtonCancelStatusVisibility();      // видимость в модальном окне кнопки смены статуса
//        new UtilsHelper().backSystemButton();                      // вспомогательный клик для снятия блока модального окна
//        new CheckUtils().checkIconEditCardVisibility();            // видимость иконки Редактировать карточку
//        new CheckUtils().checkButtonCloseVisibility();             // видимость иконки Закрыть карточку
//
    }







    // проверка состояния иконки смены статуса, что она Enable (true)
    // используем все четыре статуса throw off, to execute, take to work, Cancel
    public boolean checkEnableStateButtonChangeStatus() {
        ViewInteraction change = onView(
                allOf(withId(ClaimElements.ID_CHANGE_STATUS_ICON_CARD),
                        withContentDescription(ClaimData.CHANGE_STATUS_TEXT_CARD),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("com.google.android.material.card.MaterialCardView")),
                                        0),
                                24),
                        isDisplayed()));
        change.perform(click());

        ViewInteraction throwOff = onView(
                allOf(withId(ClaimElements.ID_CHANGE_THROW_OFF_CARD),
                        withText(ClaimData.CHANGE_THROW_OFF_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));

        ViewInteraction execute = onView(
                allOf(withId(ClaimElements.ID_CHANGE_TAKE_TO_WORK_CARD),
                        withText(ClaimData.CHANGE_TO_EXECUTE_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));

        ViewInteraction takeToWork = onView(
                allOf(withId(ClaimElements.ID_CHANGE_TAKE_TO_WORK_CARD),
                        withText(ClaimData.CHANGE_TAKE_TO_WORK_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));

        ViewInteraction cancel = onView(
                allOf(withId(ClaimElements.ID_CHANGE_CANCEL_CARD),
                        withText(ClaimData.CHANGE_CANCEL_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));

        try {
            throwOff.check(matches(isDisplayed()));
            return true;
        } catch (NoMatchingViewException e) {
            try {
                execute.check(matches(isDisplayed()));
                return true;
            } catch (NoMatchingViewException ex) {
                try {
                    takeToWork.check(matches(isDisplayed()));
                    return true;
                } catch (NoMatchingViewException exx) {
                    try {
                        cancel.check(matches(isDisplayed()));
                        return true;
                    } catch (NoMatchingViewException exxx) {
                        return false;
                    }
                }
            }
        }
    }



    // проверка состояния иконки смены статуса, что она Disable
    // используем все четыре статуса throw off, to execute, take to work, Cancel
    public boolean checkDisableStateButtonChangeStatus() {
        ViewInteraction change = onView(
                allOf(withId(ClaimElements.ID_CHANGE_STATUS_ICON_CARD),
                        withContentDescription(ClaimData.CHANGE_STATUS_TEXT_CARD),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("com.google.android.material.card.MaterialCardView")),
                                        0),
                                24),
                        isDisplayed()));
        change.perform(click());

        ViewInteraction throwOff = onView(
                allOf(withId(ClaimElements.ID_CHANGE_THROW_OFF_CARD),
                        withText(ClaimData.CHANGE_THROW_OFF_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));

        ViewInteraction execute = onView(
                allOf(withId(ClaimElements.ID_CHANGE_TAKE_TO_WORK_CARD),
                        withText(ClaimData.CHANGE_TO_EXECUTE_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));

        ViewInteraction takeToWork = onView(
                allOf(withId(ClaimElements.ID_CHANGE_TAKE_TO_WORK_CARD),
                        withText(ClaimData.CHANGE_TAKE_TO_WORK_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));

        ViewInteraction cancel = onView(
                allOf(withId(ClaimElements.ID_CHANGE_CANCEL_CARD),
                        withText(ClaimData.CHANGE_CANCEL_TEXT_CARD),
                        withParent(withParent(withId(android.R.id.content))),
                        isDisplayed()));

        try {
            throwOff.check(matches(isDisplayed()));
            return false;                           // Если "throwOff" видима, вернуть false
        } catch (NoMatchingViewException e) {
            try {
                execute.check(matches(isDisplayed()));
                return false;                       // Если "execute" видима, вернуть false
            } catch (NoMatchingViewException ex) {
                try {
                    takeToWork.check(matches(isDisplayed()));
                    return false;                   // Если "takeToWork" видима, вернуть false
                } catch (NoMatchingViewException exx) {
                    try {
                        cancel.check(matches(isDisplayed()));
                        return false;               // Если "cancel" видима, вернуть false
                    } catch (NoMatchingViewException exxx) {
                        return true;                // Если ни одна из кнопок не видима, вернуть true (состояние "Disable")
                    }
                }
            }
        }
    }



}



