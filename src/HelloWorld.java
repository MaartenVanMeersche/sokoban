/**
 *
 * @author Thomas
 */
public class HelloWorld
{

    public static void main(String[] args)
    {
	System.out.println("Hello World");
	System.out.println(geefNaam());
    }

    public static String geefNaam()
    {
	String naam = String.format("Thomas");
	return naam;
    }
}
