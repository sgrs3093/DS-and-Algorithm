package interviewQuestions;

//Abstract class and inner class example
public class Test3
{

    //Abstract class example
    //When a class doesn't declare any constructor, the compiler creates a default constructor for us.
    //This is also true for abstract classes. Even when there's no explicit constructor,
    // the abstract class will have a default constructor available.

    /*public abstract class AbstractClass
    {
        // compiler creates a default constructor
    }

    public class ConcreteClass extends AbstractClass
    {

        public ConcreteClass ()
        {
            super();
        }
    }*/

    public abstract class AbstractClass
    {
        public AbstractClass ()
        {
            System.out.println("Initializing AbstractClass");
        }
    }

    public class ConcreteClassA extends AbstractClass
    {
    }

    public class ConcreteClassB extends AbstractClass
    {
        public ConcreteClassB ()
        {
            System.out.println("Initializing ConcreteClassB");
        }
    }

    public static void main (String[] args)
    {
        Test3 t = new Test3();
        Test3.ConcreteClassB b = t.new ConcreteClassB();
        Test3.ConcreteClassA a = t.new ConcreteClassA();
    }
}
