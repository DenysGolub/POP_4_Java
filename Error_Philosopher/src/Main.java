public class Main {
    public static void main(String[] args) {
        for(int j = 0; j<100; j++) {
            Table table = new Table();
            for (int i = 0; i < 5; i++) {
                new Philosopher(i, table);
            }
        }

    }
}