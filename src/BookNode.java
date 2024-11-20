public class BookNode {

    String title;
    String book_author;
    int book_id;
    DynamicArray borrowerList;
    BookNode next;
    BookNode prev;

    public BookNode(String title, String book_author, int book_id) {
        this.title = title;
        this.book_author = book_author;
        this.book_id = book_id;
        this.borrowerList = new DynamicArray();
    }

    public void AddBorrower(String name){
        borrowerList.Add_Element(name);
    }

    public void RemoveBorrower(String name){
        borrowerList.remove_element(name);
    }
}
