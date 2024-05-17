public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee(String name,int salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if(this.salary<1000.0 && this.salary>0.0){
            return 0.0;
        }
        if(this.salary>=1000.0){
            return (this.salary * 3.0) / 100.0;
        }
        else{
            return 0.0;
        }
    }
    double bonus(){
        if(this.workHours>=40.0){
           return (this.workHours - 40.0 ) * 30.0;
        }else{
            return 0.0;
        }
    }

    double raiseSalary(){
        if(this.hireYear<=2011 && this.hireYear>2001){
            return (double) (this.salary * 10.0) / 100.0;
        }if(this.hireYear>2011 && this.hireYear<=2021){
            return (double) (this.salary * 5.0) / 100.0;
        }if(this.hireYear<=2001){
            return (double) (this.salary * 15.0) / 100.0;
        }
        else {
            return 0;
        }
    }

    void print(){
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hire Year: " + this.hireYear);
        System.out.println("Tax: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Salary Raise: " + raiseSalary());
        System.out.println("Salary with bonuses and taxes: " + (this.salary + (bonus()-tax())));
        System.out.println("Total Salary: " + (this.salary + (bonus()-tax()) + raiseSalary() ));
    }

}
