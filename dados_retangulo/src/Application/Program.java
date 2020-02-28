package Application;
import java.util.Scanner;
import Entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//atribuindo a classe Rectangle
		Rectangle rectangle;
		rectangle = new Rectangle();
		
		System.out.println("Insira a largura e altura do retangulo, respectivamente: ");
		//atribuindo ao objeto rectangle a altura e largura recebida
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		//chamando o método dentro do objeto rectangle
		System.out.println("A area do retangulo é: "+ rectangle.Area());
		System.out.println("O perimetro é: " + rectangle.Perimeter());
		System.out.println("A diagonal é: " + rectangle.Diagonal());
		
		
		sc.close();
	}

}
