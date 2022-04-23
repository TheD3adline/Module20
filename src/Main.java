import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] employees = new String[4];

        employees[0] = "Michael";
        employees[1] = "Hannah";
        employees[2] = "Sabrina";
        employees[3] = "Dietrich";

        String[] employeesNew = new String[8];

        for(int i = 0; i < employees.length; i++) {
            employeesNew[i] = employees[i];
        }

        employees = employeesNew;

        ArrayList<String> betterEmployees = new ArrayList<String>();

        betterEmployees.add("Michael");
        betterEmployees.add("Hannah");
        betterEmployees.add("Sabrina");
        betterEmployees.add("Dietrich");

        for(int i = 0; i < betterEmployees.size(); i++) {
            System.out.println(betterEmployees.get(i));
        }

        System.out.println();

        betterEmployees.add(1, "Nina");

        for(int i = 0; i < betterEmployees.size(); i++) {
            System.out.println(betterEmployees.get(i));
        }

        System.out.println();

        betterEmployees.set(4, "Horst");

        for(int i = 0; i < betterEmployees.size(); i++) {
            System.out.println(betterEmployees.get(i));
        }

        System.out.println();

        betterEmployees.remove(4);

        for(int i = 0; i < betterEmployees.size(); i++) {
            System.out.println(betterEmployees.get(i));
        }

        System.out.println();

        System.out.println(betterEmployees.contains("Hannah"));
        System.out.println(betterEmployees.contains("Roland"));

        System.out.println();

        System.out.println(betterEmployees.indexOf("Sabrina"));

        System.out.println();

        betterEmployees.clear();

        for(int i = 0; i < betterEmployees.size(); i++) {
            System.out.println(betterEmployees.get(i));
        }
    }
}