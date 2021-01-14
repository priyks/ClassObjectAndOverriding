package oops_Exercises;

interface Tv{
	public boolean turnOn() ;
	public boolean turnOff();
	public int increaseVolumn(int value);
	public int decreaseVolumn(int value);
	
}

class OnePlus implements Tv{
	int volumn;
	boolean status;
	
	OnePlus(){
		volumn=0;
		status=false;
	}
	

	@Override
	public boolean turnOn() {
		status=true;
		return status;
	}

	@Override
	public boolean turnOff() {
		status=false;
		return status;
	}

	@Override
	public int increaseVolumn(int value) {
		volumn=volumn+value;
		return 0;
	}

	@Override
	public int decreaseVolumn(int value) {
		volumn=volumn-value;
		return 0;
	}
	
	public void printVolumnStatus() {
		System.out.println("TV Volumn is "+volumn +" "+status);
	}
	
}

public class Exercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OnePlus op=new OnePlus();
		System.out.println("is Tv Turn ON :"+op.turnOn());
		op.printVolumnStatus();
		  System.out.println("is Tv Turn Off :"+op.turnOff());
		op.turnOff();
		op.increaseVolumn(40);
		op.decreaseVolumn(20);
		op.printVolumnStatus();
      
	}

}
