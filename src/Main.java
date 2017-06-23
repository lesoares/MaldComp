
import java.io.FileReader;
import java.nio.file.Paths;

public class Main {
    public static void main(String []args){
        String rootPath = Paths.get("").toAbsolutePath().toString();
        String subPath = "\\src\\test\\";

        String sourcecode = rootPath + subPath + "exemplo1";
        
        try {
            Parser p = new Parser(new Lexer(new FileReader(sourcecode)));
            
            Object result = p.parse().value;
            
            
            
            
            
            System.out.println("Scanner e parser realizados com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
