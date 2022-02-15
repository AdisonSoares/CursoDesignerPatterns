package aula04.parte05AdapterClass;

/**
 * 
 * @Quando_programar_para_Interface
 * O ideal � programar para interface quando for necess�rio,
 * normalmente vem da necessidade de se atender ao principio
 * de varia��es protegidas, ou seja, permitir que implementa��es
 * mudem sem afetar o codigo cliente.
 *
 */
public interface IArma {
	public abstract void carregar();
	public abstract void atirar();
	public abstract void mirar();
	
}
