package netflix;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GirisSayfasi extends javax.swing.JFrame {

    
    public GirisSayfasi() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GirisArkaPlan = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        OturumAcYazisi = new javax.swing.JLabel();
        MailAdresi = new javax.swing.JLabel();
        Sifre = new javax.swing.JLabel();
        MailAdresiGiris = new javax.swing.JTextField();
        SifreGiris = new javax.swing.JPasswordField();
        OturumAcButonu = new javax.swing.JButton();
        KayitOlmakIstıyorum = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GirisArkaPlan.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        OturumAcYazisi.setBackground(new java.awt.Color(204, 0, 0));
        OturumAcYazisi.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        OturumAcYazisi.setForeground(new java.awt.Color(255, 0, 0));
        OturumAcYazisi.setText("OTURUM AÇ");

        MailAdresi.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        MailAdresi.setForeground(new java.awt.Color(255, 0, 0));
        MailAdresi.setText("MAIL ADRESİ:");

        Sifre.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Sifre.setForeground(new java.awt.Color(255, 0, 0));
        Sifre.setText("ŞİFRE:");

        OturumAcButonu.setBackground(new java.awt.Color(255, 0, 0));
        OturumAcButonu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        OturumAcButonu.setText("OTURUM AÇ");
        OturumAcButonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OturumAcButonuMouseClicked(evt);
            }
        });

        KayitOlmakIstıyorum.setForeground(new java.awt.Color(255, 0, 0));
        KayitOlmakIstıyorum.setText("KAYIT OLMAK İSTİYORUM!");
        KayitOlmakIstıyorum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KayitOlmakIstıyorumMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OturumAcYazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MailAdresi, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(Sifre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MailAdresiGiris, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(SifreGiris))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(OturumAcButonu)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(KayitOlmakIstıyorum)
                        .addGap(90, 90, 90))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OturumAcYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MailAdresi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MailAdresiGiris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SifreGiris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(OturumAcButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(KayitOlmakIstıyorum)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/netflix.PNG"))); // NOI18N

        javax.swing.GroupLayout GirisArkaPlanLayout = new javax.swing.GroupLayout(GirisArkaPlan);
        GirisArkaPlan.setLayout(GirisArkaPlanLayout);
        GirisArkaPlanLayout.setHorizontalGroup(
            GirisArkaPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GirisArkaPlanLayout.createSequentialGroup()
                .addGroup(GirisArkaPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GirisArkaPlanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GirisArkaPlanLayout.createSequentialGroup()
                        .addGap(506, 506, 506)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(567, Short.MAX_VALUE))
        );
        GirisArkaPlanLayout.setVerticalGroup(
            GirisArkaPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GirisArkaPlanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GirisArkaPlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GirisArkaPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OturumAcButonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OturumAcButonuMouseClicked
        PreparedStatement ps = null;
        ResultSet rs = null;
        String mailgiris = MailAdresiGiris.getText();
        String sifregiris = String.valueOf(SifreGiris.getPassword());
        
        String query = "SELECT * FROM `kullanici` WHERE `email` =? AND `sifre` =?";
        
        
        try {
            ps = Baglanti.Bagla().prepareStatement(query);
            
            ps.setString(1, mailgiris);
            ps.setString(2, sifregiris);
            
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                    AnaSayfa as = new AnaSayfa();
                    as.setVisible(true);
                    as.pack();
                    as.setLocationRelativeTo(null);
                   /* as.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    as.isimetiketi.setText("Welcome < " + isim +" >");*/
                    
                    this.dispose();
            }
            else{
                    JOptionPane.showMessageDialog(null, "YANLIS MAIL ADRESİ YA DA PAROLA", "GIRIS BASARISIZ", 2);
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(GirisSayfasi.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                ps.close();
                rs.close();
            } catch (Exception ex) {
               
            }
            
        }
    }//GEN-LAST:event_OturumAcButonuMouseClicked

    private void KayitOlmakIstıyorumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KayitOlmakIstıyorumMouseClicked
        new KayitSayfasi().setVisible(true);
    }//GEN-LAST:event_KayitOlmakIstıyorumMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GirisSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisSayfasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GirisArkaPlan;
    private javax.swing.JLabel KayitOlmakIstıyorum;
    private javax.swing.JLabel MailAdresi;
    private javax.swing.JTextField MailAdresiGiris;
    private javax.swing.JButton OturumAcButonu;
    private javax.swing.JLabel OturumAcYazisi;
    private javax.swing.JLabel Sifre;
    private javax.swing.JPasswordField SifreGiris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
   
}

