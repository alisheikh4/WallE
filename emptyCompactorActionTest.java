package comp303.assignment6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class emptyCompactorActionTest {

    @Test
    void execute() {
        WallE testWallE = new WallE();
        emptyCompactorAction testAction = new emptyCompactorAction(testWallE);
        compactObjectAction testActionCompact = new compactObjectAction(testWallE);
        testWallE.openGripper();
        testWallE.extendArm();
        testWallE.closeGripper();
        testActionCompact.execute();
        assertTrue(testAction.execute());

    }

    @Test
    void executeEmptyAlreadyTest(){
        WallE testWallE = new WallE();
        emptyCompactorAction testAction = new emptyCompactorAction(testWallE);
        assertFalse(testAction.execute());
    }
}