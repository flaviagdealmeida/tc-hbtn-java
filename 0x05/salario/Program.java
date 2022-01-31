import java.text.NumberFormat;
import java.util.Locale;

public class Program {
	 public static void main(String[] args) {
		 Locale locale = new Locale.Builder().setLanguage("pt").setRegion("BR").build();
		 NumberFormat frm = NumberFormat.getInstance(locale);
		 
         Departamento departamentoEngenharia = new Departamento(1000, 1100);
         Departamento departamentoDocumentacao = new Departamento(1000, 800);

         Empregado empregadoEngenharia1 = new Empregado(2300);
         Empregado empregadoEngenharia2 = new Empregado(3650);
         Gerente gerenteEngenharia = new Gerente(5800);

         Empregado empregadoDocumentacao1 = new Empregado(2500);
         Empregado empregadoDocumentacao2 = new Empregado(3000);
         Gerente gerenteDocumentacao = new Gerente(4980);

         System.out.printf("Salario Fixo: %.2f - Salario Total: %.2f - Valor Bonus: %.2f\n",
                 frm.format(empregadoEngenharia1.getSalarioFixo()),
                 frm.format(empregadoEngenharia1.calcularSalarioTotal(departamentoEngenharia)),
                 frm.format(empregadoEngenharia1.calcularBonus(departamentoEngenharia)));

         System.out.printf("Salario Fixo: %.2f - Salario Total: %.2f - Valor Bonus: %.2f\n",
        		 frm.format(empregadoEngenharia2.getSalarioFixo()),
        		 frm.format(empregadoEngenharia2.calcularSalarioTotal(departamentoEngenharia)),
        		 frm.format(empregadoEngenharia2.calcularBonus(departamentoEngenharia)));

         System.out.printf("Salario Fixo: %.2f - Salario Total: %.2f - Valor Bonus: %.2f\n",
        		frm.format(gerenteEngenharia.getSalarioFixo()),
        		frm.format(gerenteEngenharia.calcularSalarioTotal(departamentoEngenharia)),
        		frm.format(gerenteEngenharia.calcularBonus(departamentoEngenharia)));

         System.out.printf("Salario Fixo: %.2f - Salario Total: %.2f - Valor Bonus: %.2f\n",
        		frm.format(empregadoDocumentacao1.getSalarioFixo()),
        		frm.format(empregadoDocumentacao1.calcularSalarioTotal(departamentoDocumentacao)),
        		frm.format(empregadoDocumentacao1.calcularBonus(departamentoDocumentacao)));

         System.out.printf("Salario Fixo: %.2f - Salario Total: %.2f - Valor Bonus: %.2f\n",
        		frm.format(empregadoDocumentacao2.getSalarioFixo()),
        		frm.format(empregadoDocumentacao2.calcularSalarioTotal(departamentoDocumentacao)),
        		frm.format(empregadoDocumentacao2.calcularBonus(departamentoDocumentacao)));

         System.out.printf("Salario Fixo: %.2f - Salario Total: %.2f - Valor Bonus: %.2f\n",
        		frm.format(gerenteDocumentacao.getSalarioFixo()),
        		frm.format(gerenteDocumentacao.calcularSalarioTotal(departamentoDocumentacao)),
        		frm.format(gerenteDocumentacao.calcularBonus(departamentoDocumentacao)));
     }
}
