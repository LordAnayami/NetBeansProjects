    package komponenty;


    import java.awt.*;
    import javax.swing.*;


    /**
     *
     * @author Lenovo
     */
    public class ObliczeniaObj extends JComponent {

       
	private static final long serialVersionUID = 1125258259561446216L;
	private int wybor = 0;
	private String Opcja = "Wybierz figure z listy powyżej.";
        private final String string1 = "Wybierz figure z listy powyżej.";
        private final String stringsz = "Wybrano sześcian. Wzór na objętość sześcianu to X^3. Podaj wartość X.";
        private final String stringpro = "Wybrano prostopadłościan. Wzór na objętość prostopadłościanu to X*Y*H. Podaj wartość X,Y i H.";
        private final String stringwal = "Wybrano walec. Wzór na objętość walca to pi*R^2*H. Podaj wartość R i H.";
        private final String stringsto = "Wybrano stożek. Wzór na objętość stożka to pi*R^2*H/3. Podaj wartość R i H.";    
        private final String stringku = "Wybrano kulę. Wzór na objętość kuli to 4/3*pi*R^3. Podaj wartość R."; 
        private String Wynik = " "; 
        private final Double pi = 3.14;
        private Double wynik = 0.0;
   
      



	
        public void setWybor(int W)
        {
            wybor = W;

        }

        public String getWzor()
        {
            if (wybor==0) Opcja =  string1;
            else if (wybor==1) Opcja = stringsz;
            else if (wybor==2) Opcja = stringpro;
            else if (wybor==3) Opcja = stringwal;
            else if (wybor==4) Opcja = stringsto;
            else if (wybor==5) Opcja = stringku;

	return Opcja;
        }


        public String objetosc(String X, String Y, String H, String R)
        {
           double x=Double.parseDouble(X);
           double y=Double.parseDouble(Y);
           double h=Double.parseDouble(H);
           double r=Double.parseDouble(R);

           
            if (wybor==1) {
                    wynik = x*x*x;
                    Wynik = String.valueOf("Objętość sześcianu to: " + wynik);  
                            }
            else if (wybor==2) 
                        {
                    wynik = x*y*h;
                    Wynik = String.valueOf("Objętość prostopadłościonu to: " + wynik);
                        }
            else if (wybor==3)
                    {
                    wynik = pi*r*r*h;
                    Wynik = String.valueOf("Objętość walca to: "+wynik);
                    }
            else if (wybor==4) 
                 {
                    wynik = pi*r*r*h/3;
                    Wynik = String.valueOf("Objętość stożka to: "+wynik);

                }


            else if (wybor==5) 
                {
                    wynik = pi*r*r*r*4/3;
                    Wynik = String.valueOf("Objętość koła to: "+wynik);

                } 


            return Wynik;
    }


    }
