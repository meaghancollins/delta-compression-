import edu.princeton.cs.introcs.Picture;

import java.awt.*;

public class compression {
    public static void main(String[] args){
        Picture pic1 = new Picture("/Users/meag.collins/IdeaProjects/DeltaCompression/src/ pic1-comparison.png");
        pic1.show();
        Picture pic2 = new Picture("/Users/meag.collins/IdeaProjects/DeltaCompression/src/pic2- comparison.png");
        pic2.show();
        Picture three = new Picture(pic1.width(), pic2.height());
        for(int i = 0; i < pic2.width(); i++) {
            for(int j = 0; j < pic2.height(); j++) {
                 if(!pic1.get(i, j).equals(pic2.get(i, j))) {
                     three .set(i,j, Color.CYAN);
                 }
            }
        }
        three.show();

    }
}
