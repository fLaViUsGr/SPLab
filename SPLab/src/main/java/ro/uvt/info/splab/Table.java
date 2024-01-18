package ro.uvt.info.splab;

public class Table implements TextElement, Visitee {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void add(int index, TextElement element) {
        throw new UnsupportedOperationException("You cannot do that");
    }

    public TextElement get(int index) {
        throw new UnsupportedOperationException("You cannot do that");
    }

    public void remove(TextElement element) {
        throw new UnsupportedOperationException("You cannot do that");
    }

    @Override
    public void accept(Visitor v) {
        v.visitTable(this);
    }
}