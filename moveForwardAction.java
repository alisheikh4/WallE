package comp303.assignment6;

public class moveForwardAction extends abstractAction implements computableAction {

    double distance;

    public moveForwardAction(WallE aWallE,double aDistance){
        super(aWallE);
        distance = aDistance;
    }
    @Override
    public boolean execute() {
//if distance is 0 or greater and our arm is retracted, robot moves distance and returns true
//if preconditions not met, returns false
        if(distance>=0 && myWallE.getArmState()== Robot.ArmState.RETRACTED){
            myWallE.moveRobot(distance);
            return true;
        }
        return false;
    }

    @Override
    public double computationAction() {
        return distance;
    }
}
