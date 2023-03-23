public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mahmut Hoca" , "HS","1678");
        Teacher teacher2 = new Teacher("graham bell" , "PHY", "0000");
        Teacher teacher3 = new Teacher("Funda", "BY", "4568");

        Course history = new Course("History", "101", "HS");
        history.addTeacher(teacher1);

        Course physics = new Course("Physic" , "102" , "PHY");
        physics.addTeacher(teacher2);

        Course biology = new Course ("Biology", "103", "BY");
        biology.addTeacher(teacher3);

        System.out.println("The effect of performance grade history lecture: 60% \t The effect of exam grade history lecture: 40%");
        System.out.println("The effect of performance grade physic lecture: 80% \t The effect of exam grade physic lecture: 20%");
        System.out.println("The effect of performance grade biology lecture: 70% \t The effect of exam grade biology lecture: 30%");

        Student student1 = new Student("Şaban", "123","2",history, physics, biology);
        student1.addBulkExamNote(100 , 100 , 100);
        student1.addBulkPerfNote(100 , 100 , 100);
        student1.isPass();

        Student student2 = new Student("Necmi", "456" , "2", history , physics , biology);
        student2.addBulkExamNote(100, 40 , 20 );
        student2.addBulkPerfNote(20 , 60 , 40 );
        student2.isPass();

    }
}