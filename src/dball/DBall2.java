/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dball;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NKC
 */
public class DBall2 extends javax.swing.JFrame implements Runnable{

    /**
     * Creates new form DBall
     */
    public DBall2() {
        initComponents();
        jp2.setVisible(false);
        System.out.println((char)(97)+"");
       // System.out.println(l2.getX()+" "+l2.getY());
         System.out.println(br2.getX()+" "+br2.getY());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        board = new javax.swing.JPanel();
        r1 = new javax.swing.JRadioButton();
        bat = new javax.swing.JPanel();
        bw = new javax.swing.JButton();
        right = new javax.swing.JRadioButton();
        left = new javax.swing.JRadioButton();
        br = new dball.Bricks();
        br2 = new dball.Bricks();
        br3 = new dball.Bricks();
        br4 = new dball.Bricks();
        br5 = new dball.Bricks();
        br6 = new dball.Bricks();
        br7 = new dball.Bricks();
        br8 = new dball.Bricks();
        br9 = new dball.Bricks();
        br10 = new dball.Bricks();
        br11 = new dball.Bricks();
        br12 = new dball.Bricks();
        br13 = new dball.Bricks();
        br14 = new dball.Bricks();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Game Over");

        javax.swing.GroupLayout jp2Layout = new javax.swing.GroupLayout(jp2);
        jp2.setLayout(jp2Layout);
        jp2Layout.setHorizontalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp2Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel1)
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jp2Layout.setVerticalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp2Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        board.setBackground(new java.awt.Color(153, 0, 51));
        board.setMinimumSize(new java.awt.Dimension(500, 600));
        board.setLayout(null);

        r1.setSelected(true);
        r1.setOpaque(false);
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        board.add(r1);
        r1.setBounds(370, 160, 20, 20);

