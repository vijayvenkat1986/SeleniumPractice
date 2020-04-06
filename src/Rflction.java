import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Rflction {

	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		// TODO Auto-generated method stub
		String s = "methodA";
		
		Method m = Rflction.class.getMethod(s, Integer.class, Integer.class);
		
		m.invoke(m,9,5);
		
		
	}
	
	public static void methodA(Integer x, Integer y)
	{
		System.out.println(x+y);
	}

}



