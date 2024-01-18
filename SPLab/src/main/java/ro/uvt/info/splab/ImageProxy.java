package ro.uvt.info.splab;

public class ImageProxy implements TextElement, Picture{
    String url;
    private Image realImage;

    public ImageProxy(String url) {
        this.url = url;
        this.realImage = null;
    }


    public void add(int index, TextElement element) {
        throw new UnsupportedOperationException("You cannot do that");
    }

    public TextElement get(int id) {
        throw new UnsupportedOperationException("You cannot do that");
    }

    public void remove(TextElement element) {
        throw new UnsupportedOperationException("You cannot do that");
    }

    @Override
    public String url() {
        throw new UnsupportedOperationException("You cannot do that");
    }

    Image loadImage(){
        if(realImage == null){
            realImage=new Image(url);
        }
        return realImage;
    }
}