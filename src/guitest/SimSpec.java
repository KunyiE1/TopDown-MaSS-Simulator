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
import java.text.DecimalFormat;
import java.util.*;
import javax.swing.JOptionPane;

public class SimSpec {
    static int count = 0;
    static ArrayList<Double> ionOffsetsC = new ArrayList();
    static ArrayList<Double> ionOffsetsN = new ArrayList();
    static ArrayList<Double> ionProbsC = new ArrayList();
    static ArrayList<Double> ionProbsN = new ArrayList();
    static ArrayList<Integer> ionCharges = new ArrayList();
    static ArrayList<Double> ionChProbs = new ArrayList();
    static ArrayList<Double> ionIntensitiesC = new ArrayList();
    static ArrayList<Double> ionIntensitiesN = new ArrayList();
    static Double intenCon = 1000.0;
    static Double noiseIntenMin = 0.25;
    static Double noiseIntenMax = 2.25;
    static int totCh = 2;
    static int noiseType = 1;
    static Double SNR = 4.0;
    static ArrayList<String> immoniumIonsAA = new ArrayList();
    static ArrayList<Double> ImmProbs = new ArrayList();
    static ArrayList<Double> ImmIntens = new ArrayList();
    static Double minMass = 800.0;
    static Double maxMass = 4000.0;
    static float cTermOff = 0.0F;
    static float nTermOff = 0.0F;
    static double max_ion_err = 0.1;
    static Comparator<Ion> comp = (a, b) -> {
        return a.compareTo(b);
    };

    public SimSpec() {
    }

    static void populateMassTable(Map<String, Double> aaMasses, BufferedReader ptmFile) throws IOException {
        aaMasses.put("G", 57.021464);
        aaMasses.put("A", 71.037114);
        aaMasses.put("S", 87.032028);
        aaMasses.put("P", 97.052764);
        aaMasses.put("V", 99.068414);
        aaMasses.put("T", 101.047679);
        aaMasses.put("C", 103.009185);
        aaMasses.put("I", 113.084064);
        aaMasses.put("L", 113.084064);
        aaMasses.put("N", 114.042927);
        aaMasses.put("D", 115.026943);
        aaMasses.put("Q", 128.058578);
        aaMasses.put("K", 128.094963);
        aaMasses.put("E", 129.042593);
        aaMasses.put("M", 131.040485);
        aaMasses.put("H", 137.058912);
        aaMasses.put("F", 147.068414);
        aaMasses.put("R", 156.101111);
        aaMasses.put("Y", 163.06332);
        aaMasses.put("W", 186.079313);
        aaMasses.put("U", 150.95363);

        String myLine;
        while((myLine = ptmFile.readLine()) != null) {
            String[] modTok = myLine.split("=");
            if (modTok[0].equals("cTerm")) {
                cTermOff = Float.parseFloat(modTok[1]);
            } else if (modTok[0].equals("nTerm")) {
                nTermOff = Float.parseFloat(modTok[1]);
            } else {
                String[] modMass = modTok[1].split("\\+");
                aaMasses.put(modTok[0], (Double)aaMasses.get(modMass[0]) + Double.parseDouble(modMass[1]));
            }
        }

    }

    static boolean getSelection(Double prob, Random r) {
        boolean selection = false;
        Double threshold = 10.0 - prob / 10.0;
        Double randomNum = 0.0 + r.nextDouble() * 10.0;
        //System.out.println("prob:" + prob +",threshold"+threshold+ ",r" + randomNum);
        selection = !(randomNum < threshold);
        return selection;
    }

