import java.util.*;
/**
 * Write a description of class OOP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OOP
{
 private static List<Mahasiswa> siswa = new ArrayList<Mahasiswa>();
 private static String nama;
 private static int nilai;
 private static int[] arrayNilai;
 
 public OOP(String nama, int nilai)
 {
    this.nama = nama;
    this.nilai = nilai;
    siswa.add(new Mahasiswa(nama, nilai)); 
     
 }
 
 public static void main(String[] args)
 {
     
     Scanner scanner = new Scanner(System.in);
     String name = "";
     int i;
     for(i=0;!name.equals("q");i++)
     {
     name = scanner.nextLine();
     if(!name.equals("q"))
     {
     int grade = scanner.nextInt();
     scanner.nextLine();
     OOP oop1 = new OOP(name, grade);
     System.out.println("Jml mahasiswa: "+siswa.size());
    }
     
    }
   
  
 }
}
