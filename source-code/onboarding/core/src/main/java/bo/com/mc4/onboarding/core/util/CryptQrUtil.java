package bo.com.mc4.onboarding.core.util;

import bo.com.mc4.onboarding.core.util.exception.OperationException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

public class CryptQrUtil {

    private static final String INSTANCIA = "RSA/ECB/PKCS1Padding";

    public static String cryptWithPrivate(PrivateKey privateKeyCert, String pStringToCrypt) throws OperationException {
        try{
            Cipher privateEncryptCipher = Cipher.getInstance(INSTANCIA);
            privateEncryptCipher.init(Cipher.ENCRYPT_MODE, privateKeyCert);
            byte[] bytesStringToCrypt=pStringToCrypt.getBytes();
            byte[] encryptedFirstString = privateEncryptCipher.doFinal(bytesStringToCrypt);

            return Base64.encodeBase64String(encryptedFirstString);
        } catch (NoSuchAlgorithmException e) {
            throw new OperationException("Se generó error al solicitar un algoritmo criptográfico particular, no está disponible en el entorno", e);
        } catch (InvalidKeyException e) {
            throw new OperationException("Se generó error clave no válida (codificación no válida, longitud incorrecta, sin inicializar, etc.)", e);
        } catch (NoSuchPaddingException e) {
            throw new OperationException("Se generó error al solicitar un mecanismo de relleno particular, no está disponible en el entorno.", e);
        } catch (BadPaddingException e) {
            throw new OperationException("Se generó error el bloque final no se rellena adecuadamente, clave incorrecta durante el descifrado.", e);
        } catch (IllegalBlockSizeException e) {
            throw new OperationException("Se generó error el cifrado es un cifrado de bloque, no se ha solicitado ningún relleno, " +
                    "y la longitud de la codificación de la clave a envolver no es un múltiplo del tamaño del bloque..(decryptWithPrivate)", e);
        }
    }

    public static String decryptWithPublic(PublicKey pPublicKeyCert, String pEncodeEncryptString) throws OperationException {

        try{
            byte[] decodedEncryptedString = Base64.decodeBase64(pEncodeEncryptString);
            Cipher publicDecryptCipher = Cipher.getInstance(INSTANCIA);
            publicDecryptCipher.init(Cipher.DECRYPT_MODE, pPublicKeyCert);
            byte[] decryptedStringByte = publicDecryptCipher.doFinal(decodedEncryptedString);

            return (new String(decryptedStringByte));

        } catch (NoSuchAlgorithmException e) {
            throw new OperationException("Se generó un error al solicitar un algoritmo criptográfico particular, no está disponible en el entorno", e);
        } catch (InvalidKeyException e) {
            throw new OperationException("Se generó un error clave no válida (codificación no válida, longitud incorrecta, sin inicializar, etc.)", e);
        } catch (NoSuchPaddingException e) {
            throw new OperationException("Se generó un error al solicitar un mecanismo de relleno particular, no está disponible en el entorno.", e);
        } catch (BadPaddingException e) {
            throw new OperationException("Se generó un error, el bloque final no se rellena adecuadamente, clave incorrecta durante el descifrado.", e);
        } catch (IllegalBlockSizeException e) {
            throw new OperationException("Se generó un error, este cifrado es un cifrado de bloque, no se ha solicitado ningún relleno, y la longitud de la codificación de la clave a envolver no es un múltiplo del tamaño del bloque..(decryptWithPrivate)",e);
        }
    }
}
