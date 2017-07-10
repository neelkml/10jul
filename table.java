package neel;

public class table {
 void printTable(int n)
{
	for(int i=1;i<=10;i++)
	{
		System.out.println(n*i);
	
	try
	{
		Thread.sleep(200);
	}
	catch(Exception ex)
	{
		System.out.println(ex);
	}
	
}
}
void displayTable(int n)
{
	
	for(int i=1;i<=10;i++)
	{
		System.out.println(n*i);
	
	try
	{
		Thread.sleep(200);
	}
	catch(Exception ex)
	{
		System.out.println(ex);
	}
	
}
}
synchronized void print(int n)
{
	printTable(n);
	displayTable(n);
}
}

class Mythread1 extends Thread
{
	table t;
	Mythread1(table t){
		this.t=t;
	}
	public void run() {
		t.printTable(5);
	}
	class Mythread2 extends Thread
	{
		table t;
		Mythread2(table t){
			this.t=t;
		}
		public void run() {
			t.printTable(100);
		}
	}
  class TestSync
	{
		public  void main(String args[]) {
			table obj=new table();
			Mythread1 t1=new Mythread1(obj);
			Mythread2 t2=new Mythread2(obj);
			t1.start();
			t2.start();
		}
	}

}
