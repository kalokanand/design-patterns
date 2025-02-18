package design.prototype;

public class PrototypeMain {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        NetworkConnection connection = new NetworkConnection("192.186.1.1","Important data");
        System.out.println(connection);
        NetworkConnection connection1 = (NetworkConnection) connection.clone();
        System.out.println(connection1);
    }
}
