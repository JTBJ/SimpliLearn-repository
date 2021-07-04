public class Node {
    
    Node next;
    Employee employee;
    
    public Node(Employee employee) {
        this.employee = employee;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public Node getNext() {
        return next;
    }
    public Employee getEmployee() {
        return employee;
    }
    
    public String toString() {
        return employee.toString();
    }
}