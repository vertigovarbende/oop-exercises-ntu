package myProjects.university.university3;

public class Test {

	public static void main(String[] args) {
		RegistrationOffice reObj = new RegistrationOffice();
		AbstractStudent studentObj = reObj.getAStudent();
		reObj.registerStudent(studentObj);
		display(studentObj);

	}

	public static void display(AbstractStudent studentObj) {
		if (studentObj instanceof PhdStudent p) {
			if (p.isQualifyingExamTaken()) {
				p.toString();
				p.study();
				p.writeThesis();
				p.writePaper();
				p.meetWithAdvisor();
			} 
		} else if (studentObj instanceof MasterStudent m) {
			m.toString();
			m.study();
			m.writeThesis();
			m.meetWithAdvisor();
		} else if (studentObj instanceof VocationalStudent v) {
			v.toString();
			v.study();
		} else if (studentObj instanceof UndergraduateStudent u) {
			u.toString();
			u.study();
		}
	}
}