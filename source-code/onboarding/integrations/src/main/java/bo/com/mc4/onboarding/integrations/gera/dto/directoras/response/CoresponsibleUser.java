package bo.com.mc4.onboarding.integrations.gera.dto.directoras.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * CoresponsibleUser
 *
 * @author Marcos Quispe
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class CoresponsibleUser {

    private Integer structureCode;

    private Integer code;

    private String name;

    private List<Telephone__1> telephones;

    private List<Email__1> emails;

    private List<SellerPicture__1> sellerPictures;

    private List<Alia> alias;

}