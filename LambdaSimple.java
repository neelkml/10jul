package neel;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaSimple {
public static void main(String args[])
{
	List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
	/*Thread t=new Thread(new Runnable()
	{
		public void run()
		{
			for(Integer i:list)
				System.out.println(i);
		}
	});

	t.start(); */
	/*list.forEach(new Consumer<Integer>(){
		@Override
		public void accept(Integer t) {
			// TODO Auto-generated method stub
			System.out.println(t);
		}
	
	}); */
	//list.forEach((Integer t)->System.out.println(t));
	//list.forEach(( t)->System.out.println(t));
	list.forEach(System.out::println); //method reference
}
}
