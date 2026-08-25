public class Wrapper_practice {
    public static void main(String[] args){
        String s = new String("5");
        // Instantitated objects
        Integer n = new Integer(5);
        Integer n1 = new Integer(50);
        Double d = new Double(5.0);
        Double d1 = new Double(5.2);
        Double d2 = new Double(5);

        int prim = n1.intValue();

        // 8+ Integer methods
        System.out.println(n.MAX_VALUE);
        System.out.println(n1.MIN_VALUE);
        System.out.println(n.byteValue());
        System.out.println(prim);
        System.out.println(n1.equals(n));
        System.out.println(n1.compareTo(n));
        System.out.println(Integer.parseInt(s));
        System.out.println(Integer.bitCount(n));
        System.out.println(Integer.highestOneBit(n1));

        // 8 Double methods 
        System.out.println(Double.parseDouble("583.5"));
        System.out.println(Double.valueOf(d));
        System.out.println(d1.equals(d));
        System.out.println(d1.compareTo(d));
        System.out.println(d.doubleValue());
        System.out.println(d.intValue()); 
        System.out.println(d.MAX_VALUE);
        System.out.println(d1.MIN_NORMAL);

        // 10 Math methods
        double random = Math.random();
        System.out.println(Math.abs(d1));
        System.out.println(Math.abs(n));
        System.out.println(Math.pow(d, d1));
        System.out.println(Math.getExponent(d));
        System.out.println(Math.sqrt(d));
        System.out.println(random);
        System.out.println(Math.min(d, d1));
        System.out.println(Math.round(d));
        System.out.println(Math.ceil(d));
        System.out.println(Math.floor(4.9));
    }
}