import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
/**
 * Write a description of class Array here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Array
{
    private static ArrayList<Integer> listInt= new ArrayList<>();
    private static int[] arrayInt= new int[1000];

  
    public Array()
    {
        // initialise instance variables
      
    }

    
    public static int[] sortArray(int[] arraySort)
    {
        Arrays.sort(arraySort);
        return arraySort;
    }
    
    public static void main (String[] args)
    {
        int i;
        listInt.add(283);
        listInt.add(157);
        listInt.add(634);
        listInt.add(766);
        listInt.add(763);
        listInt.add(896);
        listInt.add(460);
        listInt.add(726);
        listInt.add(392);
        listInt.add(182);

        arrayInt[0]= 283;
        arrayInt[1]= 157;
        arrayInt[2]= 634;
        arrayInt[3]= 766;
        arrayInt[4]= 763;
        arrayInt[5]= 896;
        arrayInt[6]= 460;
        arrayInt[7]= 726;
        arrayInt[8]= 392;
        arrayInt[9]= 182;
        
        final long startTime = System.nanoTime();
        Array sorting= new Array();
        for (int hasil : sorting.sortArray(arrayInt))
        {
          System.out.println(hasil);
        }
        final long duration = System.nanoTime()-startTime;
        System.out.println("Waktu =" +duration+"ns");
        
        final long startTime1 = System.nanoTime();
        Collections.sort(listInt);
        final long duration1 = System.nanoTime()-startTime1;
        System.out.println("Hasil ArrayList : " +listInt);
        System.out.println("Waktu = " +duration1+"ns");
        System.out.println("Hasil Sorting Array List : "+listInt);
        
        
    }
}
