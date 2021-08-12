package projeto1;

import java.util.Scanner;

public class teste_vocacional_metodo {
	
	private int desempate = 0;
	
	//Matematica
	private int xvezesmat = 0;
	private int respostamat = 0;
	private int nenhumamat = 0;

	//Naturalista
	private int xvezesnatu = 0;
	private int respostanatu = 0;
	private int nenhumanatu = 0;

	//Interpessoal
	private int xvezesinter = 0;
	private int respostainter = 0;
	private int nenhumainter = 0;

	//Corporal
	private int xvezescorp = 0;
	private int respostacorp = 0;
	private int nenhumacorp = 0;
	
		//Método inteligencia
		public void inteligencias() {
		
		Scanner leia = new Scanner(System.in);
		String[] mat = new String[3];
		String[] natu = new String[3];
		String[] inter = new String[3];
		String[] corp = new String[3];		
		
		// Matematica
		mat[0] = "\nPergunta 1 - Você tem facilidade em organizar suas tarefas, atividades e rotina a partir de listas e esquemas ?";
		mat[1] = "\nPergunta 2 - Você gosta de jogos de raciocínio lógico, como xadrez, puzzles, quebra – cabeças ?";
		mat[2] = "\nPergunta 3 - Você consegue fazer contas simples de matemática de cabeça de forma rápida?";		
		System.out.println("Digite 1 - Sim ou 2 - Não");
		for(int i = 0; i < 3; i++) {
			System.out.println(mat[i]);
			respostamat = leia.nextInt();
			
			if(respostamat == 1) {
				xvezesmat++;
			}
			else if(respostamat == 2){
				nenhumamat++;
			}
			
			else{
				while(respostamat!=1 && respostamat!=2) {
				System.out.println("Insira uma resposta válida: ");
				respostamat = leia.nextInt();
				if(respostamat == 1) {
					xvezesmat++;
				}
				else if(respostamat == 2){
					nenhumamat++;
				}
				}
			}
		}
		//Naturalista
		natu[0] = "\nPergunta 4 - Você participa de causas sociais relacionadas ao meio ambiente ?";
		natu[1] = "\nPergunta 5 - Você tem Alta tendência à exploração do meio ambiente e curiosidade sobre ele ?";
		natu[2] = "\nPergunta 6 - Você tem facilidade para adaptação em diferentes ambientes ou habitats ?";
		for(int i = 0; i < 3; i++) {
			System.out.println(natu[i]);
			respostanatu = leia.nextInt();
			
			if(respostanatu == 1) {
				xvezesnatu++;
			}
			else if(respostanatu == 2){
				nenhumanatu++;
			}
			else{
				while(respostanatu!=1 && respostanatu!=2) {
				System.out.println("Insira uma resposta válida: ");
				respostanatu = leia.nextInt();
				if(respostanatu == 1) {
					xvezesnatu++;
				}
				else if(respostanatu == 2){
					nenhumanatu++;
				}
			}
			}
		}
		//Interpessoal
		inter[0] = "\nPergunta 7 - Você se considera comunicativo(a) ?";
		inter[1] = "\nPergunta 8 - Você tem facilidade de  compreender os sentimentos do próximo ?";
		inter[2] = "\nPergunta 9 - Você sempre se mantém humorado(a) e otimista ?";
		for(int i = 0; i < 3; i++) {
			System.out.println(inter[i]);
			respostainter = leia.nextInt();
			
			if(respostainter == 1) {
				xvezesinter++;
			}
			else if(respostainter == 2){
				nenhumainter++;
			}
			else{
				while(respostainter!=1 && respostainter!=2) {
				System.out.println("Insira uma resposta válida: ");
				respostainter = leia.nextInt();
				if(respostainter == 1) {
					xvezesinter++;
				}
				else if(respostainter == 2){
					nenhumainter++;
				}
			}
			}
		}
		//Corporal
		corp[0] = "\nPergunta 10 - Você gosta de se exercitar ou dançar ?";
		corp[1] = "\nPergunta 11 - Você tem uma boa coordenação motora ?";
		corp[2] = "\nPergunta 12 - Você gosta de atuar ?";
		for(int i = 0; i < 3; i++) {
			System.out.println(corp[i]);
			respostacorp = leia.nextInt();
			
			if(respostacorp == 1) {
				xvezescorp++;
			}
			else if(respostacorp == 2){
				nenhumacorp++;
			}
			else{
				while(respostacorp!=1 && respostacorp!=2) {
				System.out.println("Insira uma resposta válida: ");
				respostacorp = leia.nextInt();
				if(respostacorp == 1) {
					xvezescorp++;
				}
				else if(respostacorp == 2){
					nenhumacorp++;
				}
			}
			}
		}
		
		//Qual a maior inteligenca
		
		if(xvezesmat>xvezesnatu && xvezesmat> xvezesinter && xvezesmat> xvezescorp){
			System.out.println("A sua principal inteligência é a Lógico Matemática: A inteligência lógico-matemática está diretamente ligada à capacidade de manipular números  e padrões lógicos fazendo uso da razão. "
					+ "Também refere-se à habilidade de analisar as situações de maneira abstrata ou a partir de conceitos científicos.\r\n"
					+ "As pessoas cuja inteligência predominante é a lógico-matemática possuem mais facilidade em realizar cálculos, bem como resolver problemas de forma analítica. \r\n"
					+ "Profissões: Engenheiro, Profissional TI, Biomédico, Arquiteto, Jogador profissional de Poker.\r\n"
					+ "Cursos: Automação Industrial, Ciências Contábeis, Estatística e Economia\r\n"
					+ "");
		}
		else if(xvezesnatu > xvezesmat&& xvezesnatu > xvezesinter && xvezesnatu > xvezescorp) {
		System.out.println("A sua principal inteligência é a Naturalista: A inteligência naturalista é definida como a capacidade para perceber o meio ambiente e realizar classificações, distinções e "
				+ "manipulações dos diferentes elementos que o compõem; objetos, plantas ou animais e seus detalhes.\r\n"
				+ "Além disso, implica a habilidade para realizar conexões e relações entre esses componentes, com o objetivo de melhorar a interação com o ambiente por meio das informações coletadas. "
				+ "Essa definição abrange tanto o contexto urbano, suburbano, como rural.\r\n"
				+ "Você participa de causas sociais relacionadas ao meio ambiente?Você tem Alta tendência à exploração do meio ambiente e curiosidade sobre ele?\r\n"
				+ "Profissões: Veterinária, Biologo, Meteorologista.\r\n"
				+ "Cursos: Astronomia, Agronomia, Segurança florestal, Ciência da Computação.\r\n"
				+ "");
		}
		else if(xvezesinter > xvezesmat && xvezesinter > xvezesnatu && xvezesinter > xvezescorp){
		System.out.println("A sua principal inteligência é a Lógico Interpessoal: A inteligência interpessoal é a habilidade de se relacionar com as outras pessoas.\r\n"
				+ "Quando uma pessoa tem inteligência interpessoal, ela é capaz de entender melhor os outros e suas emoções, bem como necessidades, intenções e motivações. "
				+ "Portanto, é empática, simpática, amigável, mais extrovertida e comunicativa, além de carismática e com um humor para cima.\r\n"
				+ "Profissões: Professor, Psicólogo, Médico, Gerente e Gestor, Vendedor, Advogado e Político.\r\n"
				+ "Cursos: Pedagogia, Psicologia, Medicina, administração, Gestão Comercial, Direito, Relações públicas.\r\n"
				+ "");
		}
		else if(xvezescorp > xvezesmat&& xvezescorp > xvezesnatu && xvezescorp > xvezesinter){
			System.out.println("A sua principal inteligência é a Corporal: A inteligência corporal compreende a capacidade que o ser humano tem em controlar e equilibrar seus movimentos corporais, "
					+ "utilizando seu corpo como um meio para se expressar.\r\n"
					+ "A pessoa que possui o domínio da inteligência corporal-cinestésica possui completo controle e precisão sobre o seu corpo, podendo ter movimentos bem flexíveis e coordenados.\r\n"
					+ "Profissões: Dançarino, Ator, Atleta, Artistas plásticos.\r\n"
					+ "Cursos: Dança, Artes cênicas, Esportismo, Artes."
					+"");
		}
		
		//Caso o usuário coloque tudo não
		if(nenhumamat==3 && nenhumanatu==3 && nenhumainter==3 && nenhumacorp==3) {
			System.out.println("\nVocê selecionou nenhum sim, faça o teste novamente");
		}
		//Caso alguma inteligencia de igual a outra
		
		else if(xvezesmat==xvezesnatu && xvezesmat>xvezesinter && xvezesmat>xvezescorp) {
			System.out.println("Voce se simpatiza com números ?");
			desempate = leia.nextInt();
			if(desempate==1){
			System.out.println("A sua principal inteligência é a Lógico Matemática: A inteligência lógico-matemática está diretamente ligada à capacidade de manipular números  e padrões lógicos fazendo uso da razão.\r\n"
					+ "Também refere-se à habilidade de analisar as situações de maneira abstrata ou a partir de conceitos científicos.\r\n"
					+ "As pessoas cuja inteligência predominante é a lógico-matemática possuem mais facilidade em realizar cálculos, bem como resolver problemas de forma analítica. \r\n"
					+ "Profissões: Engenheiro, Profissional TI, Biomédico, Arquiteto, Jogador profissional de Poker.\r\n"
					+ "Cursos: Automação Industrial, Ciências Contábeis, Estatística e Economia\r\n"
					+ "");
			}
			else {
			System.out.println("A sua principal inteligência é a Naturalista: A inteligência naturalista é definida como a capacidade para perceber o meio ambiente "
					+ "e realizar classificações, distinções e manipulações dos diferentes elementos que o compõem; objetos, plantas ou animais e seus detalhes.\r\n"
					+ "Além disso, implica a habilidade para realizar conexões e relações entre esses componentes, com o objetivo de melhorar a interação com o ambiente por meio das informações coletadas. "
					+ "Essa definição abrange tanto o contexto urbano, suburbano, como rural.\r\n"
					+ "Você participa de causas sociais relacionadas ao meio ambiente?Você tem Alta tendência à exploração do meio ambiente e curiosidade sobre ele?\r\n"
					+ "Profissões: Veterinária, Biologo, Meteorologista.\r\n"
					+ "Cursos: Astronomia, Agronomia, Segurança florestal, Ciência da Computação.\r\n"
					+ "");
				}	
			}
		
		else if(xvezesmat==xvezesinter && xvezesmat>xvezesnatu && xvezesmat>xvezescorp) {
			System.out.println("Voce se simpatiza com números ?");
			desempate = leia.nextInt();
			if(desempate==1){
			System.out.println("A sua principal inteligência é a Lógico Matemática: A inteligência lógico-matemática está diretamente ligada à capacidade de manipular números e padrões lógicos fazendo uso da razão.\r\n"
					+ "Também refere-se à habilidade de analisar as situações de maneira abstrata ou a partir de conceitos científicos.\r\n"
					+ "As pessoas cuja inteligência predominante é a lógico-matemática possuem mais facilidade em realizar cálculos, bem como resolver problemas de forma analítica. \r\n"
					+ "Profissões: Engenheiro, Profissional TI, Biomédico, Arquiteto, Jogador profissional de Poker.\r\n"
					+ "Cursos: Automação Industrial, Ciências Contábeis, Estatística e Economia\r\n"
					+ "");
			}
			else {
			System.out.println("A sua principal inteligência é a Lógico Interpessoal: A inteligência interpessoal é a habilidade de se relacionar com as outras pessoas.\r\n"
					+ "Quando uma pessoa tem inteligência interpessoal, ela é capaz de entender melhor os outros e suas emoções, bem como necessidades, intenções e motivações. "
					+ "Portanto, é empática, simpática, amigável, mais extrovertida e comunicativa, além de carismática e com um humor para cima.\r\n"
					+ "Profissões: Professor, Psicólogo, Médico, Gerente e Gestor, Vendedor, Advogado e Político.\r\n"
					+ "Cursos: Pedagogia, Psicologia, Medicina, administração, Gestão Comercial, Direito, Relações públicas.\r\n"
					+ "");
				}	
			}
		
		else if(xvezesmat==xvezescorp && xvezesmat>xvezesnatu && xvezesmat>xvezesinter) {
			System.out.println("Voce se simpatiza com números ?");
			desempate = leia.nextInt();
			if(desempate==1){
			System.out.println("A sua principal inteligência é a Lógico Matemática: A inteligência lógico-matemática está diretamente ligada à capacidade de manipular números e padrões lógicos fazendo uso da razão.\r\n"
					+ "Também refere-se à habilidade de analisar as situações de maneira abstrata ou a partir de conceitos científicos.\r\n"
					+ "As pessoas cuja inteligência predominante é a lógico-matemática possuem mais facilidade em realizar cálculos, bem como resolver problemas de forma analítica. \r\n"
					+ "Profissões: Engenheiro, Profissional TI, Biomédico, Arquiteto, Jogador profissional de Poker.\r\n"
					+ "Cursos: Automação Industrial, Ciências Contábeis, Estatística e Economia\r\n"
					+ "");
			}
			else {
			System.out.println("A sua principal inteligência é a Corporal: A inteligência corporal compreende a capacidade que o ser humano tem em controlar e equilibrar seus movimentos corporais, "
					+ "utilizando seu corpo como um meio para se expressar.\r\n"
					+ "A pessoa que possui o domínio da inteligência corporal-cinestésica possui completo controle e precisão sobre o seu corpo, podendo ter movimentos bem flexíveis e coordenados.\r\n"
					+ "Profissões: Dançarino, Ator, Atleta, Artistas plásticos.\r\n"
					+ "Cursos: Dança, Artes cênicas, Esportismo, Artes."
					+"");
				}	
			}
		
		else if(xvezesmat==xvezesinter && xvezesmat>xvezesnatu && xvezesmat>xvezescorp) {
			System.out.println("Voce se simpatiza com números ?");
			desempate = leia.nextInt();
			if(desempate==1){
			System.out.println("A sua principal inteligência é a Lógico Matemática: A inteligência lógico-matemática está diretamente ligada à capacidade de manipular números e padrões lógicos fazendo uso da razão.\r\n"
					+ "Também refere-se à habilidade de analisar as situações de maneira abstrata ou a partir de conceitos científicos.\r\n"
					+ "As pessoas cuja inteligência predominante é a lógico-matemática possuem mais facilidade em realizar cálculos, bem como resolver problemas de forma analítica. \r\n"
					+ "Profissões: Engenheiro, Profissional TI, Biomédico, Arquiteto, Jogador profissional de Poker.\r\n"
					+ "Cursos: Automação Industrial, Ciências Contábeis, Estatística e Economia\r\n"
					+ "");
			}
			else {
			System.out.println("A sua principal inteligência é a Lógico Interpessoal: A inteligência interpessoal é a habilidade de se relacionar com as outras pessoas.\r\n"
					+ "Quando uma pessoa tem inteligência interpessoal, ela é capaz de entender melhor os outros e suas emoções, bem como necessidades, intenções e motivações. "
					+ "Portanto, é empática, simpática, amigável, mais extrovertida e comunicativa, além de carismática e com um humor para cima.\r\n"
					+ "Profissões: Professor, Psicólogo, Médico, Gerente e Gestor, Vendedor, Advogado e Político.\r\n"
					+ "Cursos: Pedagogia, Psicologia, Medicina, administração, Gestão Comercial, Direito, Relações públicas.\r\n"
					+ "");
				}	
			}
		
		else if(xvezesnatu==xvezesinter && xvezesnatu>xvezesmat && xvezesnatu>xvezescorp) {
			System.out.println("Voce se simpatiza com a natureza ?");
			desempate = leia.nextInt();
			if(desempate==1){
			System.out.println("A sua principal inteligência é a Naturalista: A inteligência naturalista é definida como a capacidade para perceber o meio ambiente e realizar classificações, distinções "
					+ "e manipulações dos diferentes elementos que o compõem; objetos, plantas ou animais e seus detalhes.\r\n"
					+ "Além disso, implica a habilidade para realizar conexões e relações entre esses componentes, com o objetivo de melhorar a interação com o ambiente por meio das informações coletadas. "
					+ "Essa definição abrange tanto o contexto urbano, suburbano, como rural.\r\n"
					+ "Você participa de causas sociais relacionadas ao meio ambiente?Você tem Alta tendência à exploração do meio ambiente e curiosidade sobre ele?\r\n"
					+ "Profissões: Veterinária, Biologo, Meteorologista.\r\n"
					+ "Cursos: Astronomia, Agronomia, Segurança florestal, Ciência da Computação.\r\n"
					+ "");
			}
			else {
			System.out.println("A sua principal inteligência é a Lógico Interpessoal: A inteligência interpessoal é a habilidade de se relacionar com as outras pessoas.\r\n"
					+ "Quando uma pessoa tem inteligência interpessoal, ela é capaz de entender melhor os outros e suas emoções, bem como necessidades, intenções e motivações. "
					+ "Portanto, é empática, simpática, amigável, mais extrovertida e comunicativa, além de carismática e com um humor para cima.\r\n"
					+ "Profissões: Professor, Psicólogo, Médico, Gerente e Gestor, Vendedor, Advogado e Político.\r\n"
					+ "Cursos: Pedagogia, Psicologia, Medicina, administração, Gestão Comercial, Direito, Relações públicas.\r\n"
					+ "");
				}	
			}
		else if(xvezesnatu==xvezescorp && xvezesnatu>xvezesmat && xvezesnatu>xvezesinter) {
			System.out.println("Voce se simpatiza com a natureza ?");
			desempate = leia.nextInt();
			if(desempate==1){
			System.out.println("A sua principal inteligência é a Naturalista: A inteligência naturalista é definida como a capacidade para perceber o meio ambiente e realizar classificações, distinções "
					+ "e manipulações dos diferentes elementos que o compõem; objetos, plantas ou animais e seus detalhes.\r\n"
					+ "Além disso, implica a habilidade para realizar conexões e relações entre esses componentes, com o objetivo de melhorar a interação com o ambiente por meio das informações coletadas. "
					+ "Essa definição abrange tanto o contexto urbano, suburbano, como rural.\r\n"
					+ "Você participa de causas sociais relacionadas ao meio ambiente?Você tem Alta tendência à exploração do meio ambiente e curiosidade sobre ele?\r\n"
					+ "Profissões: Veterinária, Biologo, Meteorologista.\r\n"
					+ "Cursos: Astronomia, Agronomia, Segurança florestal, Ciência da Computação.\r\n"
					+ "");
			}
			else {
			System.out.println("A sua principal inteligência é a Corporal: A inteligência corporal compreende a capacidade que o ser humano tem em controlar e equilibrar seus movimentos corporais, "
					+ "utilizando seu corpo como um meio para se expressar.\r\n"
					+ "A pessoa que possui o domínio da inteligência corporal-cinestésica possui completo controle e precisão sobre o seu corpo, podendo ter movimentos bem flexíveis e coordenados.\r\n"
					+ "Profissões: Dançarino, Ator, Atleta, Artistas plásticos.\r\n"
					+ "Cursos: Dança, Artes cênicas, Esportismo, Artes."
					+"");
				}	
			}
		else if(xvezesinter==xvezescorp && xvezesinter>xvezesmat && xvezesinter>xvezesnatu) {
			System.out.println("Voce se simpatiza com as pessoas facilmente ?");
			desempate = leia.nextInt();
			if(desempate==1){
			System.out.println("A sua principal inteligência é a Lógico Interpessoal: A inteligência interpessoal é a habilidade de se relacionar com as outras pessoas.\r\n"
					+ "Quando uma pessoa tem inteligência interpessoal, ela é capaz de entender melhor os outros e suas emoções, bem como necessidades, intenções e motivações. "
					+ "Portanto, é empática, simpática, amigável, mais extrovertida e comunicativa, além de carismática e com um humor para cima.\r\n"
					+ "Profissões: Professor, Psicólogo, Médico, Gerente e Gestor, Vendedor, Advogado e Político.\r\n"
					+ "Cursos: Pedagogia, Psicologia, Medicina, administração, Gestão Comercial, Direito, Relações públicas.\r\n"
					+ "");
			}
			else {
			System.out.println("A sua principal inteligência é a Corporal? A inteligência corporal compreende a capacidade que o ser humano tem em controlar e equilibrar seus movimentos corporais, "
					+ "utilizando seu corpo como um meio para se expressar.\r\n"
					+ "A pessoa que possui o domínio da inteligência corporal-cinestésica possui completo controle e precisão sobre o seu corpo, podendo ter movimentos bem flexíveis e coordenados.\r\n"
					+ "Profissões: Dançarino, Ator, Atleta, Artistas plásticos.\r\n"
					+ "Cursos: Dança, Artes cênicas, Esportismo, Artes."
					+"");
				}	
			}
		
		leia.close();
	
	}

