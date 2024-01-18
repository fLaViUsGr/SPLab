package ro.uvt.info.splab.Services.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.*;
import ro.uvt.info.splab.AllBooksSubject;
import ro.uvt.info.splab.SseObserver;

@RequestMapping("/books-sse")
public class BooksSseController {

    private final AllBooksSubject allBooksSubject;

    @Autowired
    public BooksSseController(AllBooksSubject allBooksSubject) {
        this.allBooksSubject = allBooksSubject;
    }

    @RequestMapping
    public ResponseBodyEmitter getBooksSse() {
        final SseEmitter emitter = new SseEmitter(0L);
        allBooksSubject.attach(new SseObserver(emitter));
        return emitter;
    }
}
