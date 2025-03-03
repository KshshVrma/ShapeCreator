package shape;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String k=sc.nextLine();
        System.out.println(k);
        // String shapeString=sc.nextLine();34

        Factory fac=new Factory();
        Shape one=fac.getShape(k);
        System.out.println(one.getDescription());

        String l=sc.nextLine();
        System.out.println(l);
        Shape two=fac.getShape(l);
       
        System.out.println(two.getDescription());
        
    }
}
