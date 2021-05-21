package comp303.assignment6;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private List<abstractAction> programActions;
    private double totalDistance;
    private double objectsCompacted;

    public Program(List<abstractAction> actions){
        programActions = actions;
    }

    public List getActions(){
        return this.programActions;
    }

    public void computationAction(){
        for(int i=0; i<this.programActions.size();i++) {
            if(this.programActions.get(i)instanceof computableAction){
                if(this.programActions.get(i)instanceof compactObjectAction) {
                    objectsCompacted = objectsCompacted + ((computableAction) this.programActions.get(i)).computationAction();
                }
                if(this.programActions.get(i)instanceof moveForwardAction){
                    totalDistance = totalDistance + ((moveForwardAction) this.programActions.get(i)).computationAction();
                }
            }
        }
        System.out.println("Computation called on program : total distance is "+this.totalDistance+", number of objects compacted is "+this.objectsCompacted);
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public double getObjectsCompacted() {
        return objectsCompacted;
    }
}
