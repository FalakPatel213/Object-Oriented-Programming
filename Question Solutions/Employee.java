// Create class called Employee that
// 1. Three instance variable id(type string), name(type string) and monthly salary(double).
// 2. Default constructor that initializes the three instance variables.
// 3. A setter & getter method for each instance variable
//    ex.  void setId(String id);          String getId();
// 4. displayEmployee() method for displaying employee defaults.
// Write driver class name EmployeeTest that demonstrates class Employee's capabilities. Create two Employee objects and display each object's yearly salary. Then give each Employee a 10%  raise & display each Employee's yearly salary again.

class Employee1{
    String id;
    String name;
    double Msalary;

    Employee1(){
        this.id = null;
        this.name = null;
        this.Msalary = 0;
    }

    void displayEmployee(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(Msalary);
    }

    void setId(String id){
        this.id = id;
    }
    
    String getId(){
        return id;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void setSalary(double Msalary){
        this.Msalary = Msalary;
    }

    double getSalary(){
        return Msalary;
    }

    double YearSalary(){
        return Msalary * 12;
    }

    double RaiseTen(double Msalary){
        return Msalary + (Msalary * 0.1);
    }
}

public class Employee{
    public static void main(String[] args) {
        Employee1 ob = new Employee1();
        ob.displayEmployee();
        ob.setId("Falak6434");
        ob.setName("Falak Patel");
        ob.setSalary(645453454);
        System.out.println("Id = " + ob.getId());
        System.out.println("Name = " + ob.getName());
        System.out.println("Monthly salary = " + ob.getSalary());

        Employee1 ep1 = new Employee1();
        Employee1 ep2 = new Employee1();
        ep1.setSalary(12000);
        ep2.setSalary(15000);
        System.out.println("The yearly salary of employee 1 is " + ep1.YearSalary());
        System.out.println("The yearly salary of employee 2 is " + ep2.YearSalary());

    }
}