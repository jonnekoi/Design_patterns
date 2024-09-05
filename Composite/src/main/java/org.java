interface org {
    String getName();
    double getSalary();
    void add(org component);
    void remove(org component);
    void toXML(StringBuilder builder, int indent);
}