import java.util.*;
public class String_exercise {
    String q;

    public static void main(String[] args){
        String greeting = "Hello";
        String greeting2 = new String("Hello");
        String a = new String("Hola");
        String address = new String("3107 Red Granite Drive");
        System.out.println(greeting.length()); //length
        System.out.println(a.substring(0,2)); 
        System.out.println(address.substring(5));
        boolean equality = greeting.equals(a);
        System.out.println(equality);
        System.out.println(greeting.equals(greeting2)); // differs with bottom one since this method checks the memory location of objects
        System.out.println(greeting == greeting2 ); // this checks the memory location of string literals
        System.out.println(greeting.indexOf("lo"));
        System.out.println(a.compareTo(greeting)); // "Hola" & "Hello" - returns the difference in askis
        String[] greeting3= greeting2.split("");
        System.out.println(Arrays.toString(greeting3)); // why is it like that
        System.out.println(greeting.concat(greeting2));
        System.out.println(greeting.length());
        System.out.println(address.lastIndexOf("v"));
        System.out.println(address.getBytes());
        char letter = address.charAt(9);
        System.out.println(letter);
        System.out.println(address.toUpperCase());
        // System.out.println(address.valueOf())
        boolean p = greeting.contains((a));
        System.out.println(address.contains("3107")); // compares literals to objects
        System.out.println(p);
        String g = "  "; // even "   " leads to false.  Not null. 
        // System.out.println(q);
        System.out.println(g.isEmpty());
        // string literal - ==
        // string object - .equals to 
        // .contain doesn't care about literal or object
        address = address.replace("a","*");
        System.out.println(address);
        System.out.println(address.toLowerCase());
        String Trimmed = "   hh  ".trim();
        System.out.println(Trimmed);
        System.out.println(Trimmed);
        String IhateStringLiteral = "String literal";
        System.out.println(IhateStringLiteral.equalsIgnoreCase("hell"));
    }
}
