import javax.swing.*;

public class CMDInput {
    public static void main(String[] args) {
        if (args.length == 0){
            JOptionPane.showMessageDialog(null, "Programmet vet inte vad det ska göra! Avbryter...");
        }else if (args.length == 1){
            JOptionPane.showMessageDialog(null, "så säger du");
        }else if (args.length == 2){
            try {
                JOptionPane.showMessageDialog(null, Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Det funkar inte för att du använder bokstäver, inte siffror.... retard.");
            }  //if (args[0] || args[1] != ){

          }

        }


    }

