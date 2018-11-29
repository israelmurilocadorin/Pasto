package pasto.entidade;

import java.awt.Point;

import javax.swing.ImageIcon;

import pasto.Pasto;

public class Ovelha extends Animal implements Entidade{
	
	 private static final int REPRODUCAO = 30;
	
	private final ImageIcon imagem = new ImageIcon("imagens/sheep.gif"); 
	
		 public Ovelha(Pasto pasto) {
			 super(pasto);
			 // TODO Auto-generated constructor stub
			 
			 tempoParaNovaReproducao = REPRODUCAO;
		 }

 			

	@Override
		public void tick(){
		
		
		tempoParaNovaReproducao--;
        
        if(tempoParaNovaReproducao == 0){      
            reproduzir();

        tempoParaNovaReproducao = REPRODUCAO;
        
        }	
		
	}
	

	@Override
	public ImageIcon getImagem() {
		return imagem;
	}
	

	@Override
	public boolean eCompativel(Entidade outraEntidade) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void reproduzir(){
	Point vizinho = 
    (Point)getMembroAleatorio
    (pasto.getVizinhosLivres(this));

	pasto.adicionaEntidade(new Ovelha(pasto), vizinho);
		
	}

	
}
