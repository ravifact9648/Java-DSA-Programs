public class ObjectCreation {
    public static void main(String args[])
    {
        Object o=new Object();
        System.out.println("O object created at addr "+o.hashCode());
    }
}
class Object {
    Object(){
        System.out.println("Object class constructor called");
    }
}
