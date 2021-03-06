package dungeonsanddragons.api.repositories;

import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import dungeonsanddragons.api.entities.Raca;
import dungeonsanddragons.api.enums.Tamanho;
import dungeonsanddragons.api.repositories.RacaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class RacaRepositoryTest {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private RacaRepository racaRepository;

	private Raca raca;
	private Long idRacaInvalido = 999L;

	@Before
	public void setUp() {
		Raca raca = new Raca();
		raca.setNome("Humano");
		raca.setTamanho(Tamanho.MEDIO);

		this.raca = this.racaRepository.save(raca);
	}

	@Test
	public void testBuscaPorIdComSucesso() {
		Optional<Raca> raca = this.racaRepository.findById(this.raca.getId());
		assertTrue(raca.isPresent());
	}

	@Test
	public void testBuscaPorIdSemSucesso() {
		Optional<Raca> raca = this.racaRepository.findById(this.idRacaInvalido);
		assertTrue(!raca.isPresent());
	}
	
	@Test
	public void testBuscaEAcessoACaracteristicas() {
		Optional<Raca> raca = this.racaRepository.findById(this.raca.getId());
		raca.get().getCaracteristicas();
	}
	
	@Test
	public void testBuscaEAcessoANomesMasculinos() {
		Optional<Raca> raca = this.racaRepository.findById(this.raca.getId());
		raca.get().getNomesMasculinos();
	}
	
	@Test
	public void testBuscaEAcessoANomesFemininos() {
		Optional<Raca> raca = this.racaRepository.findById(this.raca.getId());
		raca.get().getNomesFemininos();
	}
	
	@After
	public void cleanUp() {
		this.racaRepository.deleteAll();
	}
}
