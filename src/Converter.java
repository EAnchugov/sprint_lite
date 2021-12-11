public class Converter {
        StepTracker stepTracker = new StepTracker();

      /* void  StepTracker() {
        ArrayList<Integer> may = new ArrayList();
        may.add(4, 55);
        may.add(6, 53);
        may.add(8, 255);
        stepInfo.put("Maй",may);

        ArrayList<Integer> june = new ArrayList();
        june.add(4, 155);
        june.add(6, 153);
        june.add(8, 1255);
        stepInfo.put("Июнь",june);

        ArrayList<Integer> august = new ArrayList();
        august.add(4, 55);
        august.add(6, 53);
        august.add(8, 255);
        stepInfo.put("Июль",august);
    }*/

    Integer getCcal(int steps){
        int ccal = (steps *50)/1000;
        return ccal;
    }

    Integer way (int steps){
        int way = 0;
        way = (steps*75)/100000;
        return way;
    }
}
