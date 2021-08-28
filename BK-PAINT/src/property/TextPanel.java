/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package property;

import java.awt.Font;
import java.awt.event.ActionEvent;
/**
 *
 * @author Khanh
 */
public class TextPanel extends javax.swing.JPanel {

    private static final int PLAIN = Font.PLAIN;
    private static final int BOLD = Font.BOLD;
    private static final int ITALIC = Font.ITALIC;

    private String fontName;
    private int fontSize;
    private int fontStyle;
    
    private boolean isOpaque;

    private Font font;

    /**
     * Creates new form TextPanel
     */
    public TextPanel() {
        initComponents();
        this.setFontName("Agency FB");
        this.setFontStyle(PLAIN);
        this.setFontSize(8);
        this.setFont(fontName, fontStyle, fontSize);
    }
    
    public void setIsOpaque(boolean isOpaque){
        this.isOpaque = isOpaque;
    }
    
    public boolean getIsOpaque(){
        return this.isOpaque;
    }

    public void setFont(String fontName, int fontStyle, int fontSize) {
        this.font = new Font(fontName, fontStyle, fontSize);
    }

    @Override
    public Font getFont() {
        return this.font;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public String getFontName() {
        return this.fontName;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public int getFontSize() {
        return this.fontSize;
    }

    public void setFontStyle(int fontStyle) {
        this.fontStyle = fontStyle;
    }

    public int getFontStyle() {
        return this.fontStyle;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup3 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        bBOLD = new javax.swing.JToggleButton();
        bITALIC = new javax.swing.JToggleButton();
        bOpaque = new javax.swing.JToggleButton();
        bTransparent = new javax.swing.JToggleButton();
        bPLAIN = new javax.swing.JToggleButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Agency FB", "Aharoni", "Algerian", "Andalus", "Angsana New", "AngsanaUPC", "Aparajita", "Arabic Typesetting", "Arial", "Arial Black", "Arial Narrow", "Arial Rounded MT Bold", "Arial Unicode MS", "Baskerville Old Face", "Batang", "BatangChe", "Bauhaus 93", "Bell MT", "Berlin Sans FB", "Berlin Sans FB Demi", "Bernard MT Condensed", "Blackadder ITC", "Bodoni MT", "Bodoni MT Black", "Bodoni MT Condensed", "Bodoni MT Poster Compressed", "Book Antiqua", "Bookman Old Style", "Bookshelf Symbol 7", "Bradley Hand ITC", "Britannic Bold", "Broadway", "Browallia New", "BrowalliaUPC", "Brush Script MT", "Calibri", "Calibri Light", "Californian FB", "Calisto MT", "Cambria", "Cambria Math", "Candara", "Castellar", "Centaur", "Century", "Century Gothic", "Century Schoolbook", "Chiller", "Colonna MT", "Comic Sans MS", "Consolas", "Constantia", "Cooper Black", "Copperplate Gothic Bold", "Copperplate Gothic Light", "Corbel", "Cordia New", "CordiaUPC", "Courier New", "Curlz MT", "DaunPenh", "David", "DFKai-SB", "Dialog", "DialogInput", "DilleniaUPC", "DokChampa", "Dotum", "DotumChe", "Ebrima", "Edwardian Script ITC", "Elephant", "Engravers MT", "Eras Bold ITC", "Eras Demi ITC", "Eras Light ITC", "Eras Medium ITC", "Estrangelo Edessa", "Euclid", "Euclid Extra", "Euclid Fraktur", "Euclid Math One", "Euclid Math Two", "Euclid Symbol", "EucrosiaUPC", "Euphemia", "FangSong", "Felix Titling", "Fences", "Footlight MT Light", "Forte", "Franklin Gothic Book", "Franklin Gothic Demi", "Franklin Gothic Demi Cond", "Franklin Gothic Heavy", "Franklin Gothic Medium", "Franklin Gothic Medium Cond", "FrankRuehl", "FreesiaUPC", "Freestyle Script", "French Script MT", "Gabriola", "Garamond", "Gautami", "Georgia", "Gigi", "Gill Sans MT", "Gill Sans MT Condensed", "Gill Sans MT Ext Condensed Bold", "Gill Sans Ultra Bold", "Gill Sans Ultra Bold Condensed", "Gisha", "Gloucester MT Extra Condensed", "Goudy Old Style", "Goudy Stout", "Gulim", "GulimChe", "Gungsuh", "GungsuhChe", "Haettenschweiler", "Harlow Solid Italic", "Harrington", "High Tower Text", "Impact", "Imprint MT Shadow", "Informal Roman", "IrisUPC", "Iskoola Pota", "JasmineUPC", "Jokerman", "Juice ITC", "KaiTi", "Kalinga", "Kartika", "Khmer UI", "KodchiangUPC", "Kokila", "Kristen ITC", "Kunstler Script", "Lao UI", "Latha", "Leelawadee", "Levenim MT", "LilyUPC", "Lingoes Unicode", "Lucida Bright", "Lucida Calligraphy", "Lucida Console", "Lucida Fax", "Lucida Handwriting", "Lucida Sans", "Lucida Sans Typewriter", "Lucida Sans Unicode", "Magneto", "Maiandra GD", "Malgun Gothic", "Mangal", "Marlett", "Matura MT Script Capitals", "Meiryo", "Meiryo UI", "Microsoft Himalaya", "Microsoft JhengHei", "Microsoft New Tai Lue", "Microsoft PhagsPa", "Microsoft Sans Serif", "Microsoft Tai Le", "Microsoft Uighur", "Microsoft YaHei", "Microsoft Yi Baiti", "MingLiU", "MingLiU-ExtB", "MingLiU_HKSCS", "MingLiU_HKSCS-ExtB", "Miriam", "Miriam Fixed", "Mistral", "Modern No. 20", "Mongolian Baiti", "Monospaced", "Monotype Corsiva", "MoolBoran", "MS Gothic", "MS Mincho", "MS Outlook", "MS PGothic", "MS PMincho", "MS Reference Sans Serif", "MS Reference Specialty", "MS UI Gothic", "MT Extra", "MT Extra Tiger", "MV Boli", "Narkisim", "Niagara Engraved", "Niagara Solid", "NSimSun", "Nyala", "OCR A Extended", "Old English Text MT", "Onyx", "Palace Script MT", "Palatino Linotype", "Papyrus", "Parchment", "Perpetua", "Perpetua Titling MT", "Plantagenet Cherokee", "Playbill", "PMingLiU", "PMingLiU-ExtB", "Poor Richard", "Pristina", "Raavi", "Rage Italic", "Ravie", "Rockwell", "Rockwell Condensed", "Rockwell Extra Bold", "Rod", "Sakkal Majalla", "SansSerif", "Script MT Bold", "Segoe Print", "Segoe Script", "Segoe UI", "Segoe UI Light", "Segoe UI Semibold", "Segoe UI Symbol", "Serif", "Shonar Bangla", "Showcard Gothic", "Shruti", "SimHei", "Simplified Arabic", "Simplified Arabic Fixed", "SimSun", "SimSun-ExtB", "Snap ITC", "Stencil", "Sylfaen", "Symbol", "Symbol Tiger", "Symbol Tiger Expert", "Tahoma", "Tempus Sans ITC", "Tiger", "Tiger Expert", "Times New Roman", "Traditional Arabic", "Trebuchet MS", "Tunga", "Tw Cen MT", "Tw Cen MT Condensed", "Tw Cen MT Condensed Extra Bold", "Utsaah", "Vani", "Verdana", "Vijaya", "Viner Hand ITC", "Vivaldi", "Vladimir Script", "Vrinda", "Webdings", "Wide Latin", "Wingdings", "Wingdings 2", "Wingdings 3" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8", "9", "10", "10", "11", "12", "14", "16", "18", "20", "22", "24", "26", "28", "36", "48", "72" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        bBOLD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bBOLD.setText("B");
        bBOLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBOLDActionPerformed(evt);
            }
        });

