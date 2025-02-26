public class aluno {
    int numeroAluno;
    char classeSocial;
    float CRA;


    public aluno(int numeroAluno, char classeSocial, float CRA) {
        this.numeroAluno = numeroAluno;
        this.classeSocial = classeSocial;
        this.CRA = CRA;
    }

    public void mostrarAluno() {
        System.out.println(this.numeroAluno + "\t\t" + this.classeSocial + "\t\t" + this.CRA);
    }
}
