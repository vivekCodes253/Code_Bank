import java.io.*;
import java.util.Scanner;

class fileopsj{

    /*Function Name : sop
    Purpose         : Simplifies System.out.print()
    Input           : String to output
    Return          : --    */
    public static void sop(String s){System.out.print(s);}
    public static boolean READ = true, WRITE = false;

    /*Function Name : filewrite
    Purpose         : write data to file
    Input           : filepath and data
    Return          : Status of write    */
    public static String filewrite(String filepath, String data)
    {
        BufferedWriter writer;
        try{
            writer = new BufferedWriter(new FileWriter(filepath,true));
        }
        catch(FileNotFoundException ex){
            return("\nFile not found, create one or check the path!\n");
        }
        catch(Exception e){
            return(""+e);
        }

        try{           
            writer.write(data);
            writer.close();
        }
        catch(Exception e){
            return(""+e);
        }

        return "Success";
    }


    /*Function Name : filewrite [file operation]
    Purpose         : write string into file
    Input           : filepath, data string and a boolean whether to overwrite or not, not means append
    Return          : Status    */
    public static String filewrite(String filepath, String data, boolean overwrite)
    {
        File file;
        BufferedWriter writer;   
        try{
            writer = new BufferedWriter(new FileWriter(filepath,!overwrite));
        }
        catch(FileNotFoundException ex)
        {
            return("\nFile not found, create one or check the path!\n");
        }
        catch(Exception e)
        {
            return(""+e);
        }
        try{           
            writer.write(data);
            writer.close();
        }
        catch(Exception e)
        {
            return(""+e);
        }     
        return "Successfully appended!"; 
    }


    /*Function Name : fileread
    Purpose         : read data from file
    Input           : filepath
    Return          : Read message or status    */
    public static String fileread(String filepath)
    {
        File file = new File(filepath);
        String str, read_string = "";
        try{
            BufferedReader in = new BufferedReader(new FileReader(file)); 
            while ((str = in.readLine()) != null) 
            {
                read_string += str;     
            }   
        }
        catch(FileNotFoundException ex)
        {
            return("\nFile not found, create one or check the path!\n");
        }
        catch(Exception e)
        {
            return(e+"\n");
        }

        return read_string;
    }


    /*Function Name : fileoperation
    Purpose         : as an intermediate to write or read data from file
    Input           : boolean for read or write - True = read, false = write, filepath and data
    Return          : String, status or error    */
    public static String fileoperation(boolean t_read_f_write, String filepath, String data)
    {
        if(t_read_f_write == READ)
            return(fileread(filepath));
        else
            return(filewrite(filepath,data));
    }

    
    
    public static void main(String[] args)
    {
        sop(filewrite("data","hahah"));
        sop("\n"+ "Text is \n" +fileread("data"));
    }
}
