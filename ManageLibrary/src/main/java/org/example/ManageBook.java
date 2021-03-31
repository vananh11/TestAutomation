package org.example;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
class ManageBook extends Managelibrary {
    private String CodeDocument;
    public String NamePublishing;
    public int DeliveryNumber;
    public String NameAuthor;
    public int NumberPage;
    List <ManageBook> book = new ArrayList <ManageBook>();
    public ManageBook() {
        super();

    }
    public ManageBook (String CodeDocument,String NamePublishing,int DeliveryNumber,String NameAuthor, int NumberPage) {
        super(CodeDocument,NamePublishing,DeliveryNumber);
        this.NameAuthor = NameAuthor;
        this.NumberPage = NumberPage;
    }

    public String getNameAuthor() {
        return NameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.NameAuthor = nameAuthor;
    }

    public int getNumberPage() {
        return NumberPage;
    }

    public void setNumberPage(int numberPage) {
        this.NumberPage = numberPage;
    }

    public void AddNew(String CodeDocument,String NamePublishing,int DeliveryNumber,String NameAuthor, int NumberPage) {
        ManageBook b = new ManageBook (CodeDocument,NamePublishing,DeliveryNumber,NameAuthor,NumberPage);
        book.add(b);
    }

    public void DeleteDocument(String CodeDocument) {
        for (int i = 0; i <book.size(); i++) {
            if (book.get(i).book.contains(getCodeDocument() == CodeDocument)) {
                book.remove(i);
            }
        }
    }
    public String Display () {
        return CodeDocument + " " + NamePublishing + " " + DeliveryNumber + " " + NameAuthor + " " + NumberPage;
    }

    public List<ManageBook> Search (String CodeDocument) {
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).book.contains(getCodeDocument() == CodeDocument)) {
                System.out.println(book.get(i));
            }
        }
        return book;
    }
}
