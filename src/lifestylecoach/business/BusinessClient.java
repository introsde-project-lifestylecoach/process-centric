package lifestylecoach.business;

import lifestylecoach.ws.business.Business;
import lifestylecoach.ws.business.BusinessService;

/**
 * Created by matteo on 19/06/17.
 */
public class BusinessClient {

    public final static String SERVICE_URL_BUSINESS = "http://localhost:6902/ws/storage?wsdl";

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
