package comp303.assignment6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class compactObjectActionTest {

    @Test
    void execute() {
        WallE testWallE = new WallE();
        compactObjectAction testAction = new compactObjectAction(testWallE);
        testWallE.openGripper();
        testWallE.extendArm();
        testWallE.closeGripper();
        assertTrue(testAction.execute());

    }
    @Test
    void emptyGripperTest(){
        WallE testWallE = new WallE();
        compactObjectAction testAction = new compactObjectAction(testWallE);
        assertFalse(testAction.execute());
    }

    @Test
    void computationActionTest() {
        WallE testWallE = new WallE();
        compactObjectAction testAction = new compactObjectAction(testWallE);
        assertEquals(1,testAction.computationAction());
    }
}