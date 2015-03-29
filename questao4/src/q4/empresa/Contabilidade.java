package q4.empresa;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contabilidade {
	    private double soma=0;
		private Pattern expressao = Pattern.compile("\\d+");	
		private Matcher matcher;
		
	public void CalculaSalarios(String dados){
		matcher  = expressao.matcher(dados);
		System.out.println("valores");
		while(matcher.find()){
			soma+= Integer.parseInt(matcher.group());
			System.out.println(matcher.group());
		}
		System.out.println("total "+soma);

    }
}