package comp303.assignment6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class turn90degreesRightActionTest {

    @Test
    void executeTest() {
        WallE testWallE = new WallE();
        turn90degreesRightAction testAction = new turn90degreesRightAction(testWallE);
        assertTrue(testAction.execute());
    }

    @Test
    void executeWhileArmExtendedTest(){
        WallE testWallE = new WallE();
        testWallE.extendArm();
        turn90degreesRightAction testAction = new turn90degreesRightAction(testWallE);
        assertFalse(testAction.execute());
    }
}