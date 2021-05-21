package comp303.assignment6;

public class releaseObjectAction extends abstractAction {

    public releaseObjectAction(WallE aWallE) {
        super(aWallE);
    }

    @Override
    public boolean execute() {
//if arm is extended and gripper is closed, robot retracts arm,opens gripper and returns true
//if preconditions not met, returns false
        if(myWallE.getArmState()== Robot.ArmState.EXTENDED && myWallE.getGripperState()!= Robot.GripperState.OPEN) {
            myWallE.retractArm();
            myWallE.openGripper();
            return true;
        }
        return false;
    }
}
