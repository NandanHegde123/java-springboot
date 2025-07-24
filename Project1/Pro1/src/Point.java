
public class Point {
    private int x;
    private int y;
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int Getx(){
        return x;
    }
    public int Gety(){
        return y;
    }
    
    public double distance(Point p){
        int dx=x-p.Getx();
        int dy=y-p.Gety();
        return Math.sqrt(dx*dx + dy*dy);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, ");
        Point p1=new Point(3,4);
        Point p2=new Point(6, 8);
        System.out.println(p1.distance(p2));
    }

    public static void cat(){
        System.out.println("Nita is a cat");
    }


}
