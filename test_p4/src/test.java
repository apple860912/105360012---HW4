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
		System.out.println("�Ͳ��F���l");
	}
	public void setCar(int n,double s)
	{
		num=n;
		gas=s;
		System.out.println("�N�����]��"+num+"�A�N�T�o�]��"+gas);
	}
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
	
}

class RacingCar extends Car
{
	private int course;
	public RacingCar()
	{
		course = 0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	public void setcourse(int c)
	{
		course = c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
}