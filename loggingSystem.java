package comp303.assignment6;

import java.util.ArrayList;
import java.util.List;

/**
 *Logging System Object for our actions
 *display method can be easily changed
 */
public class loggingSystem {
    List<abstractAction> actionLog = new ArrayList<>();

    public void displayAction(int i){
        System.out.println(actionLog.get(i).getClass().getSimpleName()+" action performed,battery level is "+ actionLog.get(i).getMyWallE().getBatteryCharge());

    }

    public List<abstractAction> getActionLog() {
        return actionLog;
    }
}
