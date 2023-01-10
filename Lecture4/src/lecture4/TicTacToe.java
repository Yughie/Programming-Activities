
package lecture4;

import java.util.Random;
import javax.swing.ImageIcon;


public class TicTacToe extends javax.swing.JFrame {
    public TicTacToe() {
        initComponents();
        RandomIcon();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblIcon1 = new javax.swing.JLabel();
        lblIcon2 = new javax.swing.JLabel();
        lblIcon3 = new javax.swing.JLabel();
        lblIcon4 = new javax.swing.JLabel();
        lblIcon5 = new javax.swing.JLabel();
        lblIcon6 = new javax.swing.JLabel();
        lblIcon9 = new javax.swing.JLabel();
        lblIcon8 = new javax.swing.JLabel();
        lblIcon7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(28, 36, 156));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(12, 18, 131));

        lblIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lecture4/0.png"))); // NOI18N

        lblIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lecture4/0.png"))); // NOI18N

        lblIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lecture4/0.png"))); // NOI18N

        lblIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lecture4/0.png"))); // NOI18N

        lblIcon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lecture4/0.png"))); // NOI18N

        lblIcon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lecture4/0.png"))); // NOI18N

        lblIcon9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lecture4/0.png"))); // NOI18N

        lblIcon8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lecture4/0.png"))); // NOI18N

        lblIcon7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lecture4/0.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIcon7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIcon8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIcon9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIcon4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIcon5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIcon6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIcon2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIcon3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(lblIcon3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIcon2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIcon4, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(lblIcon6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIcon5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIcon7, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(lblIcon9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIcon8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
                
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblIcon1;
    private javax.swing.JLabel lblIcon2;
    private javax.swing.JLabel lblIcon3;
    private javax.swing.JLabel lblIcon4;
    private javax.swing.JLabel lblIcon5;
    private javax.swing.JLabel lblIcon6;
    private javax.swing.JLabel lblIcon7;
    private javax.swing.JLabel lblIcon8;
    private javax.swing.JLabel lblIcon9;
    // End of variables declaration//GEN-END:variables
    
    String[] icons = {
        "D:\\Documents\\Java Programming\\Programming-Activities\\Lecture4\\src\\lecture4\\0.png",
        "D:\\Documents\\Java Programming\\Programming-Activities\\Lecture4\\src\\lecture4\\1.png",
        "D:\\Documents\\Java Programming\\Programming-Activities\\Lecture4\\src\\lecture4\\2.png"
    };
    
    
    //Random Number Generator
    Random rand = new Random();
    int r1 = rand.nextInt(icons.length);
    int r2 = rand.nextInt(icons.length);
    int r3 = rand.nextInt(icons.length);
    int r4 = rand.nextInt(icons.length);
    int r5 = rand.nextInt(icons.length);
    int r6 = rand.nextInt(icons.length);
    int r7 = rand.nextInt(icons.length);
    int r8 = rand.nextInt(icons.length);
    int r9 = rand.nextInt(icons.length);
    
 
   
    //Set Icon based on the random index of array
    public void RandomIcon(){
        lblIcon1.setIcon(new ImageIcon(icons[r1]));
        lblIcon2.setIcon(new ImageIcon(icons[r2]));
        lblIcon3.setIcon(new ImageIcon(icons[r3]));
        lblIcon4.setIcon(new ImageIcon(icons[r4]));
        lblIcon5.setIcon(new ImageIcon(icons[r5]));
        lblIcon6.setIcon(new ImageIcon(icons[r6]));
        lblIcon7.setIcon(new ImageIcon(icons[r7]));
        lblIcon8.setIcon(new ImageIcon(icons[r8]));
        lblIcon9.setIcon(new ImageIcon(icons[r9]));
    } 
}

