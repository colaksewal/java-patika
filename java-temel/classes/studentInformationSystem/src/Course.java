public class Course {
    String name ;
    String code ;
    String prefix ;
    Teacher teacher;
    int note;
    int perfNote;


    Course(String name, String code, String prefix ){
        this.name= name ;
        this.code = code;
        this.prefix = prefix;

    }

    public void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
           this.teacher = teacher;
        }
        else{
            System.out.println("!!!teacher and course parts do not match!!!");
        }
    }

    void printTeacher(){
        this.teacher.print();
    }
}
