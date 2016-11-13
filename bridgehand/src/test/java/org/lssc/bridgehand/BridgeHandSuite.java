package org.lssc.bridgehand;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.lssc.bridgehand.domain.CardTest;
import org.lssc.bridgehand.domain.HandTest;
import org.lssc.bridgehand.domain.PointsTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({PointsTest.class, CardTest.class, HandTest.class})
public class BridgeHandSuite {
}
