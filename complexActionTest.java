package comp303.assignment6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class complexActionTest {

    @Test
    //compactAction without holding object should result in failure
    void executeFailureTest() {
        WallE testWallE = new WallE();
        compactObjectAction testAction = new compactObjectAction(testWallE);
        grabObjectAction testAction1 = new grabObjectAction(testWallE);
        List<abstractAction> testActionList = new ArrayList<>();
        testActionList.add(testAction);
        testActionList.add(testAction1);
        complexAction complexTestAction = new complexAction(testWallE,testActionList);
        assertFalse(complexTestAction.execute());

    }
    @Test
    void execute(){
        //hold object first, then compact should result in true
        WallE testWallE = new WallE();
        compactObjectAction testActionSecond = new compactObjectAction(testWallE);
        grabObjectAction testActionFirst = new grabObjectAction(testWallE);
        List<abstractAction> testActionList = new ArrayList<>();
        testActionList.add(testActionFirst);
        testActionList.add(testActionSecond);
        complexAction complexTestAction = new complexAction(testWallE,testActionList);
        assertTrue(complexTestAction.execute());
    }
}