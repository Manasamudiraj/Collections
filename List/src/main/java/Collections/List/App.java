package Collections.List;

/**
 * Hello world!
 *
 */
import java.util.CustomList;
import java.util.Iterator;
public class App 
{
    public static void main( String[] args )
    {
    	CustomList<Integer> al=new CustomList<>();
    	al.add(1);
    	al.add(2);
    	al.add(3);
    	Iterator<String> i=al.iterator();
    	while(i.hasNext())
    		System.out.println(i.next());
        
    }
}
