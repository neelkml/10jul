package neel;

public class Timit {
public static void code(Runnable r) {
long start=System.currentTimeMillis();

	try {
		r.run();
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	start=System.currentTimeMillis()-start;
	System.out.println("Time taken" +start/1000);
}
}
