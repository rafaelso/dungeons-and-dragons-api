package dungeonsanddragons.api.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dungeonsanddragons.api.entities.Raca;
import dungeonsanddragons.api.repositories.RacaRepository;
import dungeonsanddragons.api.services.RacaService;

@Service
public class RacaServiceImpl implements RacaService {

	private static final Logger log = LoggerFactory.getLogger(RacaServiceImpl.class);
	
	@Autowired
	private RacaRepository racaRepository;
	
	@Override
	public Raca salvar(Raca raca) {
		log.info("Persistindo raca: {}", raca);
		return this.racaRepository.save(raca);
	}

	@Override
	public Optional<Raca> buscarPorId(Long id) {
		log.info("Buscando raca pelo id: {}", id);
		return racaRepository.findById(id);
	}

}
