package neel;

public class MySingleTon {
public static MySingleTon ins;
public static MySingleTon getInstance()
{
	if(ins==null)
	{
		ins=new MySingleTon();
	}
	return ins;
}
private MySingleTon() {
	
}
}
