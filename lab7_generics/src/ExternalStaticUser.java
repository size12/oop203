public class ExternalStaticUser {
    private String login;
    private String password;

    public ExternalStaticUser(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        Query query = new Query(login, password);
        query.printToLog();
    }

    public static class Query {
        private String login;
        private String password;

        public Query(String login, String password) {
            this.login = login;
            this.password = password;
        }

        public void printToLog() {
            String message = "User with credentials %s:%s made request.".formatted(login, password);
            System.out.println(message);
        }
    }

    public static void main(String args[]) {
        ExternalStaticUser user = new ExternalStaticUser("admin", "123456");
        user.createQuery();

        ExternalStaticUser.Query query = new ExternalStaticUser.Query("root", "1234");
        query.printToLog();
    }
}
