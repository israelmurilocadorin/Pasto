package pasto.entidade;

import java.awt.Point;

import javax.swing.ImageIcon;

import pasto.Pasto;

public class Lobo extends Animal implements Entidade{
	
	private static final int REPRODUCAO = 30;
	
	private final ImageIcon imagem = new ImageIcon("imagens/wolf.gif"); 
	
	
	public Lobo(Pasto pasto){
		super(pasto);
		// TODO Auto-generated constructor stub
		tempoParaNovaReproducao = REPRODUCAO;
	}

		@Override
	public void tick() {
		// TODO Auto-generated method stub
		
		tempoParaNovaReproducao--;
        
        if(tempoParaNovaReproducao == 0){      
            reproduzir();

         tempoParaNovaReproducao = REPRODUCAO;
         
        }	
		
	}

	@Override
	public ImageIcon getImagem(){
		
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

				pasto.adicionaEntidade(new Lobo(pasto), vizinho);
					
				}
		
	}


