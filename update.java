import java.util.Scanner;

class update
{
    public static void sop(String s){System.out.print(s);}

    public static void test(){}

    public static void main(String[] args)
    {
        try{
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("git push");
        }
        catch(Exception e)
        {
            sop(""+e);
        }
    }
}