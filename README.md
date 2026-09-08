Respostas

## 1. Qual era o principal problema do código original?

O código original apresentava dois problemas principais:

- Nomes de variáveis pouco descritivos: as variáveis não deixavam claro o que representavam, dificultando a leitura e o entendimento do código por outras pessoas
- Falta de modularização: todo o processamento estava concentrado dentro do main, misturando diferentes responsabilidades em um único bloco de código. Isso torna o programa mais difícil de manter e testar

## 2. Quais melhorias você realizou?

- Renomeei as variáveis para nomes mais claros e significativos: nomeAluno, nota1, nota2, media

- Dividi o código em métodos com responsabilidades específicas:
  - calcularMedia(): responsável apenas por calcular a média das notas
  - verificarSituacao(): responsável por determinar se o aluno está aprovado ou reprovado
  - apresentarResultados(): responsável por exibir as informações no console
- Simplifiquei o método main, que passou a apenas para a chamada dos métodos

## 3. Como a modularização facilitou a organização do código?

- Legibilidade: fica mais fácil entender o que cada parte do código faz
  
- Manutenção: caso seja necessário algo, basta modificar o método, sem precisar mexer no restante do código

- **Testabilidade**: cada método pode ser testado isoladamente, facilitando a identificação de erros.

## 4. Como o Git ajudou a controlar as alterações realizadas no sistema?

O Git permitiu registrar o histórico de mudanças feitas no código ao longo do desenvolvimento, possibilitando:

- Rastreabilidade: acompanhar exatamente o que foi alterado, quando e por quem, através dos commits
  
- Segurança: possibilidade de reverter para versões anteriores do código caso alguma alteração cause um erro
  
- Organização do processo do código: cada commit pode representar uma etapa do código, deixando claro o progresso do trabalho
