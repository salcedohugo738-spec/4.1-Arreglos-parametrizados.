/*
Hugo Emmanuel Salcedo Alvarez
Juan Adrian Morales Escobar
 */
package front_end;
import back_end.Articulo;
import back_end.BibliotecaGenericaArreglo;
import back_end.Libro;
import back_end.Revista;
import back_end.Trabajo;
import javax.swing.JOptionPane;

public class TestBiblioteca extends javax.swing.JFrame {
    
    private BibliotecaGenericaArreglo<Trabajo> bib;
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TestBiblioteca.class.getName());

  
    public TestBiblioteca() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_Titulo = new javax.swing.JTextField();
        lbl_Titulo = new javax.swing.JLabel();
        lbl_Autor = new javax.swing.JLabel();
        txt_Autor = new javax.swing.JTextField();
        lbl_Año = new javax.swing.JLabel();
        txt_Anio = new javax.swing.JTextField();
        lbl_Indice = new javax.swing.JLabel();
        txt_Indice = new javax.swing.JTextField();
        cmb_Tipo = new javax.swing.JComboBox<>();
        lbl_Especifico = new javax.swing.JLabel();
        txt_Especifico = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_Crear = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_MostrarL = new javax.swing.JButton();
        btn_MostrarIN = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        btn_Destruir = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sistema de Gestión de Biblioteca");

        lbl_Titulo.setText("Titulo");

        lbl_Autor.setText("Autor");

        lbl_Año.setText("Año");

        txt_Anio.addActionListener(this::txt_AnioActionPerformed);

        lbl_Indice.setText("Indice");

        txt_Indice.addActionListener(this::txt_IndiceActionPerformed);

        cmb_Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Revista", "Articulo" }));
        cmb_Tipo.addActionListener(this::cmb_TipoActionPerformed);

        lbl_Especifico.setText("Num Paginas:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_Especifico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Indice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Año, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Autor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Anio, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(txt_Indice, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(txt_Autor, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(txt_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(txt_Especifico))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmb_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_Titulo)
                    .addComponent(txt_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Autor)
                    .addComponent(txt_Autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_Año)
                    .addComponent(txt_Anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_Indice)
                    .addComponent(txt_Indice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Especifico)
                    .addComponent(txt_Especifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_Crear.setText("Crear Biblioteca");
        btn_Crear.addActionListener(this::btn_CrearActionPerformed);

        btn_Eliminar.setText("Eliminar Trabajo");
        btn_Eliminar.addActionListener(this::btn_EliminarActionPerformed);

        btn_MostrarL.setText("Mostrar Trabajos");
        btn_MostrarL.addActionListener(this::btn_MostrarLActionPerformed);

        btn_MostrarIN.setText("Mostrar por Indice");
        btn_MostrarIN.addActionListener(this::btn_MostrarINActionPerformed);

        btn_Agregar.setText("Agregar Trabajo");
        btn_Agregar.addActionListener(this::btn_AgregarActionPerformed);

        btn_Destruir.setText("Vaciar Biblioteca");
        btn_Destruir.addActionListener(this::btn_DestruirActionPerformed);

        btn_Modificar.setText("Modificar trabajo");
        btn_Modificar.addActionListener(this::btn_ModificarActionPerformed);

        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(this::btn_SalirActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_Crear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_MostrarL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_MostrarIN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Destruir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Crear)
                    .addComponent(btn_Eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_MostrarL)
                    .addComponent(btn_MostrarIN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Agregar)
                    .addComponent(btn_Destruir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(btn_Salir)
                .addContainerGap())
        );

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // ---------- Métodos auxiliares (lectura y validación de los campos) ----------
    private boolean hayBiblioteca() {
        if (bib == null) {
            JOptionPane.showMessageDialog(this, "Primero debes crear la biblioteca usando el botón 'Crear Biblioteca'.");
            return false;
        }
        return true;
    }

    private int leerEnteroPositivo(String texto, String campo) {
        int valor;
        try {
            valor = Integer.parseInt(texto.trim());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("El campo " + campo + " debe ser un número entero.");
        }
        if (valor <= 0) {
            throw new NumberFormatException("El campo " + campo + " debe ser un entero mayor a cero.");
        }
        return valor;
    }

    private int leerPosicion() {
        int pos;
        try {
            pos = Integer.parseInt(txt_Indice.getText().trim());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("El campo Índice debe ser un número entero.");
        }
        if (pos < 0 || pos >= bib.getCapacidad()) {
            throw new IndexOutOfBoundsException("El índice debe estar entre 0 y " + (bib.getCapacidad() - 1) + ".");
        }
        return pos;
    }

    private String leerTextoObligatorio(javax.swing.JTextField campo, String nombre) {
        String texto = campo.getText().trim();
        if (texto.isEmpty()) {
            throw new IllegalArgumentException("El campo " + nombre + " no puede estar vacío.");
        }
        return texto;
    }

    /** Lee los campos y crea la subclase de Trabajo según el tipo elegido. */
    private Trabajo construirTrabajo() {
        String titulo = leerTextoObligatorio(txt_Titulo, "Título");
        String autor = leerTextoObligatorio(txt_Autor, "Autor");
        int anio = leerEnteroPositivo(txt_Anio.getText(), "Año");
        String tipo = cmb_Tipo.getSelectedItem().toString();
        switch (tipo) {
            case "Libro":
                return new Libro(titulo, autor, anio, leerEnteroPositivo(txt_Especifico.getText(), "Núm. Páginas"));
            case "Revista":
                return new Revista(titulo, autor, anio, leerEnteroPositivo(txt_Especifico.getText(), "Núm. Edición"));
            default:
                return new Articulo(titulo, autor, anio, leerTextoObligatorio(txt_Especifico, "Conferencia"));
        }
    }

    private void limpiarCampos() {
        txt_Titulo.setText("");
        txt_Autor.setText("");
        txt_Anio.setText("");
        txt_Indice.setText("");
        txt_Especifico.setText("");
    }

    private void mostrarError(String mensaje) {
        jTextArea1.setText("Error: " + mensaje);
        JOptionPane.showMessageDialog(this, mensaje);
    }

    // ---------- Eventos ----------
    private void btn_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CrearActionPerformed
        if (bib != null) {
            JOptionPane.showMessageDialog(this, "La biblioteca ya fue creada (capacidad " + bib.getCapacidad()
                    + "). Usa 'Vaciar Biblioteca' para eliminar su contenido.");
            return;
        }
        String entrada = JOptionPane.showInputDialog(this, "Capacidad de la biblioteca:",
                String.valueOf(BibliotecaGenericaArreglo.CAPACIDAD_POR_DEFECTO));
        if (entrada == null) {
            return; // el usuario canceló
        }
        try {
            int capacidad = leerEnteroPositivo(entrada, "Capacidad");
            bib = new BibliotecaGenericaArreglo<>(capacidad);
            jTextArea1.setText("Biblioteca creada con capacidad para " + capacidad + " trabajos (índices 0 a " + (capacidad - 1) + ").");
        } catch (IllegalArgumentException e) {
            mostrarError(e.getMessage());
        }
    }//GEN-LAST:event_btn_CrearActionPerformed

    private void btn_MostrarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MostrarLActionPerformed
        if (!hayBiblioteca()) {
            return;
        }
        jTextArea1.setText(bib.mostrarTodosTrabajos());
    }//GEN-LAST:event_btn_MostrarLActionPerformed

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        if (!hayBiblioteca()) {
            return;
        }
        try {
            int pos = leerPosicion();
            Trabajo nuevo = construirTrabajo();
            bib.agregarTrabajo(nuevo, pos);
            limpiarCampos();
            jTextArea1.setText("Trabajo agregado en la posición " + pos + ".\n\n" + bib.mostrarTodosTrabajos());
        } catch (IllegalArgumentException | IllegalStateException | IndexOutOfBoundsException e) {
            mostrarError(e.getMessage());
        }
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_MostrarINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MostrarINActionPerformed
        if (!hayBiblioteca()) {
            return;
        }
        try {
            int pos = leerPosicion();
            jTextArea1.setText("Índice [" + pos + "] -> " + bib.mostrarTrabajo(pos).toString());
        } catch (IllegalArgumentException | IllegalStateException | IndexOutOfBoundsException e) {
            mostrarError(e.getMessage());
        }
    }//GEN-LAST:event_btn_MostrarINActionPerformed

    private void btn_DestruirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DestruirActionPerformed
        if (!hayBiblioteca()) {
            return;
        }
        if (bib.isEmpty()) {
            JOptionPane.showMessageDialog(this, "La biblioteca ya está vacía.");
            return;
        }
        bib.vaciarBiblioteca();
        limpiarCampos();
        jTextArea1.setText("La biblioteca fue vaciada.");
        JOptionPane.showMessageDialog(this, "La biblioteca ha sido vaciada.");
    }//GEN-LAST:event_btn_DestruirActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
    System.exit(0);
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void txt_IndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IndiceActionPerformed
     
    }//GEN-LAST:event_txt_IndiceActionPerformed

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
        if (!hayBiblioteca()) {
            return;
        }
        try {
            int pos = leerPosicion();
            Trabajo actual = bib.mostrarTrabajo(pos); // valida que la posición esté ocupada
            Trabajo nuevo = construirTrabajo();
            int opcion = JOptionPane.showConfirmDialog(this,
                    "La posición " + pos + " contiene:\n" + actual + "\n¿Deseas sobrescribirla?",
                    "Confirmar modificación", JOptionPane.YES_NO_OPTION);
            if (opcion != JOptionPane.YES_OPTION) {
                jTextArea1.setText("Modificación cancelada.");
                return;
            }
            bib.reemplazarTrabajo(nuevo, pos);
            limpiarCampos();
            jTextArea1.setText("Trabajo de la posición " + pos + " modificado.\n\n" + bib.mostrarTodosTrabajos());
        } catch (IllegalArgumentException | IllegalStateException | IndexOutOfBoundsException e) {
            mostrarError(e.getMessage());
        }
    }//GEN-LAST:event_btn_ModificarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        if (!hayBiblioteca()) {
            return;
        }
        try {
            int pos = leerPosicion();
            Trabajo eliminado = bib.eliminarTrabajo(pos);
            txt_Indice.setText("");
            jTextArea1.setText("Se eliminó de la posición " + pos + ":\n" + eliminado + "\n\n" + bib.mostrarTodosTrabajos());
        } catch (IllegalArgumentException | IllegalStateException | IndexOutOfBoundsException e) {
            mostrarError(e.getMessage());
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void txt_AnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AnioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AnioActionPerformed

    private void cmb_TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_TipoActionPerformed
        String tipo = cmb_Tipo.getSelectedItem().toString();
    txt_Especifico.setText(""); // Limpia el campo al cambiar
    
    switch (tipo) {
        case "Libro":
            lbl_Especifico.setText("Núm. Páginas:");
            break;
        case "Revista":
            lbl_Especifico.setText("Núm. Edición:");
            break;
        case "Articulo":
            lbl_Especifico.setText("Conferencia:");
            break;
    }
    }//GEN-LAST:event_cmb_TipoActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TestBiblioteca().setVisible(true));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Crear;
    private javax.swing.JButton btn_Destruir;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton btn_MostrarIN;
    private javax.swing.JButton btn_MostrarL;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JComboBox<String> cmb_Tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_Autor;
    private javax.swing.JLabel lbl_Año;
    private javax.swing.JLabel lbl_Especifico;
    private javax.swing.JLabel lbl_Indice;
    private javax.swing.JLabel lbl_Titulo;
    private javax.swing.JTextField txt_Anio;
    private javax.swing.JTextField txt_Autor;
    private javax.swing.JTextField txt_Especifico;
    private javax.swing.JTextField txt_Indice;
    private javax.swing.JTextField txt_Titulo;
    // End of variables declaration//GEN-END:variables
}


