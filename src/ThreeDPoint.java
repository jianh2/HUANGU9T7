public class ThreeDPoint extends Point {
    private int z;
    private int x;
    private int y;
    private String label;
    public ThreeDPoint(String label, int x, int y, int z){
        super(label, x, y);
        this.z = z;

    }

    public String toString(){
        return super.toString() + " Z: " + z;
    }

    public boolean equals(ThreeDPoint point){
        if(point instanceof ThreeDPoint && point.z == z && point.super.equals(ThreeDPoint)){
            return true;
        }else{
            return false;
        }
    }
}
