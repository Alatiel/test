/**
 * Created by inna on 07/09/2016.
 */
public class square {

    static double a = 5.2;

    public static void main (String[] args) {

        AreaOfSquare();
        PerimeterOfSquare();

        private static void AreaOfSquare(){

            double P = a * a;
            System.out.println("Площа квадрата = " + P + " km");
        }

        private static void PerimeterOfSquare(){

            double per = a * 4;

            System.out.println("Периметр квадрата = "+ per + " km");
        }

        String formatP = String.format("%.2f",P);
        System.out.println(formatP);
    }
}
