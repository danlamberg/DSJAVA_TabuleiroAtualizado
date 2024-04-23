import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {

    public static void tabuleiro(int largura, int altura, List<Personagem> personas) {
        for (int lin = 0; lin < altura; lin++) {
            for (int col = 0; col < largura; col++) {
                boolean tevePersonagem = false; 

                for (Personagem persona : personas) { 
                    //for (int i = 0; i < persona.size(); i++){
                    //Personagem p = pers.get(i);                   }
                    if (lin == persona.getPosX() && col == persona.getPosY()) {
                        tevePersonagem = true; 
                        System.out.print("[ " + persona.getDesenho() + " ]");
                        break;
                    }
                }     

                if (!tevePersonagem) 
                    System.out.print("[ . ]");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Personagem> personas = new ArrayList<>();
        personas.add(new Personagem(2, 3, "O"));
        personas.add(new Personagem(3, 5, "A"));
        personas.add(new Personagem(1, 6, "B"));
        tabuleiro(10, 10, personas);
    }
}