import java.io.*;
import java.util.Scanner;

/**
 * @author ekaterina
 */
public class LanguageFixer {

    /**
     * Read line from file
     * Fix all language problems in "file's" text
     * Write file with new text
     * @param args
     */
    public static void main(String[] args){
        String str = readString();

        str = fixAbbreviations(str);
        str = fixSmiles(str);

        writeString(str);
    }

    /**
     * This method fixes sentence. It changes slang words to normal language
     * PLZ = please
     * FYI = for your information
     * GTFO = please, leave me alone
     * ASAP = as soon as possible
     * @param str sentence that must be changed
     * @return result sentence without slang
     */
    public static String fixAbbreviations(String str){
        str = str.replace("PLZ", "please");
        str = str.replace("FYI", "for your information");
        str = str.replace("GTFO", "please, leave me alone");
        str = str.replace("ASAP", "as soon as possible");
        return str;
    }

    /**
     * This method fixes sentence. It changes smiles to emotion or phrase that
     * smiles represent
     * :) = [smiling]
     * ¯ \ _ (ツ) _ / ¯ = [such is life]
     * :( = [sad]
     * @param str sentence that must be changed
     * @return result sentence without smiles
     */
    public static String fixSmiles(String str){
        str = str.replace(":(", "[sad]");
        str = str.replace("¯ \\ _ (ツ) _ / ¯", "[such is life]");
        str = str.replace(":)", "[smiling]");
        return str;
    }

    /**
     * read Strings from file "input.txt"
     * @return Strings from file
     */
    private static String readString() {
        try {
            return new Scanner(new File("input.txt")).nextLine();
        } catch (FileNotFoundException ex) {
            return null;
        }
    }

    /**
     * write String to file "output.txt"
     */
    private static void writeString(String s) {
        try {
            try (Writer writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("output.txt"), "ascii"))) {
                writer.write(s);
            }
        } catch (IOException ex) {
        }
    }

}
