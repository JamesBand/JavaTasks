package ua.khpi.markevich.Practice5;

import java.io.IOException;

import ua.khpi.markevich.Practice5.part1.Part1;
import ua.khpi.markevich.Practice5.part2.Part2;
import ua.khpi.markevich.Practice5.part3.Part3;
import ua.khpi.markevich.Practice5.part4.Part4;
import ua.khpi.markevich.Practice5.part5.Part5;
import ua.khpi.markevich.Practice5.part6.Part6;

public class Demo {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println("~~~~~~~~~~~~Part1");
		Part1.main(args);
		Thread.sleep(5000);

		System.out.println("~~~~~~~~~~~~Part3");
		Part3.main(args);
		Thread.sleep(500);

		System.out.println("~~~~~~~~~~~~Part4");
		Part4.main(args);
		Thread.sleep(500);

		System.out.println("~~~~~~~~~~~~Part5");
		Part5.main(args);
		Thread.sleep(500);

		System.out.println("~~~~~~~~~~~~Part6");
		Part6.main(args);
		Thread.sleep(1000);

		System.out.println("~~~~~~~~~~~~Part2");
		Part2.main(args);

	}

}
