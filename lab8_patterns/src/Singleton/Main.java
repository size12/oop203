package Singleton;

public class Main {
    public static void main(String[] args) {
        Server server = Server.getInstance();
        System.out.println(server);

        Server server2 = Server.getInstance();
        System.out.println(server2);
    }
}
