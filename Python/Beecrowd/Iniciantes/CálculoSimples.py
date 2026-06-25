# Padrão para ler vários valores na mesma linha
# Entrada de Dados no Beecrownd
# dados = input().split()

# Agora você distribui e converte
# item1 = int(dados[0])
# item2 = int(dados[1])
# item3 = float(dados[2])

# Como eu fiz (error)
# a, b, c = map (int, int, float, input("Digite três números: ")).split()
# d, e, g = map (int, int, float, input("Digite mais três números: ")).split()

# Como era para ser feito

l1 = input().split()
codigo1 = int(l1[0])
qte1 = int(l1[1])
valor1 = float(l1[2])

l2 = input().split()
codigo2 = int (l2[0])
qte2 = int (l2[1])
valor2 = float (l2[2])

total = (valor1 * qte1) + (valor2 * qte2)

print (f"VALOR A PAGAR: R$ {total:.2f}")
# Control + Espaço abre uma gama de coisas da linguagem