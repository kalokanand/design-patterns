public class Parent implements MyInterface {

    public void show(){
        System.out.println("In abstract class");
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        MyInterface myInterface = new Parent();
        myInterface.show();
    }
}
