public class BasicPrinter implements Printable, Scanable, Faxable {
    public void print(String text){ 
        System.out.println("Print: "+text); 
    }
    
    public void scan(String dstPath){ 
        System.out.println("Scan to: "+dstPath); 
    }
       
    public void fax(String number){ 
        System.out.println("Faxing to: "+number); 
    }
}
