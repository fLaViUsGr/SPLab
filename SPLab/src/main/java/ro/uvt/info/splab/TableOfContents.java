package ro.uvt.info.splab;

import java.util.ArrayList;
import java.util.List;
public class TableOfContents implements TextElement {
    private List<TextElement> entries = new ArrayList<>();

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