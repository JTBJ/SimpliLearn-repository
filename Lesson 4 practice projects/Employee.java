class Employee {
    
    String firstName;
    String lastName;
    int id;
    
    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return firstName;
    }
    public int getId(){
        return id;
    }
    
    public String toString() {
        return "[Firstname: " + firstName + ", Lastname: " + lastName + ", Id: " + id + "]\n";
    }
}