//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package guitest;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class guiTest extends JFrame {
    String inFileString;
    String outFileString;
    String ptmFileString;
    String cIonsString;
    String nIonsString;
    String cProbsString;
    String nProbsString;
    String maxChString;
    String maxChProbsString;
    String cIntenString;
    String nIntenString;
    String snrString;
    String noiseTypeString;
    String noiseMinString;
    String noiseMaxString;
    String immIonString;
    String immIonProbsString;
    String immIonIntenString;
    String precMinMass;
    String precMaxMass;
    private JTextArea cIGPText;
    private JTextArea cIntenText;
    private JTextArea cMassesText;
    private JTextArea immAcidsText;
    private JTextArea immIGPtext;
    private JTextArea immIntenText;
    private JButton inButton;
    private JLabel inFileText;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JMenuBar jMenuBar1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane10;
    private JScrollPane jScrollPane11;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    private JScrollPane jScrollPane5;
    private JScrollPane jScrollPane6;
    private JScrollPane jScrollPane7;
    private JScrollPane jScrollPane8;
    private JScrollPane jScrollPane9;
    private JTabbedPane jTabbedPane4;
    private JButton modButton;
    private JLabel modFileText;
    private JTextField modsAllowed;
    private JTextArea mulChargText;
    private JTextArea mulIGPtext;
    private JCheckBox myCheckBox;
    private JFileChooser myChooser;
    private JTextArea nIGPText;
    private JTextArea nIntenText;
    private JTextArea nMassesText;
    private JTextField noiseMaxText;
    private JTextField noiseMinText;
    private JSpinner noiseTypeText;
    private JButton outButton;
    private JLabel outFileText;
    private JTextField posText;
    private JTextField precMaxText;
    private JTextField precMinText;
    private JTextField probModi;

    public guiTest() {
        this.initComponents();
        this.inFileText.setText("");
        this.outFileText.setText("");
        this.modFileText.setText("");
        this.cMassesText.setText("");
        this.cIGPText.setText("");
        this.cIntenText.setText("");
        this.nMassesText.setText("");
        this.nIGPText.setText("");
        this.nIntenText.setText("");
        this.immAcidsText.setText("");
        this.immIGPtext.setText("");
        this.immIntenText.setText("");
        this.mulChargText.setText("");
        this.mulIGPtext.setText("");
        this.noiseTypeText.setValue(2);
        this.noiseMinText.setText("");
        this.noiseMaxText.setText("");
        this.precMinText.setText("");
        this.precMaxText.setText("");
        this.posText.setText("");
    }

    private void initComponents() {
        this.myChooser = new JFileChooser();
        this.inButton = new JButton();
        this.modButton = new JButton();
        this.outButton = new JButton();
        this.inFileText = new JLabel();
        this.modFileText = new JLabel();
        this.outFileText = new JLabel();
        this.jTabbedPane4 = new JTabbedPane();
        this.jPanel1 = new JPanel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.cIGPText = new JTextArea();
        this.jScrollPane2 = new JScrollPane();
        this.cMassesText = new JTextArea();
        this.jScrollPane3 = new JScrollPane();
        this.cIntenText = new JTextArea();
        this.jPanel2 = new JPanel();
        this.jPanel3 = new JPanel();
        this.jLabel6 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jLabel8 = new JLabel();
        this.jScrollPane4 = new JScrollPane();
        this.nIGPText = new JTextArea();
        this.jScrollPane5 = new JScrollPane();
        this.nMassesText = new JTextArea();
        this.jScrollPane6 = new JScrollPane();
        this.nIntenText = new JTextArea();
        this.jPanel4 = new JPanel();
        this.jLabel9 = new JLabel();
        this.jLabel10 = new JLabel();
        this.jScrollPane7 = new JScrollPane();
        this.immAcidsText = new JTextArea();
        this.jScrollPane8 = new JScrollPane();
        this.immIGPtext = new JTextArea();
        this.jScrollPane9 = new JScrollPane();
        this.immIntenText = new JTextArea();
        this.jLabel11 = new JLabel();
        this.jPanel5 = new JPanel();
        this.jScrollPane10 = new JScrollPane();
        this.mulChargText = new JTextArea();
        this.jScrollPane11 = new JScrollPane();
        this.mulIGPtext = new JTextArea();
        this.jLabel13 = new JLabel();
        this.jLabel14 = new JLabel();
        this.jPanel6 = new JPanel();
        this.jLabel1 = new JLabel();
        this.noiseTypeText = new JSpinner();
        this.jLabel2 = new JLabel();
        this.jLabel12 = new JLabel();
        this.noiseMinText = new JTextField();
        this.noiseMaxText = new JTextField();
        this.jLabel15 = new JLabel();
        this.jLabel16 = new JLabel();
        this.jLabel20 = new JLabel();
        this.posText = new JTextField();
        this.jPanel7 = new JPanel();
        this.jLabel17 = new JLabel();
        this.precMinText = new JTextField();
        this.jLabel18 = new JLabel();
        this.jLabel19 = new JLabel();
        this.precMaxText = new JTextField();
        this.jPanel8 = new JPanel();
        this.myCheckBox = new JCheckBox();
        this.modsAllowed = new JTextField();
        this.probModi = new JTextField();
        this.jLabel21 = new JLabel();
        this.jLabel22 = new JLabel();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.jButton4 = new JButton();
        this.jMenuBar1 = new JMenuBar();
        this.myChooser.setDialogTitle("my dialog box");
        this.setDefaultCloseOperation(3);
        this.inButton.setText("Input File");
        this.inButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                guiTest.this.inButtonActionPerformed(evt);
            }
        });
        this.modButton.setText("Modification File");
        this.modButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                guiTest.this.modButtonActionPerformed(evt);
            }
        });
        this.outButton.setText("Output File");
        this.outButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                guiTest.this.outButtonActionPerformed(evt);
            }
        });
        this.jTabbedPane4.setBorder(BorderFactory.createBevelBorder(0));
        this.jLabel3.setText("Mass Offsets");
        this.jLabel4.setText("<html><p>Ion Generation Probabilities</p></html>");
        this.jLabel5.setText("Ion Intensities");
        this.cIGPText.setColumns(20);
        this.cIGPText.setRows(5);
        this.jScrollPane1.setViewportView(this.cIGPText);
        this.cMassesText.setColumns(20);
        this.cMassesText.setRows(5);
        this.jScrollPane2.setViewportView(this.cMassesText);
        this.cIntenText.setColumns(20);
        this.cIntenText.setRows(5);
        this.jScrollPane3.setViewportView(this.cIntenText);
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(52, 52, 52).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel5).addComponent(this.jLabel4, -2, 124, -2).addComponent(this.jLabel3, -2, 109, -2)).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jScrollPane2, -1, 503, 32767).addComponent(this.jScrollPane1).addComponent(this.jScrollPane3)).addGap(61, 61, 61)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(38, 38, 38).addComponent(this.jLabel3).addGap(40, 40, 40)).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane2, -2, 65, -2).addPreferredGap(ComponentPlacement.RELATED))).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel4, -2, -1, -2).addComponent(this.jScrollPane1, -2, 64, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jScrollPane3, -2, 64, -2).addGroup(jPanel1Layout.createSequentialGroup().addGap(17, 17, 17).addComponent(this.jLabel5))).addContainerGap(-1, 32767)));
        this.jTabbedPane4.addTab("C-Ions", this.jPanel1);
        this.jLabel6.setText("Mass Offsets");
        this.jLabel7.setText("<html><p>Ion Generation Probabilities</p></html>");
        this.jLabel8.setText("Ion Intensities");
        this.nIGPText.setColumns(20);
        this.nIGPText.setRows(5);
        this.jScrollPane4.setViewportView(this.nIGPText);
        this.nMassesText.setColumns(20);
        this.nMassesText.setRows(5);
        this.jScrollPane5.setViewportView(this.nMassesText);
        this.nIntenText.setColumns(20);
        this.nIntenText.setRows(5);
        this.jScrollPane6.setViewportView(this.nIntenText);
        GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
        this.jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(32, 32, 32).addComponent(this.jLabel6, -2, 143, -2)).addGroup(Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addContainerGap().addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel8).addComponent(this.jLabel7, -2, 143, -2)))).addGap(18, 18, 18).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jScrollPane4, Alignment.TRAILING, -1, 505, 32767).addComponent(this.jScrollPane5, Alignment.TRAILING).addComponent(this.jScrollPane6, Alignment.TRAILING)).addGap(154, 154, 154)));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(32, 32, 32).addComponent(this.jLabel6).addGap(45, 45, 45)).addGroup(Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane5, -2, 65, -2).addPreferredGap(ComponentPlacement.RELATED))).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel7, -2, 53, -2).addComponent(this.jScrollPane4, -2, 64, -2)).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel8).addGap(56, 56, 56)).addGroup(jPanel3Layout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jScrollPane6, -2, 61, -2).addContainerGap(32, 32767)))));
        GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGap(0, 852, 32767).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jPanel3, -2, -1, -2).addGap(0, 0, 32767))));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGap(0, 263, 32767).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jPanel3, -2, -1, -2).addGap(0, 0, 32767))));
        this.jTabbedPane4.addTab("N-Ions", this.jPanel2);
        this.jLabel9.setText("Amino Acids");
        this.jLabel10.setText("<html><p>Ion Generation Probabilities</p></html>");
        this.immAcidsText.setColumns(20);
        this.immAcidsText.setRows(5);
        this.jScrollPane7.setViewportView(this.immAcidsText);
        this.immIGPtext.setColumns(20);
        this.immIGPtext.setRows(5);
        this.jScrollPane8.setViewportView(this.immIGPtext);
        this.immIntenText.setColumns(20);
        this.immIntenText.setRows(5);
        this.jScrollPane9.setViewportView(this.immIntenText);
        this.jLabel11.setText("Ion Intensities");
        GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
        this.jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel9, -2, 113, -2).addComponent(this.jLabel10, -2, 150, -2).addComponent(this.jLabel11)).addGap(36, 36, 36).addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jScrollPane9, -2, 486, -2).addComponent(this.jScrollPane8, -2, 486, -2).addComponent(this.jScrollPane7, -2, 486, -2)).addContainerGap(37, 32767)));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addGap(34, 34, 34).addComponent(this.jLabel9).addGap(43, 43, 43)).addGroup(Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane7, -2, 64, -2).addPreferredGap(ComponentPlacement.RELATED))).addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel10, -2, 53, -2).addComponent(this.jScrollPane8, -2, 64, -2)).addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel11).addContainerGap(-1, 32767)).addGroup(jPanel4Layout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jScrollPane9, -2, 64, -2).addContainerGap(-1, 32767)))));
        this.jTabbedPane4.addTab("Immonium Ions", this.jPanel4);
        this.mulChargText.setColumns(20);
        this.mulChargText.setRows(5);
        this.jScrollPane10.setViewportView(this.mulChargText);
        this.mulIGPtext.setColumns(20);
        this.mulIGPtext.setRows(5);
        this.jScrollPane11.setViewportView(this.mulIGPtext);
        this.jLabel13.setText("<html><p>Ion Generation Probabilities</p></html>");
        this.jLabel14.setText("Charges");
        GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
        this.jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGap(28, 28, 28).addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel14, -2, 95, -2).addComponent(this.jLabel13, -2, 154, -2)).addGap(30, 30, 30).addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jScrollPane10, Alignment.TRAILING, -1, 486, 32767).addComponent(this.jScrollPane11, Alignment.TRAILING)).addContainerGap(26, 32767)));
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGap(32, 32, 32).addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addComponent(this.jScrollPane10, -2, 63, -2).addGap(35, 35, 35).addComponent(this.jScrollPane11, -2, 61, -2).addContainerGap(-1, 32767)).addGroup(jPanel5Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(this.jLabel14).addGap(68, 68, 68).addComponent(this.jLabel13).addGap(86, 86, 86)))));
        this.jTabbedPane4.addTab("Multiple Charged Ions", this.jPanel5);
        this.jLabel1.setText("Noise Type");
        this.jLabel2.setText("0: no noise, 1: Uniform Noise, 2: Guassian Noise");
        this.jLabel12.setText("Intensity Range");
        this.noiseMinText.setText("Min Intensity");
        this.noiseMinText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                guiTest.this.noiseMinTextActionPerformed(evt);
            }
        });
        this.noiseMaxText.setText("Max Intensity");
        this.noiseMaxText.setAutoscrolls(false);
        this.noiseMaxText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                guiTest.this.noiseMaxTextActionPerformed(evt);
            }
        });
        this.jLabel15.setText("Min");
        this.jLabel16.setText("Max");
        this.jLabel20.setText("POS");
        this.posText.setText("Noise");
        this.posText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                guiTest.this.posTextActionPerformed(evt);
            }
        });
        GroupLayout jPanel6Layout = new GroupLayout(this.jPanel6);
        this.jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addGap(273, 273, 273).addComponent(this.jLabel12)).addGroup(jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout.createParallelGroup(Alignment.TRAILING, false).addGroup(Alignment.LEADING, jPanel6Layout.createSequentialGroup().addComponent(this.jLabel20).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.posText, -2, 75, -2)).addGroup(Alignment.LEADING, jPanel6Layout.createSequentialGroup().addComponent(this.jLabel1).addGap(18, 18, 18).addComponent(this.noiseTypeText, -2, -1, -2))).addGap(47, 47, 47).addComponent(this.jLabel2, -2, 424, -2)))).addGroup(jPanel6Layout.createSequentialGroup().addGap(178, 178, 178).addComponent(this.jLabel15).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.noiseMinText, -2, 80, -2).addGap(70, 70, 70).addComponent(this.jLabel16).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.noiseMaxText, -2, 83, -2))).addContainerGap(109, 32767)));
        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel6Layout.createSequentialGroup().addGap(34, 34, 34).addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel1).addComponent(this.noiseTypeText, -2, -1, -2).addComponent(this.jLabel2)).addGap(27, 27, 27).addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel20).addComponent(this.posText, -2, 34, -2)).addPreferredGap(ComponentPlacement.RELATED, 21, 32767).addComponent(this.jLabel12).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.noiseMinText).addComponent(this.noiseMaxText).addComponent(this.jLabel15).addComponent(this.jLabel16)).addGap(41, 41, 41)));
        this.jTabbedPane4.addTab("Noise Settings", this.jPanel6);
        this.jLabel17.setText("Precursor Mass Range:");
        this.precMinText.setText("Min Mass");
        this.precMinText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                guiTest.this.precMinTextActionPerformed(evt);
            }
        });
        this.jLabel18.setText("Min");
        this.jLabel19.setText("Max");
        this.precMaxText.setText("Max Mass");
        this.precMaxText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                guiTest.this.precMaxTextActionPerformed(evt);
            }
        });
        GroupLayout jPanel7Layout = new GroupLayout(this.jPanel7);
        this.jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addGap(120, 120, 120).addComponent(this.jLabel17).addGap(44, 44, 44).addComponent(this.jLabel18).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.precMinText, -1, 56, 32767).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jLabel19).addGap(4, 4, 4).addComponent(this.precMaxText, -1, 59, 32767).addContainerGap(215, 32767)));
        jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addGap(35, 35, 35).addGroup(jPanel7Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel17).addComponent(this.precMinText).addComponent(this.precMaxText).addComponent(this.jLabel18).addComponent(this.jLabel19)).addContainerGap(184, 32767)));
        this.jTabbedPane4.addTab("Other Settings", this.jPanel7);
        this.myCheckBox.setText("Post Translational Modifications have been correctly formatted in my input file");
        this.myCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                guiTest.this.myCheckBoxActionPerformed(evt);
            }
        });
        this.modsAllowed.setText("0");
        this.probModi.setText("0");
        this.jLabel21.setText("Number of modifications allowed per peptide");
        this.jLabel22.setText("% Probability that each peptide will contain a modification");
        GroupLayout jPanel8Layout = new GroupLayout(this.jPanel8);
        this.jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addGap(47, 47, 47).addComponent(this.myCheckBox)).addGroup(jPanel8Layout.createSequentialGroup().addGap(73, 73, 73).addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel21).addComponent(this.jLabel22)).addGap(36, 36, 36).addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING).addComponent(this.probModi, -2, -1, -2).addComponent(this.modsAllowed, -2, -1, -2)))).addContainerGap(94, 32767)));
        jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel8Layout.createSequentialGroup().addContainerGap().addComponent(this.myCheckBox).addGap(49, 49, 49).addGroup(jPanel8Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel21).addComponent(this.modsAllowed, -2, -1, -2)).addGap(48, 48, 48).addGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING).addComponent(this.probModi, -2, -1, -2).addComponent(this.jLabel22)).addContainerGap(55, 32767)));
        this.jTabbedPane4.addTab("Input File Formatting", this.jPanel8);
        this.jButton1.setText("Initialize Settings");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                guiTest.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton2.setText("Load Default");
        this.jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                guiTest.this.jButton2ActionPerformed(evt);
            }
        });
        this.jButton3.setText("SIMULATE");
        this.jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                guiTest.this.jButton3ActionPerformed(evt);
            }
        });
        this.jButton4.setText("About");
        this.jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                guiTest.this.jButton4ActionPerformed(evt);
            }
        });
        this.setJMenuBar(this.jMenuBar1);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(147, 147, 147).addComponent(this.jButton1).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton2, -2, 139, -2).addGap(131, 131, 131)).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(Alignment.TRAILING).addComponent(this.jTabbedPane4, -2, 733, -2).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.TRAILING, false).addComponent(this.modButton, Alignment.LEADING, -1, -1, 32767).addComponent(this.inButton, Alignment.LEADING, -1, -1, 32767).addComponent(this.outButton, -1, -1, 32767)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.TRAILING, false).addComponent(this.modFileText, -1, -1, 32767).addComponent(this.inFileText, -1, -1, 32767).addComponent(this.outFileText, -1, 594, 32767)))).addContainerGap(44, 32767)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jButton4)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jButton3, -2, 222, -2).addGap(263, 263, 263)));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jButton4).addGap(35, 35, 35).addGroup(layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.inButton).addGroup(layout.createSequentialGroup().addGap(4, 4, 4).addComponent(this.inFileText, -1, -1, 32767))).addGap(18, 18, 18).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.modButton).addComponent(this.modFileText)).addGap(27, 27, 27).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.outButton).addComponent(this.outFileText)).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.jTabbedPane4, -2, 305, -2).addGap(18, 18, 18).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jButton1).addComponent(this.jButton2)).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jButton3).addGap(9, 9, 9)));
        this.pack();
    }

    private void inButtonActionPerformed(ActionEvent evt) {
        int returnVal = this.myChooser.showOpenDialog(this);
        if (returnVal == 0) {
            File file = this.myChooser.getSelectedFile();
            this.inFileText.setText(file.getAbsolutePath());
        } else {
            System.out.println("File access cancelled by user.");
        }

    }

    private void modButtonActionPerformed(ActionEvent evt) {
        int returnVal = this.myChooser.showOpenDialog(this);
        if (returnVal == 0) {
            File file = this.myChooser.getSelectedFile();
            this.modFileText.setText(file.getAbsolutePath());
        } else {
            System.out.println("File access cancelled by user.");
        }

    }

    private void outButtonActionPerformed(ActionEvent evt) {
        int returnVal = this.myChooser.showOpenDialog(this);
        if (returnVal == 0) {
            File file = this.myChooser.getSelectedFile();
            this.outFileText.setText(file.getAbsolutePath());
        } else {
            System.out.println("File access cancelled by user.");
        }

    }

    private void noiseMinTextActionPerformed(ActionEvent evt) {
    }

    private void noiseMaxTextActionPerformed(ActionEvent evt) {
    }

    private void precMinTextActionPerformed(ActionEvent evt) {
    }

    private void precMaxTextActionPerformed(ActionEvent evt) {
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        this.cMassesText.setText("0 -18.015 -17.013");
        this.cIGPText.setText("70 70 70");
        this.cIntenText.setText("1.75 0.25 0.25");
        this.nMassesText.setText("0 -18.015 -17.013 -28.01 -45.023 -46.025");
        this.nIGPText.setText("70 70 70 70 70 70");
        this.nIntenText.setText("1.5 0.75 0.75 0.45 0.35 0.35");
        this.immAcidsText.setText("M D Q K E");
        this.immIGPtext.setText("40 40 40 40 40");
        this.immIntenText.setText("0.02 0.02 0.02 0.02 0.02");
        this.mulChargText.setText("2");
        this.mulIGPtext.setText("0");
        this.noiseTypeText.setValue(2);
        this.noiseMinText.setText("0.01");
        this.noiseMaxText.setText("0.02");
        this.precMinText.setText("100");
        this.precMaxText.setText("60000");
        this.posText.setText("3.0");
        this.probModi.setText("0");
        this.modsAllowed.setText("0");
        this.myCheckBox.setSelected(true);
        JOptionPane.showMessageDialog((Component)null, "default parameters set, click Initialize Settings to initialize and then click SIMULATE to execute.", "Default Set", 1);
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog((Component)null, "This is MaSS-Simulator GUI version 1.0 \n report bugs at: fsaeed@fiu.edu \n if you use this tool, please cite us using: \n Muaaz G. Awan and Fahad Saeed, \"MaSS-Simulator: A highly \n configurable simulator for generating MS/MS datasets \n for benchmarking of proteomics algorithms\", \n Wiley Proteomics, September 2018", "MaSS-Simulator 1.0", 1);
    }

    private void posTextActionPerformed(ActionEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        this.inFileString = this.inFileText.getText();
        this.outFileString = this.outFileText.getText();
        this.ptmFileString = this.modFileText.getText();
        this.cIonsString = this.cMassesText.getText();
        this.nIonsString = this.nMassesText.getText();
        this.cProbsString = this.cIGPText.getText();
        this.nProbsString = this.nIGPText.getText();
        this.maxChString = this.mulChargText.getText();
        this.maxChProbsString = this.mulIGPtext.getText();
        this.cIntenString = this.cIntenText.getText();
        this.nIntenString = this.nIntenText.getText();
        this.snrString = this.posText.getText();
        this.noiseTypeString = this.noiseTypeText.getValue().toString();
        this.noiseMinString = this.noiseMinText.getText();
        this.noiseMaxString = this.noiseMaxText.getText();
        this.immIonString = this.immAcidsText.getText();
        this.immIonProbsString = this.immIGPtext.getText();
        this.immIonIntenString = this.immIntenText.getText();
        this.precMinMass = this.precMinText.getText();
        this.precMaxMass = this.precMaxText.getText();
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        if (!this.inFileString.isEmpty() && !this.outFileString.isEmpty() && !this.ptmFileString.isEmpty() && !this.cIonsString.isEmpty() && !this.nIonsString.isEmpty() && !this.cProbsString.isEmpty() && !this.nProbsString.isEmpty() && !this.maxChString.isEmpty() && !this.maxChProbsString.isEmpty() && !this.cIntenString.isEmpty() && !this.nIntenString.isEmpty() && !this.snrString.isEmpty() && !this.noiseTypeString.isEmpty() && !this.noiseMinString.isEmpty() && !this.noiseMaxString.isEmpty() && !this.immIonString.isEmpty() && !this.immIonProbsString.isEmpty() && !this.immIonIntenString.isEmpty() && !this.precMinMass.isEmpty() && !this.precMaxMass.isEmpty() && this.inFileString != null && this.outFileString != null && this.ptmFileString != null && this.cIonsString != null && this.nIonsString != null && this.cProbsString != null && this.nProbsString != null && this.maxChString != null && this.maxChProbsString != null && this.cIntenString != null && this.nIntenString != null && this.snrString != null && this.noiseTypeString != null && this.noiseMinString != null && this.noiseMaxString != null && this.immIonString != null && this.immIonProbsString != null && this.immIonIntenString != null && this.precMinMass != null && this.precMaxMass != null) {
            try {
                ModiAdd.callModiAdd(this.inFileString, this.inFileString + ".temp", this.ptmFileString, Integer.parseInt(this.modsAllowed.getText()), Double.parseDouble(this.probModi.getText()));
                SimSpec.runSimulator(this.inFileString + ".temp", this.outFileString, this.ptmFileString, this.cIonsString, this.nIonsString, this.cProbsString, this.nProbsString, this.maxChString, this.maxChProbsString, this.cIntenString, this.nIntenString, this.snrString, this.noiseTypeString, this.noiseMinString, this.noiseMaxString, this.immIonString, this.immIonProbsString, this.immIonIntenString, this.precMinMass, this.precMaxMass);
            } catch (Exception var5) {
                Exception ex = var5;
                Logger.getLogger(guiTest.class.getName()).log(Level.SEVERE, (String)null, var5);
                JOptionPane.showMessageDialog((Component)null, "An exception occured:" + var5, "Exception", 1);

                try {
                    System.setErr(new PrintStream(new FileOutputStream("error.log")));
                    ex.printStackTrace();
                } catch (FileNotFoundException var4) {
                }
            }
        } else {
            JOptionPane.showMessageDialog((Component)null, "Please set all the paramters or press Load Default for default parameters and press Initialize Settings before running Simulation", "Error Config", 1);
        }

    }

    private void myCheckBoxActionPerformed(ActionEvent evt) {
        if (this.myCheckBox.isSelected()) {
            this.probModi.setText("0");
            this.probModi.setEditable(false);
            this.modsAllowed.setText("0");
            this.modsAllowed.setEditable(false);
        } else {
            this.probModi.setText("0");
            this.probModi.setEditable(true);
            this.modsAllowed.setText("0");
            this.modsAllowed.setEditable(true);
        }

    }
}

