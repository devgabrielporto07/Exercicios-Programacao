# Usando for:

valor_usuario1 = int(input())

if valor_usuario1 % 2 == 0: # se ele for par
    for par in range(6):
        valor_usuario1 += 1
        proximo_valor = valor_usuario1 + par
        print (proximo_valor)
else: # se nao impar
    for impar in range(6): # o range começa em 0 (0,1,2,3,4,5,6) por isso valor_usuario = 11 + impar(0) = 11
        proximo_valor = valor_usuario1 + (impar*2) # 11 + (0x2) 11 + (2x1) e assim vai
        print (proximo_valor)

# Usando while:

contador_par = 1
contador_impar = 1
valor_usuario2 = int(input())

if valor_usuario2 % 2 == 0:
    valor_usuario2 += 1
    while (contador_par <= 6):
        contador_par += 1
        print (valor_usuario2)
        valor_usuario2 += 2
else:
    while (contador_impar <= 6):
        contador_impar += 1
        print (valor_usuario2)
        valor_usuario2 += 2