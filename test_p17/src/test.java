import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		Car rccar1[];
	//	RacingCar rccar1;
		rccar1 = new Car[2];
		rccar1[0] = new Car();
		rccar1[0].setCar(1234, 20.5);
		
		rccar1[1] = new RacingCar();
		rccar1[1].setCar(4567,30.5);
		
		for(int i=0;i<rccar1.length;i++)
		{
			rccar1[i].show();
		}
	}
}
class Car
{
	protected int num;
	protected double gas;
	
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
	public void show()
	{
		System.out.println("�ɨ��������O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�ɨ��s���O"+course);
	}
}