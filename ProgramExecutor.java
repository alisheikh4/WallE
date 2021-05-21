package comp303.assignment6;

import java.util.ArrayList;
import java.util.List;

/**This class executes all actions of a given program
 * and logs each action in a list
 *Command Design Pattern
 */
public class ProgramExecutor {
    private boolean fullBatteryMode = false;
    private loggingSystem myLog = new loggingSystem();


    public void executeProgram(Program aProgram) {
       List<abstractAction> myActions = aProgram.getActions();
       //add each action of our program to our action log, execute and display action
        for (int i=0; i<myActions.size();i++) {
            myLog.getActionLog().add(myActions.get(i));
            if(fullBatteryMode == true){myActions.get(i).fullBatteryPerform(); }
            else { myActions.get(i).perform(); }
            myLog.displayAction(i);
        }

    }
    //provide true or false to method to force fullBatteryMode
    //This will make each action charge battery before executing
    public void setFullBatteryMode(boolean modeSwitch){
        this.fullBatteryMode = modeSwitch;
    }
}
