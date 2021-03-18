package OopsConcepts;

interface TechOuts {
public void branch1(); 
public void branch2(); 
}


class Branches implements TechOuts{
public void branch1() {

 System.out.println("The first branch is in united states");
}
public void branch2() {

 System.out.println("The second branch is in Hyderabad");
}
}

public class Interfaces {
public static void main(String[] args) {
 Branches b1 = new Branches();  
b1.branch1();
b1.branch2();
}
}
