import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileExample(String filePath){
        try {
            File file= new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException("not");
            }
            BufferedReader br =new BufferedReader(new FileReader(file));
            String line="";
            int sum =0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng : "+sum);

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap Duong Dan File : ");
        Scanner scanner=new Scanner(System.in);
        String path = scanner.nextLine();
        
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileExample(path);
    }
}
