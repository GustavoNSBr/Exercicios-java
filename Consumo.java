import java.util.Scanner;

public class Consumo
{
	private int kmDirigido, litrosGas, viagem;

	public Consumo(int kmDirigido, litrosGas, viagem)
	{	
		this.kmDrigido = kmDirigido;
		this.litrosGas = litrosGas;
		this.viagem = viagem;
	}

	public void getKmDirigido (int kmDirigido)
	{
		return this.kmDirigido;
	}

	public void setKmDirigido (int kmDirigido)
	{
		this.kmDirigido = kmDirigido;
	}

	public void getLitrosGas (int litrosGas)	
	{
		return this.litrosGas;
	}

	public void setLitrosGas (int litrosGas)
	{
		this.litrosGas = litrosGas;
	}

	public void getViagem (int viagem)
	{
		return this.viagem;
	}
	
	public void setViagem (int viagem)
	{
		this.viagem = viagem;
	}
	

	public void Viagem(int kmDirigido, int litrosGas, int viagem)
	{
		double consumoViagem = this.kmDirigido/this.litrosGas;
		System.out.printf("Media de consumo por litro é de %f\n", consumoViagem);
	}

}
