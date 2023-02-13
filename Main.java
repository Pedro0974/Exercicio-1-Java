public class Main{
   public static void main (String[] args){
      Produto produto1 = new Produto("Pacoca", "Sabor de infancia", 1.50, 100);
      Produto produto2 = new Produto("Nitro5", "Se tem Led é bom", 4.440, 100);
      Produto produto3 = new Produto("Bola de Basquete", "So arremeça quem tem braço", 105, 100);
      
      produto2.adicionarAoEstoque(21);
      produto2.setNome("Acer Nitro 5");
      
      produto3.removerDoEstoque(37);
      produto3.setPreco(110.35);
      
      System.out.println(produto2.getEstoque()+"\n"+produto2.getNome());
      
      System.out.println(produto3.getPreco()+"\n"+produto3.getEstoque());
      
      System.out.println(produto1.getNome());
   }
}  