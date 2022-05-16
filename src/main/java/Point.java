public class Point {
    protected int x;
    protected int y;
    public Point(){
        this (0,0);
    }
    public Point(int a, int b){
        x=a;
        y=b;
    }
    public String text(){
        return "["+x+","+y+"]";
    }
}
