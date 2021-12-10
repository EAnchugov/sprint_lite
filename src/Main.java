import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int stepsGoal = 0;

        StepTracker stepTracker = new StepTracker();

         while (true) {
            printmenu();
            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();

            if (command == 1) {
                stepTracker.addSteps();
            } else if (command == 2) {

            } else if (command == 3){
                stepsGoal = stepTracker.setGoal();
            }
            else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Неверная команда");
            }
        }



    }
    public static void printmenu(){
        System.out.println("1. Ввести количество шагов за определённый день;");
        System.out.println("2. Напечатать статистику за определённый месяц;");
        System.out.println("3. Изменить цель по количеству шагов в день;");
        System.out.println("0. Выйти из приложения.");
    }
 /*   public static void  addsteps(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название месяца");
        String month = scanner.next();
        System.out.println("Введите число");
        int day = scanner.nextInt();
        System.out.println("Введите количество шагов");
        int steps = scanner.nextInt();


    }*/

}
