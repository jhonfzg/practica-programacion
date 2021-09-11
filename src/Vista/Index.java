package Vista;
import Controlador.Main;

public class Index extends javax.swing.JFrame 
{
 public boolean RutaI;
 public boolean RutaF;
 public boolean OpcionA;
 public boolean OpcionD;
 
 public Index() {
  initComponents();
 }


 @SuppressWarnings("unchecked")
 // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
 private void initComponents() {

  
  jLabel1 = new javax.swing.JLabel();
  jLabel2 = new javax.swing.JLabel();
  jButton4 = new javax.swing.JButton();
  jLabel3 = new javax.swing.JLabel();
  jTextField1 = new javax.swing.JTextField();
  jTextField2 = new javax.swing.JTextField();
  jRadioButton1 = new javax.swing.JRadioButton();
  jRadioButton2 = new javax.swing.JRadioButton();

  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

  

  jLabel1.setForeground(new java.awt.Color(102, 102, 102));
  jLabel1.setText("Ruta Archivo Inicial");

  jLabel2.setForeground(new java.awt.Color(102, 102, 102));
  jLabel2.setText("Ruta Archivo Final");

  jButton4.setText("GUARDAR");
  jButton4.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jButton4ActionPerformed(evt);
   }
  });

  jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
  jLabel3.setText("Sort Numbers ");

  jTextField1.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jTextField1ActionPerformed(evt);
   }
  });

  jTextField2.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jTextField2ActionPerformed(evt);
   }
  });

  jRadioButton1.setText("Ordenar Ascendente");
  jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jRadioButton1ActionPerformed(evt);
   }
  });

  jRadioButton2.setText("Ordenar Descendente");
  jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
   public void actionPerformed(java.awt.event.ActionEvent evt) {
    jRadioButton2ActionPerformed(evt);
   }
  });

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(layout.createSequentialGroup()
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(layout.createSequentialGroup()
      .addGap(38, 38, 38)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
       .addGroup(layout.createSequentialGroup()
        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(26, 26, 26)
        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
       .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
          .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGap(402, 402, 402))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
          .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGap(117, 117, 117))))
       .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
     .addGroup(layout.createSequentialGroup()
      .addGap(46, 46, 46)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
       .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
    .addContainerGap(59, Short.MAX_VALUE))
  );
  layout.setVerticalGroup(
   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
   .addGroup(layout.createSequentialGroup()
    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
    .addGap(29, 29, 29)
    .addComponent(jLabel1)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addGap(31, 31, 31)
    .addComponent(jRadioButton1)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
    .addComponent(jRadioButton2)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
    .addComponent(jLabel2)
    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
     .addComponent(jButton4)
     .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addGap(75, 75, 75))
  );

  pack();
 }// </editor-fold>                        

                                      

 private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) 
 {
  Boolean Res;
  int res;
	  
  String TextoRutaS,TextoRutaE;
  Boolean ResRuta,ResRutaS;
  Boolean ResOpcion;
  String Tipo = "";
  Main G = new Main();
  TextoRutaS= jTextField1.getText();
  TextoRutaE= jTextField2.getText();
  
 
  if((TextoRutaS.isEmpty()) || (TextoRutaE.isEmpty()))
  {
   ResRuta=false;
  }
  else
  {
   ResRuta=true;
  }
  
  if((jRadioButton1.isSelected()) || (jRadioButton2.isSelected()))
  {
   ResOpcion=true;
   if(jRadioButton1.isSelected())
   {
	Tipo="A";
   }
   else
   {
	Tipo="D";
   }
  }
  else
  {
   ResOpcion=false;
  }
	  
  res=G.GuardarArchivo(ResRuta,ResOpcion,Tipo,TextoRutaE,TextoRutaS);
  if(res==1)
  {
   jTextField1.setText(null);
   jTextField2.setText(null);
   jRadioButton1.setSelected(false);
   jRadioButton2.setSelected(false);  
  }
 }                                        

 private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {}                                           

 private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {}                                           

 private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
  jRadioButton2.setSelected(false);
 }                                             

 private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
  jRadioButton1.setSelected(false);
 }      
 
  
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
   java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (InstantiationException ex) {
   java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (IllegalAccessException ex) {
   java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
   java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  }
  //</editor-fold>

  /* Create and display the form */
  java.awt.EventQueue.invokeLater(new Runnable() {
   public void run() {
    new Index().setVisible(true);
   }
  });
 }

 // Variables declaration - do not modify                     
 
 private javax.swing.JButton jButton4;
 private javax.swing.JLabel jLabel1;
 private javax.swing.JLabel jLabel2;
 private javax.swing.JLabel jLabel3;
 private javax.swing.JRadioButton jRadioButton1;
 private javax.swing.JRadioButton jRadioButton2;
 private javax.swing.JTextField jTextField1;
 private javax.swing.JTextField jTextField2;
 // End of variables declaration                   
}
