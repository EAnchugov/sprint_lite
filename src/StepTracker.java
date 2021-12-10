import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StepTracker {
    HashMap<String,ArrayList<Integer>> stepInfo;

    StepTracker (){
    stepInfo = new HashMap<>();
    }


    void addSteps(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название месяца");
        String month = scanner.next();
        System.out.println("Введите число");
        int day = scanner.nextInt();
        System.out.println("Введите количество шагов");
        int steps = scanner.nextInt();

        if (stepInfo.containsKey(month)) {//проверка наличия месяца
            if (stepInfo.containsKey(month)) {

                ArrayList<Integer> step = stepInfo.get(month); // заводим переменную для месяца
                if (step.get(day - 1) != null) {
                    step.add(day - 1, steps);
                }
                else {
                    for (int i = step.size(); i < day - 1; i++) { //заполняем пустые дни нолями
                        step.add(i, 0);
                    }
                    step.remove(day - 1);//
                    step.add(day - 1, steps);
                }
            }
        }

    }






}


