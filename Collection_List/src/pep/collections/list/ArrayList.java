package pep.collections.list;


import java.util.Iterator;

public class ArrayList {
	
	public static void main(String [] args) {
		
	List<String> al= new ArrayList<>( );
		al.add( "one" );
		al.add( "two" );
		al.add( "three" );
		Iterator<String> i= al.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}

}
