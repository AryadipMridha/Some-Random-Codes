import java.util.*;

public class person {
    private int age; 
  
 public person(int initialAge) {
    // Add some more code to run some checks on initialAge
          this.age=initialAge;
 }
 public void amIOld() {
          if(age<=0){
              age=0;
              System.out.println("Age is not valid, setting age to 0.");
              System.out.println("You are young.");
          }
          else if(age<13){
            System.out.println("You are young.");
          }
          else if(age>=13 && age<18){
              System.out.println("You are a teenager.");
          }
          else{
        System.out.println("You are old.");
          }
 }
 public void yearPasses()
 {
    // Increment this person's age.
        age=age+1;
 }
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in); // reader
  int T = sc.nextInt();
  for (int i = 0; i < T; i++) {
   int age = sc.nextInt();
   person p = new person(age);
   p.amIOld();
   for (int j = 0; j < 3; j++) {
    p.yearPasses();
   }
   p.amIOld();
   System.out.println();
        }
  sc.close();
    }
}
