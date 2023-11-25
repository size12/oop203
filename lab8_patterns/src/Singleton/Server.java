package Singleton;

public class Server {
    private static Server instance;
    private String port = ":8080";
    public static Server getInstance()
    {
        if (instance == null)
            instance = new Server();
        return instance;
    }

    String getPort() {
        return this.port;
    }
}
