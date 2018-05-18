package dungeonsanddragons.api.services;

import java.util.Optional;

import dungeonsanddragons.api.entities.Raca;

public interface RacaService {

	/**
	 * Cadastra uma nova raça na base de dados.
	 * 
	 * @param raca
	 * @return Raca
	 */
	public Raca salvar(Raca raca);
	
	
	/**
	 * Busca uma raça dado um id.
	 * 
	 * @param id
	 * @return Optional<Raca>
	 */
	public Optional<Raca> buscarPorId(Long id);
	
}
