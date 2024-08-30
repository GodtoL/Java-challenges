public class CalculaPoligonos {
    public static void main(String[] args){
        CalculaPoligonos polycalc = new CalculaPoligonos();

        double squareArea = polycalc.polyArea("cuadrado", 10.0 , 10.0);
        double triangleArea = polycalc.polyArea("triangulo", 5.6, 3.3);
        double rectangleArea = polycalc.polyArea("rectangulo", 2.2, 8.8);

        System.out.println("El area del cuadrado es: " + squareArea);
        System.out.println("El area del triangulo es: " + triangleArea);
        System.out.println("El area del rectangulo es: " + rectangleArea);

    }
    public double polyArea(String poly, double height_or_large, double side_or_base){
        double area = 0.0;

        switch (poly.toLowerCase()) {
            case "triangulo":
                area = (side_or_base * height_or_large) / 2;
                break;
            case "cuadrado":
                area = height_or_large * height_or_large;
                break;
            case "rectangulo":
                area = height_or_large * side_or_base;
                break;
            default:
                System.out.println("Polígono no encontrado");
        }
        return area;
    }
}
