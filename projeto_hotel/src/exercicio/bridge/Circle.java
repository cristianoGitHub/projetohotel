package exercicio.bridge;

public class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Desenhei um c�rculo!");
	}	
		
	@Override
	public String toString() {
		return "c�rculo";
		
		
	}

}
