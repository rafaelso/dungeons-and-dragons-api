package dungeonsanddragons.api.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import dungeonsanddragons.api.enums.Tamanho;

@Entity
@Table(name="raca")
public class Raca implements Serializable {

	private static final long serialVersionUID = 3784642167975818903L;

	private Long id;
	private String nome;
	private String descricao;
	private String descricaoFisica;
	private String relacoes;
	private String aventuras;
	private String terras;
	private String tendencia;
	private String nomes;
	private Tamanho tamanho;
	private String idiomas;
	private Set<String> nomesMasculinos;
	private Set<String> nomesFemininos;
	private Set<String> caracteristicas;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Column(name="descricao_fisica")
	public String getDescricaoFisica() {
		return descricaoFisica;
	}
	
	public void setDescricaoFisica(String descricaoFisica) {
		this.descricaoFisica = descricaoFisica;
	}
	
	@Column(name="relacoes")
	public String getRelacoes() {
		return relacoes;
	}
	
	public void setRelacoes(String relacoes) {
		this.relacoes = relacoes;
	}
	
	@Column(name="aventuras")
	public String getAventuras() {
		return aventuras;
	}
	
	public void setAventuras(String aventuras) {
		this.aventuras = aventuras;
	}
	
	@Column(name="terras")
	public String getTerras() {
		return terras;
	}
	
	public void setTerras(String terras) {
		this.terras = terras;
	}
	
	@Column(name="tendencia")
	public String getTendencia() {
		return tendencia;
	}
	
	public void setTendencia(String tendencia) {
		this.tendencia = tendencia;
	}
	
	@Enumerated(EnumType.STRING)
	public Tamanho getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(Tamanho tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getIdiomas() {
		return idiomas;
	}
	
	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}
	
	public String getNomes() {
		return nomes;
	}
	
	public void setNomes(String nomes) {
		this.nomes = nomes;
	}
	
	@ElementCollection(fetch = FetchType.EAGER)
	@Column(name="nomes_masculinos")
	public Set<String> getNomesMasculinos() {
		return nomesMasculinos;
	}
	
	public void setNomesMasculinos(Set<String> nomesMasculinos) {
		this.nomesMasculinos = nomesMasculinos;
	}
	
	@ElementCollection(fetch = FetchType.EAGER)
	@Column(name="nomes_feminimos")
	public Set<String> getNomesFemininos() {
		return nomesFemininos;
	}
	
	public void setNomesFemininos(Set<String> nomesFemininos) {
		this.nomesFemininos = nomesFemininos;
	}
	
	@ElementCollection(fetch = FetchType.EAGER)
	public Set<String> getCaracteristicas() {
		return caracteristicas;
	}
	
	public void setCaracteristicas(Set<String> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		return "Raca [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", descricaoFisica=" + descricaoFisica
				+ ", relacoes=" + relacoes + ", aventuras=" + aventuras + ", terras=" + terras + ", tendencia="
				+ tendencia + ", nomes=" + nomes + ", tamanho=" + tamanho + ", idiomas=" + idiomas
				+ ", nomesMasculinos=" + nomesMasculinos + ", nomesFemininos=" + nomesFemininos + ", caracteristicas="
				+ caracteristicas + "]";
	}

}
