import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		RacingCar rccar1;
		rccar1 = new RacingCar();
		rccar1.setCar(1234, 20.5);
		rccar1.setcourse(5);
	}
}
class Car
{
	private int num;
	private double gas;
	
	public Car()
	{
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public void setCar(int n,double s)
	{
		num=n;
		gas=s;
		System.out.println("將車號設為"+num+"，將汽油設為"+gas);
	}
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	
}

class RacingCar extends Car
{
	private int course;
	public RacingCar()
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	public void setcourse(int c)
	{
		course = c;
		System.out.println("將賽車編號設為"+course);
	}
}