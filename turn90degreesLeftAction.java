package comp303.assignment6;

public class turn90degreesLeftAction extends abstractAction {

    double direction = -90;

    public turn90degreesLeftAction(WallE aWallE) {
        super(aWallE);


    }

    @Override
    public boolean execute() {
//if arm is retracted, robot turns in direction and returns true
//if preconditions not met, returns false
        if (myWallE.getArmState() == Robot.ArmState.RETRACTED) {
            myWallE.turnRobot(direction);
            return true;
        }

        return false;
    }
}
