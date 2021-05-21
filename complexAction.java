package comp303.assignment6;

import java.util.List;

public class complexAction extends abstractAction {
    List<abstractAction> actions;

    public complexAction(WallE aWallE,List<abstractAction> actionList){
        super(aWallE);
        this.actions = actionList;

    }
    @Override
    public boolean execute() {
//if any action returns false, we return false
//if all actions execute successfully, return true
        for(int i= 0; i<actions.size();i++){
            if(actions.get(i).execute()==false){
                return false;
            }
        }
    return true;
    }
}
