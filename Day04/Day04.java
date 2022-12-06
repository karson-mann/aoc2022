import java.io.*;

public class Day04
{

    static int linecount = 0;
    static int totalcount = 0;
    static int overlapcount = 0;
    static BufferedReader reader;
    public static void main(String[] args)
    {   String filename = "input.txt";
        if(args.length>0)
        filename=args[args.length-1];
        String line = "";
    
        try
        {
            BufferedReader br=new BufferedReader(new FileReader(filename));
            line = br.readLine();
            while(line != null){
                linecount++;
        
        if(processString(line)>0)
                totalcount++;
                if(processString1(line)>0)
                overlapcount++;
                    line = br.readLine();

            
        }
            br.close();
        }
        catch(Exception e){}
        System.out.println(totalcount);
        System.out.println(overlapcount);
        }

    public static int processString(String s)
    {
    
    try{
    int v1 = Integer.parseInt(s.split(",")[0].split("-")[0]);
    int v2 = Integer.parseInt(s.split(",")[0].split("-")[1]);
    int v3 = Integer.parseInt(s.split(",")[1].split("-")[0]);
    int v4 = Integer.parseInt(s.split(",")[1].split("-")[1]);
    if(isConsumed(v1, v2, v3, v4)||isConsumed(v3, v4, v1, v2))
            return 1;
    else return 0;
    }
    catch(Exception e){}
        
        return -1;
    }

    public static int processString1(String s)
    {
    
    try{
    int v1 = Integer.parseInt(s.split(",")[0].split("-")[0]);
    int v2 = Integer.parseInt(s.split(",")[0].split("-")[1]);
    int v3 = Integer.parseInt(s.split(",")[1].split("-")[0]);
    int v4 = Integer.parseInt(s.split(",")[1].split("-")[1]);
    if(isbetween(v1, v2, v3, v4)||isbetween(v3, v4, v1, v2))
            return 1;
        else return 0;
    }
    catch(Exception e){}
        
        return -1;
    }

    public static boolean isbetween(int v1, int v2, int v3, int v4)
    {
    if((v1>=v3 && v1 <=v4) || (v2>=v3 && v2 <=v4))
    return true;
    return false;
    }

    public static boolean isConsumed(int v1, int v2, int v3, int v4)
    {
        if((v2<=v4)&&(v1>=v3))
            return true;
        return false;
        }

}