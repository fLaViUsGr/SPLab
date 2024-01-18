package ro.uvt.info.splab;

public class Paragraph implements TextElement, Visitee {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
        this.alignStrategy = new AlignLeft();
    }

    @Override
    public void accept(Visitor v) {
        v.visitParagraph(this);
    }

    public void setAlignStrategy(AlignStrategy strategy) {
        this.alignStrategy = strategy;
    }

    public AlignStrategy getAlignStrategy(){
        return alignStrategy;
    }

    public String getText(){
        return text;
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
}