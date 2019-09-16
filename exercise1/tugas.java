import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugas{


public static void main(String[] args) throws IOException {


BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      
System.out.print("Masukkan Jumlah Data : " );
String jumlahInput = reader.readLine();
int data = Integer.parseInt(jumlahInput);
String [] name = new String[data] ;
String [] umur = new String[data] ;


int numb = 1 ;
for(int i=0; i<data; i++){

    System.out.println("Masukkan Data ke-" +numb++);
    System.out.print("Nama : ");
    name[i] = reader.readLine();

    System.out.print("Umur : ");
    umur[i] = reader.readLine();
    

}
System.out.println("==============");
System.out.println("||Nama||Umur||");
System.out.println("==============");
for(int x=0, y=0;  x < name.length && y<umur.length; x++ , y++){

System.out.println("||"+name[x]+"||"+umur[y]+"||");
System.out.println("==============");
}
    

}
}

