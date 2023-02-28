import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static Vector<Graph> CunChu(File SLine)
    {
        Vector<Graph> g1=new Vector<Graph>(0);
        Scanner scan;
        try {
            scan=new Scanner(SLine);
        } catch (Exception e) {
            System.out.println("文件为空!!");
            return g1;
        }
        while( scan.hasNextLine() )
        {
            Scanner scanLine=new Scanner(scan.nextLine());
            String type=scanLine.next();
            String name=scanLine.next();
            //System.out.println(type+name);
            if(type.compareTo("Circular")==0){
                Circular cir=new Circular(type,name, scanLine.nextInt(),scanLine.nextInt(),scanLine.nextFloat(),scanLine.nextFloat());
                g1.add(cir);
                System.out.println(type+name);
            }
            else if(type.compareTo("Rectangle")==0)
            {
                int[] list1=new int[4];
                for(int i=0;i<=3;i++)
                {
                    list1[i]= scanLine.nextInt();
                }
                float alpha= scanLine.nextFloat();
                Rectangle rec=new Rectangle(type,name,list1[0],list1[1],list1[2],list1[3],alpha);
                g1.add(rec);
            }
            else if(type.compareTo("Triangle")==0)
            {
                int[] list=new int[6];
                for(int i=0 ;i<=5;i++)
                {
                    list[i]=scanLine.nextInt();
                }
                float alpha= scanLine.nextFloat();
                Triangle tri=new Triangle(type,name,list[0],list[1],list[2],list[3],list[4],list[5],alpha);
                        g1.add(tri);

            }

        }
        return g1;
    }

    public static void main(String[] args) {

        File scanFile=new File("D:/Java ZiYuan/123.txt");
        Vector<Graph> g1=CunChu(scanFile);
        System.out.println(g1.size());
        float[] area1=new float[g1.size()];
       // g1= Main.CunChu(scanFile);

        for(int i=0;i<g1.size();i++)
        {
            area1[i]=g1.get(i).area();
            System.out.println(area1[i]);
        }


    }

}