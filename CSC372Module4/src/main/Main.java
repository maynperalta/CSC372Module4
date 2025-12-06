package main;
// import ArrayList for driver class requirements
import java.util.ArrayList;

public class Main {
// Sphere class	
	public static class Sphere extends Shape {
		private double radius;
// Parameterized constructor		
		public Sphere(double radius) {
			this.radius = radius;
		}
// Surface area		
		@Override
		public double surface_area() {
			return 4 * Math.PI * Math.pow(radius, 2);
		}
// Volume		
		@Override
		public double volume() {
			return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		}
// toString method	
		@Override
		public String toString() {
			return "Sphere: \n" + 
					"Radius: "+ radius + "\n" + 
					"Surface Area: " + String.format("%.2f", surface_area()) + "\n" + 
					"Volume: " + String.format("%.2f", volume()) + "\n";
		}
	}
// Cylinder class	
	public static class Cylinder extends Shape {
		private double radius;
		private double height;
		
		public Cylinder(double radius, double height) {
			this.radius = radius;
			this.height = height;
		}
		@Override
		public double surface_area() {
			return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
		}
		@Override
		public double volume() {
			return (Math.PI * Math.pow(radius, 2) * height);
		}
		@Override
		public String toString() {
			return "Cylinder: \n" + 
					"Radius: " + radius + "\n" + 
					"Height: " + height + "\n" +
					"Surface Area: " + String.format("%.2f", surface_area()) + "\n" + 
					"Volume: " + String.format("%.2f", volume()) + "\n";
		}
	}
// Cone class
	public static class Cone extends Shape {
		private double radius;
		private double height;
		
		public Cone(double radius, double height) {
			this.radius = radius;
			this.height = height;
		}	
		@Override
		public double surface_area() {
			return Math.PI * radius * (radius + Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));
		}
		@Override
		public double volume() {
			return Math.PI * Math.pow(radius, 2) * (height / 3);
		}
		@Override
		public String toString() {
			return "Cone: \n" + 
					"Radius: " + radius + "\n" + 
					"Height: " + height + "\n" +
					"Surface Area: " + String.format("%.2f", surface_area()) + "\n" + 
					"Volume: " + String.format("%.2f", volume()) + "\n";
		}
	}
// Driver class to instantiate each shape and save to array	
	public static class ShapeArray {
		public static void main(String[] args) {
			
			ArrayList <Shape> shapeArray = new ArrayList<>();
			
			Shape sphere = new Sphere(3.0);
			shapeArray.add(sphere);
			Shape cylinder = new Cylinder(5.5, 7.0);
			shapeArray.add(cylinder);
			Shape cone = new Cone(8.5, 4.0);
			shapeArray.add(cone);
// Loop through array and print using toString method			
			for (int i = 0; i < shapeArray.size(); i ++) {
				System.out.println(shapeArray.get(i));
			}
		}
	}
}
