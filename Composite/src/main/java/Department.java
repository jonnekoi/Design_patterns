import java.util.ArrayList;
import java.util.List;

public class Department implements org {

    private String name;
    private List<org> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String getName () {
        return name;
    }

    @Override
    public void add(org component) {
        employees.add(component);
    }

    @Override
    public void remove(org component) {
        employees.remove(component);
    }

    @Override
    public double getSalary() {
        double salary = 0;
        for (org e : employees) {
            salary += e.getSalary();
        }
        return salary;
    }

    @Override
    public void toXML(StringBuilder builder, int indent) {
        for (int i = 0; i < indent; i++) builder.append("  ");
        builder.append("<Name=\"").append(name).append("\">\n");
        for (org component : employees) {
            component.toXML(builder, indent + 1);
        }
        for (int i = 0; i < indent; i++) builder.append("  ");
        builder.append("</Name>\n");
    }
}
