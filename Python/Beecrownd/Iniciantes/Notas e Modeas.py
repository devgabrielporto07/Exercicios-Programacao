valor_monetario = float(input())*100 # Não trabalha com números decimais namoral tenta sair das vírgulas da vida trabalhe na programação como se fosse matemática

nota100int = valor_monetario // 10000
resto = valor_monetario % 10000

nota50int = resto // 5000
resto = resto % 5000

nota20int = resto // 2000
resto = resto % 2000

nota10int = resto // 1000
resto = resto % 1000

nota5int = resto // 500
resto = resto % 500

nota2int = resto // 200
resto = resto % 200

moeda1 = resto // 100
resto = resto % 100

moeda050 = resto // 50
resto = resto % 50

moeda025 = resto // 25
resto = resto % 25

moeda010 = resto // 10
resto = resto % 10

moeda005 = resto // 5
resto = resto % 5

moeda001 = resto // 1 

print("NOTAS:")
print(f"{nota100int:.0f} nota(s) de R$ 100.00")
print(f"{nota50int:.0f} nota(s) de R$ 50.00")
print(f"{nota20int:.0f} nota(s) de R$ 20.00")
print(f"{nota10int:.0f} nota(s) de R$ 10.00")
print(f"{nota5int:.0f} nota(s) de R$ 5.00")
print(f"{nota2int:.0f} nota(s) de R$ 2.00")

print("MOEDAS:")
print(f"{moeda1:.0f} moeda(s) de R$ 1.00")
print(f"{moeda050:.0f} moeda(s) de R$ 0.50")
print(f"{moeda025:.0f} moeda(s) de R$ 0.25")
print(f"{moeda010:.0f} moeda(s) de R$ 0.10")
print(f"{moeda005:.0f} moeda(s) de R$ 0.05")
print(f"{moeda001:.0f} moeda(s) de R$ 0.01") 






































# Error: dinheiro + float = perigo números decimais não são representados exatamente em binário. aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

"""valor_monetario = float(input(""))

nota100int = valor_monetario // 100
resto = valor_monetario % 100

nota50int = resto // 50
resto = resto % 50

nota20int = resto // 20
resto = resto % 20

nota10int = resto // 10
resto = resto % 10

nota5int = resto // 5
resto = resto % 5

nota2int = resto // 2
resto = resto % 2

moeda1 = resto // 1
resto = resto % 1

moeda050 = resto // 0.5
resto = resto % 0.5

moeda025 = resto // 0.25
resto = resto % 0.25

moeda010 = resto // 0.10
resto = resto % 0.10

moeda005 = resto // 0.05
resto = resto % 0.05

moeda001 = resto // 0.01 

print("NOTAS:")
print(f"{nota100int:.0f} nota(s) de R$ 100.00")
print(f"{nota50int:.0f} nota(s) de R$ 50.00")
print(f"{nota20int:.0f} nota(s) de R$ 20.00")
print(f"{nota10int:.0f} nota(s) de R$ 10.00")
print(f"{nota5int:.0f} nota(s) de R$ 5.00")
print(f"{nota2int:.0f} nota(s) de R$ 2.00")

print("MOEDAS:")
print(f"{moeda1:.0f} moeda(s) de R$ 1.00")
print(f"{moeda050:.0f} moeda(s) de R$ 0.50")
print(f"{moeda025:.0f} moeda(s) de R$ 0.25")
print(f"{moeda010:.0f} moeda(s) de R$ 0.10")
print(f"{moeda005:.0f} moeda(s) de R$ 0.05")
print(f"{moeda001:.0f} moeda(s) de R$ 0.01")"""

# Error: uma variável atribui a outra não precisa ficar colocando o nome tipo a nota é 100
# E o resto100 não precisa deixar resto100 deixa a variável resto normal porque ele vai ter novos valores lendo de cima para baixo

"""valor_monetario = float(input(""))

nota100 = valor_monetario // 100
resto100 = valor_monetario % 100

nota50 = resto100 // 50
resto50 = resto100 % 50

nota20 = resto50 // 20
resto20 = resto50 % 20

nota5 = resto20 // 5
resto5 = resto20 % 5

nota2 = resto5 // 2
resto2 = resto5 % 2

moeda1 = resto2 % 2

moeda050 = moeda1 // 0.5
resto050 = moeda1 % 0.5

moeda025 = resto050 // 0.25
resto025 = resto050 % 0.25

moeda010 = resto025 // 0.1
resto010 = resto025 % 0.1

moeda005 = resto010 // 0.05
resto005 = resto010 % 0.05

moeda001 = resto005 % 0.01

print("NOTAS:")
print(f"{nota100} nota(s) de R$ 100.00")
print(f"{nota50} nota(s) de R$ 50.00")
print(f"{nota20} nota(s) de R$ 20.00")
print(f"{nota5} nota(s) de R$ 5.00")
print(f"{nota2} nota(s) de R$ 2.00")
print("MOEDAS:")
print(f"{moeda1} moeda(s) de R$ 1.00")
print(f"{moeda050} moeda(s) de R$ 0.50")
print(f"{moeda025} moeda(s) de R$ 0.25")
print(f"{moeda010} moeda(s) de R$ 0.10")
print(f"{moeda005} moeda(s) de R$ 0.05")
print(f"{moeda001} moeda(s) de R$ 0.01")"""