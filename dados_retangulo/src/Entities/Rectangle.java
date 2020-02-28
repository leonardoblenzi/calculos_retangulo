package Entities;

public class Rectangle {
	public double width;
	public double height;
	
	//método calculo da area retangulo
	public double Area() {
		return width*height;
	}
	//método calculo perimetro retangulo
	public double Perimeter() {
		return 2*(width+height);
	}
	//método calculo diagonal triangulo
	public double Diagonal() {
		return Math.sqrt(width*width + height*height);
	}
}
