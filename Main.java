 public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		Scanner s1=new Scanner(System.in);
		int id=s1.nextInt();
		String fullname=s1.next();
		String birthDate=s1.next();
		double avgMark=s1.nextDouble();
		Student s1=new Student( id, fullname, birthDate, avgMark );
	}

}
