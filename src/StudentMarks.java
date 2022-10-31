public class StudentMarks {
	//attributes
	private String id;
	private double quiz;
	private double assignment;
	private double homeWork;
	private double midturm;
	private double finalExam;
	
	//constructors
	public StudentMarks() {
		
	}
	public StudentMarks(String id, double quiz, double assignment, double homeWork, double midturm,
			double finalExam) {
		super();
		this.id = id;
		this.quiz = quiz;
		this.assignment = assignment;
		this.homeWork = homeWork;
		this.midturm = midturm;
		this.finalExam = finalExam;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id.trim();
	}
	public double getQuiz() {
		return quiz;
	}
	public void setQuiz(double quiz) {
		this.quiz = quiz;
	}
	public double getAssignment() {
		return assignment;
	}
	public void setAssignment(double assignment) {
		this.assignment = assignment;
	}
	public double getHomeWork() {
		return homeWork;
	}
	public void setHomeWork(double homeWork) {
		this.homeWork = homeWork;
	}
	public double getMidturm() {
		return midturm;
	}
	public void setMidturm(double midturm) {
		this.midturm = midturm;
	}
	public double getFinalExam() {
		return finalExam;
	}
	public void setFinalExam(double finalExam) {
		this.finalExam = finalExam;
	}
	
	//method for formating data
	public String getDataInFileFormate() {
		return id + "\r\n" + quiz + "\r\n" + assignment + "\r\n" + homeWork + "\r\n" + midturm + "\r\n" + finalExam;
	}
	
	//toString method
	@Override
	public String toString() {
		return "ID         : " +id+
			 "\nQuiz       : " +quiz+
			 "\nAssignment : " +assignment+
			 "\nHomework   : " +homeWork+
			 "\nMidturm    : " +midturm+
			 "\nFinal      : " +finalExam;
	}
}
