# Usando For

valores_pares = 0 # inicialmente não temos valores nenhum
for valores in range(5):
    valores_usuarios = int(input())
    if valores_usuarios % 2 == 0:
        valores_pares += 1
print (f"{valores_pares}valores pares")

# Usando While
valores_pares_2 = 0
valores2 = 1
while valores2 <= 5:
    valores_usuarios2 = int(input())
    valores2 += 1
    if valores_usuarios2 % 2 == 0:
        valores_pares_2 += 1
print (f"{valores_pares_2} valores pares")