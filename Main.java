package shape;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        System.out.println(k);
        // String shapeString=sc.nextLine();34

        Shape cir=new Circle();
        Shape rec=new Rectangle();
        System.out.println(cir.getDescription());
        System.out.println(rec.getDescription());
        
    }
}
