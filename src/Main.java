import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        StepTracker stepTracker = new StepTracker();

         while (true) {
            printmenu();
            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();

            if (command == 1) {
                stepTracker.addSteps();
            } else if (command == 2) {
                stepTracker.getReport();
            } else if (command == 3){
               stepTracker.setGoal();//ууу
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
}
