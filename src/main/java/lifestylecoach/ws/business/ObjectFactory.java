
package lifestylecoach.ws.business;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the lifestylecoach.ws.business package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteMeasureResponse_QNAME = new QName("http://webservice.business.lifecoach/", "deleteMeasureResponse");
    private final static QName _UpdatePerson_QNAME = new QName("http://webservice.business.lifecoach/", "updatePerson");
    private final static QName _GetGoalsResponse_QNAME = new QName("http://webservice.business.lifecoach/", "getGoalsResponse");
    private final static QName _UpdateMeasureResponse_QNAME = new QName("http://webservice.business.lifecoach/", "updateMeasureResponse");
    private final static QName _CreateGoal_QNAME = new QName("http://webservice.business.lifecoach/", "createGoal");
    private final static QName _CreateMeasureResponse_QNAME = new QName("http://webservice.business.lifecoach/", "createMeasureResponse");
    private final static QName _DeleteGoal_QNAME = new QName("http://webservice.business.lifecoach/", "deleteGoal");
    private final static QName _GetGoals_QNAME = new QName("http://webservice.business.lifecoach/", "getGoals");
    private final static QName _CreateMeasure_QNAME = new QName("http://webservice.business.lifecoach/", "createMeasure");
    private final static QName _UpdateMeasure_QNAME = new QName("http://webservice.business.lifecoach/", "updateMeasure");
    private final static QName _CreateGoalResponse_QNAME = new QName("http://webservice.business.lifecoach/", "createGoalResponse");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://webservice.business.lifecoach/", "deletePersonResponse");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://webservice.business.lifecoach/", "updatePersonResponse");
    private final static QName _DeleteGoalByTitleResponse_QNAME = new QName("http://webservice.business.lifecoach/", "deleteGoalByTitleResponse");
    private final static QName _DeleteMeasure_QNAME = new QName("http://webservice.business.lifecoach/", "deleteMeasure");
    private final static QName _UpdateGoal_QNAME = new QName("http://webservice.business.lifecoach/", "updateGoal");
    private final static QName _CreatePerson_QNAME = new QName("http://webservice.business.lifecoach/", "createPerson");
    private final static QName _DeleteGoalByTitle_QNAME = new QName("http://webservice.business.lifecoach/", "deleteGoalByTitle");
    private final static QName _GetBmiResponse_QNAME = new QName("http://webservice.business.lifecoach/", "getBmiResponse");
    private final static QName _UpdateGoalResponse_QNAME = new QName("http://webservice.business.lifecoach/", "updateGoalResponse");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://webservice.business.lifecoach/", "createPersonResponse");
    private final static QName _DeleteGoalResponse_QNAME = new QName("http://webservice.business.lifecoach/", "deleteGoalResponse");
    private final static QName _DeletePerson_QNAME = new QName("http://webservice.business.lifecoach/", "deletePerson");
    private final static QName _GetBmi_QNAME = new QName("http://webservice.business.lifecoach/", "getBmi");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lifestylecoach.ws.business
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Bmi }
     */
    public Bmi createBmi() {
        return new Bmi();
    }

    /**
     * Create an instance of {@link GoalType }
     */
    public GoalType createGoalType() {
        return new GoalType();
    }

    /**
     * Create an instance of {@link Goal }
     */
    public Goal createGoal() {
        return new Goal();
    }

    /**
     * Create an instance of {@link Measure }
     */
    public Measure createMeasure() {
        return new Measure();
    }

    /**
     * Create an instance of {@link MeasureType }
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link DeletePerson }
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link GetBmi }
     */
    public GetBmi createGetBmi() {
        return new GetBmi();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link DeleteGoalResponse }
     */
    public DeleteGoalResponse createDeleteGoalResponse() {
        return new DeleteGoalResponse();
    }

    /**
     * Create an instance of {@link GetBmiResponse }
     */
    public GetBmiResponse createGetBmiResponse() {
        return new GetBmiResponse();
    }

    /**
     * Create an instance of {@link UpdateGoalResponse }
     */
    public UpdateGoalResponse createUpdateGoalResponse() {
        return new UpdateGoalResponse();
    }

    /**
     * Create an instance of {@link DeleteGoalByTitle }
     */
    public DeleteGoalByTitle createDeleteGoalByTitle() {
        return new DeleteGoalByTitle();
    }

    /**
     * Create an instance of {@link CreatePerson }
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link DeleteMeasure }
     */
    public DeleteMeasure createDeleteMeasure() {
        return new DeleteMeasure();
    }

    /**
     * Create an instance of {@link UpdateGoal }
     */
    public UpdateGoal createUpdateGoal() {
        return new UpdateGoal();
    }

    /**
     * Create an instance of {@link DeleteGoalByTitleResponse }
     */
    public DeleteGoalByTitleResponse createDeleteGoalByTitleResponse() {
        return new DeleteGoalByTitleResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link CreateGoalResponse }
     */
    public CreateGoalResponse createCreateGoalResponse() {
        return new CreateGoalResponse();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link CreateMeasure }
     */
    public CreateMeasure createCreateMeasure() {
        return new CreateMeasure();
    }

    /**
     * Create an instance of {@link UpdateMeasure }
     */
    public UpdateMeasure createUpdateMeasure() {
        return new UpdateMeasure();
    }

    /**
     * Create an instance of {@link GetGoals }
     */
    public GetGoals createGetGoals() {
        return new GetGoals();
    }

    /**
     * Create an instance of {@link CreateGoal }
     */
    public CreateGoal createCreateGoal() {
        return new CreateGoal();
    }

    /**
     * Create an instance of {@link CreateMeasureResponse }
     */
    public CreateMeasureResponse createCreateMeasureResponse() {
        return new CreateMeasureResponse();
    }

    /**
     * Create an instance of {@link DeleteGoal }
     */
    public DeleteGoal createDeleteGoal() {
        return new DeleteGoal();
    }

    /**
     * Create an instance of {@link GetGoalsResponse }
     */
    public GetGoalsResponse createGetGoalsResponse() {
        return new GetGoalsResponse();
    }

    /**
     * Create an instance of {@link UpdateMeasureResponse }
     */
    public UpdateMeasureResponse createUpdateMeasureResponse() {
        return new UpdateMeasureResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link DeleteMeasureResponse }
     */
    public DeleteMeasureResponse createDeleteMeasureResponse() {
        return new DeleteMeasureResponse();
    }

    /**
     * Create an instance of {@link GoalBusiness }
     */
    public GoalBusiness createGoalBusiness() {
        return new GoalBusiness();
    }

    /**
     * Create an instance of {@link Person.HealthProfile }
     */
    public Person.HealthProfile createPersonHealthProfile() {
        return new Person.HealthProfile();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMeasureResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "deleteMeasureResponse")
    public JAXBElement<DeleteMeasureResponse> createDeleteMeasureResponse(DeleteMeasureResponse value) {
        return new JAXBElement<DeleteMeasureResponse>(_DeleteMeasureResponse_QNAME, DeleteMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalsResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "getGoalsResponse")
    public JAXBElement<GetGoalsResponse> createGetGoalsResponse(GetGoalsResponse value) {
        return new JAXBElement<GetGoalsResponse>(_GetGoalsResponse_QNAME, GetGoalsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMeasureResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "updateMeasureResponse")
    public JAXBElement<UpdateMeasureResponse> createUpdateMeasureResponse(UpdateMeasureResponse value) {
        return new JAXBElement<UpdateMeasureResponse>(_UpdateMeasureResponse_QNAME, UpdateMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoal }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "createGoal")
    public JAXBElement<CreateGoal> createCreateGoal(CreateGoal value) {
        return new JAXBElement<CreateGoal>(_CreateGoal_QNAME, CreateGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMeasureResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "createMeasureResponse")
    public JAXBElement<CreateMeasureResponse> createCreateMeasureResponse(CreateMeasureResponse value) {
        return new JAXBElement<CreateMeasureResponse>(_CreateMeasureResponse_QNAME, CreateMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoal }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "deleteGoal")
    public JAXBElement<DeleteGoal> createDeleteGoal(DeleteGoal value) {
        return new JAXBElement<DeleteGoal>(_DeleteGoal_QNAME, DeleteGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoals }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "getGoals")
    public JAXBElement<GetGoals> createGetGoals(GetGoals value) {
        return new JAXBElement<GetGoals>(_GetGoals_QNAME, GetGoals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMeasure }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "createMeasure")
    public JAXBElement<CreateMeasure> createCreateMeasure(CreateMeasure value) {
        return new JAXBElement<CreateMeasure>(_CreateMeasure_QNAME, CreateMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMeasure }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "updateMeasure")
    public JAXBElement<UpdateMeasure> createUpdateMeasure(UpdateMeasure value) {
        return new JAXBElement<UpdateMeasure>(_UpdateMeasure_QNAME, UpdateMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoalResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "createGoalResponse")
    public JAXBElement<CreateGoalResponse> createCreateGoalResponse(CreateGoalResponse value) {
        return new JAXBElement<CreateGoalResponse>(_CreateGoalResponse_QNAME, CreateGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoalByTitleResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "deleteGoalByTitleResponse")
    public JAXBElement<DeleteGoalByTitleResponse> createDeleteGoalByTitleResponse(DeleteGoalByTitleResponse value) {
        return new JAXBElement<DeleteGoalByTitleResponse>(_DeleteGoalByTitleResponse_QNAME, DeleteGoalByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMeasure }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "deleteMeasure")
    public JAXBElement<DeleteMeasure> createDeleteMeasure(DeleteMeasure value) {
        return new JAXBElement<DeleteMeasure>(_DeleteMeasure_QNAME, DeleteMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGoal }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "updateGoal")
    public JAXBElement<UpdateGoal> createUpdateGoal(UpdateGoal value) {
        return new JAXBElement<UpdateGoal>(_UpdateGoal_QNAME, UpdateGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoalByTitle }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "deleteGoalByTitle")
    public JAXBElement<DeleteGoalByTitle> createDeleteGoalByTitle(DeleteGoalByTitle value) {
        return new JAXBElement<DeleteGoalByTitle>(_DeleteGoalByTitle_QNAME, DeleteGoalByTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBmiResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "getBmiResponse")
    public JAXBElement<GetBmiResponse> createGetBmiResponse(GetBmiResponse value) {
        return new JAXBElement<GetBmiResponse>(_GetBmiResponse_QNAME, GetBmiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGoalResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "updateGoalResponse")
    public JAXBElement<UpdateGoalResponse> createUpdateGoalResponse(UpdateGoalResponse value) {
        return new JAXBElement<UpdateGoalResponse>(_UpdateGoalResponse_QNAME, UpdateGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoalResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "deleteGoalResponse")
    public JAXBElement<DeleteGoalResponse> createDeleteGoalResponse(DeleteGoalResponse value) {
        return new JAXBElement<DeleteGoalResponse>(_DeleteGoalResponse_QNAME, DeleteGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBmi }{@code >}}
     */
    @XmlElementDecl(namespace = "http://webservice.business.lifecoach/", name = "getBmi")
    public JAXBElement<GetBmi> createGetBmi(GetBmi value) {
        return new JAXBElement<GetBmi>(_GetBmi_QNAME, GetBmi.class, null, value);
    }

}
