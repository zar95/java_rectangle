public class Test {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,3,2,2);
        Rectangle r2 = new Rectangle(6,4,3,3);

//        System.out.println(r1.toString());
//        System.out.println(r2.toString());
        System.out.printf("Area of r1 is %.2f and perimeter is %.2f\n",r1.calArea(),r1.calPerimeter());
        System.out.printf("Area of r2 is %.2f and perimeter is %.2f\n",r2.calArea(),r2.calPerimeter());
//        Rectangle maxRect = r1.GetMaxRect(r1,r2);
//        System.out.println(maxRect);
        Rectangle lap = r1.overlapCheck(r1,r2);
        System.out.println(lap);
    }
}
