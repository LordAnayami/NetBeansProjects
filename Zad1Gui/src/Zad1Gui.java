import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;


public class Zad1Gui extends JFrame implements ActionListener {


/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private final int WIDTH_FRAME = 800;
private final int HEIGHT_FRAME = 650;
private final String ICON_PATH = "/grafika/";
private Icon iconSzesc, iconProst, iconStozek, iconWalec, iconKula, iconFigura;
private JButton jbtSzesc, jbtProst, jbtStozek, jbtWalec, jbtKula, jbtOblicz;
private JLabel rowWzor, rowWynik, rowX, rowY, rowH, rowR;
private JTextField txtX, txtY, txtH, txtR;
private String wynik = "";
private String wzor = "";



public Zad1Gui() {
super("Komponenty");
// okreslamy rozmiar okna
Dimension frameSize = new Dimension(WIDTH_FRAME,HEIGHT_FRAME);
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
if(frameSize.height > screenSize.height)
frameSize.height = screenSize.height;
else if(frameSize.height < screenSize.height/2)
frameSize.height = screenSize.height/2;
if(frameSize.width > screenSize.width)
frameSize.width = screenSize.width;
else if(frameSize.width < screenSize.width/2)
frameSize.width = screenSize.width/2;
setSize(frameSize);
setLocationRelativeTo(null);






// Utworzenie glownego kontekstu (ContentPane)
JPanel cp = (JPanel) this.getContentPane();
cp.setLayout(new BorderLayout());
try {
createIcons();
initGUI();
createMenus();
cp.add(createToolBar(), BorderLayout.NORTH);
cp.add(createStatusBar(), BorderLayout.SOUTH);
// cp.add(taskPanel, BorderLayout.LEFT); panel nawigacyjny
cp.add(createCenterPanel(), BorderLayout.CENTER);
}
catch(IconException ie) {
JOptionPane.showMessageDialog(this,"B³¹d podczas wczytywania icon");
}
catch(Exception e) {
System.out.println("ERROR - B³¹d podczas tworzenia GUI aplikacji");
e.printStackTrace();
JOptionPane.showMessageDialog(this,"B³¹d podczas tworzenia GUI");
}
}
/**
*
* @throws IconException
*/
private void createIcons() throws IconException {
// Utworzenie ikon 24 * 24 px dla paska toolbar
 
//iconSzesc = createMyIcon("SZESCIAN1.png");
//iconProst = createMyIcon("PROSTOK1.png");
//iconStozek = createMyIcon("STOZEK1.png");
//iconWalec = createMyIcon("WALEC1.png");
//iconKula = createMyIcon("KULA1.png");
//iconFigura = createMyIcon("FIGURA.png");
}
/**
*
*/
public void initGUI() {
rowWynik = new JLabel("Wynik =  " + wynik );
rowWzor = new JLabel("Wzor na objetosc figury = " + wzor );
rowX = new JLabel("X = " );
rowY = new JLabel("Y = " );
rowH = new JLabel("H = " );
rowR = new JLabel("R = " );
txtX = new JTextField("0");
txtX.setHorizontalAlignment(JTextField.RIGHT);
txtY = new JTextField("0");
txtY.setHorizontalAlignment(JTextField.RIGHT);
txtH = new JTextField("0");
txtH.setHorizontalAlignment(JTextField.RIGHT);
txtR = new JTextField("0");
txtR.setHorizontalAlignment(JTextField.RIGHT);
}
/**
*
*/
private void createMenus() {
// Utworzenie paska menu
JMenuBar menuBar = new JMenuBar();
// Utworzenie pol menu glownego
JMenu fileMenu = createJMenu("Plik", KeyEvent.VK_P);
JMenu helpMenu = createJMenu("pomoc", KeyEvent.VK_O);
// utworzenie menuitem


menuBar.add(fileMenu);
menuBar.add(helpMenu);
setJMenuBar(menuBar);
}
/**
*
*/
private JToolBar createToolBar() {
JToolBar jtb = new JToolBar();
jtb.setFloatable(false);
jtb.add(Box.createHorizontalStrut(5));
jbtSzesc = createJButtonToolBar("Szeœcian");
jbtProst = createJButtonToolBar("Prostopad³oœcian");
jbtStozek = createJButtonToolBar("STOZEK");
jbtWalec = createJButtonToolBar("Walec");
jbtKula = createJButtonToolBar("Kula");
jtb.add(jbtSzesc);
jtb.add(jbtProst);
jtb.add(jbtStozek);
jtb.add(jbtWalec);
jtb.add(jbtKula);
return jtb;
}
/**
*
*/
private JPanel createStatusBar() {
JPanel jp = new JPanel();
jp.setLayout(new BoxLayout(jp, BoxLayout.X_AXIS));
jp.setBorder(BorderFactory.createEmptyBorder(2,5,2,5));
jp.add(new JLabel("Pasek statusu", JLabel.LEFT));
return jp;
}
/**
*
*/
private JPanel createCenterPanel() {
JPanel jp = new JPanel();
FormLayout formLayout = new FormLayout(
"3dlu, 60dlu, 2dlu, 60dlu, pref:grow, 3dlu", // poziom
"8dlu, pref, 5dlu, pref:grow, 5dlu, pref, "); // pion
jp.setLayout(formLayout);
CellConstraints cc = new CellConstraints();
jp.add(txtX, cc.xy(2,2,CellConstraints.RIGHT,
CellConstraints.FILL));
jp.add(rowWzor, cc.xy(4,2,CellConstraints.FILL,
CellConstraints.FILL));
jp.add(new JSeparator(JSeparator.HORIZONTAL), cc.xyw(1,6,6,
CellConstraints.FILL, CellConstraints.FILL));
return jp;
}
/**
* Metoda zamykaj¹ca aplikacjê
*/
public void disposeAndExit() {
// utworzenie okna dialogowego z zapytaniem o zamkniecie projektu
int value = JOptionPane.showOptionDialog(
this,
"Czy chcesz zamkn¹æ aplikacjê", // komunikat
"Uwaga",// nag³ówek okna
JOptionPane.YES_NO_CANCEL_OPTION, // typ opcji
JOptionPane.WARNING_MESSAGE, // typ komunikatu
null, // domyœlna ikona
new String[] { "Tak","Nie"},
"Tak"); // inicjacja aktywnego przycisku
if(value == JOptionPane.YES_OPTION) {
dispose();
System.exit(0);
}
}
public Icon createMyIcon(String file) throws IconException {
String name = ICON_PATH+file;
Icon icon = null;
URL url= getClass().getResource(name);
if(url == null) throw new IconException();
else icon = new ImageIcon(url);
return icon;
}
/**
* Metoda tworz ca obiekt typu JMenu
* @param name zmienna okre laj ca nazw 
* @param keyEvent zmienna okre laj ca klawisz skr tu
* @return zwraca utworzony obiekt typu JMenu
*/
public JMenu createJMenu(String name, int keyEvent) {
JMenu jMenu = new JMenu(name);
jMenu.setMnemonic(keyEvent);
return jMenu;
}
/**
* Metoda tworz ca obiekt typu JMenuItem
* @param name zmienna okre lajaca nazw 
* @param icon zmienna okre laj ca icon  wy wietlan  wraz z nazw 
* @param key zmienna okre laj ca klawisze akceleracji dost pu
* @return zwraca utworzony obiekt typu JMenuItem
*/
public JMenuItem createJMenuItem(String name, Icon icon, KeyStroke key) {
JMenuItem jMI;
if(icon != null)
jMI = new JMenuItem(name,icon);
else jMI = new JMenuItem(name);
jMI.setAccelerator(key);
// jMI.addActionListener(this);
return jMI;
}
/**
* Metoda tworz ca obiekt typu JButton dla paska narz dziowego
* @param tooltip zmienna okre laj ca podpowiedz dla przycisku
* @param icon zmienna okre laj ca obrazek przypisany do przycisku
* @return zwraca utworzony obiekt typu JButton
*/
public JButton createJButtonToolBar(String tooltip) {
JButton jb = new JButton("");
jb.setToolTipText(tooltip);
jb.addActionListener(this);
return jb;
}
@Override
public void actionPerformed(ActionEvent e) {
//if(e.getSource() == fileExitMenuItem ||
//e.getSource() == jtbExit) {
//disposeAndExit();
}


public class IconException extends Exception {
private static final long serialVersionUID = 1L;

 public IconException() {
System.out.println("B³¹d wczytywania obiektu Icon");
}
}


public static void main(String[] args) {
new Zad1Gui().setVisible(true);
}
}