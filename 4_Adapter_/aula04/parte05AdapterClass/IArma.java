package aula04.parte05AdapterClass;

/**
 * 
 * @Quando_programar_para_Interface
 * O ideal é programar para interface quando for necessário,
 * normalmente vem da necessidade de se atender ao principio
 * de variações protegidas, ou seja, permitir que implementações
 * mudem sem afetar o codigo cliente.
 *
 */
public interface IArma {
	public abstract void carregar();
	public abstract void atirar();
	public abstract void mirar();
	
}
