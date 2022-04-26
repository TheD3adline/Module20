import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {        //The collection framework is a collection (duh) of pre-defined code that includes tools to make lists and other forms of compilations
                                                    //of data types. One of the most common is the ArrayList.
        String[] employees = new String[4];
                                                    //This is the regular way of making a String Array and writing some content into each of them.
        employees[0] = "Michael";                   //It requires an awful lot of typing to do that.
        employees[1] = "Hannah";
        employees[2] = "Sabrina";
        employees[3] = "Dietrich";

        String[] employeesNew = new String[8];      //If we then want to extend it, it requires even more typing to do.
                                                    // Not to mention the effort it takes to delete an index somewhere in the middle and then rearrange all other content.
        for(int i = 0; i < employees.length; i++) {
            employeesNew[i] = employees[i];
        }

        employees = employeesNew;

        ArrayList<String> betterEmployees = new ArrayList<String>();    //That's why the java collection framework exists. This is the pre-defined class of ArrayList<>
                                                                        //It includes several methods to do what was done in the example above and so much more,
        betterEmployees.add("Michael");                                 //while being a lot less typing work. It also automatically rearranges the content if a middle index or others are deleted
        betterEmployees.add("Hannah");
        betterEmployees.add("Sabrina");                                 //the ArrayList.add method lets you add content to the list
        betterEmployees.add("Dietrich");

        for(int i = 0; i < betterEmployees.size(); i++) {               //If we want to use it as control element for a for loop like here .length like for regular arrays is now a .size
            System.out.println(betterEmployees.get(i));                 //.get method for data access
        }

        System.out.println();

        betterEmployees.add(1, "Nina");                     //.add can be specified with an index to put the content in and rearrange all others accordingly

        for(int i = 0; i < betterEmployees.size(); i++) {
            System.out.println(betterEmployees.get(i));
        }

        System.out.println();

        betterEmployees.set(4, "Horst");                                //.set can be used to overwrite content of specified index

        for(int i = 0; i < betterEmployees.size(); i++) {
            System.out.println(betterEmployees.get(i));
        }

        System.out.println();

        betterEmployees.remove(4);                                 //.remove is used to delete content of specified index

        for(int i = 0; i < betterEmployees.size(); i++) {
            System.out.println(betterEmployees.get(i));
        }

        System.out.println();

        System.out.println(betterEmployees.contains("Hannah"));         //.contains returns a boolean if the list contains the specified content
        System.out.println(betterEmployees.contains("Roland"));

        System.out.println();

        System.out.println(betterEmployees.indexOf("Sabrina"));         //.indexOf returns the index number of specified content

        System.out.println();

        betterEmployees.clear();                                        //.clear deletes all content

        for(int i = 0; i < betterEmployees.size(); i++) {
            System.out.println(betterEmployees.get(i));
        }

        System.out.println("------------------------------------------------");

        ArrayList<String> evenBetterEmployees = new ArrayList<String>();

        evenBetterEmployees.add("Hans-Peter");
        evenBetterEmployees.add("Simone");
        evenBetterEmployees.add("Jochen");
        evenBetterEmployees.add("Lara");

        for(int i = 0; i < evenBetterEmployees.size(); i++) {
            System.out.println(evenBetterEmployees.get(i));
        }

        System.out.println();

        Collections.sort(evenBetterEmployees);                          //.sort to sort the content alphabetically

        for(int i = 0; i < evenBetterEmployees.size(); i++) {
            System.out.println(evenBetterEmployees.get(i));
        }

        System.out.println();

        Collections.reverse(evenBetterEmployees);                       //.reverse to sort the content reverse-alphabetically

        for(String employee : evenBetterEmployees) {
            System.out.println(employee);
        }
    }
}