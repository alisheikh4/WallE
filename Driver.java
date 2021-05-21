package comp303.assignment6;

import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
        /**
         * main method creates an abstractAction object for each concrete action implemented
         * adds them to a list of abstractActions
         * Initializes program with said list
         * Executes program
         * turns on FullBatteryMode to force recharge before execution of actions (Requirement 5)
         * Executes program again with FullBatteryMode
         * Performs computationAction() on all computable actions in our list(moveForwardAction and compactObjectAction)
         * Executor.executeProgram has a call to displayAction() from our loggingSystem which displays actions to console
         */
    ProgramExecutor Executor = new ProgramExecutor();
    WallE testWallE = new WallE();
    abstractAction aAction = new turn90degreesLeftAction(testWallE);
    abstractAction aAction1 = new turn90degreesRightAction(testWallE);
    abstractAction aAction2 = new moveForwardAction(testWallE,10);
    abstractAction aAction3 = new grabObjectAction(testWallE);
    abstractAction aAction4 = new releaseObjectAction(testWallE);
    abstractAction aAction5 = new turn90degreesLeftAction(testWallE);
    abstractAction aAction6 = new grabObjectAction(testWallE);
    abstractAction aAction7 = new compactObjectAction(testWallE);

        List<abstractAction> testActions = new ArrayList<>();
    testActions.add(aAction);
    testActions.add(aAction1);
    testActions.add(aAction2);
    testActions.add(aAction3);
    testActions.add(aAction4);
    testActions.add(aAction5);
    testActions.add(aAction6);
    testActions.add(aAction7);
    Program aProgram = new Program(testActions);

    Executor.executeProgram(aProgram);
        Executor.setFullBatteryMode(true);
        Executor.executeProgram(aProgram);
        aProgram.computationAction();




    }
}
