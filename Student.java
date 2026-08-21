public class Student{


    // attributes; they belong to Student OBjects only
    public String firstname = "";
    public String lastname = "";
    // public String lastname; defaults to null
    int studentID; // 0 
    double GPA; // default: 0.0
    boolean graduate; // default: false

    public static int numStudents = 0; 
    // constructor
    public Student(){ 
        firstname = "No name";
        lastname = "No Name";
        studentID = 000000;
        GPA = 0.0;
        graduate = false;
        numStudents++;

    }

    public Student(String Name, String lName, int ID, double gpa, boolean grad){
        firstname = Name;
        lastname = lName;
        studentID = ID;
        GPA = gpa;
        graduate = grad;
        numStudents++;
    }
    public Student(String firstname, String lName, int ID, double gpa ){
        this.firstname = firstname;
        lastname = lName;
        studentID = ID;
        GPA = gpa;
        numStudents++;

    }
// static - belong to class itself
// void doesn't return anything

    // setter methods
    public void setName(String firstName, String lastName){
        this.firstname = firstName;
        this.lastname = lastName;
    }



    // Overloaded setName
    public void setName(String firstName ){
        this.firstname = firstName;
        this.lastname = "Reassigned last name";
    }

    // getter methods

    public double getGPA(){
        return this.GPA;
    }

    // 4th methods 
    public void printToString(){
        System.out.println(lastname + ", " + firstname + "with student ID of" + studentID + "has a GPA of " + GPA + "and is a" + graduate + "graduate");
    }




    public static void main(String[] args)

    {

        
        Student num1 = new Student("Naman", "Raichura", 712457, 5.5);
        Student num2 = new Student("Naman", "Raichura", 712457, 5.5, false);
        Student num3 = new Student();
        num1.setName("Prachi", "Raichura");
        num1.setName("Prachi" );

        num1.printToString(); 
        // num2.printToString();
        // num3.printToString();
                    // inside this class you can access it without calling class name
        System.out.println("We have "+ numStudents + "Students enrolled");

        



        // Strings

    }
}