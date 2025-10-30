
public class Magazin implements Publication {
    private String name;
    private String author;
    private int countExemplar;

    public Magazin(String name, String author, int countExemplar) {
	this.name = name;
	this.author = author;
	this.countExemplar = countExemplar;
    }

    @Override
    public String getName() {
	return name;
    }

    @Override
    public String getAuthor() {
	return author;
    }

    @Override
    public void displayInfo() {
	System.out.println(name + author + countExemplar);
    }


}
