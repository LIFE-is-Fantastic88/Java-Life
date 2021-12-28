import javax.swing.JOptionPane;

public class EXAMINATION {

	public static void main(String[] args) {
		String input;
		int question;
		int miss;
		input = JOptionPane.showInputDialog("Please key in the amount of question in your exam paper");
		question = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Please key in the amount of your wrong answer from exam");
		miss = Integer.parseInt(input);
		FinalExam exam = new FinalExam(question, miss);
		JOptionPane.showMessageDialog(null,
				"The mark for each question in examination is " + exam.getPointEach()
						+ "\nThe amount of question answer wrong is " + exam.getNumMissed()
						+ "\n The score you get in examination is " + exam.getScore()
						+ "\nThe grade you get in exam is " + exam.getGrade());
	}

}

class GradedActivity {
	private double score;

	void getScore(double s) {
		score = s;
	}

	double getScore() {
		return score;
	}

	char getGrade() {
		char grade;
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;
	}
}

class FinalExam extends GradedActivity {
	private int numQuestion;
	private double pointEach;
	private int numMissed;

	public FinalExam(int question, int missed) {
		this.numQuestion = question;
		this.numMissed = missed;
		double point;
		pointEach = 100.0 / question;
		point = 100.0 - (missed * pointEach);
		getScore(point);
	}

	double getPointEach() {
		return pointEach;
	}

	int getNumMissed() {
		return numMissed;
	}
}