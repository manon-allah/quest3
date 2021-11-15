
package quest3;
import java.util.Scanner;
public class pointt {
    Scanner input = new Scanner(System.in);
    public double x ; 
    public double y;
    public pointt(){
        x=0;
        y=0;
    } 
    public pointt( double x , double y){
        this.x=x;
        this.y=y;
    }  
    public double get_x(){
        return x;
    }
    public double get_y(){
        return y;
    }
    public void show(){
        System.out.println("x is = " + get_x());
        System.out.println("y is = " + get_y());
    }
    public void distance(){
        System.out.println("Enter the x point");
        double x1 = input.nextDouble();
        System.out.println("Enter the y point");
        double y1 = input.nextDouble();
        System.out.println("The point x is = " + (x - x1));
        System.out.println("The point y is = " + (y - y1));
    }
}

