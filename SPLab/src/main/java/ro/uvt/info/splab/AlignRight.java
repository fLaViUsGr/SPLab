package ro.uvt.info.splab;

public class AlignRight implements AlignStrategy {
    public String render(String text, int lineLength) {
        int length = text.length();
        StringBuilder result = new StringBuilder();
        int start = 0;
        while (start < length) {
            int end = Math.min(start + lineLength, length);
            result.append(" ".repeat(lineLength - (end - start))).append(text, start, end).append('\n');
            start = end;
        }
        return result.toString();
    }
}