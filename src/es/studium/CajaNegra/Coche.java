package es.studium.CajaNegra;

public class Coche 
{
	private String fabricante;
	private String modelo;
	private int anyo;
	public Coche()
	{
		fabricante = "";
		modelo = "";
		anyo = 0;
	}
	public Coche(String f, String m, int a)
	{
		fabricante = f;
		modelo = m;
		anyo = a;
	}
	public String getFabricante()
	{
		return fabricante;
	}
	public void setFabricante(String f)
	{
		fabricante = f;
	}
	public String getModelo()
	{
		return modelo;
	}
	public void setModelo(String m)
	{
		modelo = m;
	}
	public int getAnyo()
	{
		return anyo;
	}
	public void setAnyo(int a)
	{
		anyo = a;
	} 
}