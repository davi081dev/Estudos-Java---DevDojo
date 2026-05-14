package br.com.devdojo.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // valores padrões por cada tipo de variavel
        // byte, short, int, long, float e double são 0
        // char é '\u0000' e ' '
        //boolean é false
        // String é null

        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kira";
        nomes[2] = "L";

        for(int i=0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
        // limpa o espaço na memória antigos, sobreescrevendo pelos novos
        nomes = new String[4];
    }
}
