public interface InterfaceDemo {
    public Object interfaceDemoMethod(InterfaceDemo object);
    
    public void dimondMethod() throws InterruptedException;
}

abstract class AbstractClass {
    public abstract String abstractMethod(String ac);
    
    public abstract void dimondMethod() throws InterruptedException;
}

class Class4 extends AbstractClass implements InterfaceDemo {
    
    private String currentClassName;
    private String callMethodName = "interfaceDemoMethod";
    private String callMethodParameter = "InterfaceDemo";
    private String superClass = "interface InterfaceDemo";
    
    public Class4(){}
    
    public Class4(String currentClassName) {
        this.currentClassName = currentClassName;
    }
    
    @Override
    public String abstractMethod(String ac) {
        return "Abstract Method implementation in concrete class 4, called via class " + ac + "\n";
    }
    
    @Override
    public Object interfaceDemoMethod(InterfaceDemo object) {
        return object;
    }
    
    @Override
    public void dimondMethod() throws InterruptedException {
        String message = "This method is declared in both the abstract class and interface. It was\n" +
                         "implemented in the class Class4.\n\n";
        new Main().printMessage(message);
    }
    
    public String toString() {
        return "[Current Class Name: " + currentClassName + "\nCall Method Name: " + callMethodName + "\nCall Method Parameter: " + callMethodParameter + "\nSuper Class: " + superClass + "]";
    }
}

class Class3 extends Class4{
    
    public Class3(){}
    
    public Class3(String currentClassName) {
        super(currentClassName);
    }
}

class Class2 extends Class3{
    
    public Class2(){}
       
    public Class2(String currentClassName) {
        super(currentClassName);
    }
}

class Class1 extends Class2{
    
    public Class1(){}
     
    public Class1(String currentClassName) {
        super(currentClassName);
    }
}

class Main2{
    
    Class1 c1 = new Class1("Class1");
    Class2 c2 = new Class2("Class2");
    Class3 c3 = new Class3("Class3");
    Class4 c4 = new Class4("Class4");
    
    String string1 = c1.toString();
    String string2 = c2.toString();
    String string3 = c3.toString();
    String string4 = c4.toString();
    String str1;
    
    public String whichClass(AbstractClass ac) {
        if (ac instanceof Class1) {
            return "Class1";
        }else if (ac instanceof Class2) {
            return "Class2";
        }else if (ac instanceof Class3) {
            return "Class3";
        }else if (ac instanceof Class4) {
            return "Class4";
        }else{
            return "";
        }
    }
    
    public void pickAnInstance() throws InterruptedException {
        Main main = new Main();
	    String message = "This program includes inheritance, encapsulation, abstraction and polymorphism.\n" +
	                     "There's an interface and abstract class.\n" +
	                     "One class inherits the abstract class and interface, implementing their abstract methods.\n" +
	                     "Three other classes are chained one to the other, forming a multi level inheritance hierarchy,\n" +
	                     "up to this class.\n\n" +
	                     "The below scetch represents the program hierarchy.\n\n" +
	                     
                        "                           Class Hierarchy\n" +
                        "\n" +
                        "         AbstractClass                      InterfaceDemo\n" +
                        "               |                                   |\n" +
                        "               |___________________________________|\n" +
                        "                                   |\n" +
                        "                                   |\n" +
                        "                                Class4\n" +
                        "                                   |\n" +
                        "                                   |\n" +
                        "                                Class3\n" +
                        "                                   |\n" +
                        "                                   |\n" +
                        "                                Class2\n" +
                        "                                   |\n" +
                        "                                   |\n" +
                        "                                Class1\n\n\n\n" +
                        "All method implementations are detailed in Class4, therefore, the 4 pillars of OOP are displayed\n" +
                        "utilizing Class4. This phase of the application won't ask for user input.\n" +
                        "The following are print outs that represent polymorphism, inheritance, abstraction and encapsulation.\n\n";
        main.printMessage(message);
    
        String[] stringArray = {string1, string2, string3, string4};
        for(int i = 0; i < stringArray.length; i++) {
            main.printMessage(stringArray[i]);
            System.out.println("\n");
        }
        
        AbstractClass[] stringArray2 = {c1, c2, c3, c4};
        for (int i = 0; i < stringArray2.length; i++) {
            str1 = stringArray2[i].abstractMethod(new Main2().whichClass(stringArray2[i]));
            main.printMessage(str1);
        }
    }
	public static void main(String[] args) throws InterruptedException {
	    new Main2().pickAnInstance();
	}
}
