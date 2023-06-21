package View;


public class principalView extends javax.swing.JFrame {

    int IndexOpcionSeleccionada;

    public principalView() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_aceptar = new javax.swing.JButton();
        cb_opciones = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bienvenido, por favor selecciona una opcion");

        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        cb_opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conversor de monedas", "Conversor de temperatura" }));
        cb_opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_opcionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addGap(0, 93, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(cb_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btn_aceptar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(cb_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btn_aceptar)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        opcionSeleccionada();
       
        
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void cb_opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_opcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_opcionesActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new principalView().setVisible(true);
        });
        
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JComboBox<String> cb_opciones;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    
    public int opcionSeleccionada(){
        
        IndexOpcionSeleccionada = cb_opciones.getSelectedIndex();
        if (IndexOpcionSeleccionada == 0) {
            ConversorMonedaView conversorMoneda = new ConversorMonedaView();
            conversorMoneda.setVisible(true);
        } else if(IndexOpcionSeleccionada == 1){
            ConversorTemperaturaView conversorTemp = new ConversorTemperaturaView();
            conversorTemp.setVisible(true);
        }
         System.out.println(IndexOpcionSeleccionada);
        return IndexOpcionSeleccionada;
    
    
    }
}
