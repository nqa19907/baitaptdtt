import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Robot[] r = new Robot[n];
        for(int i = 0; i<n;i++){
            String line =  sc.nextLine();
            String[] info = line.split(" ");
            if (info[0].equals("DR")){
            r[i] = new DroneRobot(Integer.parseInt(info[1]), info[2]);
            }
            if (info[0].equals("FR")){
            r[i] = new FishRobot(Integer.parseInt(info[1]), info[2]);
            }
            if (info[0].equals("AR")){
           r[i] = new AmphibiousRobot(Integer.parseInt(info[1]), info[2]);
            }
        }

        for (int i = 0;i < r.length; i++){
            if(r[i] instanceof DroneRobot){
                DroneRobot drone = (DroneRobot) r[i];
                drone.performMainTask();
                if (drone instanceof Flyable){
                    ((Flyable) drone).fly();
                }
                drone.getCoordinates();
            }
            if(r[i] instanceof FishRobot){
                FishRobot fish = (FishRobot) r[i];
                fish.performMainTask();
                if (fish instanceof Flyable){
                    ((Flyable) fish).fly();
                }
                fish.swim();
            }
            else if(r[i] instanceof AmphibiousRobot){
                AmphibiousRobot amphi = (AmphibiousRobot) r[i];
                amphi.performMainTask();
                if (amphi instanceof Flyable){
                    ((Flyable) amphi).fly();
                }
                amphi.swim();
                amphi.getCoordinates();
            }
        }
        sc.close();

    }
}
