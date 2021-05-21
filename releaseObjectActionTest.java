package comp303.assignment6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class releaseObjectActionTest {

    @Test
    void executeEmptyGripperTest() {
        WallE testWallE = new WallE();
        releaseObjectAction testAction = new releaseObjectAction(testWallE);
        assertFalse(testAction.execute());
    }

    @Test
    void execute(){
        WallE testWallE = new WallE();
        releaseObjectAction testAction = new releaseObjectAction(testWallE);
        testWallE.openGripper();
        testWallE.extendArm();
        testWallE.closeGripper();
        assertTrue(testAction.execute());
    }
}