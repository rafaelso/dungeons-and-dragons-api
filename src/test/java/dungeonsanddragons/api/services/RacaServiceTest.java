package dungeonsanddragons.api.services;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import dungeonsanddragons.api.entities.Raca;
import dungeonsanddragons.api.repositories.RacaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class RacaServiceTest {

	@MockBean
	private RacaRepository racaRepository;
	
	@Autowired
	private RacaService racaService;
	
	@Before
	public void setUp() {
		BDDMockito.given(this.racaRepository.save(Mockito.any(Raca.class))).willReturn(new Raca());
		BDDMockito.given(this.racaRepository.findById(Mockito.anyLong())).willReturn(Optional.of(new Raca()));
	}
	
	@Test
	public void testSalvarRaca() {
		Raca raca = this.racaService.salvar(new Raca());
		assertNotNull(raca);
	}
	
	@Test
	public void testBuscaPorId() {
		Optional<Raca> raca = this.racaService.buscarPorId(1L);
		assertTrue(raca.isPresent());
	}
}
