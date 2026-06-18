# Uma instrução break vai encerrar o programa na hora e não vai incluir a sequência que você colocou a dica é essa
# Uma instrução continue ele vai continuar o programa sem incluir a condição que você colocou
# Variavel impar ela não está definida no programa toda usamos ela apenas no for como se fosse uma variável de controle

# Usando for 
numero_usuario1 = int(input())
if numero_usuario1 % 2 == 1: # se ele for impar
    for impar in range(1, numero_usuario1 + 1, +2):
        print (impar)
# Podia fazer um else aqui mas decidir fazer um elif para ficar mais legível
elif numero_usuario1 % 2 == 0: # se ele for par
    for impar in range(1, numero_usuario1, +2):
        print (impar)
# Usando o break não incluimos o numero_usuario1

# Usando while

