package Day3;

public class CombinedTable {
    private SingleTable t1;
    private SingleTable t2;
    public CombinedTable(SingleTable tbl1, SingleTable tbl2){
        t1 = tbl1;
        t2 = tbl2;
    }
    
    public boolean canSeat(int num){
        int sum = t1.getNumSeats() + t2.getNumSeats();
        if (num<=(sum -2)) {
            return true;
        }
        return false;
    }
    public double getDesirability(){
        if (t1.getHeight() == t2.getHeight()) {
            return (t1.getViewQuality() + t2.getViewQuality())/2;
        }else{
            return ((t1.getViewQuality() + t2.getViewQuality())/2)-10;
        }
    }

}
