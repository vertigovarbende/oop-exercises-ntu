package compositionInheritancePolymorphism.composition.point;

import java.util.Arrays;

public class LineTest {

	public static void main(String[] args) {
		// Test constructor and toString()
		Line firstLine = new Line(1, 2, 3, 4);
		System.out.println(firstLine); // firstLine.toString()
		// Line[begin=(1,2),end=(3,4)]
		Line secondLine = new Line(new Point(5, 6), new Point(7, 8));
		System.out.println(secondLine); // secondLine.toString()
		// Line[begin=(5,6),end=(7,8)]

		// Test Setters and Getters
		firstLine.setBegin(new Point(11, 12));
		firstLine.setEnd(new Point(13, 14));
		System.out.println(firstLine);
		// Line[begin=(11,12),end=(13,14)]
		System.out.println("firstLine's begin is: " + firstLine.getBegin());
		// "firstLine's being is: (11,12)
		System.out.println("firstLine's end is: " + firstLine.getEnd());
		// firstLine's end is: (13,14)

		firstLine.setBeginX(21);
		firstLine.setBeginY(22);
		firstLine.setEndX(23);
		firstLine.setEndY(24);
		System.out.println(firstLine);
		// Line[begin=(21,22),end=(23,24)]
		System.out.println("firstLine's begin's x is: " + firstLine.getBeginX());
		// firstLine's begin's x is: 21
		System.out.println("firstLine's begin's y is: " + firstLine.getBeginY());
		// firstLine's begin's y is: 22
		System.out.println("firstLine's end's x is: " + firstLine.getEndX());
		// firstLine's end's x is: 23
		System.out.println("firstLine's end's y is: " + firstLine.getEndY());
		// firstLine's end's y is: 24

		firstLine.setBeginXY(31, 32);
		firstLine.setEndXY(33, 34);
		System.out.println(firstLine);
		// Line[begin=(31,32),end=(33,34)]
		System.out.println("firstLine's begin's x and y are: " + Arrays.toString(firstLine.getBeginXY()));
		// firstLine's begin's x and y are: [31, 32]
		System.out.println("firstLine's end's x and y are: " + Arrays.toString(firstLine.getEndXY()));
		// firstLine's end's x and y are: [33, 34]

		// Test getLength()
		System.out.printf("firstLine's length is: %.2f%n", firstLine.getLength());
		// firstLine's length is: 2.83
		
		// Test getGradient()
		firstLine.setBeginXY(4, -5);
		firstLine.setEndXY(2, 3);
		System.out.printf("%.2f", firstLine.getGradient());

	}

}
