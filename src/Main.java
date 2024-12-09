import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше количество баллов");
        int a = scanner.nextInt();

        if (a>=90&& a<=100){
            System.out.println("Ваша оценка: A");
        }
        if (a>=80&& a<=89){
            System.out.println("Ваша оценка: B");
        }
        if (a>=70&& a<=79){
            System.out.println("Ваша оценка: C");
        }
        if (a>60&& a<=69){
            System.out.println("Ваша оценка: D");
        }
        if (a<=60){
            System.out.println("Ваша оценка: F");
        }
    }
}