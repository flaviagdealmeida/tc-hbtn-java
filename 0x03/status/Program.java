personagem1.setNome("Sonic");
		
		personagem1.setSaudeAtual(0);
	
		System.out.printf("%d - %s  \n", personagem1.getSaudeAtual(), personagem1.getStatus());
		
		personagem1.setSaudeAtual(10);

		System.out.printf("%d - %s  \n", personagem1.getSaudeAtual(), personagem1.getStatus());

		personagem1.receberCura(80);

		System.out.printf("%d - %s \n", personagem1.getSaudeAtual(), personagem1.getStatus());

		personagem1.tomarDano(25);

		System.out.printf("%d - %s \n", personagem1.getSaudeAtual(), personagem1.getStatus());

		personagem1.tomarDano(65);

		System.out.printf("%d - %s \n", personagem1.getSaudeAtual(), personagem1.getStatus());
		
		personagem1.receberCura(10);
	
		System.out.printf("%d - %s \n", personagem1.getSaudeAtual(), personagem1.getStatus());

