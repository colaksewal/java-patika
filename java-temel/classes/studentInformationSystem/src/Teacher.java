public class Teacher {
    String name;
    String mpno;

    String branch ;

    Teacher(String name, String branch , String mpno){
        this.name = name;
        this.branch = branch;
        this.mpno = mpno ;
    }

    void print(){
        System.out.println("Name: " + this.name);
        System.out.println("Telephone: " + this.mpno);
        System.out.println("Branch: " + this.branch);
    }

}
