package oops_Exercises;


/*
 * Create new classes for each real-world object that you observed
 * at the beginning of this trail.
 * 
 */
class Television {
	int volumn;
	boolean status;
	int chennal_No;
	boolean channel_Flag;
	
	Television(){
		volumn=0;
		status=false;
		channel_Flag=false;
	}
	
	public boolean turnOn() {
		status=true;
		return status;
	}
	
	public boolean turnOff() {
		status=true;
		return status;
		
	}
	
	public int increaseVolumn(int value) {
		volumn+=value;
		System.out.println("Volumne Increased by :"+value);
		return volumn;
	}
	
	public int decreaseVolumn(int value) {
		volumn-=value;
		System.out.println("Volumne Decreased by :"+value);
		return volumn;
	}
	
	public void printVolumnStatus() {
		System.out.println("Now TV Volumn is "+volumn);
	}
	
	public boolean change_chennal(int chennal_No) {
		
		this.chennal_No=chennal_No;
		channel_Flag=true;
		System.out.println("Now "+this.chennal_No+" channel is shown.. ");
		return channel_Flag;
	}
	
	
}

public class Exercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Television mytv=new Television();
		//turn on tv
		System.out.println("Tv is turn On "+mytv.turnOn());
		System.out.println("Incerase volumn of TV");
		mytv.increaseVolumn(30);
		mytv.printVolumnStatus();
		mytv.decreaseVolumn(10);
		mytv.printVolumnStatus();
		mytv.change_chennal(305);
		mytv.increaseVolumn(5);
		mytv.printVolumnStatus();
		System.out.println("Tv is turn OFF "+mytv.turnOff());
		System.gc(); 
		
		
		

	}

}