	public int getDesempate() {
		return desempate;
	}

	public void setDesempate(int desempate) {
		this.desempate = desempate;
	}

	public int getXvezesmat() {
		return xvezesmat;
	}

	public void setXvezesmat(int xvezesmat) {
		this.xvezesmat = xvezesmat;
	}

	public int getRespostamat() {
		return respostamat;
	}

	public void setRespostamat(int respostamat) {
		this.respostamat = respostamat;
	}

	public int getNenhumamat() {
		return nenhumamat;
	}

	public void setNenhumamat(int nenhumamat) {
		this.nenhumamat = nenhumamat;
	}

	public int getXvezesnatu() {
		return xvezesnatu;
	}

	public void setXvezesnatu(int xvezesnatu) {
		this.xvezesnatu = xvezesnatu;
	}

	public int getRespostanatu() {
		return respostanatu;
	}

	public void setRespostanatu(int respostanatu) {
		this.respostanatu = respostanatu;
	}

	public int getNenhumanatu() {
		return nenhumanatu;
	}

	public void setNenhumanatu(int nenhumanatu) {
		this.nenhumanatu = nenhumanatu;
	}

	public int getXvezesinter() {
		return xvezesinter;
	}

	public void setXvezesinter(int xvezesinter) {
		this.xvezesinter = xvezesinter;
	}

	public int getRespostainter() {
		return respostainter;
	}

	public void setRespostainter(int respostainter) {
		this.respostainter = respostainter;
	}

	public int getNenhumainter() {
		return nenhumainter;
	}

	public void setNenhumainter(int nenhumainter) {
		this.nenhumainter = nenhumainter;
	}

	public int getXvezescorp() {
		return xvezescorp;
	}

	public void setXvezescorp(int xvezescorp) {
		this.xvezescorp = xvezescorp;
	}

	public int getRespostacorp() {
		return respostacorp;
	}

	public void setRespostacorp(int respostacorp) {
		this.respostacorp = respostacorp;
	}

	public int getNenhumacorp() {
		return nenhumacorp;
	}

	public void setNenhumacorp(int nenhumacorp) {
		this.nenhumacorp = nenhumacorp;
	}
	
	
}
	


