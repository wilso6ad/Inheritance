import java.util.ArrayList;

public class Inheritance {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Bruce", "Wayne", "001", "Mr.", 1981, 30.0));
        workers.add(new Worker("Clark", "Kent", "002", "Mr.", 1985, 35.0));
        workers.add(new Worker("Barry", "Allen", "003", "Mr.", 1990, 40.0));
        workers.add(new SalaryWorker("Alice", "Wonderland", "004", "Ms.", 1990, 18.0, 60000));
        workers.add(new SalaryWorker("Lex", "Luthor", "005", "Mr.", 1985, 16.0, 80000));
        workers.add(new SalaryWorker("Elizabeth", "Brown", "006", "Dr.", 1990, 12.0, 90000));

        int[] weeklyHours = {40, 50, 40};

        for (int week = 1; week <= 3; week++) {
            System.out.println("Week " + week + " Pay:");
            for (Worker worker : workers) {
                double hoursWorked = weeklyHours[week - 1];
                System.out.println(worker.formalName() + ": " + worker.displayWeeklyPay(hoursWorked));
            }
            System.out.println();
        }
    }
}