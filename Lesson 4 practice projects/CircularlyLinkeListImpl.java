public class CircularlyLinkeListImpl {
    
    Node head;
    Node tail;
    Employee employee;

    public void addNode (Employee employee) {
        
        Node new_node = new Node(employee);
        Node current = head;
 
        if (current == null) {
            new_node.next = new_node;
            head = new_node;
        }
 
        else if (current.getEmployee().getId() >= new_node.getEmployee().getId()) {
 
            while (current.next != head)
                current = current.next;
                current.next = new_node;
                new_node.next = head;
                head = new_node;
        }else {
            while (current.next != head && current.next.getEmployee().getId() < new_node.getEmployee().getId())
                current = current.next;
                new_node.next = current.next;
                current.next = new_node;
        }
    }
    
    public void printNode(Main main) throws InterruptedException {
        Node current = head;  
        if(head == null) {  
            String message = "List is empty";
            main.printMessage(message);
        }  
        else {  
            String message = "Nodes of the circular linked list sorted by Id:\n\n";
            main.printMessage(message);
             do{  
                String message2 = current.toString();
                main.printMessage(message2);
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }

    public void createObject(Main main) throws InterruptedException {
        
        String message = "Creating Employee objects to store in Circular implementation of the LinkedList\n\n";
        main.printMessage(message);
        
        Employee adam = new Employee("Adam", "Casanova", 1213);
        Employee marie = new Employee("Marie", "Kawasaki", 1011);
        Employee james = new Employee("James", "Benton", 123);
        Employee susan = new Employee("Susan", "Masiano", 789);
        Employee jessica = new Employee("Jessica", "Ray", 456);
        
        addNode(james);
        addNode(jessica);
        addNode(susan);
        addNode(marie);
        addNode(adam);
        main.setHasPassedOnce(true);
    }
}






