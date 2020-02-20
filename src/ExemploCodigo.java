
public class ExemploCodigo {

	public static void main(String[] args) { // CTRL + ESPAÇO PARA COMPLETAR O COMANDO.
		// System.out.println("Alo mundo"); // CTRL + F11 PARA EXECUTAR O CODIGO.
		int idade = 10; // Variavel sempre em minusculo. Classe sempre a primeira letra em maisculo.
		float salario = 100;

		boolean aceita = false; // BOOLEAN ACEITA TRUE OU FALSE.

		String nome = "Rodrigo"; // String no java é em maisculo porque é uma classe.

		System.out.println("Olá, " + nome + ". Você tem " + idade + " anos. ");

		System.out.println(String.format("Olá, %s. Você tem %s anos.", nome, idade));
	}// CTRL + SHIFT + F PARA IDENTAR AUTOMATICAMENTE.

}
