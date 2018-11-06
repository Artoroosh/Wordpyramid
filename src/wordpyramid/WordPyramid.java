/*
 * Corbin Nash
 * This program makes  
 * and open the template in the editor.
 */
package wordpyramid;
import javax.swing.JOptionPane;
    public class WordPyramid {
        public static void main(String[] args) {
         String input = "";
         input = JOptionPane.showInputDialog("e");
         pyramid(input);
        }
       public static void pyramid(String word){
       System.out.println(word);
        if(word.length()> 2){
         pyramid(word.substring(1, word.length()-1));
      }
     }  
    }
