public class UserUsingLocalQuery {
    private String login;
    private String password;

    UserUsingLocalQuery(String login, String password) {
        this.login = login;
        this.password = password;
    }

    void createQuery() {
        class Query {
            void printToLog() {
                String message = "User with credentials %s:%s made request.".formatted(login, password);
                System.out.println(message);
            }
        }

        Query query = new Query();
        query.printToLog();
    }

    public static void main(String args[]) {
        UserUsingLocalQuery user = new UserUsingLocalQuery("admin", "123456");
        user.createQuery();
    }
}
