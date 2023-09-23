/* You are using 3-Dimensional Equation Solver.
   For using this equation solver, input the
   the coefficients of the variables along with
   their values. Eg.-
   ax + by + cz = d
   a
   b
   c
   d
   The solver will print the values of the
   corresponding variables.
*/
   
import java.util.Scanner;

class ES {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the coefficients of the first equation.");
    double m = scanner.nextDouble();
    double n = scanner.nextDouble();
    double o = scanner.nextDouble();
    double p = scanner.nextDouble();
    System.out.println("Enter the coefficients of the second equation.");
    double q = scanner.nextDouble();
    double r = scanner.nextDouble();
    double s = scanner.nextDouble();
    double t = scanner.nextDouble();
    System.out.println("Enter the coefficients of the third equation.");
    double u = scanner.nextDouble();
    double v = scanner.nextDouble();
    double w = scanner.nextDouble();
    double x = scanner.nextDouble();
    double Dt = m*r*w-m*s*v+n*s*u-n*q*w+o*q*v-o*r*u;
    double Dtx = p*r*w-p*s*v+n*s*x-n*t*w+o*t*v-o*r*x;
    double Dty = m*t*w-m*s*x+p*s*u-p*q*w+o*q*x-o*t*u;
    double Dtz = m*r*x-m*t*v+n*t*u-n*q*x+p*q*v-p*r*u;
    if(Dt != 0) {
      double Valx = Dtx / Dt;
      double Valy = Dty / Dt;
      double Valz = Dtz / Dt;
      System.out.println("The values are :");
      System.out.println("x = " + Valx);
      System.out.println("y = " + Valy);
      System.out.println("z = " + Valz);
    } else if(Dt == 0 && Dtx == 0 && Dty == 0 && Dtz == 0) {
      System.out.println("The equations have infinite solutions.");
    } else {
      System.out.println("The equations have no solution.");
    }
  }

}