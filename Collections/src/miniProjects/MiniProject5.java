package miniProjects;


import java.util.*;
import java.text.DecimalFormat;

class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Box)) return false;
        Box other = (Box) obj;
        return Double.compare(this.getVolume(), other.getVolume()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Math.round(getVolume() * 100)); 
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Length =" + length + " Width =" + width + " Height =" + height + " Volume =" + df.format(getVolume());
    }
}
public class MiniProject5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        Set<Box> boxSet = new LinkedHashSet<>();

	        System.out.println("Enter the number of Box:");
	        int n = Integer.parseInt(sc.nextLine());

	        for (int i = 1; i <= n; i++) {
	            System.out.println("Enter the Box " + i + " details");

	            System.out.print("Enter Length: ");
	            double length = Double.parseDouble(sc.nextLine());

	            System.out.print("Enter Width: ");
	            double width = Double.parseDouble(sc.nextLine());

	            System.out.print("Enter Height: ");
	            double height = Double.parseDouble(sc.nextLine());

	            Box box = new Box(length, width, height);
	            boxSet.add(box);
	        }

	        System.out.println("Unique Boxes in the Set are");
	        for (Box box : boxSet) {
	            System.out.println(box);
	        }
	        
	}

}