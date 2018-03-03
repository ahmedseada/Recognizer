/*
 * Created :  By Ahmed Seada.

 */
package task4;

import java.util.Scanner;

/**
 *
 * @author ahmed
 */
public class Task4 {
    
    // This Function Made For Recoginze The Machine Givin In Task 4 (Last Lecture )
    public static boolean Recongize(String Tokens){
    int state=1;
    int i=0;
        while (i<Tokens.length()) {            
            char ch =Tokens.charAt(i);
            switch(state){
                case 1:if (ch=='a') state=2;
                 else if (ch=='b') state=3;
                 else return false;
                break;
                case 2:if (ch=='a') state=1;
                 else if (ch=='b') state=4;
                 else return false;
                break;
                 case 3:if (ch=='a') state=4;
                 else if (ch=='b') state=1;
                 else return false;
                break;
                 case 4:if (ch=='a') state=3;
                 else if (ch=='b') state=2;
                 else return false;
                break;
            }
            i++;
            
        }
        if (state==3) return true;
        else return false;
    
    }
    public static void main(String[] args) {
        form1 f=new form1();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        
    }
    
}
