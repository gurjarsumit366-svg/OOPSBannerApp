/**
 * OOPSBannerApp
 * UC4 - Print OOPS banner using Array and Loop
 *
 * @author Abhishek
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {

            String.join("", " *****   ", " *****   ", " *****   ", " ***** "),
            String.join("", "*     * ", "*     * ", "*     * ", "*     *"),
            String.join("", "*     * ", "*     * ", "*     * ", "*      "),
            String.join("", "*     * ", "*****   ", " *****  ", " ***** "),
            String.join("", "*     * ", "*       ", "*            ", "* "),
            String.join("", "*     * ", "*       ", "*      ", "*     *"),
            String.join("", " *****  ", "*       ", " *****  ", " ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}