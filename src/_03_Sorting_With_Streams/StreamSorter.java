package _03_Sorting_With_Streams;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class StreamSorter {
	public static void main(String[] args) {
		Integer[] nums = new Integer[50];
		for(int i = 0; i < nums.length; i++) {
			Random rGen = new Random();
			nums[i] = rGen.nextInt();
		}
		
		//1. Convert the Integer array to Stream object.
		Arrays.stream(nums).sorted().forEach((i)->System.out.println(i));
		
		//2. Use the sorted method of the stream to sort the numbers.

		
		//3. Use the forEach method with a lambda to print all the elements of the sorted Stream.
		//   They should be in ascending order.
		
	}
}
