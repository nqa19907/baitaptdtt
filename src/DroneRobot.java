public class DroneRobot extends Robot implements GPS,Flyable,ElectronicDevice {
    public DroneRobot(int id, String modelName){
        super(id,modelName);
    }
    @Override
    void performMainTask() {
        System.out.printf("%s performing main task\n",this.getName());
    }
    @Override
    public void getCoordinates() {
        System.out.printf("%s getting coordinates\n",this.getName());
        
    }
    @Override
    public void fly() {
        System.out.printf("%s flying\n",this.getName());

    }
    public void turnOn(){
        System.out.printf("%s turned on\n",this.getName());

    }
    // khong ke thua duoc electronicdevice => java khong cho ke thua 2 lop
}
