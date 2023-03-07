package Tut1;
import java.util.Scanner;

class T3{
	public static void main(String args[])
	{
	double speed,distance,time;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter speed in kmph ");
	speed=sc.nextDouble();	
	System.out.println("enter time in hours ");
	time=sc.nextDouble();	
	distance=speed*time;
	System.out.println("Distance in kilometers= "+distance+"km");
	System.out.println("Distance in meters= "+distance*1000+"m");
	}
}
