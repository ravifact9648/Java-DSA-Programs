public class ObjectCompare {
    public static void main(String[] args) {
        Object o = new Object();
        Object o1 = new Object();
        o1 = o;
        System.out.println("o object hashcode " + o.hashCode());
        System.out.println("o1 object hashcode " + o1.hashCode());
    }
}

class Object {
    Object() {
        System.out.println("Object class constructor called");
    }
}
