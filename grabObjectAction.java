package comp303.assignment6;

public class grabObjectAction extends abstractAction {

    public grabObjectAction(WallE aWallE){
        super(aWallE);
    }

    @Override
    public boolean execute() {
//if arm is retracted, make sure gripper is open
//extend the arm, close gripper, retract arm, then return true
//if precondition of arm retracted isn't met, return false
        if (myWallE.getArmState() == Robot.ArmState.RETRACTED) {
            if(myWallE.getGripperState() != Robot.GripperState.OPEN){
                myWallE.openGripper();
            }
            myWallE.extendArm();
            myWallE.closeGripper();
            myWallE.retractArm();
            return true;
        }
        return false;
    }

}
