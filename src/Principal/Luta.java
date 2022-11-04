package Principal;

import java.util.Objects;
import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;

    private boolean aprovada;
    private int rounds;
    private String local;


    public Luta(){

    }

    public Luta(Lutador desafiante, Lutador desafiado, int rounds, String local) {
        this.desafiante = desafiante;
        this.desafiado = desafiado;
        this.rounds = rounds;
        this.local = local;
    }


    public boolean marcarLuta(Lutador l1, Lutador l2, int rounds, String local){
        if(!Objects.equals(l1.getCategoria(), l2.getCategoria())){
            System.out.println("Esta luta não pode acotecer! Lutadores de categorias diferentes!");
        } else if(Objects.equals(l1.getNome(), l2.getNome())){
            System.out.println("Esta luta não pode acontece! Verifique os lutadores!");
        } else{
            this.desafiante = l1;
            this.desafiado = l2;
            this.rounds = rounds;
            this.local = local;
            return true;
        }
        return false;
    }

    public void lutar(){
        if(!marcarLuta(this.desafiante, this.desafiado,this.rounds, this.local)){
            System.out.println("Luta não autorizada!");
        } else{
            System.out.println("IIIIIIIIT'S TIIIIMEEEE!! Sejam bem vindos ao "+ this.local);
            System.out.println("Esta luta tera "+ this.rounds+ " rounds." );
            System.out.println("Introduzindo no Corner Azul ");
            this.desafiante.apresetarLutador();
            System.out.println("E do outro lado, no corner vermelho seu oponente ");
            this.desafiado.apresetarLutador();

            Random random = new Random();

            int resultado = random.nextInt(3);

            switch (resultado){
                case 0:
                    System.out.println("Luta empatou!");
                    break;
                case 1:
                    System.out.println(this.desafiante.getNome() + " ganhou!");
                    break;
                case 2:
                    System.out.println(this.desafiado.getNome()+ " ganhou!");
                    break;
            }


        }
    }


    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
