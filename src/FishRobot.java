public class FishRobot extends Robot implements Swimmable{
    public FishRobot(int id , String modelName){
        super(id, modelName);
    }
    @Override
    void performMainTask() {
        System.out.printf("%s performing main task\n",this.getName());
    }
    public void swim(){
        System.out.printf("%s swimming\n",this.getName());
    }
}
