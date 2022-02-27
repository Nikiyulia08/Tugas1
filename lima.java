import java.util.ArrayList;
public class lima {
    public static void main(String[] args) {
          
    ArrayList<String> nama = new ArrayList<String>();
    nama.add("N");
    nama.add("A");
    nama.add("D");
    nama.add("A");

    //nama.remove(0);
    nama.remove(3);
    nama.remove(2);
    System.out.println("ArrayList setelah remove:");
       for(String var: nama){
             System.out.println(var);


            }

    
        
    } 
    
}
