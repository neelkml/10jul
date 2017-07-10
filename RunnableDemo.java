package neel;

public class RunnableDemo implements Runnable{
	
	private Thread t;
	private String threadName;

		
		
	RunnableDemo(String name)
	{
		threadName=name;
		System.out.println("Creating"+threadName);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running"+ threadName);
		try
		{
			for(int i=4;i>0;i--)
			{
				System.out.println("Thread" + threadName+ ","+i);
				Thread.sleep(50);
			}
		}
			catch(InterruptedException ex)
			{
			System.out.println("Thread"+ threadName+"Interrupted");
			}
		System.out.println("Thread"+ threadName+"Exiting");
		}
	
	public void start()
	{
		System.out.println("Starting"+ threadName);
		if(t==null)
		{
			t=new Thread(this,threadName);
			t.start();
		}
	}

}
