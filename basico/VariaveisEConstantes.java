package cursoJava.basico;
/*
 * Classe demonstrativa de veri�veis e Constantes
 * 
 * vers�o: 1.0
 * 
 * autor: Marcelo Junior 
 * 
 */
public class VariaveisEConstantes {

	public static void main(String[] args) {
		
		//Cria��o de COnstantes
		
		final double ACELERACAO_GRAVIDADE_TERRA= 9.80665;
		
		
		// Cria��o de Vari�veis
		String nome="Jos�";
		
		int idade=48;
		
		double peso=73.4, altura=1.73;
		
		char sexo='m', chn='a';
		
		boolean doadorOrgaos=true;
		
		System.out.println("Nome: "+nome);
		
		System.out.println("Idade: "+idade);
		
		System.out.println("Peso: "+peso);
		
		System.out.println("Altura: "+altura);
		
		System.out.println("Sexo: "+sexo);
		
		System.out.println("CHN: "+chn);
		
		System.out.println("Doador de Orgaos: "+doadorOrgaos);
		
		System.out.println("Gravidade na Terra � de: "+ACELERACAO_GRAVIDADE_TERRA+" s/s2");

	}

}
