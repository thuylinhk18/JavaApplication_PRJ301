package sample.mvc;

public class testDB {

    public static void main(String[] args) {
        CartBean ls=new CartBean();
        BookDTO b=new BookDTO("abx");
        for (int i = 0; i < 3; i++) {
           ls.addBook(b);
        }
        System.out.println(((BookDTO)ls.get("abx")).getQuantity());
    }
    
}