    static void readParams(String cIonsString, String nIonsString, String cProbsString, String nProbsString, String maxChString, String maxChProbsString, String cIntenString, String nIntenString, String snrString, String noiseTypeString, String noiseMinString, String noiseMaxString, String immIonString, String immIonProbsString, String immIonIntenString, String precMinMass, String precMaxMass) throws IOException {
        String[] lineToks = cIonsString.split(" ");

        int i;
        for(i = 0; i < lineToks.length; ++i) {
            ionOffsetsC.add(Double.parseDouble(lineToks[i]));
        }

        lineToks = nIonsString.split(" ");

        for(i = 0; i < lineToks.length; ++i) {
            ionOffsetsN.add(Double.parseDouble(lineToks[i]));
        }

        lineToks = cProbsString.split(" ");

        for(i = 0; i < lineToks.length; ++i) {
            ionProbsC.add(Double.parseDouble(lineToks[i]));
        }

        lineToks = nProbsString.split(" ");

        for(i = 0; i < lineToks.length; ++i) {
            ionProbsN.add(Double.parseDouble(lineToks[i]));
        }

        lineToks = maxChString.split(" ");

        for(i = 0; i < lineToks.length; ++i) {
            ionCharges.add(Integer.parseInt(lineToks[i]));
        }

        lineToks = maxChProbsString.split(" ");

        for(i = 0; i < lineToks.length; ++i) {
            ionChProbs.add(Double.parseDouble(lineToks[i]));
        }

        lineToks = cIntenString.split(" ");

        for(i = 0; i < lineToks.length; ++i) {
            ionIntensitiesC.add(Double.parseDouble(lineToks[i]));
        }

        lineToks = nIntenString.split(" ");

        for(i = 0; i < lineToks.length; ++i) {
            ionIntensitiesN.add(Double.parseDouble(lineToks[i]));
        }

        SNR = Double.parseDouble(snrString);
        noiseType = Integer.parseInt(noiseTypeString);
        noiseIntenMin = Double.parseDouble(noiseMinString);
        noiseIntenMax = Double.parseDouble(noiseMaxString);
        lineToks = immIonString.split(" ");

        for(i = 0; i < lineToks.length; ++i) {
            immoniumIonsAA.add(lineToks[i]);
        }

        lineToks = immIonProbsString.split(" ");

        for(i = 0; i < lineToks.length; ++i) {
            ImmProbs.add(Double.parseDouble(lineToks[i]));
        }

        lineToks = immIonIntenString.split(" ");

        for(i = 0; i < lineToks.length; ++i) {
            ImmIntens.add(Double.parseDouble(lineToks[i]));
        }

        minMass = Double.parseDouble(precMinMass);
        maxMass = Double.parseDouble(precMaxMass);
        if (ionOffsetsC.size() != ionProbsC.size() || ionOffsetsN.size() != ionProbsN.size() || ionChProbs.size() != ionCharges.size()) {
            System.out.println("*****ERROR in params.txt file, please check formatting guide*******");
            System.exit(1);
        }

    }

    static double genError(Random ion_error, double max_error){
        double aa = 1 / (2 * max_error);
        return ion_error.nextDouble() / aa - max_error;
    }

    static void addNoise(int noiseType, ArrayList<Ion> noiseList, int totNoisePeaks, Double peptideMass, Random noiseGen, Random intenGen) {
        int noiseAdded = 0;
        Double noiseMean = peptideMass / 2.0;
        Double noiseStdDev = noiseMean / 2.0;
        double currentIon;
        Double noiseInten;
        if (noiseType == 2) {
            while(noiseAdded < totNoisePeaks) {
                currentIon = noiseGen.nextGaussian() * noiseStdDev + noiseMean;
                noiseInten = noiseIntenMin + intenGen.nextDouble() * (noiseIntenMax - noiseIntenMin);
                if (!noiseList.contains(currentIon) && currentIon > 1.0 && currentIon < peptideMass + 50.0) {
                    noiseList.add(new Ion(currentIon, noiseInten * intenCon));
                    ++noiseAdded;
                }
            }
        } else if (noiseType == 1) {
            while(noiseAdded < totNoisePeaks) {
                currentIon = noiseGen.nextDouble() * peptideMass;
                noiseInten = noiseIntenMin + intenGen.nextDouble() * (noiseIntenMax - noiseIntenMin);
                if (!noiseList.contains(currentIon) && currentIon > 1.0 && currentIon < peptideMass + 50.0) {
                    noiseList.add(new Ion(currentIon, noiseInten * intenCon));
                    ++noiseAdded;
                }
            }
        } else if (noiseType == 0) {
        }

    }

    static MyPair getNextAA(String myString, int i) {
        MyPair myPair = new MyPair();
        String[] rsult = myString.split("");
        String temp = null;
        String newStr = null;
        temp = rsult[i];
        if (i + 1 < rsult.length && rsult[i + 1].equals("[")) {
            newStr = temp;

            int j;
            for(j = i + 1; !rsult[j].equals("]"); ++j) {
                newStr = newStr + rsult[j];
            }

            newStr = newStr + rsult[j];
            temp = newStr;
            myPair.myStr = newStr;
            myPair.myInt = j;
            myPair.mod = true;
        }

        if (!myPair.mod) {
            myPair.myStr = temp;
            myPair.myInt = i;
        }

        return myPair;
    }

