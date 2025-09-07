Para versionar o git:

utilizar o Powershell

Comandos:
ls - vê quaisa pastas temos disponivel
cd - se movimentar entre as pastas
cd .. - voltar uma pastas
mkdir - criar pastas
echo "algo" nome_do_arquivo.txt > - criar arquivo de texto
cat + nome_do_arquivo.txt = mostra oq tem no arquivo de texto
git commit - entra no editor de texto
git commit -m "digitar oq fez" - não precisa entrar no editor de texto
git commit -am "digitar oq fez" - adicona não precisa entrar no editor de texto
changelog - informar as mudanças
rm -rf "nome da pasta" - excluir pasta
Logs - todos comandos feito no arquivo
git log - vê as mexidas feitas
git log -1 = retorna os últimos commits feitos(nesse caso só o último)
git log --oneline - de forma resumida
git log --stat - os arquivos modificados
git log -n 3 --oneline - as útimas modificações resumidas
git restore nome_do_arquivo.txt = restaurar o arquivo
git checkout idlog/idbranch - restaurar a modificação para a anterior
git revert HEAD idlog - ele exclui oq foi feito no commit anteior e cria um novo revertendo o que foi feito no anterior
git branch - mostra em que branch está 
git branch nome_de_branch - cria uma nova branch(muito bom para fazer testes e não utilizar a branch principal)
git chekcout -b nome_da_branch - cria e já muda pra nova branch criada de uma vez
git branch -D - deletar a branch
git merge nome_da_branch - tu une os arquivos da branch na branch em que tu estiver
code . - abre já na pasta em que estiver
