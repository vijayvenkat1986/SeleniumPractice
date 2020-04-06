import java.util.HashSet;
import java.util.Iterator;

public class Itrator2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("My");
		hs.add("Name");
		hs.add("is");
		hs.add("vijay");
		
		Iterator<String> itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
				
		

	}

}
