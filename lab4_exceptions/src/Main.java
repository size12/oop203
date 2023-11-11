import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {

        String filePath = "lab4_exceptions/src/resource/tasks.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                var splitted = line.split(":");

                if (splitted.length != 2) {
                    System.out.println("Failed parse line: "+ line);
                    continue;
                }

                try {
                    System.out.println(splitted[1] + "     " + Solver.Solve(splitted[1]));
                } catch (Exception e) {
                    System.out.println(e);
                }

            }
        }
    }
}