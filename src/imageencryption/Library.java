package imageencryption;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Library {

    public static byte[] cifrarString(byte[] str, String rutaImagen, boolean cifrar) {
        byte[] r = null ;
        try {
            int numColors = countImageColors(rutaImagen);
            File imgFile = new File(rutaImagen);
            long hashCode = imgFile.hashCode();
            r = xor(str, String.format("%016d", Integer.parseInt(hashCode + numColors + "")).getBytes());
        } catch (Exception ex) {
            Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    public static String cifrarArchivo(String rutaArchivo, String rutaImagen, boolean cifrar) {
        String r = "";
        File archivo = new File(rutaArchivo);
        try {
            if (cifrar) {
                r = archivo.getParent() + "\\" + archivo.getName() + ".BLAU";
            } else {
                String name = archivo.getName();
                r = archivo.getParent() + "\\_" + name.split("\\.")[0] + "." + name.split("\\.")[1];
            }
            new File(r).createNewFile();

            byte[] fileBytes = Files.readAllBytes(Paths.get(rutaArchivo));
            try (FileOutputStream out = new FileOutputStream(r)) {
                out.write(cifrarString(fileBytes, rutaImagen, cifrar));
            }
        } catch (Exception ex) {
            Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    private static int countImageColors(String rutaImagen) {
        int r = 0;
        try {
            Set<Integer> colors = new HashSet<>();
            BufferedImage image = ImageIO.read(new File(rutaImagen));
            int w = image.getWidth();
            int h = image.getHeight();
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    int pixel = image.getRGB(x, y);
                    colors.add(pixel);
                }
            }
            r = colors.size();
        } catch (IOException ex) {
            //Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }

    private static byte[] xor(final byte[] input, final byte[] secret) {
        final byte[] output = new byte[input.length];
        if (secret.length == 0) {
            throw new IllegalArgumentException("empty security key");
        }
        int spos = 0;
        for (int pos = 0; pos < input.length; ++pos) {
            output[pos] = (byte) (input[pos] ^ secret[spos]);
            ++spos;
            if (spos >= secret.length) {
                spos = 0;
            }
        }
        return output;
    }
}
