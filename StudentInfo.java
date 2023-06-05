//Question 1
public class StudentInfo {
public static void main(String[] args) {
  String name;
  String urollno;
  String course;
  int sem;
  name=args[0];
  urollno=args[1];
  course=args[2];
  sem=Integer.parseInt(args[3]);
  System.out.println("Name: "+name);
  System.out.println("UnversityRollno: "+urollno);
  System.out.println("Course: "+course);
  System.out.println("Semester: "+sem);
 }
}
// Output 
// Name:SK 
// UnversityRollno:2020123 
// Course:B.Tech(CSE)S 
// emester:4
