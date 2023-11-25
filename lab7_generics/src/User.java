class User {
    private String login;
    private String password;

    User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    private class Query {
        void printToLog() {
            String message = "User with credentials %s:%s made request.".formatted(login, password);
            System.out.println(message);
        }
    }

    void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public static void main(String args[]) {
        User user = new User("admin", "123456");
        user.createQuery();

        Query query = user.new Query();
        query.printToLog();

        Query query2 = new User("admin", "123456").new Query();
        query2.printToLog();
    }
}