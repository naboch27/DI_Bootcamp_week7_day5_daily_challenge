public class Main {
    
    public static void main(String[] args) {
        
         //Test with Passay Library
         System.out.println(new PasswordGenerator().generatePasswordWithPassyLibrary());

         //Test with Apache Common Text Library
         System.out.println(new PasswordGenerator().generatePasswordWithApachCommonTextLibrary());
    }
}
