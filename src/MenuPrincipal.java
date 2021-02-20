
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        Main = new javax.swing.JPanel();
        SearchContact = new javax.swing.JButton();
        AddNewContact = new javax.swing.JButton();
        List = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        SearchField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        RenderedContactTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(720, 680));

        Main.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista Telefônica"));

        SearchContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/SearchIcon.png"))); // NOI18N
        SearchContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchContactActionPerformed(evt);
            }
        });

        AddNewContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/AddIcon.png"))); // NOI18N
        AddNewContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewContactActionPerformed(evt);
            }
        });

        List.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/PeopleIcon.png"))); // NOI18N
        List.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListActionPerformed(evt);
            }
        });

        SearchField.setText("Procurar...");
        SearchField.setToolTipText("Procure por um contato");
        SearchField.setVisible(false);
        SearchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SearchFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SearchFieldFocusLost(evt);
            }
        });
        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foc(evt);
            }
        });
        SearchField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                SearchFieldPropertyChange(evt);
            }
        });
        SearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SearchFieldKeyTyped(evt);
            }
        });

        RenderedContactTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RenderedContactTable.setAutoCreateRowSorter(true);
        RenderedContactTable.getTableHeader().setResizingAllowed(false);
        RenderedContactTable.getTableHeader().setReorderingAllowed(false);
        RenderedContactTable.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(RenderedContactTable);

        javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
        Main.setLayout(MainLayout);
        MainLayout.setHorizontalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(MainLayout.createSequentialGroup()
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SearchField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(List, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchContact, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddNewContact, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        MainLayout.setVerticalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addGroup(MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(List, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddNewContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddNewContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewContactActionPerformed
        SearchField.setVisible(false);
        Main.revalidate();
        Main.repaint();
            
        String name, phoneNumber;
        
        do {
            name = JOptionPane.showInputDialog(Main,
                "Insira o nome:", null);
            
            if(name.isEmpty()) {
                JOptionPane.showMessageDialog(Main, "Por favor, insira um nome.");
            }
        } while(name.isEmpty());
        
        do {
            phoneNumber = JOptionPane.showInputDialog(Main,
                "Insira o número", null);
        
            if(phoneNumber.isEmpty()) {
               JOptionPane.showMessageDialog(Main, "Por favor, insira um telefone.");
            }
            
            else if(!PhoneNumber.isValidPhoneNumber(phoneNumber)) {
               JOptionPane.showMessageDialog(Main, "O número de telefone digitado é invalido.");
           }
        } while(phoneNumber.isEmpty() || !PhoneNumber.isValidPhoneNumber(phoneNumber));

        Contact newContact = new Contact(name, phoneNumber);
        contacts.add(newContact);
    }//GEN-LAST:event_AddNewContactActionPerformed

    private void SearchContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchContactActionPerformed
        SearchField.setVisible(!SearchField.isVisible());
        Main.revalidate();
        Main.repaint();
    }//GEN-LAST:event_SearchContactActionPerformed

    private void foc(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foc
        // TODO add your handling code here:
    }//GEN-LAST:event_foc

    private void SearchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchFieldFocusGained
        if(SearchField.getText().equals("Procurar..."))
            SearchField.setText("");
    }//GEN-LAST:event_SearchFieldFocusGained

    private void SearchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchFieldFocusLost
        if(SearchField.getText().equals(""))
            SearchField.setText("Procurar...");
    }//GEN-LAST:event_SearchFieldFocusLost

    private void ListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListActionPerformed
        SearchField.setVisible(false);
        Main.revalidate();
        Main.repaint();
        
        contacts.reset();
    }//GEN-LAST:event_ListActionPerformed

    private void SearchFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_SearchFieldPropertyChange

    }//GEN-LAST:event_SearchFieldPropertyChange

    private void SearchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchFieldKeyTyped
        
        if(evt.getKeyChar() != 8) // Existe um problema quando se digita backspace, esse condicional o evita.
            contacts.fetchByParameters(SearchField.getText() + evt.getKeyChar());
        else
            contacts.fetchByParameters(SearchField.getText());
    }//GEN-LAST:event_SearchFieldKeyTyped

    public static void addRow(Contact e) {
        DefaultTableModel model = (DefaultTableModel) RenderedContactTable.getModel();
        model.insertRow(
            0, new Object[] {
                e.getName(),
                e.getPhoneNumber(),
            }
        );
    }
    
    public static void clearRows() {
        DefaultTableModel model = (DefaultTableModel) RenderedContactTable.getModel();
        model.setRowCount(0);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
                        
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
                contacts = new ContactList();
                contactTableModel = (DefaultTableModel) RenderedContactTable.getModel();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewContact;
    private javax.swing.JButton List;
    private javax.swing.JPanel Main;
    private static javax.swing.JTable RenderedContactTable;
    private javax.swing.JButton SearchContact;
    private javax.swing.JTextField SearchField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    private static ContactList contacts;
    static DefaultTableModel contactTableModel; 
}