        bat.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                batMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout batLayout = new javax.swing.GroupLayout(bat);
        bat.setLayout(batLayout);
        batLayout.setHorizontalGroup(
            batLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(batLayout.createSequentialGroup()
                .addComponent(left)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bw, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(right)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        batLayout.setVerticalGroup(
            batLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(batLayout.createSequentialGroup()
                .addGroup(batLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        board.add(bat);
        bat.setBounds(360, 450, 120, 20);

        br.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        br.setContentAreaFilled(false);
        board.add(br);
        br.setBounds(270, 30, 100, 90);

        br2.setFocusPainted(false);
        br2.setFocusable(false);
        br2.setRequestFocusEnabled(false);
        board.add(br2);
        br2.setBounds(40, 100, 210, 40);

        br3.setFocusPainted(false);
        br3.setFocusable(false);
        br3.setRequestFocusEnabled(false);
        board.add(br3);
        br3.setBounds(10, 50, 210, 40);

        br4.setFocusPainted(false);
        br4.setFocusable(false);
        br4.setRequestFocusEnabled(false);
        board.add(br4);
        br4.setBounds(450, 150, 210, 40);

        br5.setFocusPainted(false);
        br5.setFocusable(false);
        br5.setRequestFocusEnabled(false);
        board.add(br5);
        br5.setBounds(30, 200, 210, 40);

        br6.setFocusPainted(false);
        br6.setFocusable(false);
        br6.setRequestFocusEnabled(false);
        board.add(br6);
        br6.setBounds(370, 200, 210, 40);

        br7.setFocusPainted(false);
        br7.setFocusable(false);
        br7.setRequestFocusEnabled(false);
        br7.setVerifyInputWhenFocusTarget(false);
        board.add(br7);
        br7.setBounds(550, 40, 210, 40);

        br8.setFocusPainted(false);
        br8.setFocusable(false);
        br8.setRequestFocusEnabled(false);
        board.add(br8);
        br8.setBounds(600, 90, 210, 40);

        br9.setFocusPainted(false);
        br9.setFocusable(false);
        br9.setRequestFocusEnabled(false);
        board.add(br9);
        br9.setBounds(80, 150, 210, 40);

        br10.setFocusPainted(false);
        br10.setFocusable(false);
        br10.setRequestFocusEnabled(false);
        board.add(br10);
        br10.setBounds(790, 190, 210, 40);

        br11.setFocusPainted(false);
        br11.setFocusable(false);
        br11.setRequestFocusEnabled(false);
        board.add(br11);
        br11.setBounds(740, 240, 210, 40);

        br12.setFocusPainted(false);
        br12.setFocusable(false);
        br12.setRequestFocusEnabled(false);
        board.add(br12);
        br12.setBounds(820, 140, 210, 40);

        br13.setFocusPainted(false);
        br13.setFocusable(false);
        br13.setRequestFocusEnabled(false);
        br13.setVerifyInputWhenFocusTarget(false);
        board.add(br13);
        br13.setBounds(820, 80, 210, 40);

        br14.setFocusPainted(false);
        br14.setFocusable(false);
        br14.setRequestFocusEnabled(false);
        board.add(br14);
        br14.setBounds(380, 90, 210, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(board, javax.swing.GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(board, javax.swing.GroupLayout.PREFERRED_SIZE, 478, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int leave=0;
Thread th; 
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        leave++;
        if(leave==1)
        {
        th= new Thread(this);
        th.start();
        }
    }//GEN-LAST:event_formMouseClicked
int n1= 0,n2=0;
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
     n2= evt.getX();
     if(n1<0)
     {
         n1=0;
     }
     if(n1>(board.getWidth()-bat.getWidth()))
     {
         n1=board.getWidth()-bat.getWidth();
     }
     if(n2>n1 && bat.getX()<=(board.getWidth()-bat.getWidth()))
     {
         bat.setBounds(evt.getX(), bat.getY(), bat.getWidth(), bat.getHeight());
         n1=n2;
     }
     else if(n2<n1 && bat.getX()>=0)
     {
         bat.setBounds(evt.getX(), bat.getY(), bat.getWidth(), bat.getHeight());
         n1=n2;
     }
    }//GEN-LAST:event_formMouseMoved

    private void batMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_batMouseMoved

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

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
            java.util.logging.Logger.getLogger(DBall2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DBall2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DBall2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DBall2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DBall2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bat;
    private javax.swing.JPanel board;
    private dball.Bricks br;
    private dball.Bricks br10;
    private dball.Bricks br11;
    private dball.Bricks br12;
    private dball.Bricks br13;
    private dball.Bricks br14;
    private dball.Bricks br2;
    private dball.Bricks br3;
    private dball.Bricks br4;
    private dball.Bricks br5;
    private dball.Bricks br6;
    private dball.Bricks br7;
    private dball.Bricks br8;
    private dball.Bricks br9;
    private javax.swing.JButton bw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jp2;
    private javax.swing.JRadioButton left;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton right;
    // End of variables declaration//GEN-END:variables

    int i=1,j=1;
    @Override
    public void run() {
        for(;r1.getY()<=board.getHeight()+10;)
        {
            r1.setBounds(r1.getX()+i,r1.getY()+j,r1.getWidth(),r1.getHeight()); 
            
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(DBall2.class.getName()).log(Level.SEVERE, null, ex);
            }
            boardHit();
            brkHt();
            if(r1.getX()>=board.getWidth()-r1.getWidth()-5)
                    {
                        i=-i;
                    }
            if(r1.getY()>=board.getHeight()+10)
                    {
                       jp2.setVisible(true);
                    }
            if(r1.getX()<=0)
                    {
                        i=-i;
                    }
            if(r1.getY()<=0)
                    {
                        j=-j;
                    }
        }
    }
boolean truth=false;
    private void boardHit() {
        // Left
       if(i>0 &&(r1.getX()+r1.getWidth())>=bat.getX()&&(r1.getX()+r1.getWidth())<=(bat.getX()+bat.getWidth()*15/100) && bat.getY()<=(r1.getY()+r1.getHeight()+5))
       {
           i=(-i);
           j=(-j);
           truth=true;
       }
       if(i<0 &&(r1.getX()+r1.getWidth())>=bat.getX()&&(r1.getX()+r1.getWidth())<=(bat.getX()+bat.getWidth()*15/100) && bat.getY()<=(r1.getY()+r1.getHeight()+5))
       {
           j=(-j);
           truth=true;
       }
       // Right
       if(i<0 &&(r1.getX()+r1.getWidth())>=(bat.getX()+bat.getWidth()-bat.getWidth()*15/100)&&(r1.getX()+r1.getWidth())<=(bat.getX()+bat.getWidth()) && bat.getY()<=(r1.getY()+r1.getHeight()+6))
       {
           i=(-i);
           j=(-j);
           truth=true;
       }
       if(i>0 &&(r1.getX()+r1.getWidth())>=(bat.getX()+bat.getWidth()-bat.getWidth()*15/100)&&(r1.getX()+r1.getWidth())<=(bat.getX()+bat.getWidth()) && bat.getY()<=(r1.getY()+r1.getHeight()+6))
       {
           j=(-j);
           truth=true;
       } 
       //center
         if((r1.getX()+r1.getWidth())<=(bat.getX()+bat.getWidth()-bat.getWidth()*15/100)&&(r1.getX()+r1.getWidth())>=(bat.getX()+bat.getWidth()*15/100)&& bat.getY()<=(r1.getY()+r1.getHeight()))
       {
           j=-j;
           truth=true;
       }
         
         if(truth && j>0)
         {
            j=(-j);
            truth=false;
         }
    }
int h=0,v=0,bs;
    private void brkHt() {     

      multipleBrick(br);
      multipleBrick(br2);
      multipleBrick(br3);
      multipleBrick(br4);
      multipleBrick(br5);
      multipleBrick(br6);
      multipleBrick(br7);
      multipleBrick(br8);
      multipleBrick(br9);
      multipleBrick(br10);
      multipleBrick(br11);
      multipleBrick(br12);
      multipleBrick(br13);
      multipleBrick(br14);
    }
   
    private void multipleBrick(dball.Bricks bkr)
    {
        int result[]=result=bkr.hitchk(r1.getX(),r1.getY(),r1.getWidth(),r1.getHeight(),h,v,bkr.getX(),bkr.getY(),bkr.getWidth(),bkr.getHeight());        
        
        if(result[0]==1)
        {    
            i=i*result[1];
            j=j*result[2];  
            //System.out.println(result[2]+" "+j);
        }
    }
}
