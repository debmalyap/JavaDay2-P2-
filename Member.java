public class Member {

    String name;
    int age;
    int salary;

    public Member(String name,int age,int salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public void display()
    {
        System.out.print("Name of the user:" +name+" "+"Age is: "+age+" "+"Salary: "+salary);
    }
}
