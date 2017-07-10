package neel;

public class testThread {
public static void main(String args[]) {
	RunnableDemo r1=new RunnableDemo("-t1");
	RunnableDemo r2=new RunnableDemo("-t2");
	r1.start();
	r2.start();
}
}
