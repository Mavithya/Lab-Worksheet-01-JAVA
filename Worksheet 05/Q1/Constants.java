package Q1;

public class Constants {
final Double PI = 3.14159;
final  int SPEED_OF_LIGHT =  299792458;


final  double GRAVITY;
Constants(double GRAVITY){

    this.GRAVITY = GRAVITY;
}
    public static void main(String[] args) {

Constants constants = new Constants(9.814);
        System.out.println(constants.GRAVITY);
    }
}
