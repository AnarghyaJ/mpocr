package mpocr;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class MainPage extends javax.swing.JFrame {

    public MainPage() {
        initComponents();
        canvas.zoomIn(1);
        
        ClassifierNetwork cn = new ClassifierNetwork();
        for (int i = 0; i < 4; i++) {
            Layer l = new Layer(10+(int)(Math.pow(-1, i) * i), 2.3, 1.5, ("Sample Layer " + i));
            cn.addLayer(l);
        }
        nnv.setNN(cn);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ImportButton = new javax.swing.JButton();
        ImagePath = new javax.swing.JLabel();
        ZoomIn = new javax.swing.JButton();
        ZoomOut = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        canvas = new mpocr.mCanvas();
        Thin = new javax.swing.JButton();
        Cover = new javax.swing.JButton();
        hack = new javax.swing.JCheckBox();
        CSkew = new javax.swing.JButton();
        histogram = new javax.swing.JButton();
        Segment = new javax.swing.JButton();
        nnv = new mpocr.NNVisualizer();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Consolas", 3, 36)); // NOI18N
        jLabel1.setText("mpocr");

        ImportButton.setText("Import");
        ImportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportButtonActionPerformed(evt);
            }
        });

        ImagePath.setText("Path");

        ZoomIn.setText(" + ");
        ZoomIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZoomInActionPerformed(evt);
            }
        });

        ZoomOut.setText(" - ");
        ZoomOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZoomOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(canvas);

        Thin.setText("Thin");
        Thin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThinActionPerformed(evt);
            }
        });

        Cover.setText("Cover");
        Cover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoverActionPerformed(evt);
            }
        });

        hack.setSelected(true);
        hack.setText("Use Hack");

        CSkew.setText("CSkew");
        CSkew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSkewActionPerformed(evt);
            }
        });

        histogram.setText("Histogram");
        histogram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                histogramActionPerformed(evt);
            }
        });

        Segment.setText("Segment");
        Segment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SegmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nnvLayout = new javax.swing.GroupLayout(nnv);
        nnv.setLayout(nnvLayout);
        nnvLayout.setHorizontalGroup(
            nnvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        nnvLayout.setVerticalGroup(
            nnvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nnv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ImportButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Cover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Thin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CSkew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(histogram)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Segment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ZoomOut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ZoomIn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ImagePath)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ImportButton)
                        .addComponent(hack))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImagePath)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ZoomIn)
                            .addComponent(ZoomOut)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cover)
                            .addComponent(Thin)
                            .addComponent(CSkew)
                            .addComponent(histogram)
                            .addComponent(Segment))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nnv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoverActionPerformed
        canvas.cover();
    }//GEN-LAST:event_CoverActionPerformed

    private void ThinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThinActionPerformed
        canvas.thin();
    }//GEN-LAST:event_ThinActionPerformed

    private void ZoomOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZoomOutActionPerformed
        canvas.zoomOut(1);
    }//GEN-LAST:event_ZoomOutActionPerformed

    private void ZoomInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZoomInActionPerformed
        canvas.zoomIn(1);
    }//GEN-LAST:event_ZoomInActionPerformed

    private void ImportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportButtonActionPerformed
        
        String path = "/home/mmp/miniproject/project/mpocr/testimages/AZVF.bmp";
        //String path = "/home/mmp/miniproject/project/mpocr/testimages/skewset1/skewset1.jpg";
        //String path = "/home/mmp/miniproject/project/mpocr/testimages/unskewedLorem.bmp";      //segments perfectly
        //String path = "/home/mmp/miniproject/project/mpocr/testimages/skewset2/unskewed.jpeg"; //full noisy, small font
        //String path = "/home/mmp/miniproject/project/mpocr/testimages/skewset2/unskewed1.png";   //less noisy
        
        if(hack.isSelected()) {
        canvas.setImage(path);
        canvas.setOffset(0);
        ImagePath.setText("Path : " + path);
        }
        else {
        JFileChooser ch = new JFileChooser();
        ch.setFileFilter(new BMPImageFilter());
        ch.setCurrentDirectory(new File(path));
        if(ch.showOpenDialog(MainPage.this) == JFileChooser.APPROVE_OPTION) {
            File file = ch.getSelectedFile();
            path = file.getAbsolutePath();
            canvas.setImage(path);
            canvas.setOffset(1);
            ImagePath.setText("Path : " + path);
        }
        }
    }//GEN-LAST:event_ImportButtonActionPerformed

    private void CSkewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSkewActionPerformed
        OCRCore.cskew(canvas);
    }//GEN-LAST:event_CSkewActionPerformed

    private void histogramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_histogramActionPerformed
        OCRCore.getHist(canvas.iData);
    }//GEN-LAST:event_histogramActionPerformed

    private void SegmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SegmentActionPerformed
        canvas.binarize();
        Segment[] segs = Segmentation.segmentImage(canvas.oimg);
        for (Segment seg: segs) {
            seg.printimage();
            seg.segmentImage();
            seg.features.get(Zones.magic).printFeatures();
        }
    }//GEN-LAST:event_SegmentActionPerformed

    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CSkew;
    private javax.swing.JButton Cover;
    private javax.swing.JLabel ImagePath;
    private javax.swing.JButton ImportButton;
    private javax.swing.JButton Segment;
    private javax.swing.JButton Thin;
    private javax.swing.JButton ZoomIn;
    private javax.swing.JButton ZoomOut;
    private mpocr.mCanvas canvas;
    private javax.swing.JCheckBox hack;
    private javax.swing.JButton histogram;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private mpocr.NNVisualizer nnv;
    // End of variables declaration//GEN-END:variables
}
