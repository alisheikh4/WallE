package comp303.assignment6;

public class compactObjectAction extends abstractAction implements computableAction {

    public compactObjectAction(WallE aWallE){
        super(aWallE);

    }


    @Override
    public boolean execute() {
//if gripper holds an object and compactor level is less than 10
//compact object and return true
//if preconditions not met, return false
        if(myWallE.getGripperState()== Robot.GripperState.HOLDING_OBJECT && myWallE.getCompactorLevel()<10){
            myWallE.compact();
            return true;
        }
        return false;
    }

    @Override
    public double computationAction() {
        return 1;
    }
}
