import java.util.Scanner;
import java.lang.*;


public class Heroi {
    public String nome;
    public int idade;
    public String classe;
    public String ataque;

    public Heroi (String nome, int idade, String classe){
       this.nome = nome;
       this.idade = idade;
       this.classe = classe;
       setAtaque(classe);
   }

   private void setAtaque (String classe){
       switch (classe){
           case "mago":
               this.ataque = "magia";
               break;

           case "guerreiro":
               this.ataque = "espada";
               break;

           case "monge":
               this.ataque = "artes marciais";
               break;

           case "ninja":
              this.ataque = "shuriken";
               break;
           default:
               throw new IllegalStateException("Unexpected value: " + classe);
       }
   }

    public void atacar(){
        System.out.println("o " + classe + " " + nome + " atacou usando " + ataque + " no auge de seus " + idade + " anos.");
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do personagem: ");
        String nome = sc.nextLine();
        System.out.println("Escolha uma das classes disponiveis: mago, guerreiro, monge ou ninja");
        String classe = sc.nextLine();
        System.out.println("Digite a idade:");
        int idade = sc.nextInt();

        Heroi heroi = new Heroi(nome, idade, classe);

        heroi.atacar();

        sc.close();

        }




}