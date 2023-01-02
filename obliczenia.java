package obliczenia;

import java.awt.*;
import javax.swing.*;

public class Obliczenia extends JComponent {
   
    private int wybor = 0;
    private final String string1 = "Wybierz figure z listy powyżej.";
    private final String stringsz = "Wybrano sześcian. Wzór na objętość sześcianu to X^3. Podaj wartość X.";
    private final String stringpro = "Wybrano prostopadłościan. Wzór na objętość prostopadłościanu to X*Y*H. Podaj wartość X,Y i H.";
    private final String stringwal = "Wybrano walec. Wzór na objętość walca to pi*r^2*H. Podaj wartość R i H.";
    private final String stringsto = "Wybrano stożek. Wzór na objętość stożka to pi*r^2*H/3. Podaj wartość R i H.";    
    private final String stringku = "Wybrano kulę. Wzór na objętość kuli to 4/3*pi*r^3. Podaj wartość R."; 
    private String Wynik = " "; 
    private Double pi = 3.14;
    private Double wynik = 0;


    public void setWybor(int W)
    {
        wybor = W;

    }

    public String getWzor()
    {
        switch (wybor)
        {
            case 0:
            return string1;
            case 1:
            return stringsz;
            case 2:
            return stringpro;
            case 3:
            return stringwal;
            case 4:
            return stringsto;
            case 5:
            return stringku;

        }
    }


    public String objetosc(String X, String Y, String H, String R)
    {
        x=Double.parseDouble(X);
        y=Double.parseDouble(Y);
        h=Double.parseDouble(H);
        r=Double.parseDouble(R);

        case 0:
            {
                return Wynik = " ";
            }
        
        case 1:
            {
                wynik = x*x*x;
                Wynik = String.valueOf(wynik);
                return Wynik;
            }
            
         case 2:
            {
                wynik = x*y*h;
                Wynik = String.valueOf(wynik);
                return Wynik;
            }
        
         case 3:
            {
                wynik = pi*r*r*h;
                Wynik = String.valueOf(wynik);
                return Wynik;
            }

        case 4:
            {
                wynik = pi*r*r*h/3;
                Wynik = String.valueOf(wynik);
                return Wynik;
            }

        case 5:
            {
                wynik = pi*r*r*r*4/3;
                Wynik = String.valueOf(wynik);
                return Wynik;
            }   
    }


}
