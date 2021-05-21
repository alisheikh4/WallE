package comp303.assignment6;

/** Template Design Pattern
 * Forces protocol method to run before execute
 * and battery Update after execute
 */
abstract class abstractAction implements Action {
    WallE myWallE;

    public abstractAction(WallE aWallE){
        myWallE = aWallE;

    }

    public abstract boolean execute();

    public final void perform(){
        protocol();
        execute();
        batteryUpdate();
    }

    private void batteryUpdate() {
    myWallE.updateBatteryLevel();
    }

    private void protocol() {
    if(myWallE.getBatteryCharge()<=5){
        myWallE.rechargeBattery();
        }
    }
    //battery will be recharged before every action
    public final void fullBatteryPerform(){
        myWallE.rechargeBattery();
        execute();
        batteryUpdate();
    }

    public WallE getMyWallE() {
        return myWallE;
    }


}
