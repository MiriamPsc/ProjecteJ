/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
/**
 *
 * @author miria
 */
public class Burbuja extends javax.swing.JFrame {
int intercambios;
int comparaciones;
int[] arreglo;
int aux;
    /**
     * Creates new form Burbuja
     */
    public Burbuja() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        txtMinimo = new javax.swing.JTextField();
        lblArregloOriginal = new javax.swing.JLabel();
        txtMaximo = new javax.swing.JTextField();
        lblArregloOrdenado = new javax.swing.JLabel();
        txtTamaño = new javax.swing.JTextField();
        lblComparaciones = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblIntercambios = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegreso = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnArreglo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnArregloAleatorio = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel10.setText("Tiempo");

        lblArregloOriginal.setText("-");

        lblArregloOrdenado.setText("-");

        lblComparaciones.setText("-");

        jLabel1.setText("Tamaño");

        lblIntercambios.setText("-");

        jLabel2.setText("Minimo");

        lblTiempo.setText("-");

        jLabel3.setText("Maximo");

        btnRegreso.setText("VOLVER");
        btnRegreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresoActionPerformed(evt);
            }
        });

        jLabel5.setText("Arreglo orignal");

        jLabel6.setText("Arreglo ordenado");

        jLabel7.setText("Comparaciones");

        btnArreglo.setText("Crear arreglo");
        btnArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArregloActionPerformed(evt);
            }
        });

        jLabel8.setText("Intercambios");

        btnArregloAleatorio.setText("Crear arreglo aleatorio");
        btnArregloAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArregloAleatorioActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("BURBUJA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(24, 24, 24)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(btnArreglo))
                            .addGap(54, 54, 54)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel8))))
                                .addComponent(jLabel4))
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblArregloOriginal)
                                .addComponent(lblArregloOrdenado)
                                .addComponent(lblComparaciones)
                                .addComponent(lblIntercambios)
                                .addComponent(lblTiempo)))
                        .addComponent(btnArregloAleatorio))
                    .addComponent(btnRegreso, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(lblArregloOriginal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(lblArregloOrdenado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(lblComparaciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnArreglo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnArregloAleatorio))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblIntercambios))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lblTiempo))))
                .addGap(9, 9, 9)
                .addComponent(btnRegreso)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresoActionPerformed
        dispose();
    }//GEN-LAST:event_btnRegresoActionPerformed

    private void btnArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArregloActionPerformed
        try
        {
            int tamaño = Integer.parseInt(txtTamaño.getText());
            int minimo = Integer.parseInt(txtMinimo.getText());
            int maximo = Integer.parseInt(txtTamaño.getText());
            if (tamaño <= 0)
            {
                JOptionPane.showMessageDialog(null,"El tamaño no puede ser menor o igual a 0");
                return;
            }
            if(maximo <= minimo)
            {
                JOptionPane.showMessageDialog(null, "El maximo no puede ser menor o igual que el minimo");
                return;
            }
            txtMaximo.setText("");
            txtMinimo.setText("");
            txtTamaño.setText("");
            intercambios = 0;
            comparaciones = 0;
            OrdenarYCrear(tamaño,minimo,maximo);

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Introduzca datos validos");
        }
    }//GEN-LAST:event_btnArregloActionPerformed

    private void btnArregloAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArregloAleatorioActionPerformed

        int tamaño = ThreadLocalRandom.current().nextInt(1,18 + 1);
        int minimo = ThreadLocalRandom.current().nextInt(0,50 + 1);
        int maximo = ThreadLocalRandom.current().nextInt(minimo, 100 + 1);
        comparaciones = 0;
        intercambios = 0;
        OrdenarYCrear(tamaño,minimo,maximo);
    }//GEN-LAST:event_btnArregloAleatorioActionPerformed
public void OrdenarYCrear(int tamaño, int minimo, int maximo){
        arreglo = new int[tamaño];
        long start = System.nanoTime();
            int random;
            for (int i = 0; i < arreglo.length; i++)
            {
               random  = ThreadLocalRandom.current().nextInt(minimo,maximo + 1);
               arreglo[i] = random;
            }
            lblArregloOriginal.setText(ImprimirArreglo());


            for (int i = 1; i < arreglo.length; i++)
            {
                for (int j = 0; j < arreglo.length - 1; j++)
                {
                    comparaciones++;
                    if (arreglo[j] > arreglo[j + 1])
                    {
                        aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;
                        intercambios++;
                    }
                }
            }
            long aaa;
            aaa = System.nanoTime();
            double tiempo = (aaa - start)/1000000.0;
            lblTiempo.setText(tiempo + "");
            lblArregloOrdenado.setText(ImprimirArreglo());
            lblComparaciones.setText(comparaciones + "");
            lblIntercambios.setText(intercambios + "");
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
            java.util.logging.Logger.getLogger(Burbuja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Burbuja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Burbuja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Burbuja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Burbuja().setVisible(true);
            }
        });
    }
    private String ImprimirArreglo(){
        String numeros = "";
        if(arreglo.length != 0){
            for (int i = 0; i< arreglo.length;i++){
                numeros += arreglo[i] + ", ";
            }
        }
        return numeros;
    }

    /**
     * @param args the command line arguments
     */
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArreglo;
    private javax.swing.JButton btnArregloAleatorio;
    private javax.swing.JButton btnRegreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblArregloOrdenado;
    private javax.swing.JLabel lblArregloOriginal;
    private javax.swing.JLabel lblComparaciones;
    private javax.swing.JLabel lblIntercambios;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JTextField txtMaximo;
    private javax.swing.JTextField txtMinimo;
    private javax.swing.JTextField txtTamaño;
    // End of variables declaration//GEN-END:variables
}
