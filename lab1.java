import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ведите 1 число: ");
        int n1 = s.nextInt();
        System.out.println("Ведите 2 число: ");
        int n2 = s.nextInt();
        System.out.println("Ведите 3 число: ");
        int n3 = s.nextInt();
        System.out.println("Ведите 4 число: ");
        int n4 = s.nextInt();

        if (n1 < n2 && n1 < n3 && n1 < n4)
            System.out.print("Наименьше число " + n1);
        else if (n2 < n1 && n2 < n3 && n2 < n4)
            System.out.print("Наименьшее число " + n2);
        else if (n3 < n1 && n3 < n2 && n3 < n4)
            System.out.print("Наименьшее число " + n3);
        else if (n4 < n1 && n4 < n2 && n4 < n3)
            System.out.print("Наименьшее число " + n4);
        else if (n1 == n2 && n2 == n3 && n3 == n4);
            System.out.print("Нет наименьшего числа, числа равны");

    }
}
