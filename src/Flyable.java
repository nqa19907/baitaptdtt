public interface Flyable {
    void fly();

    default void cc(){
        System.out.println("hi");
    }
}