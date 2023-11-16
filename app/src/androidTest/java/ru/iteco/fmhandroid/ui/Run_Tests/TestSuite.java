package ru.iteco.fmhandroid.ui.Run_Tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ru.iteco.fmhandroid.ui.About_Tests.About_Tests;
import ru.iteco.fmhandroid.ui.Authorization_Tests.NegativeAuth_Tests;
import ru.iteco.fmhandroid.ui.Authorization_Tests.PositiveAuth_Tests;
import ru.iteco.fmhandroid.ui.Claim_Tests.NegativeClaims_Tests;
import ru.iteco.fmhandroid.ui.Claim_Tests.PositiveClaims_Tests;
import ru.iteco.fmhandroid.ui.Menu_Tests.PositiveMenu_Tests;
import ru.iteco.fmhandroid.ui.News_Tests.NegativeNews_Tests;
import ru.iteco.fmhandroid.ui.News_Tests.PositiveNews_Tests;
import ru.iteco.fmhandroid.ui.OurMission_Tests.PositiveOurMission_Tests;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        About_Tests.class,
        NegativeAuth_Tests.class,
        PositiveAuth_Tests.class,
        NegativeClaims_Tests.class,
        PositiveClaims_Tests.class,
        PositiveMenu_Tests.class,
        NegativeNews_Tests.class,
        PositiveNews_Tests.class,
        PositiveOurMission_Tests.class,
})
public class TestSuite {

}
