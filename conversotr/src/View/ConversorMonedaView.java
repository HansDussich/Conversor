package View;

import monedas.DolarAMonedas;
import monedas.EuroAMonedas;
import monedas.LibraAMonedas;
import monedas.PesoAMonedas;
import monedas.YenAMonedas;

public class ConversorMonedaView extends javax.swing.JFrame {

    //Metodos sobre el valor de una moneda a las diferentes monedas
    PesoAMonedas Pesos = new PesoAMonedas();
    DolarAMonedas dolar = new DolarAMonedas();
    EuroAMonedas euro = new EuroAMonedas();
    LibraAMonedas libra = new LibraAMonedas();
    YenAMonedas yen = new YenAMonedas();

    int opcion1Seleccionada;
    int opcion2Seleccionada;
    float cantidadIngresada;

    float finalResultado;

    public ConversorMonedaView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        cb_monedaActual = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cb_convertir = new javax.swing.JComboBox<>();
        btn_convertir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingresa la cantidad y la moneda actual");

        cb_monedaActual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pesos colombianos", "Dolar", "Euro", "Libra", "Yen" }));

        jLabel2.setText("cambiar a:");

        cb_convertir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolar", "Pesos colombianos", "Euro", "Libra", "Yen" }));

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cb_monedaActual, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cb_convertir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(btn_convertir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_monedaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_convertir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(btn_convertir)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_convertir;
    private javax.swing.JComboBox<String> cb_convertir;
    private javax.swing.JComboBox<String> cb_monedaActual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_cantidad;
    // End of variables declaration//GEN-END:variables

    // Traer a las opciones seleccionadas y la cantidad de dinero en variables
    public int index1() {
        return opcion1Seleccionada = cb_monedaActual.getSelectedIndex();
    }

    public int index2() {
        return opcion2Seleccionada = cb_convertir.getSelectedIndex();
    }

    public float cantidadIngresada() {
        return cantidadIngresada = Float.parseFloat(txt_cantidad.getText().trim());
    }

    // Metodo principal despues de hacer clic
    public void opcionSeleccionada() {
        if (opcion1Seleccionada == 0) {
            resultadoPesosOtrasMonedas();
        } else if (opcion1Seleccionada == 1) {
            resultadoDolarOtrasMenedas();
        } else if (opcion1Seleccionada == 2) {
            resultadoEuroOtrasMenedas();
        } else if (opcion1Seleccionada == 3) {
            resultadoLibraOtrasMenedas();
        } else if (opcion1Seleccionada == 4) {
            resultadoYenOtrasMenedas();
        }
    }

    // Si la moneda actual es pesos colombianos cambiar a las diferentes
    public void resultadoPesosOtrasMonedas() {

        if (opcion2Seleccionada == 0) {
            finalResultado = Pesos.getPesoDolar() * cantidadIngresada;
            jLabel3.setText(String.valueOf(finalResultado) + " Dolares.");
        } else if (opcion2Seleccionada == 1) {
            jLabel3.setText(String.valueOf(cantidadIngresada) + " Pesos colombianos");

        } else if (opcion2Seleccionada == 2) {
            finalResultado = Pesos.getPesoEuro() * cantidadIngresada;
            jLabel3.setText(String.valueOf(finalResultado) + " Euros");

        } else if (opcion2Seleccionada == 3) {
            finalResultado = Pesos.getPesoLibra() * cantidadIngresada;
            jLabel3.setText(String.valueOf(finalResultado) + " Libra esterlina");

        } else if (opcion2Seleccionada == 4) {
            finalResultado = Pesos.getPesoYen() * cantidadIngresada;
            jLabel3.setText(String.valueOf(finalResultado) + " Yen");
        }

    }

    // Si la moneda actual es dolar cambiar a las diferentes
    public void resultadoDolarOtrasMenedas() {
        if (opcion2Seleccionada == 0) {
            jLabel3.setText(String.valueOf(finalResultado) + " Dolares.");
        } else if (opcion2Seleccionada == 1) {
            finalResultado = dolar.getDolarPesoColmbiano() * cantidadIngresada;
            jLabel3.setText(String.valueOf(cantidadIngresada) + " Pesos colombianos");
        } else if (opcion2Seleccionada == 2) {
            finalResultado = dolar.getDolarEuro() * cantidadIngresada;
            jLabel3.setText(String.valueOf(finalResultado) + " Euros");
        } else if (opcion2Seleccionada == 3) {
            finalResultado = dolar.getDolarLibra() * cantidadIngresada;
            jLabel3.setText(String.valueOf(finalResultado) + " Libra esterlina");
        } else if (opcion2Seleccionada == 4) {
            finalResultado = dolar.getDolarYen() * cantidadIngresada;
            jLabel3.setText(String.valueOf(finalResultado) + " Yen");

        }
    }

    // Si la moneda actual es euro cambiar a las diferentes
    public void resultadoEuroOtrasMenedas() {
        if (opcion2Seleccionada == 0) {
            finalResultado = libra.getLibraADolar() * cantidadIngresada;
            jLabel3.setText(String.valueOf(finalResultado) + " Dolares.");
        } else if (opcion2Seleccionada == 1) {
            finalResultado = libra.getLibraAPesosColombianos() * cantidadIngresada;
            jLabel3.setText(String.valueOf(cantidadIngresada) + " Pesos colombianos");
        } else if (opcion2Seleccionada == 2) {
            finalResultado = libra.getLibraAEuro() * cantidadIngresada;
            jLabel3.setText(String.valueOf(finalResultado) + " Euros");
        } else if (opcion2Seleccionada == 3) {
            jLabel3.setText(String.valueOf(finalResultado) + " Libra esterlina");
        } else if (opcion2Seleccionada == 4) {
            finalResultado = libra.getLibraAYen() * cantidadIngresada;
            jLabel3.setText(String.valueOf(finalResultado) + " Yen");

        }
    }

    // Si la moneda actual es libra cambiar a las diferentes
    public void resultadoLibraOtrasMenedas() {
        if (opcion2Seleccionada == 0) {
            finalResultado = euro.getEuroADolar() * cantidadIngresada;
            jLabel3.setText(String.valueOf(finalResultado) + " Dolares.");
        } else if (opcion2Seleccionada == 1) {
            finalResultado = euro.getEuroAPesosColombianos() * cantidadIngresada;
            jLabel3.setText(String.valueOf(cantidadIngresada) + " Pesos colombianos");
        } else if (opcion2Seleccionada == 2) {
            jLabel3.setText(String.valueOf(finalResultado) + " Euros");
        } else if (opcion2Seleccionada == 3) {
            finalResultado = euro.getEuroALibra() * cantidadIngresada;
            jLabel3.setText(String.valueOf(finalResultado) + " Libra esterlina");
        } else if (opcion2Seleccionada == 4) {
            finalResultado = euro.getEuroAYen() * cantidadIngresada;
            jLabel3.setText(String.valueOf(finalResultado) + " Yen");

        }
    }

    // Si la moneda actual es yen cambiar a las diferentes
    public void resultadoYenOtrasMenedas() {
        if (opcion2Seleccionada == 0) {
            finalResultado = yen.getYenADolar() * cantidadIngresada;
            jLabel3.setText(String.valueOf(finalResultado) + " Dolares.");
        } else if (opcion2Seleccionada == 1) {
            finalResultado = yen.getYenAPesosColombianos() * cantidadIngresada;
            jLabel3.setText(String.valueOf(cantidadIngresada) + " Pesos colombianos");
        } else if (opcion2Seleccionada == 2) {
            finalResultado = yen.getYenAEuro() * cantidadIngresada;
            jLabel3.setText(String.valueOf(finalResultado) + " Euros");
        } else if (opcion2Seleccionada == 3) {
            finalResultado = yen.getYenALibra() * cantidadIngresada;
            jLabel3.setText(String.valueOf(finalResultado) + " Libra esterlina");
        } else if (opcion2Seleccionada == 4) {
            jLabel3.setText(String.valueOf(finalResultado) + " Yen");

        }
    }

}
