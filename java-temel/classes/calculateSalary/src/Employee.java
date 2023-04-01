public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours , int hireYear){
        this.name = name ;
        this.salary= salary;
        this.workHours = workHours ;
        this.hireYear = hireYear ;
    }

    double  tax(){
        if(salary < 1000)
            return 0;
        else
            return salary* 0.03;

    }

    double bonus(){
        if(workHours > 40)
            return (this.workHours-40) * 30 ;

        return 0;
    }

    double raiseSalary(){
        int currentYear = 2021;
        if(currentYear- hireYear < 10)
            return this.salary * 0.05;
        else if( currentYear- hireYear < 20)
            return this.salary * 0.10;
        else
            return this.salary * 0.15;
    }


    public String toString (){
        System.out.println("Name and Surname: " + this.name);
        System.out.println("Salary : " + this.salary );
        System.out.println("Working hour " +this.workHours );
        System.out.println("Hire year : " + this.hireYear);
        System.out.println("TAx: " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Increase salary : "+ raiseSalary());
        System.out.println("Salary with tax and bonus: " + (this.salary+bonus()-tax()));
        System.out.println("Total Salary= " + (this.salary+bonus()-tax()+raiseSalary()));
        return null;
    }



}
