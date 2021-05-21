package comp303.assignment6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {



    @Test
    void DistanceComputationTest() {
        WallE testWallE = new WallE();
        abstractAction aAction = new moveForwardAction(testWallE,10);
        List<abstractAction> testActions = new ArrayList<>();
        testActions.add(aAction);
        Program aProgram = new Program(testActions);
        aProgram.computationAction();
        assertEquals(10,aProgram.getTotalDistance());
    }
    @Test
    void compactedObjectsComputationTest() {
        WallE testWallE = new WallE();
        compactObjectAction testAction = new compactObjectAction(testWallE);
        testWallE.openGripper();
        testWallE.extendArm();
        testWallE.closeGripper();
        List<abstractAction> testActions = new ArrayList<>();
        testActions.add(testAction);
        Program aProgram = new Program(testActions);
        aProgram.computationAction();
        assertEquals(1,aProgram.getObjectsCompacted());
    }
}