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


    }

    public Student(String Name, String lName, int ID, double gpa, boolean grad){
        firstname = Name;
        lastname = lName;
        studentID = ID;
        GPA = gpa;
        graduate = grad;
    }
    public Student(String firstname, String lName, int ID, double gpa ){
        this.firstname = firstname;
        lastname = lName;
        studentID = ID;
        GPA = gpa;
    }

    // 4th methods 
    public void toString(){
        System.out.println("");
    }
    public static void main(String[] args)

    {

        
        Student num1 = new Student("Naman", "Raichura", 712457, 5.5);
        Student num2 = new Student("Naman", "Raichura", 712457, 5.5, false);
        Student num3 = new Student();

        num1.toString(); 
        


    }
}