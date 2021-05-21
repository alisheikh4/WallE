package comp303.assignment6;

public class emptyCompactorAction extends abstractAction {


    public emptyCompactorAction(WallE aWallE){
        super(aWallE);


    }


    @Override
    public boolean execute() {
//if compactor isn't 0, empty and return true
//return false if compactor is already empty
        if(myWallE.getCompactorLevel()!=0){
            myWallE.emptyCompactor();
        return true;}
    return false;
    }
}
