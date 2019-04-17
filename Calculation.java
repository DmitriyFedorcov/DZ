package Domawka;
import java.util.Scanner;
public class Calculation {
   // public void calSqrts(){
//        double a, b, c;
//        double D;
//        System.out.println("Програма решает квадратное урвнение");
//        System.out.println("3x^2 - 4x + 1c = 0");
//        System.out.println("Ведите а, b, c ");
//        Scanner in = new Scanner(System.in);
//        a = in.nextDouble();
//        b = in.nextDouble();
//        c = in.nextDouble();
//
//        D = b * b - 4 * a * c;
//        if (D > 0){
//            double x1, x2;
//            x1 = (-b - Math.sqrt(D))/ (2 * a);
//            x2 = (-b - Math.sqrt(D))/ (2 * a);
//            System.out.println("x1 = " + x1 + ", x2 = " + x2);
//
//        }
//
//
//    public double plKruga(){
//       Scanner marka = new Scanner(System.in);
//        System.out.println("Требуются параметры радиуса..");
//        double radius;
//        radius = marka.nextDouble();
//        double area;
//        area = Math.PI * (radius * radius);
//        System.out.println("Площадь круга = " + area);
//        return area;
//    }
//        public double DlKruga(){
//           Scanner dlinKruga = new Scanner(System.in);
//            System.out.println("Введите параметы для расчетов...");
//           double l;
//           double r;
//           r = dlinKruga.nextDouble();
//
//            dlinKruga.close();
//            l = 2 * (Math.PI) * 2 * r;
//            System.out.println("Длина круга равна.." + l);
//            return l;
//        }
//
        public void treugol() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите параметры...");
            double a;
            double b;
            a = scanner.nextDouble();
            b = scanner.nextDouble();

            System.out.println("Катеты треугольника равны = " + (a * b) / 2);
            double c;
            c = Math.sqrt(a * a + b * b);
            System.out.println("Гипотенуза равна = " + c);
        }
}











