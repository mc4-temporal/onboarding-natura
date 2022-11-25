package bo.com.mc4.onboarding.integrations.gera.dto.consultoras.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * ResponsibleUser
 *
 * @author Marcos Quispe
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class ResponsibleUser {

    private Integer structureCode;

    private Integer code;

    private String name;

    private List<Telephone> telephones;

    private List<Email> emails;

    private List<SellerPicture> sellerPictures;

    private List<Alia> alias;

}