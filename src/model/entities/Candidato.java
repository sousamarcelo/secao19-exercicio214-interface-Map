package model.entities;

/*Na contagem de votos de uma elei��o, s�o gerados v�rios registros
de vota��o contendo o nome do candidato e a quantidade de votos
(formato .csv) que ele obteve em uma urna de vota��o. Voc� deve
fazer um programa para ler os registros de vota��o a partir de um
arquivo, e da� gerar um relat�rio consolidado com os totais de cada
candidato.*/

public class Candidato {
	
	private String nome;
	private Integer quantidadeDeVotos;
	
	public Candidato(String nome, Integer quantidadeDeVotos) {
		this.nome = nome;
		this.quantidadeDeVotos = quantidadeDeVotos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadeDeVotos() {
		return quantidadeDeVotos;
	}

	public void setQuantidadeDeVotos(Integer quantidadeDeVotos) {
		this.quantidadeDeVotos = quantidadeDeVotos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidato other = (Candidato) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	

}
