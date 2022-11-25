package bo.com.mc4.onboarding.integrations.gera.dto.consultoras.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * ConsultaConsultorasResponseDto
 *
 * @author Marcos Quispe
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class ConsultaConsultorasResponseDto {

    private Integer code;

    private String name;

    private String birthday;

    private BusinessData businessData;

    private Training training;

    private Registration registration;

    private Multilevel multilevel;

    private List<Email__3> emails;

    private List<Document> document;

    private CommercialStructure__1 commercialStructure;

    private List<Address> addresses;

    private List<Telephone__3> telephones;

    private CommercialInformation commercialInformation;

    private CreditData creditData;

    private CreditToleranceData creditToleranceData;

    private List<PersonalReference> personalReferences;

    private String multilevelNetworkName;

    private List<SellerPicture__3> sellerPictures;

    private Integer gender;

    private Boolean inDebit;

    private PersonType personType;

    private AutoReactivation autoReactivation;

    private List<SellerSameIdDocument> sellerSameIdDocument;

    private List<BankAccount> bankAccounts;

    private List<Alia> alias;

    private CompanyData companyData;

    private Boolean acceptTerms;

}