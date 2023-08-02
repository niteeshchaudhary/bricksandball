/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dball;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author NKC
 */
public class Bricks extends JButton 
{
    public Bricks()
    {
    this.setBackground(new Color((int) (Math.random() * 255), 
    (int) (Math.random() * 255), (int) (Math.random() * 255),100));
    }
    
    /*public Bricks(JButton jb)
    {
    this.setModel(jb.getModel());
    }*/
    
    //            yes/no,  i   j  
    int n;
    public int[]  hitchk(int xc,int yc,int wc,int hc,int hori,int verti,int bx,int by,int bw,int bh)
    {
       /* int bx=this.getX(),
            by=this.getY(),
            bw=this.getWidth(),
            bh=this.getHeight();*/  
        int result[]={ 0    ,  0 , 0 , 0 , 0,  0};    
        
      //  System.out.println(by+" "+bx);
        //down
         if(this.isVisible()&&(xc+wc+1)>=(bx)&&(xc)<=(bx+bw)&& yc==by+bh )//(yc-1)<=by+bh && (yc+1)>=by+bh)// && verti==0 
        {
            result[0]=1;
            result[1]=1;
            result[2]=-1;
             System.out.println(by+" "+bx);
          //  result[5]=1;
            this.setVisible(false);
            //System.out.println("running down :"+result[2]);
        }
        //left side
        if(this.isVisible() && bx==(xc+wc) && (by+bh)>=yc && by<=yc+hc)//&& hori==1
        {
            result[0]=1;
            result[1]=-1;
            result[2]=1;
            this.setVisible(false);
        }
        //right side
         if(this.isVisible()&& bx+bw==(xc) && by+bh>=yc && by<=yc+hc)// && hori==0 
        {
            result[0]=1;
            result[1]=-1;
            result[2]=1;  
            this.setVisible(false);
        }
        //up
         if(this.isVisible() &&(xc+wc+1)>=(bx) && (xc)<=(bx+bw) && yc+hc==by)//(yc+hc)>=(by-1) && (yc+hc)<=by+1)// && verti==1
        {
            
            result[0]=1;
            result[1]=1;
            result[2]=-1;
             System.out.println(by+" hi "+bx);
            this.setVisible(false);
           // System.out.println("running up :"+result[2]);
        }
        
        

        return result;
    }
     void vB()
     {
    //     this.setVisible(false);
     }
}
