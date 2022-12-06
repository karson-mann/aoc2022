import java.util.*;
import java.io.*;


public class Day04 {

    public static void part1() throws IOException {
        Scanner in = new Scanner(new File("input.txt"));
        int count=0;
        while(in.hasNext()){
            String line=in.nextLine();
            String[] sections=line.split(",");
            String[] sect1=sections[0].split("-");
            String[] sect2=sections[1].split("-");

            int a = Integer.parseInt(sect1[0]);
            int b = Integer.parseInt(sect1[1]);
            int c = Integer.parseInt(sect2[0]);
            int d = Integer.parseInt(sect2[1]);
            if(c<=a&&b<=d||a<=c&&d<=b){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void part2() throws IOException {
        Scanner in = new Scanner(new File("sampleInput.txt"));
        int count=0;
        while(in.hasNext()){
            String line=in.nextLine();
            String[] sections=line.split(",");
            String[] sect1=sections[0].split("-");
            String[] sect2=sections[1].split("-");

            int a = Integer.parseInt(sect1[0]);
            int b = Integer.parseInt(sect1[1]);
            int c = Integer.parseInt(sect2[0]);
            int d = Integer.parseInt(sect2[1]);
            if(c<=a&&b<=d||a<=c&&d<=b){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String...args) {
        try {
            part1();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}