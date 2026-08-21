import java.util.*;

public class Stringinto {
    public static void main(String[] arg){
        String address = new String("1 Grizzly Way Granite Bay"); // AP test version
        String location = "Yosemite National Park"; // informal way
        System.out.println(address);
        System.out.print(location);

        // Methods for the AP test
        System.out.println(address.length()); // returns char count
            // for loops the length will be included in your for loop header for number for iterations
        
        // String city = address.substring(14,25);
            // does not change the string literal
        // System.out.print();
        String name = location.substring(9);
        System.out.println(address.substring(1,4));
        System.out.println(name);

        int letterLocation = location.indexOf("25"); // String as arg
        // if no substring or char found, returns -1
        System.out.println(letterLocation);

        System.out.println(location.equals(address));
        System.out.println("Yosemite National Park".equals("Yosemite National Park"));
                            // compares string object
        String x = new String("hi");
        String y = new String("hi");
        System.out.println("hi" == "hi"); // returns
                        //  x             returns false
        String z = "hi";
        System.out.println(z == "hi"); // you can't compare 2 string objects
        // 2 string objects with formal declartions have own memory
        // string literals are informal declarations with 


        int compare = x.compareTo(y);
        System.out.println(compare); 
        int compare_1 = y.compareTo("Hi");
        System.out.println(compare_1);
        // doesn't care about the declaration type
            // positive values mean
            // argument in compareTo gets subtracted in aski to comparator

        String[] listOfLetters = location.split("a");
        System.out.println(Arrays.toString(listOfLetters));


        // . equals and == - have differnt use cases investigate both





    }
}
