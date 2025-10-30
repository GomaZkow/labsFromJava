import com.laba7.utils.KakNazaviuteTakiPopluete;

public class Book implements Publication, KakNazaviuteTakiPopluete{
    private String name;
    private String author;
    private int pageCount;
    private Boolean plivu;
    public Book(String name, String author, int pageCount) {
        this.name = name;
        this.author = author;
        this.pageCount = pageCount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public  Boolean plit() {
        return plivu;
    }
   

    public void printInfo() {
        System.out.println(name + author);
    }

    @Override
    public void displayInfo() {
        System.out.println(name + author + pageCount);
    }

}
