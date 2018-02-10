
import java.awt.image.BufferedImage;

import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Scanner;

import java.io.File;
import java.util.HashMap;


public class Main 
{	
    public static void main( String[] args )
    {
    	BufferedImage image = null;
        try {
          
            String name;
          Scanner in = new Scanner(System.in);
          name = in.nextLine();
          for(int i=0;i<7;i++)
          { URL url = new URL("http://192.168.1.102:1234/storage/emulated/0/WhatsApp/Media/WhatsApp%20Images/IMG-20151115-WA000"+i+".jpg");
            image = ImageIO.read(url);
        
            ImageIO.write(image, "jpg",new File("E:\\out"+i+".jpg"));
          } 
            
        } catch (IOException e) {
        }
        
        System.out.println("Done");
        JFrame frame = new JFrame();
        frame.setSize(800, 800);
        JLabel label = new JLabel(new ImageIcon(image));
        frame.add(label);
        frame.setVisible(true);

    
    
    }
}
