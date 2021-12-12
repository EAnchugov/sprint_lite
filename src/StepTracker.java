import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class StepTracker {
    ArrayList <Integer> goalDays = new ArrayList<>();
    int goal = 0;
    Converter converter = new Converter();
    public HashMap<String, ArrayList<Integer>> stepInfo = new HashMap<>();

    void setGoal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целевое количество шагов");
        int goal= scanner.nextInt();
        if (goal < 0){
            System.out.println("Количестов шагов может быть только положительным");}
        System.out.println("Целевое количество шагов в день теперь " + goal);

    }

    void addSteps() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца от 1 - до 12");
        String month = scanner.next();
        System.out.println("Введите число месяца от 1 до 30");
        int day = scanner.nextInt();
        System.out.println("Введите количество шагов.");
        Integer steps = scanner.nextInt();

        if (stepInfo.containsKey(month)) {//если месяц создан добавляем день
            ArrayList<Integer> monthCheck = stepInfo.get(month);
            int exSteps = monthCheck.get(day - 1);
            //System.out.println("Quantity of steps in day "+ (day-1)+ "changed from " + exSteps + "to " + steps );
            monthCheck.set(day - 1, steps);//Заменяем значение
        } else {//если нет заводим новый месяц и добавляем день
            // System.out.println("месяца нет");
            ArrayList<Integer> monthCheck = new ArrayList<>();
                for (int i = 0; i < 30; i++) {//добавляем нули во все дни месяца
                    monthCheck.add(0);
                }
                monthCheck.set(day - 1, steps);//добавляем день в нужную ячейку
                stepInfo.put(month, monthCheck);//добавить в мапу
        }

    }

   void getReport () {
       int stepsByMonth = 0;//шагов за месяц
       int maxSteps = 0;//максимум шагов
       int stepCheck = 0;//шагов за день
       int goalsRow = 0;//переменная для дней подряд
       goalDays.clear();// обнуляем временную таблицу


       Scanner scanner = new Scanner(System.in);
       System.out.println("Введите название месяца");
       String reportMonth = scanner.next();
       ArrayList<Integer> monthCheck = stepInfo.get(reportMonth);
       if (stepInfo.containsKey(reportMonth)) {
           for (int i = 0; i < monthCheck.size(); i++) {
               System.out.print((i + 1) + " день :" + monthCheck.get(i) + " ");
               stepCheck = monthCheck.get(i);
               stepsByMonth += stepCheck;//считаем сумму шагов

               if (maxSteps < stepCheck) {// если максимум шагов
                   maxSteps = stepCheck; // записываем лучший день
                   if (goalsRow >= 0) {
                       goalsRow += 1; //добавляем день в "дней подряд"
                   }


               } else { //если серия прервалаясь
                   goalDays.add(goalsRow);//Записываем значение и обнуляем переменную
                   goalsRow = 0;
               }
           }
       }
       if (stepsByMonth == 0) {
           System.out.println("Нет вснесенных данных");
       } else {
           System.out.println("Всего: " + stepsByMonth + " шагов.");
           System.out.println("Максимальное пройденное количество шагов в месяце: " + maxSteps);
           int medianSteps = stepsByMonth / 30;
           System.out.println("Среднее количество шагов в месяце: " + medianSteps);
           System.out.println("Пройденная дистанция (в км) " + converter.way(stepsByMonth));
           System.out.println("Всего сожжено: " + converter.getCcal(stepsByMonth) + " килокалорий");
           goalsRow();
       }
   }



   void goalsRow () {
            int bestRow = 0;
            for (Integer row : goalDays) {
                if (bestRow < row) {
                    bestRow = row;
                }
            }
            System.out.println("Лучшая серия: " + bestRow + ".");
   }

}