    public static String[][] readCSV(String filePath) throws Exception  {
        //第一步，创建一个空二维数据准备存数据，创建缓冲流读取出文件的行数

        String[][] allData = null; //创建二维数组
        BufferedReader br = new BufferedReader(new FileReader(filePath));// 创建缓冲流读取行
        int lineNumber = 0;  // 记录文件行数
        while (br.readLine() != null) {//读取文件行数
            lineNumber++;
        }
        //第二步，重置缓冲流，将行数赋给数组，用字符串记录每一行的数据，用逗号分割，存入二维数组
        br = new BufferedReader(new FileReader(filePath));//将缓冲流重置
        allData = new String[lineNumber][];
        String line;  //每一行的数据
        lineNumber = 0;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");  //用一个一维数组存，将每一行元素用逗号分开
            allData[lineNumber] = data;
            lineNumber++;
        }
        //将二维数组遍历输出，先输出第一个数据，再拼接逗号
//        for (int i = 0; i < lineNumber; i++) {
//            System.out.print(allData[i][0]); //输出第i行第一个数据
//            for (int j = 1; j < allData[0].length; j++) {
//                System.out.print("," + allData[i][j]); //在第一个数据还没加逗号拼接
//            }
//            System.out.println();//换行
//        }
//        br.close();
        return allData;
    }


    public static void runSimulator(String inFileString, String outFileString, String ptmFileString, String cIonsString, String nIonsString, String cProbsString, String nProbsString, String maxChString, String maxChProbsString, String cIntenString, String nIntenString, String snrString, String noiseTypeString, String noiseMinString, String noiseMaxString, String immIonString, String immIonProbsString, String immIonIntenString, String precMinMass, String precMaxMass) throws Exception {
        Random r = new Random(System.currentTimeMillis());
        Map<String, Double> aaMasses = new HashMap();
        String gndTruth = "./peptides.rst";
        BufferedReader ptmReader = new BufferedReader(new FileReader(ptmFileString));
        readParams(cIonsString, nIonsString, cProbsString, nProbsString, maxChString, maxChProbsString, cIntenString, nIntenString, snrString, noiseTypeString, noiseMinString, noiseMaxString, immIonString, immIonProbsString, immIonIntenString, precMinMass, precMaxMass);
        populateMassTable(aaMasses, ptmReader);
        BufferedReader peptideReader = new BufferedReader(new FileReader(inFileString));
        FileWriter myPepsFile = new FileWriter(outFileString);
        PrintWriter printWriter = new PrintWriter(myPepsFile);
        FileWriter myRstFile = new FileWriter(gndTruth);
        PrintWriter rstWriter = new PrintWriter(myRstFile);
        ArrayList<Ion> bList = new ArrayList();
        ArrayList<Ion> yList = new ArrayList();
        ArrayList<Ion> ImmList = new ArrayList();
        ArrayList<Ion> noiseList = new ArrayList();
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(5);
        df.setGroupingUsed(false);
        Random noiseGen = new Random(System.currentTimeMillis());
        Random intenGen = new Random(System.currentTimeMillis());
        Random ion_error = new Random(System.currentTimeMillis());

        String myLine = null;
        boolean checkHeader = false;
        printWriter.println("H\tCreationDate\t");
        printWriter.println("H\tSNR\t" + SNR);

        Map<String, Integer> indexForRes = new HashMap();
        indexForRes.put("A", 0);
        indexForRes.put("R", 1);
        indexForRes.put("N", 2);
        indexForRes.put("D", 3);
        indexForRes.put("C", 4);
        indexForRes.put("E", 5);
        indexForRes.put("Q", 6);
        indexForRes.put("G", 7);
        indexForRes.put("H", 8);
        indexForRes.put("I", 9);
        indexForRes.put("L", 10);
        indexForRes.put("K", 11);
        indexForRes.put("M", 12);
        indexForRes.put("F", 13);
        indexForRes.put("P", 14);
        indexForRes.put("S", 15);
        indexForRes.put("T", 16);
        indexForRes.put("U", 17);
        indexForRes.put("W", 18);
        indexForRes.put("Y", 19);
        indexForRes.put("V", 20);

        Map<Integer, String[][]> probsForOffsetN = new HashMap();
        //probsForOffsetN.put(0, readCSV("prob for offset/matched nodeR CID.csv"));
        probsForOffsetN.put(0, readCSV("IGP data/b- mean.csv"));
        probsForOffsetN.put(-17, readCSV("IGP data/b-NH3 mean.csv"));
        probsForOffsetN.put(-18, readCSV("IGP data/b-H2O mean.csv"));
        probsForOffsetN.put(-28, readCSV("IGP data/a- mean.csv"));
        probsForOffsetN.put(-45, readCSV("IGP data/a-NH3 mean.csv"));
        probsForOffsetN.put(-46, readCSV("IGP data/a-H2O mean.csv"));

        Map<Integer, String[][]> probsForOffsetC = new HashMap();
        probsForOffsetC.put(0, readCSV("IGP data/y- mean.csv"));
        probsForOffsetC.put(-17, readCSV("IGP data/y-NH3 mean.csv"));
        probsForOffsetC.put(-18, readCSV("IGP data/y-H2O mean.csv"));


        Map<Integer, String[][]> varN = new HashMap();
        //probsForOffsetN.put(0, readCSV("prob for offset/matched nodeR CID.csv"));
        varN.put(0, readCSV("IGP data/b- var.csv"));
        varN.put(-17, readCSV("IGP data/b-NH3 var.csv"));
        varN.put(-18, readCSV("IGP data/b-H2O var.csv"));
        varN.put(-28, readCSV("IGP data/a- var.csv"));
        varN.put(-45, readCSV("IGP data/a-NH3 var.csv"));
        varN.put(-46, readCSV("IGP data/a-H2O var.csv"));

        Map<Integer, String[][]> varC = new HashMap();
        varC.put(0, readCSV("IGP data/y- var.csv"));
        varC.put(-17, readCSV("IGP data/y-NH3 var.csv"));
        varC.put(-18, readCSV("IGP data/y-H2O var.csv"));




        while((myLine = peptideReader.readLine()) != null) {
            if (!checkHeader) {
                checkHeader = true;
            } else {
                //double peptideMassN = 18.015 + (double)cTermOff + (double)nTermOff;
                double peptideMassN = 18.0106 + (double)cTermOff + (double)nTermOff;
                double bSeries = (double)(0.0F + nTermOff);
                double ySeries = 0.0;
                int subScriptB = 0;
                int subScriptY = 0;
                String peptideStr = myLine;

                MyPair c;
                for(int k = 0; k < peptideStr.length(); k = c.myInt + 1) {
                    c = getNextAA(peptideStr, k);
                    peptideMassN += (Double)aaMasses.get(c.myStr);
                }



                if (peptideMassN > minMass && peptideMassN < maxMass) {
                    ++count;
                    int totYions = 0;
                    int totBions = 0;
                    int ionsGen = 0;
                    //ySeries = peptideMassN - bSeries + 1.0;
                    ySeries = peptideMassN - bSeries;

                    int l;
                    for(l = 0; l < immoniumIonsAA.size(); ++l) {
                        System.out.println(immoniumIonsAA.get(l));
                        if (getSelection((Double)ImmProbs.get(l), r)) {

                        ImmList.add(new Ion((Double)aaMasses.get(immoniumIonsAA.get(l)) - 26.99 + genError(ion_error, max_ion_err), (Double)ImmIntens.get(l) * intenCon));}
                    }


                    Ion tempY;
                    for(l = 0; l < ionOffsetsC.size(); ++l) {
                        tempY = new Ion(ySeries + (Double)ionOffsetsC.get(l) + genError(ion_error, max_ion_err), (Double)ionIntensitiesC.get(l) * intenCon);
                        if (tempY.m_z > 0.0 && getSelection((Double)ionProbsC.get(l), r)) {
                            yList.add(tempY);
                            ++ionsGen;
                            if ((Double)ionOffsetsC.get(l) == 0.0) {
                                ++totYions;
                            }
                        }
                    }


                    l = 0;

                    label134:
                    while(true) {
                        int i;
                        if (l >= peptideStr.length()) {

                            //i = (int)((double)(100 * (totBions + totYions)) / SNR);
                            double w_ols = 0.03289;
                            double b_ols = 2.99537;
                            int peak_num = (int)Math.round((peptideMassN * w_ols + b_ols - 2.0) / 2.0);
                            i = peak_num;
                            int totNoisePeaks = i - ionsGen;
                            bList.removeAll(yList);
                            bList.removeAll(ImmList);
                            bList.addAll(yList);
                            bList.addAll(ImmList);

                            addNoise(noiseType, noiseList, totNoisePeaks, peptideMassN, noiseGen, intenGen);
                            noiseList.removeAll(bList);
                            noiseList.addAll(bList);
                            noiseList.sort(comp);
                            System.out.println("Mass: " +peptideMassN + "matched peak" + (totBions + totYions) + ", total peaks" + 2 * noiseList.size() + ", prob" + ((double)(totBions + totYions) / (2*noiseList.size())));
                            int maxCharge = ionCharges.size() > 0 ? (Integer)ionCharges.get(ionCharges.size() - 1) : 1;
                            rstWriter.println("scan:" + count + " peptide:" + peptideStr);
                            //printWriter.println("S\t" + count + "\t" + count + "\t" + df.format((peptideMassN + (double)maxCharge) / (double)maxCharge));
                            printWriter.println("S\t" + count + "\t" + count + "\t" + df.format(peptideMassN / (double)maxCharge + 1.007276466879));
                            printWriter.println("Z\t" + maxCharge + "\t" +df.format(peptideMassN));
                            Iterator var61 = noiseList.iterator();

                            while(true) {
                                if (!var61.hasNext()) {
                                    break label134;
                                }

                                Ion b = (Ion)var61.next();
                                if (b.m_z != 0.0) {
                                    printWriter.println(df.format(b.m_z) + " " + df.format(b.intensity));
                                }
                            }
                        }

                        MyPair myChar = getNextAA(peptideStr, l);

                        ++subScriptB;
                        subScriptY = peptideStr.length() - subScriptB;
                        bSeries += (Double)aaMasses.get(myChar.myStr);
                        //ySeries = peptideMassN - bSeries + 2.0;
                        ySeries = peptideMassN - bSeries;

                        //Ion tempY;
                        for(i = 0; i < ionOffsetsN.size(); ++i) {
                            tempY = new Ion(bSeries + (Double)ionOffsetsN.get(i) + genError(ion_error, max_ion_err), (Double)ionIntensitiesN.get(i) * intenCon);
                            double mean;
                            double var;
                            mean = Double.parseDouble(probsForOffsetN.get((int) Math.ceil(ionOffsetsN.get(i)))[(int) (peptideMassN / 10000)][indexForRes.get(myChar.myStr.substring(0,1))]);
                            var = Double.parseDouble(varN.get((int) Math.ceil(ionOffsetsN.get(i)))[(int) (peptideMassN / 10000)][indexForRes.get(myChar.myStr.substring(0,1))]);

                            double prob = noiseGen.nextGaussian() * Math.sqrt(var) + mean;


                            if (tempY.m_z > 0.0 && getSelection((Double)prob * 100, r)) {
                                ++ionsGen;
                                bList.add(tempY);
                                if ((Double)ionOffsetsN.get(i) == 0.0) {
                                    ++totBions;
                                }
                            }
                        }



                        if(myChar.myInt + 1 < peptideStr.length()) {
                            MyPair myChar_nxt = getNextAA(peptideStr, myChar.myInt + 1);
                            //System.out.println(myChar_nxt.myStr);
                            //System.out.println(myChar_nxt.myStr.substring(0,1));
                            for (i = 0; i < ionOffsetsC.size(); ++i) {
                                tempY = new Ion(ySeries + (Double) ionOffsetsC.get(i) + genError(ion_error, max_ion_err), (Double) ionIntensitiesC.get(i) * intenCon);
                                double mean = Double.parseDouble(probsForOffsetC.get((int)Math.ceil(ionOffsetsC.get(i)))[(int)(peptideMassN / 10000)][indexForRes.get(myChar_nxt.myStr.substring(0,1))]);
                                double var = Double.parseDouble(varC.get((int)Math.ceil(ionOffsetsC.get(i)))[(int)(peptideMassN / 10000)][indexForRes.get(myChar_nxt.myStr.substring(0,1))]);
                                double prob = noiseGen.nextGaussian() * Math.sqrt(var) + mean;


                                if (tempY.m_z > 0.0 && getSelection((Double) prob * 100, r)) {
                                    yList.add(tempY);
                                    ++ionsGen;

                                    if ((Double) ionOffsetsC.get(i) == 0.0) {
                                        ++totYions;
                                    }
                                }
                            }
                        }



                        l = myChar.myInt + 1;
                    }
                }
            }

            bList.clear();
            yList.clear();
            noiseList.clear();
            ImmList.clear();
        }

        printWriter.flush();
        printWriter.close();
        rstWriter.flush();
        rstWriter.close();
        JOptionPane.showMessageDialog((Component)null, "Smulation Complete", "System Message: ", 1);
    }
}
