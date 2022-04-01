
public class Main {
	
	public static void main(String[] args) {
		
//instanciando do carro		
		Carro carro1 = new Carro();
		
		carro1.ano = 1980;
		carro1.setMarca("Ford");
		carro1.setModelo("Fiesta");
		carro1.setQuatroPortas(true);
		
		carro1.imprimeDados();
		carro1.buzinar();
		
		System.out.println();
		
		
//instanciando da moto	
		Moto moto1 = new Moto();
		
		moto1.setAno(2022);
		moto1.setMarca("Honda");
		moto1.setModelo("Titan");
		
		moto1.imprimeDados();
		moto1.empinar();
		moto1.buzinar();
		
		System.out.println();
		
//instanciando do caminhao	
		Caminhao caminhao1 = new Caminhao();
		
		caminhao1.buzinar();
		
	}
	 
}
