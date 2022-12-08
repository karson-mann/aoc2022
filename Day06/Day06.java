import java.util.*;
import java.io.*;


public class Day06 {

    public static void part1(int numChars) throws IOException {
        Scanner in = new Scanner(new File("input.txt"));
        String dataStream=in.nextLine();
        outerLoop:
        for(int i=0;i<dataStream.length()-numChars-1;i++){
            String fourWeAreChecking=dataStream.substring(i,i+numChars);
            char[] chars= fourWeAreChecking.toCharArray();
            for(int p=0;p<chars.length-1;p++){
                for(int q=p+1;q<chars.length;q++){
                    if(chars[p]==chars[q]){
                        continue outerLoop;
                    }

                }
            }
            System.out.println(i+numChars);
            break;
        }

    }

    public static void part2() throws IOException {
        Scanner in = new Scanner(new File("sample.txt"));
        String dataStream=in.nextLine();
        outerLoop:
        for(int i=0;i<dataStream.length()-3;i++){
            String fourWeAreChecking=dataStream.substring(i,i+4);
            char[] chars= fourWeAreChecking.toCharArray();
            for(int p=0;p<chars.length-1;p++){
                for(int q=p+1;q<chars.length;q++){
                    if(chars[p]==chars[q]){
                        continue outerLoop;
                    }

                }
            }
            System.out.println(i+4);
            break;
        }
    }

    public static void main(String...args) {
        try {
            part1(14);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}