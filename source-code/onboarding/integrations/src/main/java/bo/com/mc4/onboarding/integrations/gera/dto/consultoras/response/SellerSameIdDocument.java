package bo.com.mc4.onboarding.integrations.gera.dto.consultoras.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * SellerSameIdDocument
 *
 * @author Marcos Quispe
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class SellerSameIdDocument {

    private Integer code;

    private String name;

    private List<SellerPicture__4> sellerPictures;

    private List<Alia> alias;

}