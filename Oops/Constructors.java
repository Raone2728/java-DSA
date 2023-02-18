public class Constructors {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="rahul";
        s1.marks[0]=90;
        s1.marks[1]=30;
        s1.marks[2]=40;

        Student s2=new Student("Aman");
        Student s3=new Student(90);
        Student s4=new Student(s1); //copy constructors
        s1.marks[0]=100;
        s1.marks[1]=200;
        for(int i=0;i<3;i++){//---------> important anychange in s1 will also reflects in s2 because of refernce
            System.out.println(s4.marks[i]);
        }

    }

}
//constructors overLoading...
class Student{
    String name;
    int rollno;
    int marks[];
    Student(){
        marks=new int[3];
        System.out.println("Non-paramaterized Constuctors");
    }
    Student(String name){ //paramaterized Consrtuctors
        marks=new int[3];
        this.name=name;
    }
    Student(int rollno){
        marks=new int[4];
        this.rollno=rollno;
    }
//    Student(Student s1){  // shallow copy constructors
//        marks=new int[3];
//        this.name=s1.name;
//        this.rollno=s1.rollno;
//        this.marks=s1.marks;
//    }
 Student(Student s1){  // Deep copy constructors important concept...
    marks=new int[3];
    this.name=s1.name;
    this.rollno=s1.rollno;
    for(int i=0;i<3;i++){
        this.marks[i]=s1.marks[i];
    }
}



}
