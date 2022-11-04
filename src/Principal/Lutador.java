package Principal;

public class Lutador {
    private String nome;
    private String nacionalidade;

    private String pais;
    private String categoria;
    private double peso;
    private double envergadura;
    private int idade;
    private double altura;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(){

    }

    public Lutador(String nome, String nacionalidade,String pais, double peso, double envergadura, int idade, double altura, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.pais = pais;
        this.peso = peso;
        this.setCategoria(peso);
        this.envergadura = envergadura;
        this.idade = idade;
        this.altura = altura;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;

    }



    // Publicos

    public void apresetarLutador(){

        System.out.println("Lutador da categoria "+ this.categoria+ " possui o cartel de: ");
        System.out.println(this.vitorias + " vitorias, "+this.derrotas+ " derrotas e " + this.empates+ " empates.");
        System.out.println("Lutando diretamente de "+ this.pais+ ", ele: " + this.nome.toUpperCase()+ "!!!");
        System.out.println();
    }

    public void status(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Nacionalidade: "+ this.nacionalidade);
        System.out.println("idade: "+ this.idade);
        System.out.println("peso: "+ this.peso);
        System.out.println("Categoria: "+ this.categoria);
        System.out.println("Envergadura: "+ this.envergadura);
        System.out.println("Altura: "+ this.altura);
        System.out.println("Vitorias: "+ this.vitorias);
        System.out.println("Empates: "+ this.empates);
        System.out.println("Derrotas: "+ this.derrotas);
    }

    public void ganharLuta(){
        this.vitorias ++;
    }

    public void perderLuta(){
        this.derrotas ++;
    }

    public void empatarLuta(){
        this.empates ++;
    }




    // Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(double peso) {
        if(peso <= 70){
            this.categoria = "Peso leve";
        } else if(peso < 80){
            this.categoria = "Peso médio";
        } else if(peso < 90){
            this.categoria = "Peso meio pesado";
        } else {
            this.categoria = "Peso pesado";
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria(peso);
    }

    public double getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
