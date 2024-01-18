package ro.uvt.info.splab.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
@Component
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ClientComponent {
    private TransientComponent tc;
    private SingletonComponent sc;
    public ClientComponent() {
        System.out.println("ClientComponent::ClientComponent = " + this);
    }

    @Autowired
    public void setTransientComponent(TransientComponent tc) {
        this.tc = tc;
    }

    @Autowired
    public void setSingletonComponent(SingletonComponent sc) {
        this.sc = sc;
    }

    public void operation() {
        System.out.println("Invoked ClientComponent::operation() on " + this);
        System.out.println(" o SingletonComponent = " + sc);
        System.out.println(" o TransientComponent = " + tc);
    }
}