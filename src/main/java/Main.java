public class Main {


    public static int bouncingBall(double h, double bounce, double window) {

        int counter =0;
        while(h > window){
            h=h*bounce;
            counter+=2;
        }
        return counter-1;
    }
    

}
