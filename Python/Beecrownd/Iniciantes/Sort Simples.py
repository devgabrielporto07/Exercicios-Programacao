# number1, number2, number3 = map(int, input().split())
# O split gera uma lista temporária gerada na memória não tem como você acessar ela
# Pra isso você tem que gerar uma lista mapeando e colocando a entrada pro usuário
# Criar ela diretamente

"""organization_numbers = list(map(int, input().split()))
# método built in do python .sort (organizar)
quebra_linha = "\n"
organization_numbers.sort()
organization_numbers.sorted()
organization_numbers.sorted(reverse=True)
organization_numbers.sort(reverse=True)
print (organization_numbers[0])
print (organization_numbers [1])
print (organization_numbers [2])
print (quebra_linha)
print (organization_numbers [1])
print (organization_numbers [2])
print (organization_numbers [0])"""

number1, number2, number3 = map(int, input().split())
# quebra_linha = "\n" pula muito
# end = "" junta os prints e você escreva na mesma linha
lista_numbers = [number1, number2, number3]
lista_numbers.sort()
print(lista_numbers [0])
print(lista_numbers [1])
print(lista_numbers [2])
print(end="")
print()
# print (quebra_linha)
print(number1)
print(number2)
print(number3)
