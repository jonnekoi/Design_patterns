public class Main {

    public static void main (String []args) {
        org company = new Department("Company");
        org employee1 = new Employee("TyönTekijä1", 2800);
        org employee2 = new Employee("TyönTekijä2", 1100);
        org department = new Department("Department");

        org department2 = new Department("Department2");

        org employee3 = new Employee("TyönTekijä3", 2400);
        org employee4 = new Employee("TyönTekijä4", 2600);

        department2.add(employee3);
        department2.add(employee4);

        department.add(employee1);
        department.add(employee2);
        company.add(department);
        company.add(department2);

        double orgSalary = company.getSalary();
        System.out.println("Salary of the company: " + orgSalary);

        StringBuilder builder = new StringBuilder();
        company.toXML(builder, 0);
        System.out.println(builder.toString());
    }
}