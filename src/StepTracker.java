import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class StepTracker {
    public HashMap<String, ArrayList<Integer>> stepInfo = new HashMap<>();

    void addSteps(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца от 1 - до 12");
        String month = scanner.next();
        System.out.println("Введите число месяца от 1 до 30");
        int day = scanner.nextInt();
        System.out.println("Введите количество шагов.");
        Integer steps = scanner.nextInt();

        if (stepInfo.containsKey(month)) {//если месяц создан добавляем день
            ArrayList<Integer> monthCheck = stepInfo.get(month);
            int exSteps = monthCheck.get(day-1);
            System.out.println("Quantity of steps in day "+ (day-1)+ "changed from " + exSteps + "to " + steps );
            monthCheck.add(day-1,steps);

            }else {//если нет заводим новый месяц и добавляем день
            System.out.println("месяца нет");
            ArrayList<Integer> monthCheck = new ArrayList<>();
                for (int i = 0;i < 30 ; i++){//добавляем нули в индексе
                monthCheck.add(0);//добавляем дни
                }
                monthCheck.add(day-1,steps);//добавляем день в нужную ячейку
            stepInfo.put(month,monthCheck);

       }
    }

    int setGoal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целевое количество шагов");
        int goal= scanner.nextInt();
            if (goal < 0){
            System.out.println("Количестов шагов может быть только положительным");}
        System.out.println("Целевое количество шагов в день теперь " + goal);
        return goal;
    }

        /*Количество пройденных шагов по дням в следующем формате:
        1 день: 3000, 2 день: 2000, ..., 30 день: 10000
        Общее количество шагов за месяц;
        Максимальное пройденное количество шагов в месяце;
        Среднее количество шагов;
        Пройденная дистанция (в км);
        Количество сожжённых килокалорий;
        Лучшая серия: максимальное количество подряд идущих дней, в течение которых количество шагов за день было выше целевого.
        Если текущий день — первый в месяце (количество дней, за которое есть данные = 0), то вывод статистики должен работать корректно: все показатели должны быть равны нулю.*/
0}


