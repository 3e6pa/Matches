package matches;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Matches {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int square = in.nextInt();
        if ( square>=1 && square<=(int)Math.pow(10, 9)){
            int width = (int) Math.sqrt(square);
            int height = (int) square/width;
            int matches = width * (height+1) + height*(width+1);
            int matchesInNewLine = square - width * height;
            if (matchesInNewLine != 0.0){
                matches = matches + 2 * matchesInNewLine +1;	
            }
            System.out.println(matches);
        } 
        else
            System.out.println("out of range");
    }   
}
