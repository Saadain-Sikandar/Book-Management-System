public class Double_circular_LInkList {

    BookNode head;
    BookNode tail;

    boolean isEmpty() {
        return head == null;
    }

    public void Add_book(String title, String book_author, int book_id) {

        BookNode newNode = new BookNode(title, book_author, book_id);

        if (isEmpty()) {

            head = newNode;
            tail = newNode;
            tail.next = head;
            head.prev = tail;
        } else {

            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            tail.next = head;
            head.prev = tail;
        }


    }

    public void removeBook(int BookID) {

        if (isEmpty()) {

            System.out.println("List is Empty");
        }

        boolean found = false;
        BookNode current = head;
        do {
            if (current.book_id == BookID) {
                if (current == head && current == tail) {
                    head = null;
                    tail = null;
                }
                else if (current == head) {

                    head = head.next;
                    head.prev = tail;
                    tail.next = head;
                }
                else if (current == tail) {
                    tail = tail.prev;
                    tail.next = head;
                    head.prev = tail;
                }
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                found = true;
                break;
            }
            current = current.next;
        }while (current!=head);

        if (found) {
            System.out.println("Book with iD:"+  BookID +" is Removed");
        } else {
            System.out.println("Book with ID:" + BookID + " not found!");
        }
    }

    public void AddBorrower(int book_id, String name) {

        boolean found = false;

        BookNode current = head;
        while (current.next != head){
            if (current.book_id == book_id) {
                current.AddBorrower(name);
                found = true;
                break;
            }
            current = current.next;
        }

        if (found){
            System.out.println("Borrower Added.");
        }
        else {
            System.out.println("Book not Found!");
        }
    }


    public void RemoveBorrower(int book_id, String name) {

        boolean found = false;

        BookNode current = head;

        while (current.next!= head) {

            if (current.book_id == book_id) {
                current.RemoveBorrower(name);
                found = true;
                break;
            }
            current = current.next;
        }

        if (found) {
            System.out.println("Borrower Removed");
        } else {
            System.out.println("Book not found!");
        }

    }


    void specificBookByAuthor(String author) {
        BookNode current = head;
        do {
            if (current.book_author.equals(author)) {
                System.out.println("Book: " + current.title + " By " + current.book_author);
                break;
            }
            current = current.next;
        }
        while (current != head);
    }


    void listBorrower(int bookId) {
        BookNode current = head;
        boolean found = false;
        do {
            if (current.book_id == bookId) {
                found = true;
                System.out.println("Book ID: " + current.book_id + "\n"
                        + "Book Title: " + current.title + "\n"
                        + "Book Author: " + current.book_author + "\n" + "Borrowers: \n");
                for (int i = 0; i < current.borrowerList.size; i++) {
                    System.out.println( current.borrowerList.data[i]);
                }
                break;
            }

            current = current.next;
        }
        while (current != head);
        if (!found) {
            System.out.println("The Book is not found!!");
        }


    }


    void listAllBooks(){
        BookNode temp=head;
        do{
            System.out.println("\nBook ID: "+temp.book_id+"\n"+"Book Title: "+temp.title+"\n"
                    +"Book Author: "+temp.book_author);
            temp=temp.next;
        }
        while(temp!=head);

    }



}
