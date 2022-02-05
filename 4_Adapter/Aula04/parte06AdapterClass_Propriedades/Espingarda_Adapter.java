package Aula04.parte06AdapterClass_Propriedades;
import PacoteEspingardaTerceiros.EspingardaTerceiros;

/**
 * @Objetivo � adaptar a interface Espingarda vinda de terceiros
 * para a classe que o personagem criado precisa, por meio de uma
 * classe adaptada para espingarda "EspingardaAdapter".
 * 
 * @O_design_pattern_Adapter permite converter a interface de uma
 * classe em outra interface esperada, permite que classes
 * com interfaces incompativeis trabalhem juntas.
 *
 * @Tipos_de_Adapters
 * Adapter de classes e de objetos, ambos adaptam a interfaces incompat�veis.
 *
 * @ObjetivoAdapter � adaptar uma interface(Adaptee- classe a ser adaptada),
 * para uma interface(Target) esperada pelo codigo Cliente, o Adaptee pode 
 * ter um m�todo incompativel com a interface Target, o objetivo do 
 * parttern � fazer com que as classes incompativeis do Adaptee 
 * e Target trabalhem juntos.
 *
 * @Justificativa do uso desse patern � a elimina��o a necessidade
 * de elimina��o de c�digos existentes para usar uma nova 
 * funcionalidade implementada por terceiros mesmo sendo implementadas
 * em interfaces incompativeis, nem precisando do c�digo fonte.
 *
 */
public class Espingarda_Adapter extends EspingardaTerceiros implements Arma_Target {

	@Override
	public void carregar() {
		this.carregamento();
	}

	@Override
	public void atirar() {
		this.alvejar();
	}

	@Override
	public void mirar() {
		this.zoom();
	}

}
