import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List;
/**
 * Write a description of class Collage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Collage
{
    public static void main (String[] args){
        Picture collage = new Picture(1000,6000);
        Picture messi1 = new Picture("messi.jpg");
        Picture messi2 = new Picture("messi.jpg");
        Picture messi3 = new Picture("messi.jpg");
        Picture messi4 = new Picture("messi.jpg");

        messi2.mirrorVerticalRightToLeft();
        messi3.greyscale();
        messi4.keepOnlyBlue();
        // source image
        collage.cropAndCopy(messi1,0,300,0,900,0,0);
        collage.cropAndCopy(messi2,0,300,0,900,0,901);
        collage.cropAndCopy(messi3,0,300,0,900,301,0);
        collage.cropAndCopy(messi4,0,300,0,900,301,901);
        
        collage.explore();
        collage.write("C:\\Users\\gokxl\\Media computation project-copy\\images\\CollageImage.jpg");
    }

}
