/*
Copyright (C) 2012, 2013 Bengt Martensson.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 3 of the License, or (at
your option) any later version.

This program is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License along with
this program. If not, see http://www.gnu.org/licenses/.
*/

package org.harctoolbox.guicomponents;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;

/**
 * A class for help popups.
 */
public class HelpPopup extends javax.swing.JDialog {
    private final String payload;

   /**
     * Creates a help popup.
     *
     * @param parent Parent frame
     * @param helpText Text (one string, to be formatted to many lines) containing the messages.
     */
    public HelpPopup(java.awt.Frame parent, String helpText) {
        super(parent, false /*modal*/);
        payload = helpText;
        initComponents();
        // show the start of the text
        this.helpText.setCaretPosition(0);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        helpText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Help");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        helpText.setEditable(false);
        helpText.setColumns(20);
        helpText.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        helpText.setLineWrap(true);
        helpText.setRows(4);
        helpText.setText(payload);
        helpText.setToolTipText("Press mouse button 2 or 3 to close window.");
        helpText.setWrapStyleWord(true);
        helpText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        helpText.setMargin(new java.awt.Insets(0, 10, 0, 0));
        helpText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(helpText);
        helpText.getAccessibleContext().setAccessibleDescription("Press mouse button 2 or 3 to close window");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if (evt.getButton() != MouseEvent.BUTTON1)
            dispose();
    }//GEN-LAST:event_formMouseClicked

    public static HelpPopup newHelpPopup(java.awt.Frame parent, String helpText) {
        HelpPopup helpBox = new HelpPopup(parent, helpText);
        // Try to align just to the right of the parent
        Rectangle parentCoords = parent.getBounds();
        Rectangle myCoords = helpBox.getBounds();
        myCoords.x = parentCoords.x + parentCoords.width;
        myCoords.y = parentCoords.y;
        helpBox.setBounds(myCoords);
        helpBox.setVisible(true);
        return helpBox;
    }

   /**
    * Normally not used; just for debugging.
    *
    * @param args Not used.
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                HelpPopup dialog = new HelpPopup(new javax.swing.JFrame(), "The best defense against logic is ignorance.");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea helpText;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
