//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package guitest;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.JOptionPane;

public class ModiAdd {
    public ModiAdd() {
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
    }

    static void callModiAdd(String pepInFile, String pepOutFile, String modFile, int maxModsAllowed, Double probModi) throws FileNotFoundException, IOException {
        Random rand = new Random();
        BufferedReader peptideReader = new BufferedReader(new FileReader(pepInFile));
        BufferedReader modReader = new BufferedReader(new FileReader(modFile));
        Map<String, String> modToAAmap = new HashMap();
        String myLine = null;

        while((myLine = modReader.readLine()) != null) {
            String[] myModToks = myLine.split("=");
            if (myModToks[0].length() > 1) {
                modToAAmap.put(myModToks[1].split("\\+")[0], myModToks[0]);
            }
        }

        FileWriter myPepsFile = new FileWriter(pepOutFile);
        PrintWriter printWriter = new PrintWriter(myPepsFile);
        ArrayList<String> myAminos = new ArrayList();
        myAminos.add("A");
        myAminos.add("R");
        myAminos.add("N");
        myAminos.add("D");
        myAminos.add("C");
        myAminos.add("E");
        myAminos.add("Q");
        myAminos.add("G");
        myAminos.add("H");
        myAminos.add("I");
        myAminos.add("L");
        myAminos.add("K");
        myAminos.add("M");
        myAminos.add("F");
        myAminos.add("P");
        myAminos.add("S");
        myAminos.add("T");
        myAminos.add("W");
        myAminos.add("Y");
        myAminos.add("V");
        printWriter.println("Peptides");
        int pepCount = 0;
        String myInPep = null;
        int totModiPeps = 0;
        boolean firstLine = false;

        while(true) {
            while((myLine = peptideReader.readLine()) != null) {
                if (!firstLine) {
                    firstLine = true;
                } else {
                    String myOutPep = "";
                    int maxMods = 0;
                    String[] tempIn = myLine.split("");

                    for(int i = 0; i < tempIn.length; ++i) {
                        if (!myAminos.contains(tempIn[i]) && !tempIn[i].equals("[")) {
                            JOptionPane.showMessageDialog((Component)null, "Your input file contains an undefined character " + tempIn[i] + " please replace this with appropriate character and try again.", "Amino Acid Read Error", 1);
                            System.exit(1);
                        } else if (tempIn[i].equals("[")) {
                            while(!tempIn[i].equals("]")) {
                                ++i;
                            }
                        }
                    }

                    int var21;
                    int var22;
                    String s;
                    String[] var25;
                    if (getSelection(probModi, rand)) {
                        var25 = tempIn;
                        var21 = tempIn.length;

                        for(var22 = 0; var22 < var21; ++var22) {
                            s = var25[var22];
                            if (maxMods < maxModsAllowed && modToAAmap.containsKey(s)) {
                                ++maxMods;
                                myOutPep = myOutPep + (String)modToAAmap.get(s);
                                ++totModiPeps;
                            } else {
                                myOutPep = myOutPep + s;
                            }
                        }
                    } else {
                        var25 = tempIn;
                        var21 = tempIn.length;

                        for(var22 = 0; var22 < var21; ++var22) {
                            s = var25[var22];
                            myOutPep = myOutPep + s;
                        }
                    }

                    ++pepCount;
                    printWriter.println(myOutPep);
                }
            }

            printWriter.flush();
            printWriter.close();
            return;
        }
    }

    static boolean getSelection(Double prob, Random r) {
        boolean selection = false;
        Double threshold = 10.0 - prob / 10.0;
        Double randomNum = 0.0 + r.nextDouble() * 10.0;
        selection = !(randomNum < threshold);
        return selection;
    }

    public static boolean searchMod(String str, String[] modArray) {
        boolean contains = false;
        String[] var3 = modArray;
        int var4 = modArray.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            String s = var3[var5];
            if (str.equals(s)) {
                contains = true;
            }
        }

        return contains;
    }
}
