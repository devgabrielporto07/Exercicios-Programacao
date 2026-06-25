cedulas_decompor = int(input(""))

# Correção 1: É obrigatório imprimir o valor lido antes das notas
print(cedulas_decompor)

# Correção 2: As divisões seguintes devem usar a variável 'valor'
nota100 = cedulas_decompor // 100
valor = cedulas_decompor % 100

nota50 = valor // 50
valor = valor % 50

nota20 = valor // 20
valor = valor % 20

nota10 = valor // 10
valor = valor % 10

nota5 = valor // 5
valor = valor % 5

nota2 = valor // 2
nota1 = valor % 2  # O que sobrar da divisão por 2 são as notas de 1

print(f"{nota100} nota(s) de R$ 100,00")
print(f"{nota50} nota(s) de R$ 50,00")
print(f"{nota20} nota(s) de R$ 20,00")
print(f"{nota10} nota(s) de R$ 10,00")
print(f"{nota5} nota(s) de R$ 5,00")
print(f"{nota2} nota(s) de R$ 2,00")
print(f"{nota1} nota(s) de R$ 1,00")

"Error"

"""cedulas_decompor = int(input(""))
nota100 = cedulas_decompor // 100
valor = cedulas_decompor % 100
nota50 = cedulas_decompor // 50
valor = cedulas_decompor % 50
nota20 = cedulas_decompor // 20
valor = cedulas_decompor % 20
nota10 = cedulas_decompor // 10
valor = cedulas_decompor % 10
nota5 = cedulas_decompor // 5
valor = cedulas_decompor % 5
nota2 = cedulas_decompor // 2
valor = cedulas_decompor % 2
nota1 = cedulas_decompor


print(f"{nota100} nota(s) de R$ 100,00")
print(f"{nota50} nota(s) de R$ 50,00")
print(f"{nota20} nota(s) de R$ 20,00")
print(f"{nota10} nota(s) de R$ 10,00")
print(f"{nota5} nota(s) de R$ 5,00")
print(f"{nota2} nota(s) de R$ 2,00")
print(f"{nota1} nota(s) de R$ 1,00")

# quantidade = valor // nota
# valor = valor % nota"""