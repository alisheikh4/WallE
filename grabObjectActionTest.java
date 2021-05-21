package comp303.assignment6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class grabObjectActionTest {

    @Test
    void execute() {
        WallE testWallE = new WallE();
        grabObjectAction testAction = new grabObjectAction(testWallE);
        assertTrue(testAction.execute());
    }

    @Test
    void executeArmAlreadyExtendedTest(){
        WallE testWallE = new WallE();
        grabObjectAction testAction = new grabObjectAction(testWallE);
        testWallE.extendArm();
        assertFalse(testAction.execute());
    }
}