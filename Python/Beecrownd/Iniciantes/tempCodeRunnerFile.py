# Usando for 
numero_usuario1 = int(input())
if numero_usuario1 % 2 == 1: # se ele for impar
    for impar in range(1, numero_usuario1, +2):
        print (impar + 2)
# Podia fazer um else aqui mas decidir fazer um elif para ficar mais legível
elif numero_usuario1 % 2 == 0: # se ele for par
    for impar in range(1, numero_usuario1, +2):
        print (impar)