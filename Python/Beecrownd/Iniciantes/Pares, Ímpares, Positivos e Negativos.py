# Uma instrução break vai encerrar o programa na hora e não vai incluir a sequência que você colocou a dica é essa
# Uma instrução continue ele vai continuar o programa sem incluir a condição que você colocou
# Usando for

contador_pares1 = 0
contador_impares1 = 0
contador_positivo1 = 0
contador_negativo1 = 0
# Usamos vários if por conta da hierarquia caso a gente coloque elif talvez a condicional não faça a verificação

for valores in range(5):
    valores_usuarios1 = int(input())
    if valores_usuarios1 % 2 == 0:
        contador_pares1 += 1
    if valores_usuarios1 % 2 == 1:
        contador_impares1 += 1
    if valores_usuarios1 > 0:
        contador_positivo1 += 1
    if valores_usuarios1 < 0:
        contador_negativo1 += 1
print (f"{contador_pares1} valor(es) par(es)")
print (f"{contador_impares1} valor(es) impar(es)")
print (f"{contador_positivo1} valor(es) positivo(s)")
print (f"{contador_negativo1} valor(es) negativo(s)")

# Usando while

contador_geral = 0 # incluindo o zero
contador_pares2 = 0
contador_impares2 = 0
contador_positivo2 = 0
contador_negativo2 = 0
while contador_geral <= 4:
    contador_geral += 1
    valores_usuarios2 = int(input())
    if valores_usuarios2 % 2 == 0:
        contador_pares2 += 1
    if valores_usuarios2 % 2 == 1:
        contador_impares2 += 1
    if valores_usuarios2 > 0:
        contador_positivo2 += 1
    if valores_usuarios2 < 0:
        contador_negativo2 += 1
print (f"{contador_pares2} valor(es) par(es)")
print (f"{contador_impares2} valor(es) impar(es)")
print (f"{contador_positivo2} valor(es) positivo(s)")
print (f"{contador_negativo2} valor(es) negativo(s)")