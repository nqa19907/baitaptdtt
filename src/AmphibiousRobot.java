public class AmphibiousRobot extends Robot implements Flyable,Swimmable,GPS {
    public AmphibiousRobot(int id, String modelName){
        super(id,modelName);
    }
    public void swim(){
        System.out.printf("%s swimming\n",this.getName());

    }
    public void fly(){
        System.out.printf("%s flying\n",this.getName());
    }
    public void getCoordinates(){
        System.out.printf("%s getting coordinates\n",this.getName());

    }
    void performMainTask(){
        System.out.printf("%s performing main task\n",this.getName());

    }

}
