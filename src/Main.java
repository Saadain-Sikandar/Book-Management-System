//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Double_circular_LInkList l1 = new Double_circular_LInkList();
        l1.Add_book("Hobbit","John Ronald",1001);
        l1.Add_book("Charlie","Sir bob", 1002);
        l1.Add_book("Horror", "Alice",1003);
        l1.Add_book("World", "John",1004);

        l1.AddBorrower(1003,"Ali");
        l1.AddBorrower(1003,"Saadain");
        l1.AddBorrower(1004,"Malik");

        l1.RemoveBorrower(1004,"Malik");
        l1.listBorrower(1003);


        l1.listAllBooks();


    }
}