package ProductDemo;

@FunctionalInterface
interface Demo {
    void disp();
}
public class LaunchAn2 {
    public static void main(String[] args) {
        Demo d=()-> {
            System.out.println("lambda");
        };
    }
}

//Assignment
// Understand all the annotations we used in the project and write an article about it.
// Component, Entity, Service, PathVariable
// Can write about spring annotations as well.

