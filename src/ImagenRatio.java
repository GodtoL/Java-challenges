import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class ImagenRatio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba aquí la URL de su imagen: ");
        String imageUrl = scanner.nextLine();
        try {
            URI uri = new URI(imageUrl);
            URL url = uri.toURL();
            BufferedImage image = ImageIO.read(url);
            int heightImage = image.getHeight();
            int widhtImage = image.getWidth();

            MCD mcd = new MCD();
            int mcdNumber = mcd.mcd(heightImage, widhtImage);
            int relationA = widhtImage / mcdNumber;
            int relationB = heightImage / mcdNumber;

            System.out.println("La relacion es " + relationA + ":" + relationB);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
