import javax.swing.JOptionPane;
public class InheritanceTest {
    private static Integer integer;

    public static void main(String args[]) {
        Point p;
        Circle c;
        int x;
        int y;
        double r;
        x = integer.parseInt(JOptionPane.showInputDialog("x좌표 입력"));
        y = integer.parseInt(JOptionPane.showInputDialog("y좌표 입력"));
        r = integer.parseInt(JOptionPane.showInputDialog("반지름 입력"));

        p = new Point(x, y);
        c = new Circle(x + 50, y + 60, r);
        JOptionPane.showMessageDialog(null, "point p:" + p.text() + "\nCircle c:" + c.text());
        System.exit(0);
        }
    }
