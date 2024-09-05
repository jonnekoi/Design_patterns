public class Employee implements org {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void add(org component) {
    }

    @Override
    public void remove(org component) {
    }

    @Override
    public void toXML(StringBuilder builder, int indent) {
        for (int i = 0; i < indent; i++) builder.append("  ");
        builder.append("<Employee name=\"").append(name).append("\" salary=\"").append(salary).append("\"/>\n");
    }
}
