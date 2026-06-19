# Pensei num exercício aqui vou fazer é isso 
# Basicamente o exercício consiste em pedir um número ao usuário e fazer a tabuada de qualquer número que ele digitar tabuada de um a 10 é claro

from time import sleep as baiano
numero_usuario = int(input())

# Usando for:
for tabuada in range (1, 11, +1):
    resultado = tabuada*numero_usuario
    baiano (1)
    print (f"{numero_usuario} x {tabuada} = {resultado}")

# Usando while:

contador = 0
while (contador <= 9):
    contador += 1
    baiano (1)
    resultado = contador*numero_usuario
    print (f"{numero_usuario} x {contador} = {resultado}")
    
    



