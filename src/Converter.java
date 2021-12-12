public class Converter {
    public static void converter(){
        StepTracker stepTracker = new StepTracker();
    }
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
