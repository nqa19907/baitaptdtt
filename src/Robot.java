public abstract class Robot  {
    private int id;
    private int batteryLevel = 0;
    private String modelName;
    public Robot(int id, String model){
        this.id = id;
        this.modelName = model;
    }
    void batteryCharge(){
        this.batteryLevel = 100;
    }
    final void showIdentity(){
        System.out.printf("%d %s\n",id,modelName);
    }
    abstract void performMainTask(); 
    public String getName(){
        return modelName;
    }
}   
