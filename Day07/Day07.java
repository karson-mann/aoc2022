import java.util.*;
import java.io.*;


public class Day07 {

    public static class Directory{
        private String name;
        private Directory parent;
        private Map<String, Integer> contents;
        private Set<Directory>subDirecetories;
        public Directory(String name, Directory parent){
            this.name=name;
            contents=new Map<String, Integer>();
            subDirecetories= new HashSet<Directory>();
        }
        
        public void addContent(String content){
            String[] stuff=content.split(" ");
            contents.put(stuff[1],Integer.parseInt(stuff[0]));
        }
        public Directory addSub(String sub, Directory parent){
            
            String dirName=sub.split(" ")[1];
            for(Directory d:subDirecetories){
                if(d.name.equals(dirName)){
                   return d;
                }
            }
            
                Directory newDir=new Directory(dirName, parent)
                subDirecetories.add(newDir);
                return newDir;
            

        }
        public String toString(){
            String result=name;
            result+=": "+contents+" "+subDirecetories;
            return result;
        }
    }

    public static void part1() throws IOException {

        Directory current=new Directory("/", null);
            
        Scanner in = new Scanner(new File(""));
        
        while(in.hasNext()) {
            String line=in.nextLine();
            
            if(line.substring(0,1).equals("$")){
                if(line.substring(2,3).equals("c")){
                    String dir=line.substring(5);
                    current=current.addSub(dir,current);

                }else{
                    while(in.hasNext()) {
                        line=in.nextLine();
                        if(line.substring(0,1).equals("$")){

                        }
                    }
                }



            }else{

            }
        }
    }

    public static void part2() throws IOException {

    }

    public static void main(String...args) {
        try {
            part1();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}