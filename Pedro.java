package sp.senai.br.poo;


public class Pedro {
    
       private int   idade;
       
       private String firstName;
       
       private String lastName;
       
       private double altura;
       
       private double peso;
       
       private String naturalidade;
       
       
       
       public void setIdade(int valor){
           idade = valor;
       }
       
       public int getIdade(){
           return idade;
       }
       
      public void setFirstName(String nome){
           firstName = nome;
       }
       
       public String getFirstName(){
           return firstName;
       }
       
       public void setLastName(String nome){
           lastName = nome;
       }
       
       public String getLastName(){
           return lastName;
       }
       
       public void setAltura(double valor){
           altura = valor;
       }
       
       public double getAltura(){
           return altura;
       }
       
       public void setPeso(double valor){
           peso = valor;
       }
       
       public double getPeso(){
           return peso;
       }
       
       public void setNaturalidade (String nome){
           naturalidade = nome;
       }
       
       public String getNaturalidade(){
           return naturalidade;
       }
}
