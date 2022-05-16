public class Circle extends  Point{
    protected double radius;
    public Circle(){
        this(0,0,0);}
    public Circle (int a, int b, double r){
        super(a,b);
        setRadius(r);}
    public void setRadius(double r){
        radius = (r>=0.0?r:0.0);}
    public double area(){
        return Math.PI*radius*radius;}
    public String text(){
        return "좌표="+"["+x+","+y+"]"+";반지름="+radius+"원의 넓이="+area();
    }
}
