# Exercícios

## EX_1
Criar a classe `Valor` com o atributo privado `número`. Criar os métodos `set` e `get` para o atributo `número`. Criar um método para calcular o fatorial de um número. Elaborar uma aplicação que crie uma instância da classe `Valor`, receba um número utilizando a classe `Scanner`, altere e imprima o fatorial com o método `printf`.

---

## EX_2
Criar a classe `Fornecedor` com os atributos privados `Empresa`, `Endereço`, `Inscrição Estadual` e `Nome do Contato`. Criar um método construtor com passagem de parâmetros para inicializar os quatro atributos. Criar os métodos `set` e `get`. Elaborar a aplicação `TesteFornecedor` e criar duas instâncias com o método construtor. Imprimir os valores dos dois fornecedores.

---

## EX_3
Criar classe `Sobrecarga`. Definir o método `adiciona` que some dois valores inteiros. Definir o método `adiciona` que some três valores inteiros. Definir o método `adiciona` que some dois valores reais. Definir o método `adiciona` que concatene nome e sobrenome. Criar os 4 métodos com o nome `adiciona`. Todos os métodos `adiciona` devem conter uma instrução de impressão dos valores (`System.out.println`). Criar a aplicação `TesteSobrecarga`. Criar a instância de dois objetos. Chamar todos os métodos `adiciona` para os dois objetos.

---

## EX_4
Criar a biblioteca de classe `EmpresaInfo` contendo três classes:
- `Funcionário` (superclasse) com os atributos privados `nome`, `CPF` e `salário`. Criar os métodos `set` e `get` para os atributos.
- `Secretaria` (subclasse) com os atributos privados `departamento` e `idioma`. Criar os métodos `set` e `get` para os atributos.
- `Programador` (subclasse) com os atributos privados `código da equipe`, `nome do projeto` e `linguagem`. Criar os métodos `set` e `get` para os atributos.

Criar a aplicação `TesteEmpresaInfo` que faça uma instância da classe `Secretaria` e uma instância da classe `Programador`, receba os valores através da classe `Scanner`, altere e imprima os atributos.

---

## EX_5
Criar a superclasse abstrata `Veículos` com os atributos protegidos `marca`, `modelo`, `ano`, `potência do motor` e `capacidade de carga`. Criar o método construtor com passagem de parâmetros. Declarar o método abstrato `imprime`.

Criar a subclasse `Utilitários` com o atributo privado `tipo de cabine`. Criar o método construtor com passagem de parâmetros. Implementar o método `imprime` exibindo todos os atributos da classe `Veículos` e o atributo `tipo de cabine`.

Criar a subclasse `Passageiros` com o atributo privado `quantidade de passageiros`. Criar o método construtor com passagem de parâmetros. Implementar o método `imprime` exibindo todos os atributos da classe `Veículos` e o atributo `quantidade de passageiros`.

Criar a aplicação `TesteVeículos` criando uma instância da classe `Veículos` como um array de 4 posições. As duas primeiras posições serão instâncias da classe `Utilitários` e as duas últimas posições serão instâncias da classe `Passageiros`. Inicializar os atributos com o construtor e imprimir os valores.

---

## EX_6
Criar superclasse `Produto` com atributos privados `código`, `preço` e `descrição`. Criar um método construtor com a passagem de parâmetros e métodos `get` para os atributos.

Criar a subclasse `Livro` herdando os atributos da superclasse `Produto`. Atributos privados `autor`, `editora`, `ISBN` e `ano`. Método construtor com passagem de parâmetros. Método `get` para os atributos.

Criar a classe `CompactDisc` herdando da superclasse `Produto`. Atributos privados `nome do álbum`, `artista` e `gravadora`. Método construtor com passagem de parâmetros. Método `get` para os atributos.

Criar aplicação para testar os produtos. Instanciar um objeto `Livro` e um objeto `CompactDisc`. Inicializar os atributos com o construtor e imprimir os conteúdos.

---

## EX_7
Criar a superclasse abstrata `Empregado` com os atributos privados `código`, `nome` e `salário base`. Criar o método construtor `Empregado`. Definir os métodos `set` e `get` para todos os campos. Definir um método abstrato para cálculo do salário.

