package visitor;

interface EmployeeVisitor {
    void visit(Clerk clerk);
    void visit(Manager manager);
    void visit(Director director);
}

interface Employee {
    void accept(EmployeeVisitor visitor);
}

class Clerk implements Employee {
    @Override
    public void accept(EmployeeVisitor visitor) {
        visitor.visit(this);
    }
    
    public void doClerkWork() {
        System.out.println("Doing clerk work");
    }
}

class Manager implements Employee {
    @Override
    public void accept(EmployeeVisitor visitor) {
        visitor.visit(this);
    }
    
    public void doManagerWork() {
        System.out.println("Doing manager work");
    }
}

class Director implements Employee {
    @Override
    public void accept(EmployeeVisitor visitor) {
        visitor.visit(this);
    }
    
    public void doDirectorWork() {
        System.out.println("Doing director work");
    }
}

class BonusVisitor implements EmployeeVisitor {
    @Override
    public void visit(Clerk clerk) {
        System.out.println("Clerk gets a bonus of 1000 dollars");
    }
    
    @Override
    public void visit(Manager manager) {
        System.out.println("Manager gets a bonus of 5000 dollars");
    }
    
    @Override
    public void visit(Director director) {
        System.out.println("Director gets a bonus of 10000 dollars");
    }
}

public class EmployeeExample {
    public static void main(String[] args) {
        Employee[] employees = { new Clerk(), new Manager(), new Director() };
        BonusVisitor visitor = new BonusVisitor();
        
        for (Employee employee : employees) {
            employee.accept(visitor);
        }
    }
}
