package bo.com.mc4.onboarding.core.util;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import org.apache.commons.codec.binary.Base64;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.EnumMap;
import java.util.Map;

public class GeneradorQr {

    public static String generarQr(String text, int width, int height) throws Exception {
        Map<EncodeHintType, Object> hints = new EnumMap<>(EncodeHintType.class);
        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");

        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height, hints);
        ByteArrayOutputStream pngOutputStream = new ByteArrayOutputStream();
        MatrixToImageWriter.writeToStream(bitMatrix, "JPEG", pngOutputStream);
        byte[] qr = addLogo(pngOutputStream.toByteArray());
        return qrToBase64(qr);
    }

    public static String qrToBase64(byte[] qr) throws Exception {
        try {
            return new String(Base64.encodeBase64(qr), StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new Exception("Error al realizar la conversion del archivo  InputStream a Base 64.", e);
        }
    }

    private static byte[] addLogo(byte[] qrImagen) throws Exception {
        ByteArrayInputStream qrImagenInputStream = new ByteArrayInputStream(qrImagen);
        BufferedImage bufferQR = ImageIO.read(qrImagenInputStream);
        Image src = ImageIO.read(GeneradorQr.class.getResource("/imagenes/logo-qr.png"));
        int width = src.getWidth(null);
        int height = src.getHeight(null);
        Graphics2D graph = bufferQR.createGraphics();
        // TODO ajustar la posicion del logo
        graph.drawImage(src, 0, 0, width, height, null);
        graph.setStroke(new BasicStroke(3f));
        graph.dispose();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(bufferQR, "JPEG", baos);
        baos.flush();
        byte[] imageInByte = baos.toByteArray();
        baos.close();
        return imageInByte;
    }
}
