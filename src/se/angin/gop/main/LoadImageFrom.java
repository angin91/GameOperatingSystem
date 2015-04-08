package se.angin.gop.main;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class LoadImageFrom {

	public static BufferedImage LoadImageFrom(Class<?> classFile, String Path) {
		URL url = classFile.getResource(Path);
		BufferedImage img = null;
		
		try{
			img = ImageIO.read(url);
		}catch(IOException e){
			e.printStackTrace();
		}
		return img;
	}
}
