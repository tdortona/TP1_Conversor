package conversor.utils;

import java.awt.Color;
import javax.swing.JComponent;

public enum Utilities {
    INSTANCE;

    /**
     * Funcion que valida si un string que se le envia es un numero o no
     */
    public boolean isNumeric(String str) {
        boolean result;
        try {
            if (str.toLowerCase().contains("d") || str.toLowerCase().contains("f")) {
                throw new NumberFormatException();
            }
            Double d = Double.valueOf(str);
            result = true;
        } catch (NumberFormatException e) {
            result = false;
        }
        return result;
    }

    /**
     * Funcion que recibe un objeto que herede de JComponent y un Color, en base
     * a estos parametros cambia el Background del col control
     */
    public void paintControl(JComponent control, Color color) {
        control.setBackground(color);
    }
}
