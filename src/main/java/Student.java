import java.util.ArrayList;

public class Student {
	private long id;
	private String name;
	private ArrayList<Integer> grade;

	public Student(long id, String name, ArrayList<Integer> grade){
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
//	Getters
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public ArrayList<Integer> getGrade() {
		return grade;
	}

//	Setters
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGrade(ArrayList<Integer> grade) {
		this.grade = grade;
	}

	// returns the average of the students grades
	public int getGradeAverage() {
		int average = 0;
		for(int grades : grade)
		average += grades;
		return Math.round(average / grade.size());
	}


}