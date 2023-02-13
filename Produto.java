public class Produto{
   //atributos da class
   public String nome;
   public String descricao;
   public double preco;
   public int quantidadeEmEstoque;
   
   public Produto ( String nome, String descricao, double preco, int quantidadeEmEstoque){
      this.nome = nome;
      this.descricao = descricao;
      this.preco = preco;
      this.quantidadeEmEstoque = quantidadeEmEstoque;
   }
   
   public String getNome(){
      return nome;
   }
   
   public String getDescricao(){
      return descricao;
   }
   
   public double getPreco(){
      return preco;
   }
   
   public int getEstoque(){
      return quantidadeEmEstoque;
   }
   
   
   // Metodo de Modificação
   public void setNome(String nome){
      this.nome = nome;
   }
   
   public void setDescricao(String descricao){
      this.descricao = descricao;
   }
   
   public void setPreco(Double preco){
      this.preco = preco;
   }
   
   public void setEstoque(int quantidadeEmEstoque){
      this.quantidadeEmEstoque  = quantidadeEmEstoque;
   }
   
   // Metodos para adicionar e remover quantidade no estoque
   public void adicionarAoEstoque(int totalAdicionado){
      quantidadeEmEstoque += totalAdicionado;
   }
   
   public void removerDoEstoque(int totalRemovido){
      quantidadeEmEstoque -= totalRemovido;
   }
   
   
}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  