package main;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Window extends javax.swing.JFrame {

    Operaciones fillComponent = new Operaciones();//para llenar JTable y Combobox
    DefaultTableModel modelview; //modelo de la tabla
    DefaultTableModel modelselected; //modelo de productos seleccionados
    Consultas sqlQuery = new Consultas();//para las operaciones de quitar/agregar cantidad en base datos
    double total = 0;

    public Window() {
        initComponents();
        //propiedades de la ventana
        this.setTitle("Carrito de compras");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        //propiedades de los text field
        txtInfoProduct.setEditable(false);
        txtInfoPrice.setEditable(false);
        //estableciendo el modelo en los jtable
        fillComponent.fillTableDB(jtProduct);
        fillComponent.fillTableProduct(jtProductCarrito);
        //propiedades de los botones
        btnAddProduct.setBackground(Color.green);
        btnAddProduct.setForeground(Color.white);
        btnDeleteL.setForeground(Color.white);
        btnDeleteL.setBackground(Color.red);
        btnFinish.setBackground(Color.blue);
        btnFinish.setForeground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProduct = new javax.swing.JTable();
        btnAddProduct = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtInfoProduct = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnFinish = new javax.swing.JButton();
        btnDeleteL = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtInfoPrice = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtProductCarrito = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Productos disponibles");

        jtProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProduct);

        btnAddProduct.setText("Agregar Producto");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        jLabel4.setText("Producto");

        jLabel5.setText("Cantidad");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Total");

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal.setText("0.0");

        btnFinish.setText("Finalizar compra");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        btnDeleteL.setText("Eliminar Producto");
        btnDeleteL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteLActionPerformed(evt);
            }
        });

        jLabel7.setText("Precio unitario");

        jtProductCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane3.setViewportView(jtProductCarrito);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Productos del carrito");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Detalles de producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(129, 129, 129)
                                    .addComponent(btnAddProduct)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtInfoPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(btnDeleteL))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(46, 46, 46)
                        .addComponent(txtInfoProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFinish))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddProduct)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteL))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtInfoProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtInfoPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblTotal)
                            .addComponent(btnFinish)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductMouseClicked

        modelview = (DefaultTableModel) this.jtProduct.getModel();
        int index = jtProduct.getSelectedRow();
        //saltamos el 0 porque es el id y aqui no lo ocupamos
        txtInfoProduct.setText(modelview.getValueAt(index, 1).toString());
        txtInfoPrice.setText(modelview.getValueAt(index, 2).toString());
        //recuperando la cantidad de productos
        int amount = Integer.parseInt(modelview.getValueAt(index, 3).toString());


    }//GEN-LAST:event_jtProductMouseClicked

    //boton de agregar al carrito
    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed

        int index = jtProduct.getSelectedRow();
        //primero se comprueba que la cantidad de productos sea correcta y que no este vacia
        try {
            if (Integer.parseInt(txtAmount.getText()) <= Integer.parseInt(modelview.getValueAt(index, 3).toString())
                    && txtAmount.getText().length() != 0 && txtInfoPrice.getText().length() != 0
                    && txtInfoProduct.getText().length() != 0 && Integer.parseInt(txtAmount.getText()) > 0) {
                //actualizando el total, multiplicando por la cantidad de productos que se vayan acumulando
                total += Double.parseDouble(modelview.getValueAt(index, 2).toString()) * Integer.parseInt(txtAmount.getText());
                lblTotal.setText(String.valueOf(total));
                //llenando el modelo del carrito
                modelselected = (DefaultTableModel) jtProductCarrito.getModel();
                /*
                para agregar las filas, creamos un array del tipo objejct cuyos valores
                los recuperamos de los text field, en ese modelo muestra el precio dependiendo
                de la cantidad de elementos seleccionados
                 */
                double itemPrice = Double.parseDouble(txtInfoPrice.getText()) * Integer.parseInt(txtAmount.getText());
                modelselected.addRow(new Object[]{
                    txtInfoProduct.getText(), itemPrice, Integer.parseInt(modelview.getValueAt(index, 0).toString())});
                //En la posicion 2 guardamos el id

                /*
                actualizando la base de datos para que retire la cantidad seleccionada, para ello
                se debe de recuperar el id y la cantida
                 */
                int cantidad = Integer.parseInt(txtAmount.getText());
                int id = Integer.parseInt(modelview.getValueAt(index, 0).toString());
                sqlQuery.deleteProduct(cantidad, id);
                fillComponent.fillTableDB(jtProduct);

                //sqlQuery.deleteProduct(cantidad, id);
            } else {
                JOptionPane.showMessageDialog(null, "Cantidad invalida", "Cantidad no disponible", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException err) {
            JOptionPane.showMessageDialog(null, "Cantidad incorrecta", "Error de formato", JOptionPane.ERROR_MESSAGE);
            System.out.println(err.toString());

        }

    }//GEN-LAST:event_btnAddProductActionPerformed

    //quitando un item del carrito
    private void btnDeleteLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteLActionPerformed

        int select = jtProductCarrito.getSelectedRow();
        int option = JOptionPane.showConfirmDialog(null, "Desea eliminar el elemento", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {

            //colocando en un try-cath por si un producto no esta seleccionado y se aprieta el boton
            try {
                //restandolo al total
                total -= Double.parseDouble(modelselected.getValueAt(select, 1).toString());//recuperando el valor de venta
                //devolviendo el numero de items a la base de datos
                int index = jtProductCarrito.getSelectedRow();
                int cantidad = Integer.parseInt(txtAmount.getText());
                int id = Integer.parseInt(modelselected.getValueAt(index, 2).toString());//ESTE ID DA LATA XQ NO ES D TABLA
                sqlQuery.AddProduct(cantidad, id);
                fillComponent.fillTableDB(jtProduct);
                //eliminando del modelo
                modelselected.removeRow(select);
                lblTotal.setText(String.valueOf(total));

            } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Debe de estar seleccionado un producto", "Sin seleccion", JOptionPane.WARNING_MESSAGE);
                System.out.println(e.toString());
            }
        }//termina opcion yes
    }//GEN-LAST:event_btnDeleteLActionPerformed
    //funcion para limpiar vista
    public void clean() {
       
        txtInfoPrice.setText("");
        txtInfoProduct.setText("");
        txtAmount.setText("");
        lblTotal.setText("0.0");
        total = 0;
        fillComponent.removeTable(jtProductCarrito);
    }
    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Desea terminar la compra", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "El total es de " + total);
            clean();
        }


    }//GEN-LAST:event_btnFinishActionPerformed

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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnDeleteL;
    private javax.swing.JButton btnFinish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtProduct;
    private javax.swing.JTable jtProductCarrito;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtInfoPrice;
    private javax.swing.JTextField txtInfoProduct;
    // End of variables declaration//GEN-END:variables
}
