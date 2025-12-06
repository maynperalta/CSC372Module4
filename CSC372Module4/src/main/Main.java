package main;

public class Main {
	
	public class Sphere extends Shape {
		private double radius;
		
		public Sphere(double radius) {
			this.radius = radius;
		}
		
		@Override
		public double surface_area() {
			return 4 * Math.PI * Math.pow(radius, 2);
		}
		
		@Override
		public double volume() {
			return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		}
		
		@Override
		public String toString() {
			return "Sphere: \n" + 
					"Radius: "+ radius + "\n" + 
					"Surface Area: " + String.format("%.2f", surface_area()) + "\n" + 
					"Volume: " + String.format("%.2f", volume()) + "\n";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
