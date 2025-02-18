package design.prototype;

public class NetworkConnection implements Cloneable{

    private String id;
    private String data;

    private NetworkConnection() {
    }

    public NetworkConnection(String id, String data) throws InterruptedException {
        this.id = id;
        this.data = data;
        Thread.sleep(3000);
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "id='" + id + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
