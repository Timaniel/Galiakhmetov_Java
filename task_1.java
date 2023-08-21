import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Введите число: ");
            int num = sc.nextInt();

            if(num > 7) {
                System.out.println("Привет");
            }
        }

    }
}