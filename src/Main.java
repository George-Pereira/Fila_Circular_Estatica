import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) 
	{
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira o Tamanho da Lista"));
		StaticQueue fila = new StaticQueue(n);
		for(int CTA = 1; CTA<21; CTA++) 
		{
			if(CTA % 3 != 0) 
			{
				fila.enfileirar(CTA);
			}
			else
			{
				System.out.println("Caracter desenfileirado = " + fila.desenfileirar() + "\n");
			}
			if(CTA % 17 == 0) 
			{
				fila.furaFila(CTA);
			}
		}
		fila.show();
	}
}
