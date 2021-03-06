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
	//list.forEach(System.out::println); //method reference
    //list.forEach(String::valueOf);  
	/*list.forEach(LambdaSimple::printWithHello);
}
public static void printWithHello(int a)
{
	System.out.println("Hello"+a);
} */
	
	/*list.forEach(t -> {
		try {
			printWithHello(t);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	});
	}
	public static void printWithHello(int a) throws InterruptedException
	{
		Thread.sleep(200);
		System.out.println("Hello"+a);
}*/
	/*Timit.code(()->{
		list.forEach(LambdaSimple::printWithHello);
	}
	);*/
	/*list.stream()
	.map(String::valueOf)
	.forEach(System.out::println);*/
	/*list.stream()
	.filter(value->value%2==0)
	.filter(value->value>3)
	.forEach(System.out::println);*/
	/*System.out.println(list.stream()
	.filter(value->value%2==0)
	.filter(value->value>3)
	.mapToInt(value->value)
	.sum());*/
	System.out.println(list.stream()
			.filter(value->value%2==0)
			.filter(value->value>3)
			.mapToDouble(value->value *1.5)
			.sum());
}
	public static  void printWithHello(int a)
	{
		try {
			Thread.sleep(350);
		}catch(InterruptedException e) {
		System.out.println("Hello"+a);
}
	}
}

