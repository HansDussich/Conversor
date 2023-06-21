package View;

public class ConversorTemperaturaView extends javax.swing.JFrame {

    int opcion1Seleccionada;
    int opcion2Seleccionada;
    double gradosIngresados;

    public ConversorTemperaturaView() {
        initComponents();
    }

    public int index1() {
        return opcion1Seleccionada = cb_escalaActual.getSelectedIndex();
    }

    public int index2() {
        return opcion2Seleccionada = cb_escalaModificada.getSelectedIndex();
    }

    public double cantidadIngresada() {
        return gradosIngresados = Float.parseFloat(txt_grados.getText().trim());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_grados = new javax.swing.JTextField();
        cb_escalaActual = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cb_escalaModificada = new javax.swing.JComboBox<>();
        btn_convertir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingresa los grados y la escala");

        cb_escalaActual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin" }));

        jLabel2.setText("cambiar a:");

        cb_escalaModificada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fahrenheit", "Celsius", "Kelvin" }));

        btn_convertir.setText("Convertir");
        btn_convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_convertirActionPerformed(evt);
            }
        });

        jLabel4.setText("es igual a:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb_escalaActual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_grados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn_convertir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_escalaModificada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_escalaModificada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_grados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_escalaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(btn_convertir)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_convertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_convertirActionPerformed
        try {
        index1();
        index2();
        cantidadIngresada();
        opcionSeleccionada();
            
        } catch (java.lang.NumberFormatException e) {
            jLabel3.setText("Ingresa solo numeros.");
        }
        
    }//GEN-LAST:event_btn_convertirActionPerformed

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
            java.util.logging.Logger.getLogger(ConversorTemperaturaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorTemperaturaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorTemperaturaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorTemperaturaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorTemperaturaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_convertir;
    private javax.swing.JComboBox<String> cb_escalaActual;
    private javax.swing.JComboBox<String> cb_escalaModificada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_grados;
    // End of variables declaration//GEN-END:variables

    public void opcionSeleccionada() {
        if (opcion1Seleccionada == 0) {
            if (opcion2Seleccionada == 0) {
                celsiusFahrenheit();
            }
            else if(opcion2Seleccionada ==1){
                jLabel3.setText(gradosIngresados + " celsius");
            }
            else if(opcion2Seleccionada == 2){
                celsiusKelvin();
            }
            
        }else if(opcion1Seleccionada ==1){
            if (opcion2Seleccionada ==0) {
                jLabel3.setText(gradosIngresados + "F Fahrenheit");
            }else if(opcion2Seleccionada ==1){
                fahrenheitCelsius();
            } else if(opcion2Seleccionada ==2){
                fahrenheitKelvin();
            }
        }
        else if(opcion1Seleccionada ==2){
            if (opcion2Seleccionada==0) {
                kelvinFahrenheit();
            } else if (opcion2Seleccionada ==1) {
                kelvinCelsius();
            }else if (opcion2Seleccionada ==2) {
                jLabel3.setText(gradosIngresados + "K Kelvin");
            }
        }
    }

    public void celsiusFahrenheit() {
        double result = (gradosIngresados * 9 / 5) + 32;
        jLabel3.setText(String.valueOf(result) + "F Fahrenheit");

    }
    
    public void celsiusKelvin(){
        double result = gradosIngresados + 273.15;
        jLabel3.setText(String.valueOf(result) + "K Kelvin");
    }
    
    public void fahrenheitCelsius(){
        double result = (gradosIngresados - 32) / 1.8000;
        jLabel3.setText(String.valueOf(result) + "C Celsius");
    }
    public void fahrenheitKelvin(){
        double result = (gradosIngresados + 459.67) * 5/9;
        jLabel3.setText(String.valueOf(result) + "K Kelvin");
    
    }
    
    public void kelvinFahrenheit(){
        double result = gradosIngresados * 9/5 - 459.67;
        jLabel3.setText(String.valueOf(result) + "F Fahrenheit");
    }
    
    public void kelvinCelsius(){
        double result = gradosIngresados - 273.15;
        jLabel3.setText(String.valueOf(result) + "C Celsius");
    } 
    
}
