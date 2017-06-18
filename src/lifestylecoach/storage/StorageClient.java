package lifestylecoach.storage;

import lifecoach.storage.webservice.Storage;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by matteo on 18/06/17.
 */
public class StorageClient {

    public final static String SERVICE_URL_STORAGE = "";
    private Storage storage;

    public StorageClient() {
        URL url = null;
        try {
            url = new URL(SERVICE_URL_STORAGE);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://webservice.storage.lifecoach/", "StorageService");
        Service service = Service.create(url, qname);
        this.storage = service.getPort(Storage.class);
    }

    public Storage getStorage() {
        return this.storage;
    }
}
