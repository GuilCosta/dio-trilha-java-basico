public class ForArray {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS" };
        
        /*O código abaixo esta mais otimizado que o comentado, ambos tem a mesma finalidade */
        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
        /*for (int x=0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x= " + x + " é " + alunos [ x ]);
        } */
    }
}
