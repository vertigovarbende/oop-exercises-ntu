package ch01_basics.time;

public class TimeTest {
	public static void main(String[] args) {
		
		// Test Constructors and toString()
		Time t1 = new Time(1, 2, 3); // with smart constructor
		System.out.println(t1); // toString()
		// 03:02:01
		Time t2 = new Time(); // with default constructor
		System.out.println(t2);
		// 00:00:00
		
		System.out.println();
		
		// Test Setters and Getters
		t1.setHour(4); // Set hour
		t1.setMinute(5); // Set minute
		t1.setSecond(6); // Set second
		System.out.println(t1); // 04:05:06
		
		System.out.println("Hour is: " + t1.getHour()); // Hour is: 4
		System.out.println("Minute is: " + t1.getMinute()); // Minute is: 5
		System.out.println("Second is: " + t1.getSecond()); // Second is: 6
		
		System.out.println();
		
		// Test ternary operator in Setters methods
		t2.setHour(25);
		t2.setMinute(65);
		t2.setSecond(65);
		System.out.println(t2); // -1:-1:-1
		
		System.out.println();
		
		// Test setTime()
		t1.setTime(58, 59, 23);
		System.out.println(t1); // 23:59:58
		
		System.out.println();
		
		// Test nextSecond() and chaining
		System.out.println(t1.nextSecond()); // Return an instance of Time. Invoke Time's toString()
		// 23:59:59
		
		System.out.println(t1.nextSecond().nextSecond().nextSecond()); // 00:00:02
	}
}
