public interface MyInterface {

    default void show(){
        System.out.println("In Interface default method");
    }
}
