public class StaticQueue 
{
	public Object fila[];
	public int primeiro;
	public int ultimo;
	
	public StaticQueue(int n) 
	{
		this.primeiro = -1;
		this.ultimo = -1;
		this.fila = new Object[n];
	}
	
	
	public boolean isEmpty() 
	{
		if (this.ultimo == -1) 
		{
			return true;
		}
		return false;
	}
	
	public boolean isFull() 
	{
		if (ultimo >= fila.length)
		{
			if(primeiro == (ultimo % fila.length)) 
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		else
		{
			if(primeiro == ultimo && ultimo >0 && primeiro > 0)
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
	}
	
	public int getSize() 
	{
		if (this.isEmpty()) 
		{
			return 0;
		}
		return this.ultimo + 1;
	}
	
	public Object showFront() 
	{
		if (this.isEmpty()) 
		{
			return null;
		}
			return this.fila[this.primeiro];
	}
	
	public void enfileirar(Object elemento) 
	{
		int max = fila.length;
		if(isEmpty())
		{
			primeiro = 0;
			ultimo  = 0;
			this.fila[ultimo] = elemento;
		}
		else if(++ultimo > max-1) 
		{
			if (isFull())
			{
				System.out.println("Fila Cheia!!!");
				--ultimo;
				show();
			}
			else if(ultimo % max < primeiro) 
			{
				this.fila[ultimo % max] = elemento;
			}
		}
		else 
		{
			this.fila[ultimo] = elemento;
		}
	}
	
	public Object desenfileirar() 
	{
		int max = fila.length;
		Object temp = null;
		if(primeiro >= max) 
		{
			temp = fila[primeiro % max];
		}
		else 
		{
			temp = fila[primeiro];
		}
		if(isEmpty())
		{
			return null;
		}
		if(getSize() == 1) 
		{
			ultimo--;
			primeiro--;
			return temp;
		}
		primeiro++;
		return temp;
	}
	public void show() 
	{
		System.out.println("Mostrando a fila:");
		int CTA = 0;
		while(CTA < fila.length) 
		{
			System.out.println(fila[CTA++]);
		}
		System.out.println("__________________");
	}
	public void furaFila(Object elemento) 
	{
		if(isFull()) 
		{
			System.out.println("Fila Cheia!!!");
		}
		else if(primeiro < (fila.length-1))
		{
			fila[--primeiro] = elemento;
			System.out.println("O elemento " + elemento + " furou a fila!");
		}
		else if(primeiro >= (fila.length)) 
		{
			fila[--primeiro %fila.length] = elemento;
			System.out.println("O elemento " + elemento + " furou a fila!");
		}
	}
}
