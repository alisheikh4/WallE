package comp303.assignment6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class turn90degreesLeftActionTest {

    @Test
    void executeTest() {
        WallE testWallE = new WallE();
        turn90degreesLeftAction testAction = new turn90degreesLeftAction(testWallE);
        assertTrue(testAction.execute());
    }

    @Test
    void executeWhileArmExtendedTest(){
        WallE testWallE = new WallE();
        testWallE.extendArm();
        turn90degreesLeftAction testAction = new turn90degreesLeftAction(testWallE);
        assertFalse(testAction.execute());
    }
}