#TP 2 - Fundamentos do desenvolvimento Java

Este trabalho é baseado no projeto little-crab-5, do scenario-book inicial do Greenfoot.

Este TP está dividido em três partes.

##Parte 1: Nesta parte o objetivo é introduzir um novo ator no nosso jogo: a poção do poder. Quando nosso caranguejo toma a poção do poder, ele deve ficar imortal por alguns segundos e as lagostas não poderão feri-lo durante esse tempo. Ao fim do tempo de duração da poção, o caranguejo poderá ser morto novamente pelas lagostas. Faça as seguintes alterações no jogo little-crab:

	1. Crie uma nova classe e dê o nome de Potion;
	2. Escolha uma imagem para essa nova classe;
	3. Faça com que três objetos da classe Potion sejam adicionados automaticamente ao jogo em posições aleatórias;
	4. Adicione código à classe Crab para detectar quando o caranguejo colidir com uma poção;
	5. Adicione código à classe Crab para, ao colidir com uma poção, fazer com que o caranguejo fique imune à lagosta por alguns minutos;
	6. Crie um novo som no editor do Greenfoot para ser utilizado quando o Crab comer a poção;
	7. Adicione código à classe Crab para, ao colidir com uma poção, fazer com que o caranguejo mude para uma imagem diferente;
	8. Quando o caranguejo deixar de estar imune às lagostas, ele deve voltar para sua imagem normal;
	9. Crie um método público na classe Crab chamado isPowerfull. Esse método não recebe parâmetros e deve retornar true se o 	caranguejo está imortal e false caso contrário;
	10. Altere o código da classe lobster para fazer com que o jogador perca se a lagosta colidir com o caranguejo, mas somente se o caranguejo não estiver imortal.

##Parte 2: você deve fazer com que o jogo little-crab possa ser jogado por dois jogadores. Faça as seguintes alterações:

	1. Adicione automaticamente mais um objeto da classe Crab (ele será usado pelo segundo jogador);
	2. Na classe Crab, crie uma variável para indicar se o objeto Crab é o primeiro ou o segundo jogador;
	3. Crie um construtor na a classe Crab que recebe um parâmetro. Esse parâmetro deve ser utilizado para inicializar a variável que você criou no item anterior;
	4. Altere o método checkKeypress da classe Crab para responder a teclas diferentes do teclado considerando se o objeto crab representa o primeiro ou o segundo jogador. O primeiro jogador deve usar as teclas "left" e "right" para virar a esquerda e a direita, respectivamente. Por outro lado, o segundo jogador deve usar as teclas "1" e "2" para virar para esquerda e para direita, respectivamente;

##Parte 3: Faça também as seguintes alterações adicionais

	1. Adicione código para que os worms se movimentem aleatoriamente no jogo (assim como as lagostas);
	2. Adicione código para que quando o caranguejo chegar em uma borda, ele apareça na borda oposta. Ou seja, chegou a borda superior, aparece na borda inferior. Chegou na borda direita, aparece na esquerda e vice-versa.