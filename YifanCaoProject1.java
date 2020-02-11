import java.io.*;
import java.util.ArrayList;



public class YifanCaoProject1{
    public    static    void    main(String[]    args)    {
        System.out.print("This function can average the ten test you took.");
        try    {
        String    inputfile    = "ycao.txt";
        BufferedReader br    =    new    BufferedReader(new    FileReader(inputfile));

        String  line    =    null;
        int i=0;
        ArrayList<String> list = new ArrayList<String>();
        for(i = 0 ; i < args.length ; i++) {
        list.add(args[i]);
        }

        int count=0;
        double    ave    =    0;
        while    ((line    =    br.readLine())    !=    null)    {


        ave    +=    Double.valueOf(line);

        count++;
        }
        ave /= count;


        br.close();

        String    outputfile    = "ycao.txt";
        PrintWriter pw    =    new    PrintWriter(new    FileWriter(outputfile));
        pw.println(ave);
        pw.close();
        }
        catch(    IOException    e    )    {
        System.out.println("No File");
        }
        }
        }


























/*
public class YifanCaoProject1 {
    public static void main(String[] args) {
        String fileName = "ycao.txt";
        String line = null;
        var reader = new Scanner(System.in);
        System.out.print("What is your name?");
        var name = reader.nextLine();

        try {
            File file = new File("ycao.txt");
            if (!file.exists()) {
                System.out.print("ファイルが存在しません");
                return;
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(filereader);
            String data;
            while ((data = bufferedReader.readline()) != null);
            System.out.println(data);
            }
            bufferReader.close();
        } catch (IOException e){
        e.printStackTrace();

        }
    }*/