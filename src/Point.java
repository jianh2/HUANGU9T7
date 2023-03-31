public class Point {
    private int x;
    private int y;
    private String label;
    public Point(String label, int x, int y){
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public Boolean equals(Point point){
        if(point == null){
            return false;
        }
        if(this.x == point.x && this.y == point.y){
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        return "( " + x + ", "  + y + " )";
    }

}
