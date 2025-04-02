Foi feito uma solução que explore o conceito de Padrões de Projeto na pŕatica em Java. 


Estrutura do Projeto
model: Contém a classe de entidade Produto.
repository: Contém a interface ProdutoRepository para acesso aos dados.
service: Contém a classe ProdutoService com a lógica de negócios.
controller: Contém a classe ProdutoController para expor os endpoints da API.

Usando Design Patterns

Padrão Factory
A interface ProdutoFactory define o contrato para criar produtos.
A classe ProdutoFactoryImpl implementa a interface e cria instâncias de Produto.
O ProdutoService usa a ProdutoFactory para criar produtos, permitindo maior flexibilidade na criação de objetos.
Com essa modificação, demonstramos o uso do padrão Factory para criar instâncias de Produto de forma mais flexível e desacoplada. 

