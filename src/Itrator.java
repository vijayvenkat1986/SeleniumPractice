import java.util.ArrayList;
import java.util.Iterator;

public class Itrator {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		alist.add(5);
		alist.add(9);
		alist.add(11);
		alist.add(13);
		
		Iterator<Integer> itr;
		itr = alist.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}		
	}

}
