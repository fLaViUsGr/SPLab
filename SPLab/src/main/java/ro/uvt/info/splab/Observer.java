package ro.uvt.info.splab;

import java.io.IOException;

public interface Observer {
    void update(Book book) throws IOException;
}