/**
 * 
 */
package test_progrems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author logendran.kandasamy
 *
 */
public class GradingStudents {

	public static void main(String[] args) {
		
		List<Integer> input = new ArrayList<>();
		input.add(73);
		input.add(67);
		input.add(38);
		input.add(33);
		
		System.out.println(gradingStudents(input));

	}

	public static List<Integer> gradingStudents(List<Integer> grades) {
		// Write your code here
		return grades.stream()
				.map(mark -> getRoundedMark(mark))
				.collect(Collectors.toList());
	}

	private static Integer getRoundedMark(Integer mark) {
		
		// 1. if mark is less than 38 no action
		
		if(mark < 38) {
			return mark;
		}
		// 2. if mark and its round of 5th order difference less than 2 then round off mark
		else {
			
			// find the 5th order round of value of mark
			int value5thOrder = (5 - (mark % 5));
			if(value5thOrder < 3) {
				return mark+value5thOrder;
			}
			else {
				return mark;
			}
		}
	}

}
