/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author davi-softplan
 */
public class ExercicioRepita {

    public static void main(String[] args) {
        int n, soma = 0, numValores = 0, numPares = 0, numImpares = 0, acimaCem = 0, media = 0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(
                    "<html>Informe um número: <i>(valor 0 interrompe)</i></html>"
            ));
            
            if (n == 0) break;

            soma += n;
            numValores += 1;
            
            if (n % 2 == 0) {
                numPares += 1;
            } else {
                numImpares += 1;
            }
            
            acimaCem += n > 100 ? 1 : 0;
            
        } while (n != 0);
        
        media = soma / numValores;

        JOptionPane.showMessageDialog(
                null,
                String.format(
                    "<html>Resultado final<hr><br>Total de valores: %d<br>Total de pares: %d<br> Total de ímpares: %d<br>Acima de cem: %d<br>Média dos valores: %d</html>",
                    numValores,
                    numPares,
                    numImpares,
                    acimaCem,
                    media
                )
        );
    }
}
