package lifestylecoach.business;

import ws.business.Business;
import ws.business.BusinessService;

/**
 * Created by matteo on 19/06/17.
 */
public class BusinessClient {

    //public final static String SERVICE_URL_BUSINESS = "http://localhost:6902/ws/storage?wsdl";
    public final static String SERVICE_URL_BUSINESS = "https://introsde-lifecoach-storage.herokuapp.com/ws/storage/?wsdl";

    private Business business;
    private BusinessService businessService;

    public BusinessClient() {
        this.businessService = new BusinessService();
        business = businessService.getBusinessImplementationPort();
    }

    public Business getBusiness() {
        return this.business;
    }
}
