package ro.uvt.info.splab;

import java.util.concurrent.TimeUnit;

public class Image implements TextElement, Picture, Visitee {
    private String name;

    public Image(String name) {
        this.name = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
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
    public String url() {
        throw new UnsupportedOperationException("You cannot do that");
    }

    @Override
    public void accept(Visitor v) {
        v.visitImage(this);
    }
}