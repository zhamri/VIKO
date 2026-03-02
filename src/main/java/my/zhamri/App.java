package my.zhamri;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Calculator calculator = new Calculator();
        int total = calculator.add(4,5);
        System.out.println(total);
    }
}