        bITALIC.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        bITALIC.setText("I");
        bITALIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bITALICActionPerformed(evt);
            }
        });

        buttonGroup3.add(bOpaque);
        bOpaque.setText("Opaque");
        bOpaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOpaqueActionPerformed(evt);
            }
        });

        buttonGroup3.add(bTransparent);
        bTransparent.setText("Transparent");
        bTransparent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTransparentActionPerformed(evt);
            }
        });

        bPLAIN.setText("P");
        bPLAIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPLAINActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(bPLAIN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bBOLD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bITALIC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bTransparent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bOpaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bOpaque, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bTransparent, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bITALIC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bBOLD, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bPLAIN, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bPLAINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPLAINActionPerformed
        bBOLD.setSelected(false);
        bITALIC.setSelected(false);
        this.setFontStyle(PLAIN);
        this.setFont(fontName, fontStyle, fontSize);
    }//GEN-LAST:event_bPLAINActionPerformed

    private void bBOLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBOLDActionPerformed

        bPLAIN.setSelected(false);
        int style = 0;
        if (bITALIC.isSelected()){
            style += ITALIC;
        }
        if (bBOLD.isSelected()){
            style += BOLD;
        }
        this.setFontStyle(style);
        this.setFont(fontName, fontStyle, fontSize);
    }//GEN-LAST:event_bBOLDActionPerformed

    private void bITALICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bITALICActionPerformed

        bPLAIN.setSelected(false);
        int style = 0;
        if (bITALIC.isSelected()){
            style += ITALIC;
        }
        if (bBOLD.isSelected()){
            style += BOLD;
        }
        this.setFontStyle(style);
        this.setFont(fontName, fontStyle, fontSize);
    }//GEN-LAST:event_bITALICActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {
        this.setFontName((String) jComboBox1.getSelectedItem());
        this.setFont(fontName, fontStyle, fontSize);
    }

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {
        String s = (String) jComboBox2.getSelectedItem();
        this.setFontSize(Integer.parseInt(s));
        this.setFont(fontName, fontStyle, fontSize);
    }

    private void bOpaqueActionPerformed(java.awt.event.ActionEvent evt) {
        this.setIsOpaque(true);
    }

    private void bTransparentActionPerformed(java.awt.event.ActionEvent evt) {
        this.setIsOpaque(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bBOLD;
    private javax.swing.JToggleButton bITALIC;
    private javax.swing.JToggleButton bOpaque;
    private javax.swing.JToggleButton bPLAIN;
    private javax.swing.JToggleButton bTransparent;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    // End of variables declaration//GEN-END:variables
}
