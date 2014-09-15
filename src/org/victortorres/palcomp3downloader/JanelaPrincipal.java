/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.victortorres.palcomp3downloader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.ListModel;
import javax.swing.SwingWorker;

/**
 *
 * @author Victor
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
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

        selecionarLocal = new javax.swing.JFileChooser();
        textoID = new javax.swing.JLabel();
        IDArtista = new javax.swing.JTextField();
        textoDestino = new javax.swing.JLabel();
        localDasMusicas = new javax.swing.JTextField();
        btnProcurar = new javax.swing.JButton();
        btnVerificar = new javax.swing.JButton();
        statusID = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaDeMusicas = new javax.swing.JList();
        btnMarcar = new javax.swing.JButton();
        btnDesmarcar = new javax.swing.JButton();
        btnDownload = new javax.swing.JButton();
        itens = new javax.swing.JLabel();
        itensb = new javax.swing.JLabel();
        marcados = new javax.swing.JLabel();
        restantes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        selecionarLocal.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        selecionarLocal.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
        selecionarLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarLocalActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Palco MP3 Downloader");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(2147483647, 338));
        setMinimumSize(new java.awt.Dimension(456, 338));
        setResizable(false);

        textoID.setText("ID do Palco MP3:");

        IDArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDArtistaActionPerformed(evt);
            }
        });
        IDArtista.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                IDArtistaPropertyChange(evt);
            }
        });
        IDArtista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IDArtistaKeyPressed(evt);
            }
        });

        textoDestino.setText("Destino das músicas:");

        localDasMusicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localDasMusicasActionPerformed(evt);
            }
        });

        btnProcurar.setText("Procurar");
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        btnListar.setText("Listar músicas");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        listaDeMusicas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaDeMusicasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaDeMusicas);

        btnMarcar.setText("Marcar todas");
        btnMarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarActionPerformed(evt);
            }
        });

        btnDesmarcar.setText("Desmarcar todas");
        btnDesmarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesmarcarActionPerformed(evt);
            }
        });

        btnDownload.setText("Download");
        btnDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownloadActionPerformed(evt);
            }
        });

        itens.setText("Itens marcados:");

        itensb.setText("Itens restantes:");

        marcados.setText("0");

        restantes.setText("0");

        jLabel1.setText("Palco MP3 Downloader - versão 1.2");

        jLabel3.setText("http://github.com/victor-torres/PalcoMP3Downloader");

        jLabel4.setText("GRATUITO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(itens)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(marcados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(itensb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(restantes)
                        .addGap(99, 99, 99))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textoDestino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(localDasMusicas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProcurar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textoID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(IDArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVerificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statusID))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnListar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMarcar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDesmarcar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDownload)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoID)
                    .addComponent(IDArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerificar)
                    .addComponent(statusID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoDestino)
                    .addComponent(localDasMusicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcurar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListar)
                    .addComponent(btnMarcar)
                    .addComponent(btnDesmarcar)
                    .addComponent(btnDownload))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itens)
                    .addComponent(itensb)
                    .addComponent(marcados)
                    .addComponent(restantes))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDArtistaActionPerformed
        // TODO add your handling code here:
        btnVerificar.doClick();
    }//GEN-LAST:event_IDArtistaActionPerformed

    private void localDasMusicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localDasMusicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localDasMusicasActionPerformed

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        // TODO add your handling code here:
        selecionarLocal.showDialog(this, null);
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void selecionarLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarLocalActionPerformed
        // TODO add your handling code here:
        try {
            localDasMusicas.setText(selecionarLocal.getSelectedFile().toString());
        } catch(NullPointerException e) {
            localDasMusicas.setText("");
        }
    }//GEN-LAST:event_selecionarLocalActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // TODO add your handling code here:
        CapturarHTML html = new CapturarHTML();
        Endereco endereco = null;
        try {
            endereco = new Endereco(IDArtista.getText());
        } catch (MalformedURLException ex) {
            statusID.setText("ID incorreto.");
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        String resultado = null;
        try {
            resultado = html.capturar(endereco.getURL());
        } catch (IOException ex) {
            statusID.setText("ID não encontrado.");
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.print(resultado);
        if(resultado.contains("data-arquivo")) {
            statusID.setText("ID encontrado.");
        } else {
            statusID.setText("ID não encontrado.");
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void IDArtistaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_IDArtistaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_IDArtistaPropertyChange

    private void IDArtistaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDArtistaKeyPressed
        // TODO add your handling code here:
        statusID.setText("");
    }//GEN-LAST:event_IDArtistaKeyPressed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        listaDeMusicas.removeAll();
        
        CapturarHTML html = new CapturarHTML();
        Endereco endereco = null;
        String resultado = null;
        
        try {
            endereco = new Endereco(IDArtista.getText());
        } catch (MalformedURLException ex) {
            statusID.setText("ID incorreto.");
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            resultado = html.capturar(endereco.getURL());
        } catch (IOException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(!resultado.contains("data-arquivo")) {
            
            DefaultListModel lista = new DefaultListModel();
            lista.addElement("Falha ao capturar lista de músicas. ID não encontrado.");
            listaDeMusicas.setModel(lista);
            
        } else {
            
            List<String> listaDeURLs = new ArrayList<String>();
            List<String> listaDeNomes = new ArrayList<String>();
            
            Matcher m = Pattern.compile("<a href=\"(\\w+://[\\w|.|/|-]+.mp3)\\?\" class=\"download\"( target=\"_blank\")* download=\"(.*?)\\.mp3\">baixar</a>").matcher(resultado);
            m.matches();
            while(m.find()) {
                listaDeURLs.add(m.group(1));
                listaDeNomes.add(m.group(3));
            }
            
            // Caso não consiga encontrar pelo método padrão, tenta o método alternativo
            if(listaDeURLs.size() == 0 || listaDeNomes.size() == 0) {
                listaDeURLs = new ArrayList<String>();
                listaDeNomes = new ArrayList<String>();
                
                m = Pattern.compile("(\\w+://[\\w|.|/|-]+.mp3)\\?\" class=\"download\"").matcher(resultado);
                m.matches();
                while(m.find()) {
                    listaDeURLs.add(m.group(0));
                }
                
                m = Pattern.compile("class=\"lista_nome\" itemprop=\"name\">(.*?)</a>").matcher(resultado);
                m.matches();
                while(m.find()) {
                    listaDeNomes.add(m.group(1));
                }
            }
            
            DefaultListModel lista = new DefaultListModel();
            for(int i = 0; i < listaDeURLs.size(); i++) {
                Musica musica = new Musica();
                musica.nome = listaDeNomes.get(i);
                try {
                    musica.url = new URL(listaDeURLs.get(i));
                } catch (MalformedURLException ex) {
                    Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                lista.addElement(musica);
            }
            
            listaDeMusicas.setModel(lista);
            
        }
        
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnMarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarActionPerformed
        // TODO add your handling code here:
        listaDeMusicas.setSelectionInterval(0, listaDeMusicas.getModel().getSize() - 1);
    }//GEN-LAST:event_btnMarcarActionPerformed

    private void btnDesmarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesmarcarActionPerformed
        // TODO add your handling code here:
        listaDeMusicas.clearSelection();
    }//GEN-LAST:event_btnDesmarcarActionPerformed

    private void btnDownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownloadActionPerformed
        // TODO add your handling code here:
        if(localDasMusicas.getText().equals("")) {
            statusID.setText("Selecione um destino.");
        }
        else if(Integer.parseInt(restantes.getText()) == 0) {
            ListModel elementos = listaDeMusicas.getModel();
            int[] indices = listaDeMusicas.getSelectedIndices();
            if(indices.length > 0) {
                statusID.setText("Download iniciado.");
                marcados.setText(String.valueOf(indices.length));
                restantes.setText(String.valueOf(indices.length));
                //System.out.println(indices.length);
                for(int i : indices) {
                    Object obj = listaDeMusicas.getModel().getElementAt(i);
                    final Musica musica = (Musica) obj;
                    final URL url = musica.url;
                    musica.nome = musica.nome.replaceAll("[\\/:*?\"|]", "");
                    SwingWorker sw = new SwingWorker() {
                        @Override
                        protected Object doInBackground() throws Exception {
                        try {
                            org.apache.commons.io.FileUtils.copyURLToFile(url, new File(localDasMusicas.getText() + "\\" + musica.nome + ".mp3"));
                        } catch (IOException ex) {
                            //statusID.setText("Falha em " + musica.nome);
                            JOptionPane.showMessageDialog(null, "Falha ao tentar baixar \"" + musica.nome + "\"", "Falha no download", ERROR_MESSAGE);
                            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        restantes.setText(String.valueOf(Integer.parseInt(restantes.getText()) - 1));
                        if(Integer.parseInt(restantes.getText()) == 0) {
                            statusID.setText("Download concluído.");
                        }
                            return null;
                        }
                    };
                    sw.execute();
                }
            } else {
                statusID.setText("Nada selecionado.");
            }
        } else {
            statusID.setText("Download em execução.");
        }
    }//GEN-LAST:event_btnDownloadActionPerformed

    private void listaDeMusicasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaDeMusicasValueChanged
        // TODO add your handling code here:
        marcados.setText(String.valueOf(listaDeMusicas.getSelectedIndices().length));
    }//GEN-LAST:event_listaDeMusicasValueChanged

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDArtista;
    private javax.swing.JButton btnDesmarcar;
    private javax.swing.JButton btnDownload;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnMarcar;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel itens;
    private javax.swing.JLabel itensb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listaDeMusicas;
    private javax.swing.JTextField localDasMusicas;
    private javax.swing.JLabel marcados;
    private javax.swing.JLabel restantes;
    private javax.swing.JFileChooser selecionarLocal;
    private javax.swing.JLabel statusID;
    private javax.swing.JLabel textoDestino;
    private javax.swing.JLabel textoID;
    // End of variables declaration//GEN-END:variables
}
