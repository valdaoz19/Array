
/**
 * Write a description of class Mahasiswa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mahasiswa 
{
   private String nama;
   int nilai;
  
   public Mahasiswa(String nama, int nilai)
   {
       this.nama = nama;
       this.nilai = nilai;
   }
   
   public void setNama(String nama)
   {
     this.nama = nama;
     
    }
    
    public void setNilai(int nilai)
   {
     this.nilai = nilai;
   }
   
   public String getNama()
   {
       return nama;
    }
    
    public int getNilai()
    {
        return nilai;
    }
    
}
