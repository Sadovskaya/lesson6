public class TrafficLights {

    boolean isButtonOffWork = false;
    boolean isButtonOffY = false;
    boolean isButtonOffB = false;
    int i = 0;
    public void pressButton (String color)
    {
        String[] colour ={"желтый","красный","желтый","красный"};
       if (isButtonOffWork){
           System.out.println("Горит желтый мигающий");
           if (isButtonOffY = true){
                   while (isButtonOffY) {
               System.out.print ("горит" + colour[i]);
               i++;}}
           else if (isButtonOffB = true) {
               while (isButtonOffB) {
                   System.out.print ("горит" + colour[i]);
                   i--;}}
           }
       else  {
               System.out.println("Горит желтый мигающий");
           }
       }
}