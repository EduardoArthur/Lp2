echo $CLASSPATH
export $CLASSPATH = ./lp2g12/biblioteca/Biblioteca.java; ./lp2g12/biblioteca/EmprestadoPara.java; ./lp2g12/biblioteca/Emprestimo.java; ./lp2g12/biblioteca/Livro.java; ./lp2g12/biblioteca/Pessoa.java; ./lp2g12/biblioteca/Usuario.java; ./lp2g12/exception/CopiaNaoDisponivelEx.java; ./lp2g12/exception/LivroNaoCadastradoEx.java; ./lp2g12/exception/NenhumaCopiaEmprestadaEx.java; ./lp2g12/exception/UsuarioNaoCadastradoEx.java;
javac *java
java Ex2
unset CLASSPATH