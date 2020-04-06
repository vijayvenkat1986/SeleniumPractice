import java.util.HashMap;

public class HashMapSample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(101, "Vijay");
		hmap.put(102, "Ram");
		hmap.put(103, "Raj");
		
		for(Integer temp:hmap.keySet())
		{
			System.out.println(temp +" " +hmap.get(temp));
		}

	}

}
