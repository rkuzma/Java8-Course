import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Lambda {
	

	public static void main(String[] args) {
		
		double highestScore = 0.0;
		
		Student s1 = new Student(3.5,"S1",2011);
		Student s2 = new Student(2.5,"S2",2012);
		Student s3 = new Student(4.5,"S3",2012);

				
		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		for (Student s: students){
			
			if(s.getScore() > highestScore){
				highestScore = s.getScore();
		}
		}
		
		System.out.println(highestScore);
		
//		range(1, 5).boxed().map(i -> { out.print("Happy Birthday "); if (i == 3) return "dear NAME"; else return "to You"; }).forEach(out::println);
		
		for(int i = 1; i <=4; i++){

			System.out.println("Happy Birthday " + (i == 3 ? "dear NAME" : "to you"));

			}
		

		
//		double highScore2 = students.filter(new Predicate<Student>(){
//			public boolean op(Student s){
//				return s.getYear() == 2012;
//			}
//		}).map(new Mapper<Student, Double>(){
//			public Double extract(Student s){
//				return s.getScore();
//			}
//		}).max();
		
//		double highScore2 = students.filter(Student s -> s.getYear() == 2012).map(Student s -> s.getScore()).max();
//		()->System.out.println("Test");
		
	}
}

class Student{
	
	private double score;
	private String name;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	private int year;
	
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(double score, String name,int year) {
		super();
		this.score = score;
		this.name = name;
		this.year = year;
	}
	
}

