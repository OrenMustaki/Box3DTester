public class MyTester {

	public static void main(String[] args) {
        Point3D p1 = new Point3D(1, 0, 0);
        Box3D b1 = new Box3D(p1, 1, 1, 1);
        Box3D b2 = b1.move(99, 20, 0);
        Box3D b3 = b1.move(96, 72, 0);
        Box3D b4 = b1.move(92, 69, 0);
        
        System.out.printf("distance : ");
        if(b1.distance(b2) != 101)
        	System.out.printf("%s instead of 101\n", b1.distance(b2));
        else
        	System.out.println("Success");
        
        System.out.printf("distance : ");
        if(b1.distance(b3) != 120)
        	System.out.printf("%s instead of 120\n", b1.distance(b3));
        else
        	System.out.println("Success");
        
        System.out.printf("distance : ");
        if(b1.distance(b4) != 115)
        	System.out.printf("%s instead of 115\n", b1.distance(b4));
        else
        	System.out.println("Success");

        b2.setLength(3);
        b2.setWidth(3);
        b2.setHeight(3);
        
        System.out.printf("isAbove : ");
        b1 = b1.move(0, 0, 3);
        if (b1.isAbove(b2))
        	System.out.printf("isAbove : b1 is not above b2\n", b1.isAbove(b2));
        else
        	System.out.println("Success");
        
        System.out.printf("isAbove : ");
        b1 = b1.move(0, 0, 1);
        if (! b1.isAbove(b2))
        	System.out.printf("isAbove : b1 is above b2\n", b1.isAbove(b2));
        else
        	System.out.println("Success");
        
        System.out.printf("contains : ");
        if (! b2.contains(b1))
        	System.out.printf("contains : b2 should contain b1 %s\n", b2.contains(b1));
        else
        	System.out.println("Success");
        
        b2.setLength(1);
        b2.setWidth(1);
        b2.setHeight(1);
        
        System.out.printf("contains : ");
        if (b2.contains(b1))
        	System.out.printf("contains : b2 should not contain b1\n", b2.contains(b1));
        else
        	System.out.println("Success");
