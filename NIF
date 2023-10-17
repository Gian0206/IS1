import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NIF {
    // Atributes
    private String number;

    // Methods
    public boolean isValid(){
        // Expresión regular para validar el formato del NIF
        String regex = "^[0-9]{8}[A-HJ-NP-TV-Z]$";

        // Compilar la expresión regular
        Pattern pattern = Pattern.compile(regex);

        // Verificar el formato del NIF
        Matcher matcher = pattern.matcher(this.number);
        if (!matcher.matches()) {
            return false;
        }

        // Extraer los números y la letra
        String dniNumbers = this.number.substring(0, 8);
        char providedLetter = this.number.charAt(8);

        // Calcular la letra de control
        int dniNumber = Integer.parseInt(dniNumbers);
        char calculatedLetter = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(dniNumber % 23);

        // Verificar si la letra proporcionada coincide con la calculada
        return providedLetter == calculatedLetter;
    }

    // Getters
    public String getNumber(){
        return this.number;
    }

}
