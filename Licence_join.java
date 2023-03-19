package thread;

class Medical extends Thread {
	
	public void run() {
		try {
			 System.out.println("Medical started");
		    Thread.sleep(4000);
		    System.out.println("Medical completed"); 
		}
		catch(Exception e) {
			
		}
	}
}

class TestDrive extends Thread {	
	public void run() {
	 try {
		 Thread.sleep(2000);
		 System.out.println("TestDrive started");
		 Thread.sleep(4000);
		 System.out.println("TestDrive completed");
	 }
	 catch(Exception e ) {
		 System.out.println(e);
	 }
	}
}
class OfficerSign extends Thread{
	public void run() {
		try {
			Thread.sleep(1000);
			 System.out.println("OfficerSign started");
			 Thread.sleep(5000);
			 System.out.println("OfficerSign completed");
		 }
		 catch(Exception e ) {
			 System.out.println(e);
		 }	
	}
}
public class Licence_join {
	public static void main(String[] args) throws InterruptedException {
		Medical m = new Medical();
		m.start();

		m.join();
		
		TestDrive t = new TestDrive();
		t.start();
		
		t.join();
		
		OfficerSign o = new OfficerSign();
		o.start();
	}
}
