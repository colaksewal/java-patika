public class Student {

    String name;
    String stuNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes , Course course1 , Course course2 , Course course3){
        this.name = name ;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote( int note1 , int note2, int note3){

        if(note1 >= 0 && note1 <= 100) { this.course1.perfNote = note1; }
        if(note2 >= 0 && note2 <= 100) { this.course2.perfNote = note2; }
        if(note3 >= 0 && note3 <= 100) { this.course3.perfNote = note3; }

    }

    void addBulkPerfNote( int note1 , int note2 , int note3 ){
        if(note1 >= 0 && note1 <= 100) { this.course1.note = note1; }
        if(note2 >= 0 && note2 <= 100) { this.course2.note = note2; }
        if(note3 >= 0 && note3 <= 100) { this.course3.note = note3; }
    }

    void isPass(){
        this.average = ((this.course1.note * 0.60 + this.course1.perfNote * 0.40 ) + (this.course2.note * 0.80 + this.course2.perfNote * 0.20 ) + (this.course3.note * 0.70 + this.course3.perfNote * 0.30 ) ) / 3.0 ;

        if(this.average >= 60){
            System.out.println("Congratulations, you passed the class !");
            this.isPass =true ;
        }else{
            System.out.println("Unfortunately, you failed the class !");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){
        System.out.println(this.course1.name + " Note: " + this.course1.note);
        System.out.println(this.course2.name + " Note: " + this.course2.note);
        System.out.println(this.course3.name + " Note: " + this.course3.note);
        System.out.println("---------------------");
        System.out.println(this.course1.name + " Note: " + this.course1.perfNote);
        System.out.println(this.course2.name + " Note: " + this.course2.perfNote);
        System.out.println(this.course3.name + " Note: " + this.course3.perfNote);
        System.out.println("Average:\t" + this.average);
        System.out.println("=====================================================");
    }






}
