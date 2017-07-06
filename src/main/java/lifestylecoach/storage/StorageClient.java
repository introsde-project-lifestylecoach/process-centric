package lifestylecoach.storage;

import ws.storage.Storage;
import ws.storage.StorageService;

/**
 * Created by matteo on 18/06/17.
 */
public class StorageClient {

    //public final static String SERVICE_URL_STORAGE = "http://localhost:6902/ws/storage?wsdl";
    public final static String SERVICE_URL_STORAGE = "https://introsde-lifecoach-storage.herokuapp.com/ws/storage/?wsdl";

    private Storage storage;
    private StorageService storageService;

    public StorageClient() {

        this.storageService = new StorageService();
        storage = storageService.getStorageImplementationPort();
    }

    public Storage getStorage() {
        return this.storage;
    }
}
