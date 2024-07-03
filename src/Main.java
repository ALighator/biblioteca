import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Locacao locacao = new Locacao();
    int opcao;

    do {
        System.out.println("1 - Cadastrar funcionário ");
        System.out.println("2 - Cadastrar usuário");
        System.out.println("3 - Cadastrar livro");
        System.out.println("4 - Mostrar todos os dados do cadastro");
        System.out.println("5 - Ir para a locação");
        System.out.println("0 - Sair");
        System.out.println("Digite aqui a opção:");
        opcao = scanner.nextInt();
        switch(opcao){
            case 1 :
                System.out.println("Cadastro de funcionário\n"
                        +"nome:");
                locacao.getFuncionario().setNome(scanner.next());
                System.out.println("Digite seu CPF:");
                locacao.getFuncionario().setCpf(scanner.nextLong());


                System.out.println("Digite seu cargo:");
                locacao.getFuncionario().setCargo(scanner.next());
                System.out.println("Digite seu salário:");
                locacao.getFuncionario().setSalario(scanner.nextFloat());

                break;

            case 2 :
                System.out.println("Cadastro de usuário");
                System.out.println("Digite seu nome");
                locacao.getUsuario().setNome(scanner.next());

                System.out.println("Digite seu CPF:");
                locacao.getUsuario().setCpf(scanner.nextLong());

                System.out.println("Digite seu código:");
                locacao.getUsuario().setCodigo(scanner.nextInt());

                System.out.println("Digite sua rua:");
                locacao.getUsuario().getEndereco().setRua(scanner.next());
                System.out.println("Digite o número da sua casa:");
                locacao.getUsuario().getEndereco().setNumero(scanner.nextInt());
                System.out.println("Digite seu bairro:");
                locacao.getUsuario().getEndereco().setBairro(scanner.next());

                break;
            case 3 :
                System.out.println("Cadastro de livro");
                System.out.println("Digite seu titulo");
                locacao.getLivro().setTitulo(scanner.next());

                System.out.println("Digite o nome do autor:");
                locacao.getLivro().setAutor(scanner.next());

                System.out.println("Digite o gênero:");
                locacao.getLivro().setGenero(scanner.next());
            case 4:
                do {
                    System.out.print("Selecione o cadastro na qual o mesmo queira acessar:\n" +

                            " 1 - Cadastro do Funcionário: \n" +
                            " 2 - Cadastro do Usuário: \n" +
                            " 3 - Cadastro do Livro: \n" +
                            " 9 _ Voltar ao menu principal: \n" +
                            "Digite a opção desejada: ");

                    opcao = scanner.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println("nome:" + locacao.getFuncionario().getNome());

                            System.out.println("cargo:" + locacao.getFuncionario().getCargo());

                            System.out.println("CPF:" + locacao.getFuncionario().getCpf());

                            System.out.println("Endereço:" + locacao.getFuncionario().getEndereco());

                            System.out.println("salario:" + locacao.getFuncionario().getSalario());

                        case 2:
                            System.out.println("nome:" + locacao.getUsuario().getNome());

                            System.out.println("código:" + locacao.getUsuario().getCodigo());

                            System.out.println("CPF:" + locacao.getUsuario().getCpf());

                            System.out.println("Endereço:" + locacao.getUsuario().getEndereco());
                        case 3:
                            System.out.println("Titulo:" + locacao.getLivro().getTitulo());

                            System.out.println("Autor:" + locacao.getLivro().getAutor());

                            System.out.println("Genero:" + locacao.getLivro().getGenero());
                    }
                }while(opcao != 9);

        }
    }while(opcao != 0);

    }

}