Criar a subclasse `Engenheiro` herdando da superclasse `Empregado`. Definir os atributos privados `departamento` e `CREA`. Criar o método construtor `Engenheiro`. Definir os métodos `set` e `get` para os campos. Implementar o método `CalculoSalario` adicionando 50% ao salário base.

Criar a subclasse `Gerente` herdando da superclasse `Empregado`. Definir o atributo privado `bonus`. Criar o método construtor `Gerente`. Definir os métodos `set` e `get` para o campo `bonus`. Implementar o método `CalculoSalario` adicionando ao salário base o valor do bônus.

Criar uma aplicação que chame os métodos `CalculoSalario` para `Gerente` e `Engenheiro` e imprima os resultados.

---

## EX_8
Criar a superclasse abstrata `Funcionario` com os atributos privados `nome`, `sobrenome` e `CPF`. Criar o método construtor `Funcionario`. Definir os métodos `set` e `get` para todos os campos. Definir o método `toString` que retorne `nome`, `sobrenome` e `CPF` do Funcionário (usar métodos `get`). Definir um método abstrato para cálculo do salário.

Criar a subclasse `FuncionarioMensalista` herdando a superclasse `Funcionario`. Definir o atributo privado `salário mensal`. Criar o método construtor `FuncionarioMensalista`. Criar o método `get` para retornar o salário mensal. Criar o método `setSalarioMensal` utilizando o operador ternário (`? :`). Se o valor do salário informado for menor que 0, então `salário mensal` recebe 0, senão recebe o valor do salário informado. Redefinir o método cálculo do salário retornando o `salário mensal`. Redefinir o método `toString` acessando o método `toString` da superclasse (uso de `super`), imprimindo o `salário mensal`.

Criar a subclasse `FuncionarioHorista` herdando a superclasse `Funcionario`. Definir os atributos privados `salário hora` e `número de horas trabalhadas`. Criar o método construtor `FuncionarioHorista`. Criar os métodos `get` para retornar o `salário hora` e o `número de horas`. Criar o método `setSalarioHora` utilizando o operador ternário (`? :`). Se o valor do salário hora informado for menor que 0, `salário hora` recebe 0, senão recebe o valor do salário hora informado. Criar o método `setNumeroHoras` utilizando o operador ternário (`? :`). Se o número de horas trabalhadas informado for maior que 0 e menor ou igual a 168.0, então o atributo `horas` recebe o número de horas trabalhadas informado, senão recebe 0.

Redefinir o método salário:  
- Se o número de horas for menor ou igual a 40, multiplicar o salário hora pelo número de horas trabalhadas;  
- Senão usar a fórmula: `40 * getSalarioHora() + (getNumeroHoras() - 40) * getSalarioHora() * 1.5`

Redefinir o método `toString` acessando o método `toString` da superclasse (uso de `super`), imprimindo o `salário hora` e o `número de horas trabalhadas`.

Criar a subclasse `FuncionarioComissao` herdando a superclasse `Funcionario`. Definir os atributos privados `venda bruta` e `comissão`. Criar o método construtor `FuncionarioComissao`. Criar os métodos `get` para retornar a `venda bruta` e a `comissão`. Criar o método `setVendaBruta` utilizando o operador condicional (`? :`). Se o valor vendido informado for menor que 0, o atributo `venda bruta` recebe 0, senão recebe o valor vendido informado. Criar o método `setComissao` utilizando o operador condicional (`? :`). Se o percentual de comissão inserido for maior que 0 e menor que 1, então o atributo `comissão` recebe o percentual informado, senão recebe 0.

Redefinir o método salário multiplicando o valor da `venda bruta` pelo percentual da `comissão`. Redefinir o método `toString` acessando o método `toString` da superclasse (uso de `super`), imprimindo `venda bruta` e `comissão`.

Criar a aplicação. Criar uma instância da classe `FuncionarioMensalista`, uma instância da classe `FuncionarioHorista` e uma instância da classe `FuncionarioComissao`, inicializando os valores com o método construtor. Imprimir os atributos das três classes utilizando o método `System.out.printf` que informará os valores atribuídos através do método `toString`. Utilizar o nome do objeto e o método salário.

---
