package patterns;
enum Connection {
    INSTANCE;
    public void connect(){
        System.out.println("Database connected.");
    }

    public void disconect() {
        System.out.println("Database disconnected.");
    }
}

//class Connection {
//    private static Connection instance;
//
//    private Connection() {
//        System.out.println("Connection created.");
//    }
//
//    public static Connection getInstance() {
//        if(instance == null) {
//            instance = new Connection();
//        }
//        return instance;
//    }
//
//    public void connect() {
//        System.out.println("Connected.");
//    }
//
//    public void disconnect() {
//        System.out.println("Disconnected.");
//    }
//}

public class SingletonPattern {
    public static void main(String[] args) {
//        Connection instance = Connection.getInstance();
//        instance.connect();
//        instance.disconnect();
//
//        Connection instance2 = Connection.getInstance();
//        Connection instance3 = Connection.getInstance();
//
//        System.out.println("Instance 1 "+instance.hashCode());
//        System.out.println("Instance 2 "+instance2.hashCode());
//        System.out.println("Instance 3 "+instance3.hashCode());
//
//        if(instance == instance2) {
//            System.out.println("Instance same");
//        }

        Connection.INSTANCE.connect();


    }
}
