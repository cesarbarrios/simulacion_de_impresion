/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacionimpresion;

/**
 *
 * @author PC
 */
public class Imprimir extends javax.swing.JDialog {
    
    protected String cadena = "";
    /**
     * Creates new form Imprimir
     */
    public Imprimir(java.awt.Frame parent, boolean modal, String dato) {
        super(parent, modal);
        initComponents();
        this.pack();
        this.setResizable(false);
        this.setTitle("Imprimiendo");
        this.setSize(250,100);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        jlblCadena.setText(dato);
    }
    
    public void setCadena(String cadena){
        if(cadena==null){
            this.dispose();
        }else{
            jlblCadena.setText(cadena);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblimprimiendo = new javax.swing.JLabel();
        jlblCadena = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jlblimprimiendo.setText("Imprimiendo:");

        jlblCadena.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jlblimprimiendo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblimprimiendo)
                    .addComponent(jlblCadena))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlblCadena;
    private javax.swing.JLabel jlblimprimiendo;
    // End of variables declaration//GEN-END:variables
}
