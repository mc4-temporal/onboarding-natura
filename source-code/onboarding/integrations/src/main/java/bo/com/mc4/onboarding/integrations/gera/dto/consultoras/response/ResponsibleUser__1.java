package bo.com.mc4.onboarding.integrations.gera.dto.consultoras.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * ResponsibleUser__1
 *
 * @author Marcos Quispe
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class ResponsibleUser__1 {

    private Integer structureCode;

    private Integer code;

    private String name;

    private List<Telephone__2> telephones;

    private List<Email__2> emails;

    private List<SellerPicture__2> sellerPictures;

    private List<Alia> alias;

}