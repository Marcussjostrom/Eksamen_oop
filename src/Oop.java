public class Oop {
    public static void main(String args[]) {
        race();
        shape3d();
        chess();
    }

    private static void race() {
        System.out.println("\nSimulated race runners:");
    }

    private static void shape3d() {
        System.out.println("\nShape3d:");
        System.out.println(new Cube(20));
        System.out.println(new Pyramid(20, 30));
        System.out.println(new Cylinder(20, 30));
        System.out.println(new Cone(20, 30));
        System.out.println(new Sphere(20));
    }




    private static void chess() {
        System.out.println("\nChess:");
    }


}
