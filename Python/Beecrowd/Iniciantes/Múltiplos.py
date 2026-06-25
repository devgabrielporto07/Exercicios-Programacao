valor1, valor2 = map(int, input().split())

# basta verificar se o primeiro número pode ser dividido exatamente pelo o segundo número
# ou seja se o resto da divisão é 0
# if valor1 % valor2 == 0 => se o usuario digitar 6 e 24 vai fazer a divisao 6/24 => o resto não é zero
if (valor1 % valor2 == 0) or (valor2 % valor1 == 0):
    print ("Sao Multiplos")
else:
    print ("Nao sao Multiplos")

