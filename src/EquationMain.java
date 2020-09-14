import java.util.Scanner;

public class EquationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter parameter a: ");
        double a = sc.nextDouble();
        System.out.println("enter parameter b: ");
        double b = sc.nextDouble();
        System.out.println("enter parameter c: ");
        double c = sc.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        if (equation.getDelta()>0){
            double r1 = equation.getRoot1();
            double r2 = equation.getRoot2();
            System.out.printf("equation has tow roots is r1= %f and r2 = %f",r1,r2);
        } else if (equation.getDelta()==0){
            double r = equation.getRoot();
            System.out.println("equation has root is "+ r);
        } else {
            System.out.println("equation has no roots");
        }

    }

}
