package ru.iteco.fmhandroid.ui.Run_Tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ru.iteco.fmhandroid.ui.About_Tests.AboutTests;
import ru.iteco.fmhandroid.ui.Authorization_Tests.NegativeAuthTests;
import ru.iteco.fmhandroid.ui.Authorization_Tests.PositiveAuthTests;
import ru.iteco.fmhandroid.ui.Main_Tests.PositiveMainTests;
import ru.iteco.fmhandroid.ui.Menu_Tests.PositiveMenuTests;
import ru.iteco.fmhandroid.ui.News_Tests.NegativeNewsTests;
import ru.iteco.fmhandroid.ui.News_Tests.PositiveNewsTests;
import ru.iteco.fmhandroid.ui.OurMission_Tests.PositiveOurMissionTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AboutTests.class,
        NegativeAuthTests.class,
        PositiveAuthTests.class,
//        NegativeClaimsTests.class,
//        PositiveClaimsTests.class,
        PositiveMainTests.class,
        PositiveMenuTests.class,
        NegativeNewsTests.class,
        PositiveNewsTests.class,
        PositiveOurMissionTests.class,
})
public class TestSuite {

}
