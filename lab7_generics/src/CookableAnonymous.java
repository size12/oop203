public class CookableAnonymous {
    interface Cookable {
        void cook(String str);
    }

    public static class Food {
        public void prepare(Cookable c, String str) {
            c.cook(str);
        }
    }

    public static void main(String[] args) {
        Food food = new Food();

        Cookable cookable = new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("Cooking: " + str);
            }
        };

        food.prepare(cookable, "Pizza");
    }
}
