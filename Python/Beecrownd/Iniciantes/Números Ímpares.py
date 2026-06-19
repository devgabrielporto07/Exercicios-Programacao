# Uma instrução break vai encerrar o programa na hora e não vai incluir a sequência que você colocou a dica é essa
# Uma instrução continue ele vai continuar o programa sem incluir a condição que você colocou
# Variavel impar ela não está definida no programa toda usamos ela apenas no for como se fosse uma variável de controle

# Usando for 
# numero_usuario1 = int(input())
# if numero_usuario1 % 2 == 1: # se ele for impar
#     for impar in range(1, numero_usuario1 + 1, +2):
#         print (impar)
# # Podia fazer um else aqui mas decidir fazer um elif para ficar mais legível
# elif numero_usuario1 % 2 == 0: # se ele for par
#     for impar in range(1, numero_usuario1, +2):
#         print (impar)
# Usando o break não incluimos o numero_usuario1

# Usando while
contador_impar1 = 1 # começa em 1
contador_impar2 = 1 # começa em 1 
numero_usuario2 = int(input())
if numero_usuario2 % 2 == 1: # se ele for impar
    print (contador_impar1) # improvisação aqui tmb
    while (contador_impar1 <= numero_usuario2):
        contador_impar1 += 2
        if contador_impar1 == numero_usuario2:
            break
        print (contador_impar1)
    print (numero_usuario2) # improvisação que fala KKKKKKKK
elif numero_usuario2 % 2 == 0: # se ele for par
    while (contador_impar2 <= numero_usuario2):
        contador_impar2 += 2
        if contador_impar2 == numero_usuario2:
            break
        print (contador_impar2-2)